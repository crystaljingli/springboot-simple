package com.lijing.springboottools.security;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.crypto.SecretKey;
import java.io.UnsupportedEncodingException;

/**
 * Title: AesUtilsTest
 * Package: com.lijing.springboottools.security
 * Author: LiJing
 * CreateTime: 2018年08月10日 10:23
 * Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AesUtilsTest {

    /**
     * 测试生成秘钥
     */
    @Test
    public void testGenerateAESSecretKey(){
        System.out.println();
        System.out.println("===== AES generate key begin =====");
        System.out.println();
        SecretKey key = AesUtils.initSecreKey();
        System.out.println("algorithm : "+key.getAlgorithm());
        System.out.println("encoded : "+key.getEncoded());
        System.out.println("format : "+key.getFormat());
        System.out.println();
        System.out.println("===== AES generate key end =====");
        System.out.println();
    }

    @Test
    public void testEcb(){
        System.out.println();
        System.out.println("===== AES ECB begin =====");
        System.out.println();
        SecretKey key = AesUtils.initSecreKey();
        String text = "hello";
        System.out.println("加密前为："+text);
        byte[] after = AesUtils.aesEcbEncode(text, key);
        String afterStr = "";
        try {
            afterStr =  new String(after,"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println("加密后为："+afterStr);
        String decodeText = AesUtils.aesEcbDecode(after, key);
        System.out.println("解密后为："+decodeText);
        System.out.println();
        System.out.println("===== AES ECB end =====");
        System.out.println();
    }

}
