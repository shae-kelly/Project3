package com.example.project3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;

public class GiftAdapter extends RecyclerView.Adapter<GiftAdapter.GiftViewHolder>  {
    private LinkedList<String> mNameList;
    private LinkedList<String> mDescriptionList;
    private LinkedList<Integer> mLinksList;
    private LayoutInflater mInflater;
    private Context context;
    private String name;
    private String description;
    private int image;
    private int pos;



    public GiftAdapter(Context context, LinkedList<String> nameList, LinkedList<String> descriptionList, LinkedList<Integer> links) {
        mInflater = LayoutInflater.from(context);
        this.mNameList = nameList;
        this.mDescriptionList = descriptionList;
        this.mLinksList = links;
        this.context = context;
    }

    public GiftViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.activity_gift_item, parent, false);
        return new GiftViewHolder(mItemView, this);
    }

    public void onBindViewHolder(GiftAdapter.GiftViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.nameItemView.setTag(position);
        String mCurrent = mNameList.get(position);
        holder.nameItemView.setText(mCurrent);
        Integer mCurrent3 = mLinksList.get(position);
        holder.imageVieww.setImageResource(mCurrent3);
        image = mCurrent3;
        String mCurrent2 = mDescriptionList.get(position);
        holder.descriptionItemView.setText(mCurrent2);
        description = mCurrent2;


    }

    public int getItemCount() {
        return mDescriptionList.size();
    }

    class GiftViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener
    {
        public TextView nameItemView;
        public TextView descriptionItemView;
        public ImageView imageVieww;
        GiftAdapter mAdapter;

        public GiftViewHolder(View itemView, GiftAdapter adapter) {
            super(itemView);
            nameItemView = itemView.findViewById(R.id.name);
            descriptionItemView = itemView.findViewById(R.id.description);
            imageVieww = itemView.findViewById(R.id.images);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);

        }

        public void onClick(View v) {
            pos = (int) nameItemView.getTag();
            Log.e("poss", String.valueOf(pos));
            writeToFile(mNameList.get(pos), mDescriptionList.get(pos), mLinksList.get(pos));
            Intent intent = new Intent(context, FavoritesActivity.class);
            context.startActivity(intent);
        }

    }

    public void writeToFile(String name, String description, int image) {
        File path = context.getApplicationContext().getFilesDir();
        try {
            FileOutputStream writer = new FileOutputStream(new File(path, "favoriteGifts.txt"), true);
            String content = name + ";" + description + ";" + image + "\n";
            Log.e("content", content);
            writer.write(content.getBytes());
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}





