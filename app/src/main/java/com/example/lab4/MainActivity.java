package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_url = (EditText) findViewById(R.id.et_url);
        btn_go = (Button) findViewById(R.id.btn_go);
        btn_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建Intent
                Intent intent = new Intent();
                // 为Intent设置Action属性
                intent.setAction(Intent.ACTION_VIEW);
                // 获取网址并解析为uri对象，设置Data属性
                intent.setData(Uri.parse(urlHead+et_url.getText().toString()));
                startActivity(intent);
            }
        });
    }
}
}
