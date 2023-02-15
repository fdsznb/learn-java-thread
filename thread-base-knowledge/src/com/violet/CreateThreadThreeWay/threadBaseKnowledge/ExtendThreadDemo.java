package com.violet.CreateThreadThreeWay.threadBaseKnowledge;

public class ExtendThreadDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        /**
         * 其实调用 start 方法后线程并没有马上执行而 处于就 状态， 这个就绪状态是指
         * 线程已经获取了除 CPU 资源外的其 资源，等待获取 CPU 资源后才会真正处于运行状态。
         * 一旦 run 方法执行完毕， 该线程就处于终止状态
         */
        myThread.start();
    }

    public static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("This a thread's run method.");
        }
    }
}