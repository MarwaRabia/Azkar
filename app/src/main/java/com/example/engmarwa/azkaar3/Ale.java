package com.example.engmarwa.azkaar3;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class Ale extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);



        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add(getString(R.string.s1));
        arrayList.add(getString(R.string.s2));
        arrayList.add(getString(R.string.s3));



        ArrayAdapter adapter =new ArrayAdapter(this,R.layout.listitem,arrayList);
        ListView listView=findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
