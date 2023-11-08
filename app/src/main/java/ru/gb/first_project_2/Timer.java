package ru.gb.first_project_2;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Timer extends Thread {

    public Timer(TextView textView) {
        this.textView = textView;
    }

    TextView textView;
    Button button;
    boolean work = true;

    public void setWork(boolean work) {
        this.work = work;
    }

    @Override
    public void run() {

    int count=0;
        while (work) {

            try {
                if (count==0){
                    textView.setTextColor(Color.RED);

                }
                else if(count==1){
                    textView.setTextColor(Color.YELLOW);

                }
                else {
                    textView.setTextColor(Color.GREEN);
                }
                sleep(500);
                count++;
                if (count>2){
                  count=0;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}










