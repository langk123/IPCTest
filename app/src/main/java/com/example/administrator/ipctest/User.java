package com.example.administrator.ipctest;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/9/27.
 */

public class User implements Serializable{

    private static final long serialVersionUID = -1549726842721258212L;
    static  int  i =0;
    String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
