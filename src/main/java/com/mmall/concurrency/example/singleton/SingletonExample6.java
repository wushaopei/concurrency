package com.mmall.concurrency.example.singleton;

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
public class SingletonExample6 {

    //私有构造函数
    private SingletonExample6(){

    }

    //单例对象
    private static SingletonExample6 instance = null;

    static {
        instance = new SingletonExample6();
    }

    //静态的工厂方法
    public static SingletonExample6 getInstance(){
        return instance;
    }

    public static void main(String[] args) {

        System.out.println(getInstance().hashCode());
        System.out.println(getInstance().hashCode());
        System.out.println(getInstance().hashCode());
        System.out.println(getInstance().hashCode());

    }
}
