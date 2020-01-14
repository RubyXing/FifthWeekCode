package com;/*
 * @author Xingqilin
 *
 */

public class Servers implements Runnable {
    private Messages mes;
    private Thread thread;
    private String[] strs;

    public Servers(Messages mes) {
        this.mes = mes;
    }

    public void showMes() {
        System.out.println(mes);
    }

    @Override
    public void run() {
        while (true) {
            if (mes.getMes().isEmpty()) {
                synchronized (mes) {
                    try {
                        mes.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            for (String me : mes.getMes()) {
                System.out.println("消费了：" + me);
            }
            mes.removeall();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (mes) {
                if (mes.getMes().isEmpty()) {
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
