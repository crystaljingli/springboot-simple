package com.lijing.springbootreflection.classdemo;

/**
 * @Description 给反射用的基础类
 * @Author crystal
 * @CreatedDate 2018年05月20日 星期日 12时17分.
 */
public class Foo {

    public void say(){
        System.out.println("Foo");
    }

    public void say(int a,int b){
        System.out.println(a+b);
    }

    public void say(String a, String b){
        System.out.println(a+"");
    }
}
