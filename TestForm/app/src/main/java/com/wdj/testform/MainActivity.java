package com.wdj.testform;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2;
    CheckBox chkAgree;
    RadioGroup rGroup1;
    RadioButton rdoDog, rdoCat, rdoRab;
    ImageView imgPet;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("34ruby radio view");

        text1 = (TextView) findViewById(R.id.Text1);
        chkAgree = (CheckBox) findViewById(R.id.ChkAgree);

        text2 = (TextView) findViewById(R.id.Text1);
        rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        rdoDog = (RadioButton) findViewById(R.id.RdoDog);
        rdoCat = (RadioButton) findViewById(R.id.RdoCat);
        rdoRab = (RadioButton) findViewById(R.id.RdoRab);

        imgPet = (ImageView) findViewById(R.id.ImgPet);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(chkAgree.isChecked() == true) {
                    text2.setVisibility(android.view.View.VISIBLE);
                    rGroup1.setVisibility(android.view.View.VISIBLE);
                    imgPet.setVisibility(android.view.View.VISIBLE);
                } else {
                    text2.setVisibility(android.view.View.INVISIBLE);
                    rGroup1.setVisibility(android.view.View.INVISIBLE);
                    imgPet.setVisibility(android.view.View.INVISIBLE);
                }
            }
        });

        rGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rGroup1, int id) {
               String result;
               if(id == R.id.RdoDog) {
                   imgPet.setImageResource(R.drawable.dog);
               } else if (id == R.id.RdoCat) {
                   imgPet.setImageResource(R.drawable.cat);
               }else if (id == R.id.RdoRab) {
                   imgPet.setImageResource(R.drawable.rabbit);
               }
            }
        });

    }

}
