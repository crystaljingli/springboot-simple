package com.lijing.springboottools.security;

/**
 * Title: ByteArrayToStringUtils
 * Package: com.lijing.springboottools.security
 * Author: LiJing
 * CreateTime: 2018年08月10日 10:45
 * Description:
 */
public class ByteArrayToStringUtils {

    /**
     * 下面这个函数用于将字节数组换成成字符串
     * @param byteArray
     * @return
     */
    public static String byteArrayToString(byte[] byteArray) {
        StringBuilder builder = new StringBuilder();
        String temp;
        for (int i = 0; i < byteArray.length; i++) {
            temp = Integer.toHexString(byteArray[i] & 0xFF);
            if (temp.length() == 1) {
                builder.append("0");
            }
            builder.append(temp);
        }
        return builder.toString();
    }
}
