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
*  懒汉模式 ->>双重同步锁单例
*  单例实例在第一次使用的时候进行创建
* */
@ThreadSafe
public class SingletonExample5 {

    //私有构造函数
    private SingletonExample5(){

    }
   // 1.   memory = allocate() 分配对象的内存空间
   // 2.ctorInstance() 初始化对象
   // 3.Instance = memory 设置instance 指向刚分配的内存

    //单例对象 volatile + 双重检测机制 - 》 进制指令重排
    private volatile static SingletonExample5 instance = null;

    //静态的工厂方法
    public static SingletonExample5 getInstance(){
        if (instance == null){ //双重检测机制
            synchronized (SingletonExample5.class){  //同步锁
                if(instance == null ){
                    instance = new SingletonExample5();
                }
            }
        }
        return instance;
    }
}