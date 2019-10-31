package com.mmall.concurrency.example.atomic;

import com.mmall.concurrency.annoations.ThreadSafe;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @ClassName AtomicExample1
 * @Description TODO
 * @Author wushaopei
 * @Date 2019/10/31 10:23
 * @Version 1.0
 */
@Slf4j
@ThreadSafe
public class AtomicExample5 {

    @Getter
    public volatile int count = 100;

    private static AtomicExample5 example5 = new AtomicExample5();

    private static AtomicIntegerFieldUpdater<AtomicExample5> updater = AtomicIntegerFieldUpdater.newUpdater(AtomicExample5.class,"count");

    public static void main(String[] args) {
        if (updater.compareAndSet(example5,100,120)){
            log.info("update success 1, {}",example5.getCount());
        }
        if (updater.compareAndSet(example5,100,120)){
            log.info("update success 2, {}",example5.getCount());
        }else {
            log.info("update failed,{}",example5.getCount());
        }
    }

}
