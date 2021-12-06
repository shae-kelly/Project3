package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class SisterGift extends AppCompatActivity {
    private final LinkedList<String> mSisterGiftList = new LinkedList<>();
    private final LinkedList<String> mSisterGiftDesc = new LinkedList<>();
    private LinkedList<Integer> mSisterGiftPic = new LinkedList<>();
    private RecyclerView mRecyclerView;
    private GiftAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sister_gift);

        mSisterGiftList.add("Smoko Mini Toasty Heatable Plushie");
        mSisterGiftList.add("Slip Silk Eye Mask");

        mSisterGiftDesc.add("Snuggle up with this mini plushie heating pad from Smoko. Super-soft, plush design is there for you when you need a hug or some cozy comfort. Heat in microwave or pop in the freezer for a refreshing chill.");
        mSisterGiftDesc.add("Get your beauty rest with this pure silk sleep mask by Slip constructed of slipsilk™ – a specially-commissioned fabric developed and refined over 10 years to provide the ultimate combination of shine, thickness, softness and durability. High-grade (6A) long fiber mulberry silk with a 22 momme thickness.");

        mSisterGiftPic.add(R.drawable.plushie);
        mSisterGiftPic.add(R.drawable.eyemask);

        mRecyclerView = findViewById(R.id.recyclerView);
        mAdapter = new GiftAdapter(this, mSisterGiftList, mSisterGiftDesc, mSisterGiftPic);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}