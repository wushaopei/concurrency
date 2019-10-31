package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annoations.NoThreadSafe;

/**
 * @ClassName SingletonExample1
 * @Description TODO
 * @Author wushaopei
 * @Date 2019/10/31 15:54
 * @Version 1.0
 */
/*
*  懒汉模式
*  单例实例在第一次使用的时候进行创建
* */
@NoThreadSafe
public class SingletonExample1 {

    //私有构造函数
    private SingletonExample1(){

    }

    //单例对象
    private static SingletonExample1 instance = null;

    //静态的工厂方法
    public static  SingletonExample1 getInstance(){
        if (instance == null){
            instance = new SingletonExample1();
        }
        return instance;
    }
}
