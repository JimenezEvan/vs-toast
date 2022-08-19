package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Counter counter;
    private TextView countTV;
    private Button toastButton;
    private Button countButton;
    private Button uncountButton;
    private Button resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = new Counter();
        countTV = findViewById(R.id.show_count);
        toastButton = findViewById(R.id.button_toast);
        countButton = findViewById(R.id.button_count);
    }

    public void toastMsg(View view) {
        Toast.makeText(this, "hi im toast", Toast.LENGTH_SHORT).show();
    }
    public void count(View view) {
        counter.add();
        countTV.setText(counter.getValue().toString());
    }
    public void uncount(View view) {
        counter.subtract();
        countTV.setText(counter.getValue().toString());
    }
    public void reset(View view) {
        counter.reset();
        countTV.setText(counter.getValue().toString());
    }

}