package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewLeft;
    private TextView textViewRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewLeft = findViewById(R.id.left_text);
        Button button = findViewById(R.id.left_button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        textViewLeft.setVisibility(View.VISIBLE);
                    }
                });

        textViewRight = findViewById(R.id.right_text);
        Button button2 = findViewById(R.id.right_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewRight.setVisibility(View.VISIBLE);
            }
        });
    }
}
