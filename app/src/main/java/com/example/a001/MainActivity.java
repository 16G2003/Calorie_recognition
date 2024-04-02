package com.example.a001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

//    TextView tv_android ;
    TextView text1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = (TextView)this.findViewById(R.id. tv_android );
        text1.setText("加载");
    }
    public void Welcome(android.view.View view) {
        android.widget.Toast.makeText(this, "欢迎来到安卓世界", android.widget.Toast.LENGTH_SHORT).show();
//        tv_android = "测试";
        text1.setText("测试");

    }
}
