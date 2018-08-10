package com.lijing.springboottools.security;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 * Title: Md5Utils
 * Package: com.lijing.springboottools.security
 * Author: LiJing
 * CreateTime: 2018年08月10日 10:44
 * Description:MD5 哈希算法
 * 特点：1.压缩性：任意长度的数据，加密后的长度是固定的
 *      2.抗修改性：对原数据修改后，加密的MD5值相差很大
 *      3.强抗碰撞：已知原数据和其MD5值，想找到一个具有相同MD5值的数据很难
 */
public class Md5Utils {

    public static final String KEY_MD5 = "MD5";

    /**
     * 获取MD5加密
     *
     * @param before 需要加密的字符串
     * @return 加密后的字符串
     */
    public static byte[] md5(byte[] before) {
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance(KEY_MD5);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        md5.update(before);
        return md5.digest();
    }
}
