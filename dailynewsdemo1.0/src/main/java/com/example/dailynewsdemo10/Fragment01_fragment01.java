package com.example.dailynewsdemo10;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by xujin on 2017/11/3.
 */

public class Fragment01_fragment01 extends Fragment {
    private Button mButton;
    private int index=3;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 0:
                    mButton.setText("还有"+index+"S");
                    break;
                case 1:
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.container,new Fragment01_fragment02()).commit();
                    break;
            }
        }
    };
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment01_fragment01,container,false);
        mButton=view.findViewById(R.id.fragment01_fragment01_myButton);
        setLoginAnimation();
        //Handle  报错
        return view;
    }

    private void setLoginAnimation() {
        new Thread(){
            @Override
            public void run() {
                super.run();
                while (true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    index--;
                    if(index>0){
                        handler.sendEmptyMessage(0);
                    }
                    else{
                        handler.sendEmptyMessage(1);
                    }

                }
            }
        }.start();
    }


}
