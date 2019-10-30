package com.mmall.concurrency.annoations;

import java.lang.annotation.ElementType;
        import java.lang.annotation.Retention;
        import java.lang.annotation.RetentionPolicy;
        import java.lang.annotation.Target;

/**
 * @ClassName ThreadSafe
 * @Description TODO
 * @Author wushaopei
 * @Date 2019/10/30 14:39
 * @Version 1.0
 * 用来标记线程安全的类或写法
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ThreadSafe {

    String value() default  "";
}
