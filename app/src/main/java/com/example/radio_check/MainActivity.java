package com.example.radio_check;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;
    Button buttonApply;
    CheckBox cbJava, cbKotlin, cbFlutter;
    Button btnck;
    TextView textck;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbJava=findViewById(R.id.cb1);
        cbKotlin=findViewById(R.id.cb2);
        cbFlutter=findViewById(R.id.cb3);
        btnck=findViewById(R.id.btn_ck);
        textck=findViewById(R.id.txt_ck2);
        radioGroup=findViewById(R.id.r_group);
        textView=findViewById(R.id.secilen_metin);
        buttonApply=findViewById(R.id.btn1);

        cbJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbJava.isChecked()){
                    cbJava.setTextColor(getResources().getColor(R.color.ColorAccent));
                }else{
                    cbJava.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
        cbKotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbKotlin.isChecked()){
                    cbKotlin.setTextColor(getResources().getColor(R.color.ColorAccent));
                }else{
                    cbKotlin.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
        cbFlutter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbFlutter.isChecked()){
                    cbFlutter.setTextColor(getResources().getColor(R.color.ColorAccent));
                }else{
                    cbFlutter.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });


        buttonApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId=radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(radioId);
                textView.setText("Seçiminiz:\n"+radioButton.getText());

            }
        });
        btnck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="";
                if (cbJava.isChecked()){
                    s+="\n Java Seçildi";
                }
                if (cbKotlin.isChecked()){
                    s+="\n Kotlin Seçildi";
                }
                if (cbFlutter.isChecked()){
                    s+="\n Flutter Seçildi";
                }
                textck.setText(s);
            }
        });

    }
    public void checkButton (View view){
        int radioId=radioGroup.getCheckedRadioButtonId();
        radioButton=findViewById(radioId);
        Toast.makeText(this, "Seçilen Buton"+radioButton.getText(), Toast.LENGTH_SHORT).show();
    }
}