package ru.gb.first_project_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity4 extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4);
        init();
        String s = getIntent().getStringExtra("Info");
        textView.setText(s);
    }
    private void init(){
        textView=findViewById(R.id.text_activity4);
    }


}
