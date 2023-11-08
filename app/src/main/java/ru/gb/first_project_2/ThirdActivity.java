package ru.gb.first_project_2;

import android.content.Intent;
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

public class ThirdActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);
        into();
        String s = getIntent().getStringExtra("Info");
        List<ListItemThirdActivity> listItemThirdActivities = createList();
        AdapterThird adapterThird =new AdapterThird(this,R.layout.item_third_activity,listItemThirdActivities);
        listView.setAdapter(adapterThird);
        listView.setOnItemClickListener(this::clik);
    }

    private void into(){
        listView=findViewById(R.id.contents);
    }

    private void clik(AdapterView adapterView, View view, int position, long id){
        TextView textView =  view.findViewById(R.id.contents_name);
        Toast.makeText(this,textView.getText(),Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Activity4.class);
        String text = textView.getText().toString();
        intent.putExtra("Info",text);
        startActivity(intent);
    }

    private List<ListItemThirdActivity> createList() {
        List<String> contents = Arrays.asList(getResources().getStringArray(R.array.contents));
        List<ListItemThirdActivity> listContents = new ArrayList<>();
        for (int i = 0; i < contents.size(); i++) {
            ListItemThirdActivity listItem2 = new ListItemThirdActivity(contents.get(i));
            listContents.add(listItem2);
        }
        return listContents;
    }





}
