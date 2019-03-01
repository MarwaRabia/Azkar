package com.example.engmarwa.azkaar3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Masa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add(getString(R.string.b1));
        arrayList.add(getString(R.string.n5));
        arrayList.add(getString(R.string.b2));
        arrayList.add(getString(R.string.b3));
        arrayList.add(getString(R.string.b4));
        arrayList.add(getString(R.string.m1));
        arrayList.add(getString(R.string.m2));
        arrayList.add(getString(R.string.m3));
        arrayList.add(getString(R.string.m4));
        arrayList.add(getString(R.string.m5));

        ArrayAdapter adapter =new ArrayAdapter(this,R.layout.listitem,arrayList);
        ListView listView=findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
