package com.lijing.springboottools.security;


import java.util.UUID;
/**
 * Title: IdGenUtils
 * Package: com.lijing.springboottools.security
 * Author: LiJing
 * CreateTime: 2018年08月10日 10:54
 * Description:
 */
public class IdGenUtils {

    public static String genId(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
