package com.example.msa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class FamilyMembers extends AppCompatActivity {
    private RecyclerView mrecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutmanager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);

        ArrayList<Family> familyMembers = new ArrayList<Family>();
        familyMembers.add(new Family(R.drawable.ic_android_black_24dp,"member","soso"));
        familyMembers.add(new Family(R.drawable.ic_android_black_24dp,"member","soso"));
        familyMembers.add(new Family(R.drawable.ic_android_black_24dp,"member","soso"));
        familyMembers.add(new Family(R.drawable.ic_android_black_24dp,"member","soso"));
        familyMembers.add(new Family(R.drawable.ic_android_black_24dp,"member","soso"));
        familyMembers.add(new Family(R.drawable.ic_android_black_24dp,"member","soso"));
        familyMembers.add(new Family(R.drawable.ic_android_black_24dp,"member","soso"));
        familyMembers.add(new Family(R.drawable.ic_android_black_24dp,"member","soso"));
        familyMembers.add(new Family(R.drawable.ic_android_black_24dp,"member","soso"));
        familyMembers.add(new Family(R.drawable.ic_android_black_24dp,"member","soso"));
        familyMembers.add(new Family(R.drawable.ic_android_black_24dp,"member","soso"));
        familyMembers.add(new Family(R.drawable.ic_android_black_24dp,"member","soso"));
        familyMembers.add(new Family(R.drawable.ic_android_black_24dp,"member","soso"));
        familyMembers.add(new Family(R.drawable.ic_android_black_24dp,"member","soso"));

        mrecyclerView = findViewById(R.id.familyRecyclerView);
        mrecyclerView.setHasFixedSize(true);
        mLayoutmanager = new LinearLayoutManager(this);
        mrecyclerView.setLayoutManager(mLayoutmanager);
        mAdapter = new FamilyAdapter(familyMembers);
        mrecyclerView.setAdapter(mAdapter);
    }
}