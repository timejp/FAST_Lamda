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

        editText.setOnClickListener(
                System.out::println
        );

        editText.setOnClickListener(
//               1.원형
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                          System.out.println(v);
//                    }
//                }
//               2. 함수명 생략
//                (View v) -> {System.out.println(v);}
//               3. 함수 인자 타입 생략
//                (v) -> {System.out.println(v);}
//               4. 함수 괄호 생략
//                v -> {System.out.println(v);}
//               5. 한줄인 경우 코드 괄호 생략
//                v -> System.out.println(v)
//               6. (특정 함수들만 가능)
                System.out::println
        );

        LamdaFunction arg = calc(); // calc가 호출되면 calc 함숭 정의된 람다식이 넘어온다.
        // arg : num -> num * num;
        int result = arg.squareParameter(50);
        System.out.println("result : " + result);
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

    public LamdaFunction calc() {
//        return num -> num * num;
//
//        return num -> {return num * num;};
//
//        return num -> {
//            switch (num) {
//                case 5:
//                    return num * num * num;
//            }
//            return num * num;
//        };
//
        return new LamdaFunction(){
            @Override
            public int squareParameter(int value) {
                return value * value;
            }
        };
    }

    interface LamdaFunction {
        public abstract int squareParameter(int value);
    }
}
