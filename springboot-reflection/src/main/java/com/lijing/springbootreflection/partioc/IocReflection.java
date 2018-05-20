package com.lijing.springbootreflection.partioc;

import com.lijing.springbootreflection.util.ClassUtil;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @Description
 * @Author crystal
 * @CreatedDate 2018年05月20日 星期日 20时49分.
 */
public class IocReflection {
    public static void main(String[] args) {

        //已知信息
        //1.com.lijing.springbootreflection.partioc.Book
        //2.成员变量名称和对应的值
        // name--->Java;auth--->lijing;publish--->now
        //结果初始化该类

        String[] namesArray = {"setName","setAuth","setPublish"};
        Object[] valueArray = {"Java","lijing",new Date()};
        try {
            Class<?> aClass = Class.forName("com.lijing.springbootreflection.partioc.Book");
            final Object o = aClass.newInstance();
            final Method[] methods = aClass.getDeclaredMethods();
            for(Method method : methods){
                for(int i = 0;i<namesArray.length;i++){
                    if(namesArray[i].equals(method.getName())){
                        //获取参数类型
                        final Class<?>[] parameterTypes = method.getParameterTypes();
                        Method setName = aClass.getMethod(method.getName() , parameterTypes);
                        setName.invoke(o,valueArray[i]);
                    }
                }
            }
            String[] getNames = {"getName","getAuth"};
            for(int j = 0;j<getNames.length;j++){
                final Method method = aClass.getMethod(getNames[j]);
                final Object invoke = method.invoke(o);
                System.out.println(invoke);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
