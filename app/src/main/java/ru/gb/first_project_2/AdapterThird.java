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

public class AdapterThird extends ArrayAdapter<ListItemThirdActivity> {
    List<ListItemThirdActivity> listItemThirdActivities;
    LayoutInflater layoutInflater;

    public AdapterThird(@NonNull Context context, int resource, @NonNull List<ListItemThirdActivity> objects){
        super(context, resource, objects);
        this.listItemThirdActivities = objects;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            convertView= layoutInflater.inflate(R.layout.item_third_activity,parent,false);
        }
        ListItemThirdActivity listItemThirdActivity = listItemThirdActivities.get(position);
        TextView textName = convertView.findViewById(R.id.contents_name);
        textName.setText(listItemThirdActivity.getContents());

        return convertView;
    }
}
