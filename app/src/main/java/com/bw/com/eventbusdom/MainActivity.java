package com.bw.com.eventbusdom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.greenrobot.eventbus.EventBus;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * 点击事件
     * @param view
     */
    public void TO2(View view) {
        //粘性事件
        EventBus.getDefault().postSticky("我是1");
        startActivity(new Intent(this,Main2Activity.class));
    }
}
