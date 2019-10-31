package com.mmall.concurrency.example.sync;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName SynchronizedExample1
 * @Description TODO
 * @Author wushaopei
 * @Date 2019/10/31 14:11
 * @Version 1.0
 */
@Slf4j
public class SynchronizedExample1 {

    //修饰一个代码块
    //作用的对象是调用的对象
    public void test1(int j){
        synchronized (this){
            for (int i = 0 ; i < 10 ; i ++){
                log.info("test1 {} - {}",j,i);
            }
        }
    }

    //修饰一个方法
    public synchronized void test2(int j){
        for (int i = 0 ; i < 10 ; i ++){
            log.info("test2 {} - {}",j,i);
        }
    }

    public static void main(String[] args) {
        SynchronizedExample1 example1 = new SynchronizedExample1();
        SynchronizedExample1 example2 = new SynchronizedExample1();
        ExecutorService executorService = Executors.newCachedThreadPool();
        //在不使用线程池的情况下，本身就是同步执行，synchronized修饰意义不大，
        //使用线程池后，存在两条线程，同时执行代码，在没有synchronized修饰时是并发异步的执行，交替穿插打印结果
        //使用synchronized修饰后，由于锁定的是当前对象example1，所以只有第一个线程执行完，第二个线程才会执行
        executorService.execute(()->{
            example1.test2(1);
        });
        executorService.execute(()->{
            example2.test2(2);
        });
    }
}
