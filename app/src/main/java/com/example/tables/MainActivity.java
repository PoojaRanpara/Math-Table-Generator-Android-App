package com.example.tables;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.tables.R;

public class MainActivity extends AppCompatActivity {
    Button b1, b2;
    TextView t1;
    int n;
    String ans = "";
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //StringBuffer buffer =new StringBuffer();
        b1 = findViewById(R.id.bt1);
        t1 = findViewById(R.id.textView2);
        e1 = findViewById(R.id.editTextTextPersonName);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fs = e1.getText().toString();
                n = Integer.parseInt(fs);

                for (int i = 1; i <= 10; i++) {

                    ans = ans + n + "X" + i + "=" + i * n + "\n";
                    t1.setText(ans);
                }
                ans = "";
                n = 0;

            }
        });
        t1.setText("");


    }
}