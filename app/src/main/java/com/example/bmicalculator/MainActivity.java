package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText h,w;
        TextView t=findViewById(R.id.textView3);
        Button btn;
        btn = findViewById(R.id.button);
        h=findViewById(R.id.editTextNumberDecimal2);
        w=findViewById(R.id.editTextNumberDecimal);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double height, weight;

                try{
                    height=Double.parseDouble(h.getText().toString());
                    weight=Double.parseDouble(w.getText().toString());
                }
                catch (Exception E)
                {
                    Toast.makeText(MainActivity.this, "Some Error Occurred!", Toast.LENGTH_SHORT).show();
                    return;
                }

                double BMI=weight/(height*height);

                t.setText(Double.toString(BMI));
            }
        });
    }
}