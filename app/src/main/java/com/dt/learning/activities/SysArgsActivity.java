package com.dt.learning.activities;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

import com.dt.learning.R;
import com.dt.learning.Util.Util;

public class SysArgsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sys_args);
        DisplayMetrics metrics = getResources().getDisplayMetrics();
        Runtime runtime = Runtime.getRuntime();
        TextView tv = (TextView)findViewById(R.id.sys_args_tv_args);
        tv.setText("device:"+ Build.MODEL + "\n");
        tv.append("sdk:" + String.valueOf(Build.VERSION.SDK_INT) + "\n");
        tv.append("os:" + Build.VERSION.RELEASE + "\n");
        tv.append("width:"+metrics.widthPixels+"\n");
        tv.append("height:"+metrics.heightPixels+"\n");
        tv.append("xdpi:"+metrics.xdpi+"\n");
        tv.append("ydpi:"+metrics.ydpi+"\n");
        tv.append("density:"+metrics.density+"\n");
        tv.append("densityDpi:"+metrics.densityDpi+"\n");
        tv.append("processors:"+runtime.availableProcessors()+"\n");
        tv.append("appMemory:"+runtime.totalMemory()/1024.0/1024+"M\n");
        tv.append("maxMemory:"+runtime.maxMemory()/1024.0/1024+"M\n");
    }
}