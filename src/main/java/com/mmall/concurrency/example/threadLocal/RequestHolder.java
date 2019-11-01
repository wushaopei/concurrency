package com.mmall.concurrency.example.threadLocal;

import com.mmall.concurrency.annoations.ThreadSafe;

/**
 * @ClassName RequestHolder
 * @Description TODO
 * @Author wushaopei
 * @Date 2019/11/1 11:12
 * @Version 1.0
 */
public class RequestHolder {

    private final static ThreadLocal<Long> requestHolder = new ThreadLocal<>();

    //在接口未实际处理之前，在filter中将值添加到ThreadLocal中，等到url被调用处理时，再从ThreadLocal中取出相应的值
    public static void add(Long id){
        requestHolder.set(id);
    }

    public static Long getId(){
        return requestHolder.get();
    }

    //在接口真正处理完之后进行处理
    public static void remove(){
        requestHolder.remove();
    }


}
