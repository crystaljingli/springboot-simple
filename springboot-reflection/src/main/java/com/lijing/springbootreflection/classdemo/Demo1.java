package com.lijing.springbootreflection.classdemo;

import com.lijing.springbootreflection.SpringbootReflectionApplication;
import org.springframework.boot.SpringApplication;

/**
 * @Description
 * @Author crystal
 * @CreatedDate 2018年05月20日 星期日 12时16分.
 */
public class Demo1
{

    public static void main(String[] args) {
        //3种表示类对象的方式
        Foo foo = new Foo();
        //1.已知类名称（Foo）
        Class c1 = Foo.class;
        //2.已知类对象
        Class c2 = foo.getClass();
        //3.已知路径
        Class c3 = null;
        try {
            c3 = Class.forName("com.lijing.springbootreflection.classdemo.Foo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(c1 == c2);
        System.out.println(c2 == c3);

        //创建实例
        Foo foo1 = null;
        try {
            foo1 =  (Foo)c3.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        if(foo1 != null){
            foo1.say();
        }


    }
}
