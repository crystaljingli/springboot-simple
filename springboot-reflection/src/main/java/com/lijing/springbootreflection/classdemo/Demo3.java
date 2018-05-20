package com.lijing.springbootreflection.classdemo;

import com.lijing.springbootreflection.util.ClassUtil;

import java.lang.reflect.Method;

/**
 * @Description
 * @Author crystal
 * @CreatedDate 2018年05月20日 星期日 20时29分.
 */
public class Demo3 {

    public static void main(String[] args) {
        Class<?> aClass = null;
        try {
             aClass = Class.forName("com.lijing.springbootreflection.classdemo.Foo");
             Method say = aClass.getDeclaredMethod("say",int.class,int.class);
            final Object invoke = say.invoke(aClass.newInstance(), 10, 10);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
