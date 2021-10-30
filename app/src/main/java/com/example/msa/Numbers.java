package com.example.msa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {
    private RecyclerView mrecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutmanager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<Num> words = new ArrayList<Num>();
        words.add(new Num(R.drawable.ic_android_black_24dp,"esraa","soso"));
        words.add(new Num(R.drawable.ic_android_black_24dp,"esraa","soso"));
        words.add(new Num(R.drawable.ic_android_black_24dp,"esraa","soso"));
        words.add(new Num(R.drawable.ic_android_black_24dp,"esraa","soso"));
        words.add(new Num(R.drawable.ic_android_black_24dp,"esraa","soso"));
        words.add(new Num(R.drawable.ic_android_black_24dp,"esraa","soso"));
        words.add(new Num(R.drawable.ic_android_black_24dp,"esraa","soso"));
        words.add(new Num(R.drawable.ic_android_black_24dp,"esraa","soso"));
        words.add(new Num(R.drawable.ic_android_black_24dp,"esraa","soso"));
        words.add(new Num(R.drawable.ic_android_black_24dp,"esraa","soso"));


        mrecyclerView = findViewById(R.id.numbersRecyclerView);
        mrecyclerView.setHasFixedSize(true);
        mLayoutmanager = new LinearLayoutManager(this);
        mrecyclerView.setLayoutManager(mLayoutmanager);
        mAdapter = new NumbersAdapter(words);
        mrecyclerView.setAdapter(mAdapter);



    }
}