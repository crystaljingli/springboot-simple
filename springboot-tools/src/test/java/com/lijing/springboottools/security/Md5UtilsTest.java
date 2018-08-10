package com.lijing.springboottools.security;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Title: Md5UtilsTest
 * Package: com.lijing.springboottools.security
 * Author: LiJing
 * CreateTime: 2018年08月10日 10:45
 * Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Md5UtilsTest {

    @Test
    public void testMd5() {
        System.out.println();
        System.out.println("===== md5 begin =====");
        String before = "hello";
        String after = ByteArrayToStringUtils.byteArrayToString(Md5Utils.md5(before.getBytes()));
        System.out.println(after);
        System.out.println("===== md5 end =====");
        System.out.println();
    }
}
