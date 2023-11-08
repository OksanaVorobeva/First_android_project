package ru.gb.first_project_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AdapterSecond extends ArrayAdapter<ListItemSecondActivity> {

    List<ListItemSecondActivity> listItemSecondActivities;
    LayoutInflater layoutInflater;

    public AdapterSecond(@NonNull Context context, int resource, @NonNull List<ListItemSecondActivity> objects) {
        super(context, resource, objects);
        this.listItemSecondActivities= objects;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       if(convertView == null){
           convertView= layoutInflater.inflate(R.layout.item_second_activity,parent,false);
       }
       ListItemSecondActivity item = listItemSecondActivities.get(position);
        TextView textName = convertView.findViewById(R.id.name);
        TextView textAge = convertView.findViewById(R.id.age);

        textName.setText(item.getName());
        textAge.setText(String.valueOf(item.getAge()));

        return convertView;
    }


}
