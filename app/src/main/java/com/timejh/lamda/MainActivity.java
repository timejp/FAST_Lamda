package com.timejh.lamda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        EditText editText = (EditText) findViewById(R.id.editText);

        // 람다 사용 조건
        // 1. 콜백 객체가 인자로 넘어가는 곳
        // 2. 콜백 객체에 함수가 하나여야 한다

        button.setOnClickListener((v) -> {
                System.out.println("클릭");
            }
        );

        editText.setOnClickListener((v) -> {

            }
        );
    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button:
                    String a = "aaa";
                    break;
            }
        }
    };

    /* 하나의 함수 instance 로 작성
    /* 함수를 객체화 한다
    함수 이름 생략 / (파라미터 타입 생략) -> {
        // 실행 블럭
    }
    */
}
