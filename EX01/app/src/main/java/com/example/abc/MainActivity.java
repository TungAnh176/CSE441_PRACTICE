package com.example.abc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edtA, edtB, edtKQ;
    Button btnTong, btnHieu, btnTich, btnThuong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtA = findViewById(R.id.editA);
        edtB = findViewById(R.id.editB);
        edtKQ = findViewById(R.id.editKQ);
        btnTong = findViewById(R.id.btnTong);
        btnTong.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                int c = a + b;
                edtKQ.setText(c+"");
            }
        });

        btnHieu = findViewById(R.id.btnHieu);
        btnHieu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                int c = a - b;
                edtKQ.setText(c+"");
            }
        });

        btnTich = findViewById(R.id.btnTich);
        btnTich.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                int c = a * b;
                edtKQ.setText(c+"");
            }
        });

        btnThuong = findViewById(R.id.bthThuong);
        btnThuong.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                int c = a / b;
                edtKQ.setText(c+"");
            }
        });
    }
}