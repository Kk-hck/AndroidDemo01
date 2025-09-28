package com.example.hellowrold;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IndexActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 将 XML 布局文件与 Activity 绑定
        setContentView(R.layout.index);

        Button button = findViewById(R.id.button4);

        button.setOnClickListener( v -> {
            TextView textView =  findViewById(R.id.textView4);
            textView.setText("Hello World!");
        });

    }
}
