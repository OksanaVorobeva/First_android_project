package ru.gb.first_project_2;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        init();
        //String s = getIntent().getStringExtra("Info");
        //ArrayAdapter <String>arrayAdapter = new ArrayAdapter<>(this,
         //       android.R.layout.simple_list_item_1,names);
        //listView.setAdapter(arrayAdapter);
        List<ListItemSecondActivity> listItemSecondActivities=createList();

        AdapterSecond adapterSecond = new AdapterSecond(this,R.layout.item_second_activity,listItemSecondActivities);
        listView.setAdapter(adapterSecond);
        listView.setOnItemClickListener(this::clik);

    }

    private void init(){
        listView=findViewById(R.id.names);
    }

    private void clik(AdapterView adapterView,View view,int position,long id){
        TextView textView =  view.findViewById(R.id.name);
        Toast.makeText(this,textView.getText(),Toast.LENGTH_SHORT).show();
    }

    private List<ListItemSecondActivity> createList(){
        List<String> names = Arrays.asList(getResources().getStringArray(R.array.name));
        int []  age = getResources().getIntArray(R.array.age);
        List<ListItemSecondActivity> list =new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            ListItemSecondActivity listItem = new ListItemSecondActivity(names.get(i),age[i]);
            list.add(listItem);
        }
        return  list;
    }





}
