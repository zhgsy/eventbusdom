package com.bw.com.eventbusdom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EventBus.getDefault().register(this);

    }
    /**
     * 支持粘性事件
     * @param s
     */
    @Subscribe(sticky = true)
    public void receive(String s){

        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();

    }

    public void to1(View view) {
        String s="我是2的大爷";
        String t="羞羞的";
        EventBus.getDefault().post(s);
        EventBus.getDefault().post(t);
        EventBus.getDefault().post(new User("kson"));
        this.finish();
    }
}
