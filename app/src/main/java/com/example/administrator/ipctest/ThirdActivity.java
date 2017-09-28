package com.example.administrator.ipctest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/9/27.
 */

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("ThirdActivity",User.i +"");
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("ThirdActivity");
    }

}
