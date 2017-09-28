package com.example.administrator.ipctest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Administrator on 2017/9/27.
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("SecondActivity",User.i +"");
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("SecondActivity");

        try {
            File file = new File(getExternalFilesDir(null),"cache.txt");
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            Person person = (Person)in.readObject();
            Log.i("SecondActivity",person.getName()+" "+person.getAge()+" "+person.getAdress()+" "+getFilesDir());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }


}
