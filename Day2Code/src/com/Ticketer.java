package com;/*
 * @author Xingqilin
 *
 */

public class Ticketer {
    private int ticket;
    private Object o = new Object();

    @Override
    public String toString() {
        return "{" +
                "ticket=" + ticket +
                '}';
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket -= ticket;
        System.out.println(Thread.currentThread().getName() + "卖了:" + ticket + "---剩余：" + toString());

    }

    public Ticketer(int ticket) {
        this.ticket = ticket;
    }
}
