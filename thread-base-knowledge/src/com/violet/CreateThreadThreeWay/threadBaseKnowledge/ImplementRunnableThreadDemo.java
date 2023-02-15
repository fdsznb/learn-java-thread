package com.violet.CreateThreadThreeWay.threadBaseKnowledge;

public class ImplementRunnableThreadDemo {
    public static class MyThread implements Runnable {

        @Override
        public void run() {
            System.out.println("I'm a thread run method.");
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        new Thread(myThread).start();
        new Thread(myThread).start();
    }
}
