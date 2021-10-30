package com.example.msa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FamilyAdapter extends RecyclerView.Adapter<FamilyAdapter.FamilyAdapterViewHolder> {
    ArrayList<Family> mfam = new ArrayList<>();
    public FamilyAdapter(ArrayList<Family> fam){
        mfam =fam;
    }

    @NonNull
    @Override
    public FamilyAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.family_layout,parent,false);
        FamilyAdapterViewHolder itemViewHolder = new FamilyAdapterViewHolder(view);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FamilyAdapterViewHolder holder, int position) {
        Family item = mfam.get(position);
        holder.mImage.setImageResource(item.getmImage());
        holder.mTxt1.setText(item.getmTxt1());
        holder.mTxt2.setText(item.getmTxt2());
    }

    @Override
    public int getItemCount() {
        return mfam.size();
    }

    public static class FamilyAdapterViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImage;
        public TextView mTxt1;
        public TextView mTxt2;
        public FamilyAdapterViewHolder(View view){
            super(view);
            mImage = view.findViewById(R.id.famImage);
            mTxt1 =  view.findViewById(R.id.famTxt1);
            mTxt2 =  view.findViewById(R.id.famText2);
        }

    }

}