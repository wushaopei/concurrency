package com.mmall.concurrency.example.immutable;

import com.google.common.collect.Maps;
import com.mmall.concurrency.annoations.NoThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @ClassName immutableExample1
 * @Description TODO
 * @Author wushaopei
 * @Date 2019/10/31 17:06
 * @Version 1.0
 */
@Slf4j
@NoThreadSafe
public class immutableExample1 {

    private final static Integer a = 1;
    private final static String b = "2";
    private final static Map<Integer,Integer> map = Maps.newHashMap();

    static {
        map.put(1,2);
        map.put(3,4);
        map.put(5,6);
    }

    public static void main(String[] args) {
//        a = 2;
//        b = "3";
//        map = Maps.newHashMap();
        map.put(1,3);
        log.info("{}",map.get(1));
    }

    private void test(final int a ){
//        a = 1;
    }
}
