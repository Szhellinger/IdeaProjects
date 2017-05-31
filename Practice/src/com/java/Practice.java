package com.java;

import java.util.*;

/**
 * Created by szhell on 5/21/17.
 */
public class Practice {
    public static void main(String[] args) {
        ThreadTest();
        char a='海';
        float b=1.1F;
        short c=1;
        int d = 1;
    }

    public static void ThreadTest() {
        MyThread t = new MyThread();
        new Thread(new MyThread()).start();
        new Thread(new MyThread());
        Runnable r = new Runnable() {
            @Override
            public void run() {

            }
        };
    }

    static class MyThread implements Runnable{
        @Override
        public void run() {
            System.out.println("My thread.");
        }
    }

    public static void BoxingTrap() {
        // Package class don't unbox when compare with == until arithmetic operations happen.
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        System.out.println(c == d);
        System.out.println(e == f);
        System.out.println(c == (a + b));
        System.out.println(c.equals(a + b));
        System.out.println(g == (a + b));
        System.out.println(g.equals(a + b));
        System.out.println(g.equals(3L));
    }
}

class Singleton {
    private Singleton () {}
    private static class InstanceHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    private static Singleton instance;
    public static final Singleton getInstance() {
        return InstanceHolder.INSTANCE;
    }

}
enum Single {
    instance;
    public void GetInstance() {}
}
