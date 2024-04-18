package com.example.mywork;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String [] shapeList;
    int [] imageSolid;
    LayoutInflater inflater;
    public CustomAdapter(Context cnt , String [] shapes,int [] images){
this.context=cnt;
this.shapeList=shapes;
this.imageSolid=images;
inflater= LayoutInflater.from(cnt);
    }
    @Override
    public int getCount() {
        return shapeList.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_custom_list_view, null);
        TextView txt=(TextView) convertView.findViewById(R.id.textView);
        ImageView shape=(ImageView) convertView.findViewById(R.id.imageIcon);
        txt.setText(shapeList[position]);
        shape.setImageResource(imageSolid[position]);
        return convertView;

    }
}
