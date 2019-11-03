package com.mmall.concurrency.example.aqs;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

/**
 * @ClassName FutureExample
 * @Description TODO
 * @Author wushaopei
 * @Date 2019/11/3 17:10
 * @Version 1.0
 */
@Slf4j
public class FutureTaskExample {

    public static void main(String[] args) throws Exception {
       FutureTask<String> futureTask = new FutureTask<String>(new Callable<String>() {
           @Override
           public String call() throws Exception {
               log.info("do something in callable");
               Thread.sleep(5000);
               return "Done";
           }
       });
       new Thread(futureTask).start();
       log.info("do something in main");
        Thread.sleep(1000);
        String result = futureTask.get();
        log.info("result:{}",result);
    }
}
