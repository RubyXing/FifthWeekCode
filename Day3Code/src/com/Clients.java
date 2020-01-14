package com;/*
 * @author Xingqilin
 *
 */


public class Clients implements Runnable {
    private Messages mes;
    private Thread thread;

    public Clients(Messages mes) {
        this.mes = mes;
    }

    public void showMes() {
        System.out.println(mes);
    }

    @Override
    public void run() {
        while (true) {
            synchronized (mes) {
                if (!mes.getMes().isEmpty()) {
                    try {
                        mes.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            for (int i = 0; i < Math.random() * 10; i++) {
                System.out.println("产生消息: message" + i);
                mes.addone("message" + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (mes) {
                if (!mes.getMes().isEmpty()) {
                    mes.notify();
                }
            }
        }
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }
}
