package com.example.administrator.ipctest;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/9/27.
 */

public class Person implements Serializable {

    private static final long serialVersionUID = -5222339353976774758L;

    String name;
    int age;
    String adress;

    public Person(String name, int age, String adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
