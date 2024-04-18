package com.example.mywork;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    String shapeList[] = {"Cube", "Cuboid", "Cylinder", "Pyramid"};
    int imageSolids[] = {R.drawable.imagecube, R.drawable.imageretangle, R.drawable.imagecylider, R.drawable.pyramid};

    ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        list = (ListView) findViewById(R.id.shapeListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), shapeList, imageSolids);
        list.setAdapter(customAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("shape_list_View", "solid is clicked @ position : " + position);
                if(position==0){
                    startActivity(new Intent(MainActivity2.this, Cube.class));
                }
               else if(position==1){
                    startActivity(new Intent(MainActivity2.this, Cubiod.class));

                } else if (position==2) {

                    startActivity(new Intent(MainActivity2.this, Cylinder.class));
                } else if (position==3) {
                    startActivity(new Intent(MainActivity2.this, pyramid.class));

                }
            }
        });
    }
}

