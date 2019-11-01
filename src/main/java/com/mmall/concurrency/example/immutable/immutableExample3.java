package com.mmall.concurrency.example.immutable;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.mmall.concurrency.annoations.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.Map;

/**
 * @ClassName immutableExample1
 * @Description TODO
 * @Author wushaopei
 * @Date 2019/10/31 17:06
 * @Version 1.0
 */
@Slf4j
@ThreadSafe
public class immutableExample3 {

    private final static ImmutableList list = ImmutableList.of(1,2,3);

    private final static ImmutableSet set = ImmutableSet.copyOf(list);

    private final static ImmutableMap<Integer,Integer> map = ImmutableMap.of(1,2,3,4);

    private final static ImmutableMap<Integer,Integer> map2 = ImmutableMap.<Integer,Integer>builder().put(1,2).put(3,4).put(5,6).build();

    public static void main(String[] args) {
//        list.add(4);

//        map.put(1,4);
        System.out.println(map.get(3));
    }
}
