package com;/*
 * @author Xingqilin
 *
 */

public class SoldOut implements Runnable {
    private Ticketer ticket;
    private Thread str;

    @Override
    public String toString() {
        return ticket.toString();
    }

    public Ticketer getTicket() {
        return ticket;
    }

    public void setTicket(Ticketer ticket) {
        this.ticket = ticket;
    }

    public SoldOut(Ticketer ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {

        try {
            while (ticket.getTicket() > 0) {
                int num = (int) (Math.random() * 3) + 1;
                ticket.setTicket(num);
                System.out.println(Thread.currentThread().getName() + "卖了:" + num + "---剩余：" + toString());
                Thread.sleep(200);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void start() {
        if (str == null) {
            str = new Thread(this);
            str.start();
        }
    }


}
