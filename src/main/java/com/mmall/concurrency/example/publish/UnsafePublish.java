package com.mmall.concurrency.example.publish;

import com.mmall.concurrency.annoations.NoThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @ClassName UnsafePublish
 * @Description TODO
 * @Author wushaopei
 * @Date 2019/10/31 15:28
 * @Version 1.0
 */
@Slf4j
@NoThreadSafe
public class UnsafePublish {

    private String [] states = {"a","b","c"};

    public String [] getStates(){
        return states;
    }

    public static void main(String[] args) {
        UnsafePublish unsafePublish = new UnsafePublish();
        log.info("{}", Arrays.toString(unsafePublish.getStates()));

        //对私有属性数组进行修改
        unsafePublish.getStates()[0] = "d";
        log.info("{}",Arrays.toString(unsafePublish.getStates()));
    }
}
