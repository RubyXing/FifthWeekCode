package com;/*
 * @author Xingqilin
 *
 */

public class ThradeDemo extends Thread {
    @Override
    public void run() {
        for (int i=0;i<20;i++){
            System.out.println("this is B");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
