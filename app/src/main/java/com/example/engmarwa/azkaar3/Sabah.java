package com.example.engmarwa.azkaar3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Sabah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        ArrayList<String> arrayList=new ArrayList<>();
        ArrayAdapter adapter =new ArrayAdapter(this,R.layout.listitem,arrayList);
        arrayList.add(getString(R.string.b1));
        arrayList.add(getString(R.string.b2));
        arrayList.add(getString(R.string.b3));
        arrayList.add(getString(R.string.b4));
        arrayList.add(getString(R.string.b5));
        arrayList.add(getString(R.string.b6));
        arrayList.add(getString(R.string.b7));
        arrayList.add(getString(R.string.b8));
        arrayList.add(getString(R.string.b9));
        arrayList.add(getString(R.string.b10));

        ListView listView=findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
