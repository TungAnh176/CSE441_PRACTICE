package com.example.infomation;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edtHoTen, edtCCCD, edtBosung;
    CheckBox ckDocBao, ckDocSach, ckDocCode;
    Button btnGui;
    RadioGroup group;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        edtHoTen = findViewById(R.id.edt_ho_ten);
        edtCCCD = findViewById(R.id.edt_cccd);
        edtBosung = findViewById(R.id.edt_bosung);
        ckDocBao = findViewById(R.id.ck_docbao);
        ckDocSach = findViewById(R.id.ck_docsach);
        ckDocCode = findViewById(R.id.ck_doccode);
        btnGui = findViewById(R.id.btn_gui);
        group = findViewById(R.id.group);

        
    }
}