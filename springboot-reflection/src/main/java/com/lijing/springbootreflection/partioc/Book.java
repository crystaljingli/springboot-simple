package com.lijing.springbootreflection.partioc;

import java.util.Date;

/**
 * @Description
 * @Author crystal
 * @CreatedDate 2018年05月20日 星期日 20时46分.
 */
public class Book {

    private String name;
    private String auth;
    private Date publish;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public Date getPublish() {
        return publish;
    }

    public void setPublish(Date publish) {
        this.publish = publish;
    }
}
