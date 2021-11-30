package com.example.project3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class GiftAdapter extends RecyclerView.Adapter<GiftAdapter.GiftViewHolder>  {

    private LinkedList<String> mNameList;
    private LinkedList<String> mDescriptionList;
    private LayoutInflater mInflater;
    private Context context;


    public GiftAdapter(Context context, LinkedList<String> nameList, LinkedList<String> descriptionList) {
        mInflater = LayoutInflater.from(context);
        this.mNameList = nameList;
        this.mDescriptionList = descriptionList;
        this.context = context;
    }

    public GiftViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.activity_gift_item, parent, false);
        return new GiftViewHolder(mItemView, this);
    }

    public void onBindViewHolder(GiftAdapter.GiftViewHolder holder, int position) {
        String mCurrent = mNameList.get(position);
        holder.nameItemView.setText(mCurrent);
        String mCurrent2 = mDescriptionList.get(position);
        holder.descriptionItemView.setText(mCurrent2);
    }

    public int getItemCount() {
        return mDescriptionList.size();
    }

    class GiftViewHolder extends RecyclerView.ViewHolder
    {
        public TextView nameItemView;
        public TextView descriptionItemView;
        GiftAdapter mAdapter;

        public GiftViewHolder(View itemView, GiftAdapter adapter) {
            super(itemView);
            nameItemView = itemView.findViewById(R.id.name);
            descriptionItemView = itemView.findViewById(R.id.description);
            this.mAdapter = adapter;
        }
        }
    }


