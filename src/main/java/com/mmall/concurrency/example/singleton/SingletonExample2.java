package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annoations.NoThreadSafe;
import com.mmall.concurrency.annoations.ThreadSafe;

/**
 * @ClassName SingletonExample1
 * @Description TODO
 * @Author wushaopei
 * @Date 2019/10/31 15:54
 * @Version 1.0
 */
/*
*  饿汉模式
*  单例实例在类装载的时候进行创建
* */
@ThreadSafe
public class SingletonExample2 {

    //私有构造函数
    private SingletonExample2(){

    }

    //单例对象
    private static SingletonExample2 instance = new SingletonExample2();

    //静态的工厂方法
    public static SingletonExample2 getInstance(){
        return instance;
    }
}
