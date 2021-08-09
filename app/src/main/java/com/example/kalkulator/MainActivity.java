package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText angka01,angka02;
    Button tambah,kurang,bagi,kali,hapus;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        angka01 = (EditText) findViewById(R.id.input1);
        angka02 = (EditText) findViewById(R.id.input2);
        tambah = (Button) findViewById(R.id.tambah);
        kurang = (Button) findViewById(R.id.kurang);
        bagi = (Button) findViewById(R.id.bagi);
        kali = (Button) findViewById(R.id.kali);
        hasil = (TextView) findViewById(R.id.hasil);
        hapus = (Button) findViewById(R.id.hapus);

        tambah.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if ((angka01.getText().length()>0)&&(angka02.getText().length()>0))
                {
                    double angka1 = Double.parseDouble(angka01.getText().toString());
                    double angka2 = Double.parseDouble(angka02.getText().toString());
                    double result = angka1 + angka2;
                    hasil.setText(Double.toString(result));
                }
                else {
                    Toast.makeText(MainActivity.this, "Mohon masukkan angka pertama & kedua", Toast.LENGTH_LONG).show();
                }

            }

        });

        kurang.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if ((angka01.getText().length()>0)&&(angka02.getText().length()>0))
                {
                    double angka1 = Double.parseDouble(angka01.getText().toString());
                    double angka2 = Double.parseDouble(angka02.getText().toString());
                    double result = angka1 - angka2;
                    hasil.setText(Double.toString(result));
                }
                else {
                    Toast.makeText(MainActivity.this, "Mohon masukkan angka pertama & kedua", Toast.LENGTH_LONG).show();
                }

            }

        });

        bagi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if ((angka01.getText().length()>0)&&(angka02.getText().length()>0))
                {
                    double angka1 = Double.parseDouble(angka01.getText().toString());
                    double angka2 = Double.parseDouble(angka02.getText().toString());
                    double result = angka1 / angka2;
                    hasil.setText(Double.toString(result));
                }
                else {
                    Toast.makeText(MainActivity.this, "Mohon masukkan angka pertama & kedua", Toast.LENGTH_LONG).show();
                }

            }

        });

        kali.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if ((angka01.getText().length()>0)&&(angka02.getText().length()>0))
                {
                    double angka1 = Double.parseDouble(angka01.getText().toString());
                    double angka2 = Double.parseDouble(angka02.getText().toString());
                    double result = angka1 * angka2;
                    hasil.setText(Double.toString(result));
                }
                else {
                    Toast.makeText(MainActivity.this, "Mohon masukkan angka pertama & kedua", Toast.LENGTH_LONG).show();
                }
            }
        });

        hapus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                angka01.setText("");
                angka02.setText("");
                hasil.setText("0");
                angka01.requestFocus();
            }
        });

    }
}