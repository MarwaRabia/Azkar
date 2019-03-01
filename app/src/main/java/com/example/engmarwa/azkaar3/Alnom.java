package com.example.engmarwa.azkaar3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.engmarwa.azkaar3.R;

import java.util.ArrayList;

public class Alnom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add(getString(R.string.n4));
        arrayList.add(getString(R.string.n5));
        arrayList.add(getString(R.string.n1));
        arrayList.add(getString(R.string.n2));
        arrayList.add(getString(R.string.n3));
        arrayList.add(getString(R.string.n6));



        ArrayAdapter adapter =new ArrayAdapter(this,R.layout.listitem,arrayList);
        ListView listView=findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
