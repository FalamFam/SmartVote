package com.example.lenovo.smartvote;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Button processButton = findViewById(R.id.process_button);
        processButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText numberEditText = findViewById(R.id.number_Text);
                String str = numberEditText.getText().toString();
                if(str.equals("1111111111111")){
                    new AlertDialog.Builder(NextActivity.this).setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง")
                            .setMessage("คุณเป็นผู้มีสิทธิเลือกตั้ง")
                            .setNegativeButton("OK", null).show();
                }
                else if(str.equals("2222222222222")){
                    new AlertDialog.Builder(NextActivity.this).setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง")
                            .setMessage("คุณเป็นผู้มีสิทธิเลือกตั้ง")
                            .setNegativeButton("OK", null).show();
                }else if(str.length() == 13){
                    new AlertDialog.Builder(NextActivity.this).setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง")
                            .setMessage("คุณไม่มีสิทธิเลือกตั้ง")
                            .setNegativeButton("OK", null).show();
                }else{
                    Toast.makeText(NextActivity.this,"กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}

