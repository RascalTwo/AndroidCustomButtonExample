package com.gmail.therealrascaltwo.custombutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private int value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textView = findViewById(R.id.counter_text);
        this.updateCounterText();
    }

    private void updateCounterText(){
        this.textView.setText(getString(R.string.counter_text, this.value));
    }

    public void modifyCounter(View v){
        this.value += Integer.valueOf(v.getTag().toString());
        this.updateCounterText();
    }
}
