package com.example.administrator.ipctest;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 2017/9/28.
 */

public class Student implements Parcelable {

   private String Name;
   private String school;
   private int    age;
   private int studyNumber;
   private Book book;



    public Student(String name, String school, int age, int studyNumber, Book book) {
        this.Name = name;
        this.school = school;
        this.age = age;
        this.studyNumber = studyNumber;
        this.book = book;
    }


    protected Student(Parcel in) {
        Name = in.readString();
        school = in.readString();
        age = in.readInt();
        studyNumber = in.readInt();
        book =  in.readParcelable(Thread.currentThread().getContextClassLoader());
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudyNumber() {
        return studyNumber;
    }

    public void setStudyNumber(int studyNumber) {
        this.studyNumber = studyNumber;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book){
        this.book = book;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Name);
        dest.writeString(school);
        dest.writeInt(age);
        dest.writeInt(studyNumber);
        dest.writeParcelable(book,0);
    }
}
