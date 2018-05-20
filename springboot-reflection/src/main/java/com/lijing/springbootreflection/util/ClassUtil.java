package com.lijing.springbootreflection.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Description
 * @Author crystal
 * @CreatedDate 2018年05月20日 星期日 19时29分.
 */
public class ClassUtil {

    //打印方法
    public static void printMethods(Object object){
        //创建对象，用方法2
        Class<?> aClass = object.getClass();
        //获取方法，并打印方法的返回类型，方法名称，参数类型
        Method[] methods = aClass.getMethods();//获取自己的和父类的public方法
        Method[] declaredMethods = aClass.getDeclaredMethods();//获取自己申明的方法
        for(Method method : methods){
             Class<?> returnType = method.getReturnType();
             System.out.print(returnType.getName()+" ");
             String name = method.getName();
             System.out.print(name+"(");
             Class<?>[] parameterTypes = method.getParameterTypes();
             for(Class c : parameterTypes){
                 System.out.print(c.getName()+",");
             }
            System.out.println(")");
        }
    }

    //打印成员变量
    public static void printFields(Object object){
         Class<?> aClass = object.getClass();
         Field[] declaredFields = aClass.getDeclaredFields();//获取自己申明的成员变量
         for(Field field : declaredFields){
             Class<?> type = field.getType();//获取成员变量的类型
             System.out.println(type.getName()+" "+field.getName()+";");
         }
    }

    //打印构造方法
    public static void printConstructs(Object object){
         Class<?> aClass = object.getClass();
         Constructor<?>[] constructors = aClass.getDeclaredConstructors();//获取自己申明的构造方法
         //构造方法无返回类型
        for (Constructor constructor :constructors) {
            System.out.print(constructor.getName()+" ");
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for(Class c : parameterTypes){
                System.out.print(c.getName()+",");
            }
            System.out.println(")");
        }
    }
}
