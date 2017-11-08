package com.example.importdemo10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {
    private SimpleDraweeView simpleDraweeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleDraweeView=findViewById(R.id.myView);

    }
}
