package com.wdj.calu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnMod;
    TextView textResult;
    String num1, num2;
//    Integer  result;
    Double result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("34ruby Calu");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);

        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnDiv = (Button) findViewById(R.id.BtnDiv);
        btnMod = (Button) findViewById(R.id.BtnMod);

        textResult = (TextView) findViewById(R.id.TextResult);

        btnAdd.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.trim().equals("")||num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "안됩니다", Toast.LENGTH_SHORT).show();
                    textResult.setText("오류 : 1번과 2번에 모두 숫자를 넣으세요.");
                }
                else  {
                    result2 = Double.parseDouble(num1) + Double.parseDouble(num2);
                    textResult.setText("계산 결과 : "  + result2.toString());

                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.trim().equals("")||num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "안됩니다", Toast.LENGTH_SHORT).show();
                    textResult.setText("오류 : 1번과 2번에 모두 숫자를 넣으세요.");
                }
                else  {
                    result2 = Double.parseDouble(num1) - Double.parseDouble(num2);
                    textResult.setText("계산 결과 : "  + result2.toString());

                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.trim().equals("")||num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "안됩니다", Toast.LENGTH_SHORT).show();
                    textResult.setText("오류 : 1번과 2번에 모두 숫자를 넣으세요.");
                }
                else  {
                    result2 = Double.parseDouble(num1) * Double.parseDouble(num2);
                    textResult.setText("계산 결과 : "  + result2.toString());

                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.trim().equals("")||num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "안됩니다", Toast.LENGTH_SHORT).show();
                    textResult.setText("오류 : 1번과 2번에 모두 숫자를 넣으세요.");
                }
                else if(num2.trim().equals("0")) {
                    Toast.makeText(getApplicationContext(), "안됩니다", Toast.LENGTH_SHORT).show();
                    textResult.setText("오류 : 0으로 나눌 수 없습니다");
                }
                else  {
                    result2 = Double.parseDouble(num1) / Double.parseDouble(num2);
                    textResult.setText("계산 결과 : "  + result2.toString());

                }
            }
        });

        btnMod.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.trim().equals("")||num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "안됩니다", Toast.LENGTH_SHORT).show();
                    textResult.setText("오류 : 1번과 2번에 모두 숫자를 넣으세요.");
                }
                else if(num2.trim().equals("0")) {
                    Toast.makeText(getApplicationContext(), "안됩니다", Toast.LENGTH_SHORT).show();
                    textResult.setText("오류 : 0으로 나눌 수 없습니다");
                }
                else  {
                    result2 = Double.parseDouble(num1) % Double.parseDouble(num2);
                    textResult.setText("계산 결과 : "  + result2.toString());

                }
            }
        });

//        btnAdd.setOnTouchListener(new View.OnTouchListener() {
//            public boolean onTouch(View arg0, MotionEvent arg1) {
//                num1 = edit1.getText().toString();
//                num2 = edit2.getText().toString();
//                if(num1.trim().equals("")||num2.trim().equals("")) {
//                    Toast.makeText(getApplicationContext(), "안됩니다", Toast.LENGTH_SHORT).show();
//                    textResult.setText("오류 : 1번과 2번에 모두 숫자를 넣으세요.");
//                }
//                else  {
//                    result2 = Double.parseDouble(num1) + Double.parseDouble(num2);
//                    textResult.setText("계산 결과 : "  + result2.toString());
//
//                }
//                return false;
//            }
//        });
//        btnSub.setOnTouchListener(new View.OnTouchListener() {
//            public boolean onTouch(View arg0, MotionEvent arg1) {
//                num1 = edit1.getText().toString();
//                num2 = edit2.getText().toString();
//                if(num1.trim().equals("")||num2.trim().equals("")) {
//                    Toast.makeText(getApplicationContext(), "안됩니다", Toast.LENGTH_SHORT).show();
//                    textResult.setText("오류 : 1번과 2번에 모두 숫자를 넣으세요.");
//                }
//                else  {
//                    result2 = Double.parseDouble(num1) - Double.parseDouble(num2);
//                    textResult.setText("계산 결과 : "  + result2.toString());
//
//                }
//                return false;
//            }
//        });
//        btnMul.setOnTouchListener(new View.OnTouchListener() {
//            public boolean onTouch(View arg0, MotionEvent arg1) {
//                num1 = edit1.getText().toString();
//                num2 = edit2.getText().toString();
//                if(num1.trim().equals("")||num2.trim().equals("")) {
//                    Toast.makeText(getApplicationContext(), "안됩니다", Toast.LENGTH_SHORT).show();
//                    textResult.setText("오류 : 1번과 2번에 모두 숫자를 넣으세요.");
//                }
//                else  {
//                    result2 = Double.parseDouble(num1) * Double.parseDouble(num2);
//                    textResult.setText("계산 결과 : "  + result2.toString());
//
//                }
//                return false;
//            }
//        });
//        btnDiv.setOnTouchListener(new View.OnTouchListener() {
//            public boolean onTouch(View arg0, MotionEvent arg1) {
//                num1 = edit1.getText().toString();
//                num2 = edit2.getText().toString();
//                if(num1.trim().equals("")||num2.trim().equals("")) {
//                    Toast.makeText(getApplicationContext(), "안됩니다", Toast.LENGTH_SHORT).show();
//                    textResult.setText("오류 : 1번과 2번에 모두 숫자를 넣으세요.");
//                }
//                else if(num2.trim().equals("0")) {
//                    Toast.makeText(getApplicationContext(), "안됩니다", Toast.LENGTH_SHORT).show();
//                    textResult.setText("오류 : 0으로 나눌 수 없습니다");
//                }
//                else  {
//                    result2 = Double.parseDouble(num1) / Double.parseDouble(num2);
//                    textResult.setText("계산 결과 : "  + result2.toString());
//
//                }
////                result2 = Double.parseDouble(num1) / Double.parseDouble(num2);
////                textResult.setText("계산 결과 : "  + result2.toString());
//                return false;
//            }
//        });
//        btnMod.setOnTouchListener(new View.OnTouchListener() {
//            public boolean onTouch(View arg0, MotionEvent arg1) {
//                num1 = edit1.getText().toString();
//                num2 = edit2.getText().toString();
//                num2 = edit2.getText().toString();
//                if(num1.trim().equals("")||num2.trim().equals("")) {
//                    Toast.makeText(getApplicationContext(), "안됩니다", Toast.LENGTH_SHORT).show();
//                    textResult.setText("오류 : 1번과 2번에 모두 숫자를 넣으세요.");
//                }
//                else if(num2.trim().equals("0")) {
//                    Toast.makeText(getApplicationContext(), "안됩니다", Toast.LENGTH_SHORT).show();
//                    textResult.setText("오류 : 0으로 나눌 수 없습니다");
//                }
//                else  {
//                    result2 = Double.parseDouble(num1) % Double.parseDouble(num2);
//                    textResult.setText("계산 결과 : "  + result2.toString());
//
//                }
//                return false;
//            }
//        });
    }
}