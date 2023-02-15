package com.violet.CreateThreadThreeWay.threadBaseKnowledge;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class FutureTaskThreadDemo {

    public static class CallerTask implements Callable<String> {

        @Override
        public String call() throws Exception {
            return "violet";
        }
    }

    public static void main(String[] args) {
        FutureTask<String> futureTask = new FutureTask<String>(new CallerTask());
        new Thread(futureTask).start();

        try {
            String res = futureTask.get();
            System.out.println("线程执行完成返回结果：" + res);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
