package com.lijing.springbootreflection.classdemo;

import com.lijing.springbootreflection.SpringbootReflectionApplication;
import com.lijing.springbootreflection.util.ClassUtil;
import org.springframework.boot.SpringApplication;

/**
 * @Description
 * @Author crystal
 * @CreatedDate 2018年05月20日 星期日 19时36分.
 */
public class Demo2 {

    public static void main(String[] args) {

        String hello = "hello";
        //ClassUtil.printMethods(hello);
        //ClassUtil.printFields(hello);
        ClassUtil.printConstructs(hello);
    }
}
