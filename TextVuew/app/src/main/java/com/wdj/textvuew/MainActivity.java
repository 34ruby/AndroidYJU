package com.wdj.textvuew;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1;
        btn1 = findViewById(R.id.btn1);

//        MyListenerClass lis = new MyListenerClass();

//        btn1.setOnClickListener(lis);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "눌러라눌러" , Toast.LENGTH_SHORT).show();
            }
        });
    }
/*
    class MyListenerClass implements View.OnClickListener {
        //컨트롤 O 눌러주기, 구현해야 하는게 뭔지를 보여준다.
        @Override
        public void onClick(View view) {
            Toast.makeText(getApplicationContext(), "눌러라눌러" , Toast.LENGTH_SHORT).show();
        }
    }
    */
 */
//    public void test(View view) {
//        Toast.makeText(getApplicationContext(), "눌러라눌러" , Toast.LENGTH_SHORT).show();
//
//    }


}