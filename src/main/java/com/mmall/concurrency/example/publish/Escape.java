package com.mmall.concurrency.example.publish;

import com.mmall.concurrency.annoations.NoRecommend;
import com.mmall.concurrency.annoations.NoThreadSafe;
import com.sun.org.apache.bcel.internal.classfile.InnerClass;
import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName Escape
 * @Description TODO
 * @Author wushaopei
 * @Date 2019/10/31 15:39
 * @Version 1.0
 */
@Slf4j
@NoThreadSafe
@NoRecommend
public class Escape {

    private int thisCanBeEscape = 0;

    public Escape(){
        new InnerClass();
    }

    private class InnerClass{
        public InnerClass (){
            log.info("{}",Escape.this.thisCanBeEscape);
        }
    }

    public static void main(String[] args) {
        new Escape();
    }

}
