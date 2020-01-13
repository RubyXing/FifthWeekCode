package com;/*
 * @author Xingqilin
 *
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SingleTon {
    private static SingleTon singleTon;
    private static ReentrantLock lock = new ReentrantLock();

    private SingleTon() {
    }

    ;

    public static SingleTon getInstance() {
        if (singleTon == null) {
            try {
                lock.lock();
                if (singleTon == null) {
                    singleTon = new SingleTon();
                }
            } catch (Exception e) {
                System.out.println("nothing");
            } finally {
                lock.unlock();
            }
        }
        return singleTon;
    }
}
