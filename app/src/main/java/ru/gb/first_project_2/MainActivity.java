package ru.gb.first_project_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity  {


    TextView textView;
    Timer timer;
    Button button,button2,button3;

    EditText editText;

    boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        button = findViewById(R.id.button);
        textView = findViewById(R.id.text_1);
        button.setOnClickListener(this::onClick);
        button2= findViewById(R.id.next);
        button2.setOnClickListener(this::onClick2);
        button3=findViewById(R.id.button_third);
        button3.setOnClickListener(this::onClick3);
        editText =findViewById(R.id.text_big);

    }


    private void onClick(View view) {
        if (flag){
            start();
        }
        else {
            stop();
        }
        flag=!flag;
    }

    private  void onClick2(View view){
        Intent intent = new Intent(this,SecondActivity.class);
        String old = editText.getText().toString();
        intent.putExtra("Info",old);
        startActivity(intent);
    }

    private void onClick3(View view){
        Intent intent = new Intent(this,ThirdActivity.class);
        startActivity(intent);
    }




    private void start() {
        timer = new Timer(textView);
        timer.start();
    }

   private void stop(){
        timer.setWork(false);
   }




}
