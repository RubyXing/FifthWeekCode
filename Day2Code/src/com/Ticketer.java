package com;/*
 * @author Xingqilin
 *
 */

public class Ticketer {
    private int ticket;

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
    }

    public Ticketer(int ticket) {
        this.ticket = ticket;
    }
}
