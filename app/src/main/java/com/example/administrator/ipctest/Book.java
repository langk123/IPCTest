package com.example.administrator.ipctest;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 2017/9/28.
 */

public class Book implements Parcelable {

    String name;

    public Book(String name) {
        this.name = name;
    }

    protected Book(Parcel in) {
        name = in.readString();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };



}
