package com.example.administrator.ipctest;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.util.Log;



/**
 * Created by Administrator on 2017/9/27.
 */

public class Myapplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("Myapplication",getCurProcessName(getApplicationContext())+" "+android.os.Process.myPid());
    }

    String getCurProcessName(Context context) {
        int pid = android.os.Process.myPid();
        ActivityManager mActivityManager = (ActivityManager) context
                .getSystemService(Context.ACTIVITY_SERVICE);
        for (ActivityManager.RunningAppProcessInfo appProcess : mActivityManager
                .getRunningAppProcesses()) {
            if (appProcess.pid == pid) {
                return appProcess.processName;
            }
        }
        return null;
    }

}
