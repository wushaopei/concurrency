package com.mmall.concurrency.example.atomic;

import com.mmall.concurrency.annoations.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.LongAdder;

/**
 * @ClassName AtomicExample1
 * @Description TODO
 * @Author wushaopei
 * @Date 2019/10/31 10:23
 * @Version 1.0
 */
@Slf4j
@ThreadSafe
public class AtomicExample4 {

   private static AtomicReference<Integer> count = new AtomicReference<>(0);

    public static void main(String[] args) {
        count.compareAndSet(0,2); // 2
        count.compareAndSet(0,1); // no
        count.compareAndSet(1,3); // no
        count.compareAndSet(2,4); // 4
        count.compareAndSet(3,5); // no
        log.info("count:{}",count.get());
    }

}
