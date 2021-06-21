package com.example.callintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String receiver = editText.getText().toString();
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+receiver));
                startActivity(intent);
            }
        });
    }

}

/*
Intent intent2 = new Intent();
// 2. 객체가 아닌 문자열로 액티비티를 지정하는 방법
ComponentName name = new ComponentName("org.example.callintent", "org.example.callintent.MenuActivity");
intent2.setComponent(name);
startActivity (intent2);
*/ 
