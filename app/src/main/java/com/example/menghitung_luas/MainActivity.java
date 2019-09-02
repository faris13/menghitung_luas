package com.example.menghitung_luas.;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.menghitung_luas.R;

public class MainActivity extends AppCompatActivity {
    private EditText editPanjang, editLebar;
    private Button btnHitung;
    private TextView txtLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Hitung Luas Persegi Panjang");

        editPanjang = (EditText)findViewById(R.id);
        editLebar = (EditText)findViewById(R.id);
        btnHitung = (Button)findViewById(R.id);
        txtLuas = (TextView)findViewById(R.id);


        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang = editPanjang.getText().toString().trim();
                String lebar = editLebar.getText().toString().trim();

                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);

                double luas = p * l ;

                txtLuas.setText("Luas : "+luas);

            }
        });
    }
}
