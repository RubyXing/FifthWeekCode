package com;/*
 * @author Xingqilin
 *
 */

public class SWtest implements Runnable {
    private Messages lobj;
    private Thread ted;

    public SWtest(Messages lobj) {
        this.lobj = lobj;
    }


    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "打印了：" + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 10) {
                synchronized (lobj) {
                    try {
                        lobj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void start() {
        if (ted == null) {
            ted = new Thread(this);
            ted.start();
        }
    }
}
