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
        mSisterGiftList.add("Browgame Cosmetics Tri-Folded Lighted Mirror");
        mSisterGiftList.add("Cooluli Mini Beauty Refrigerator");
        mSisterGiftList.add("Fujifilm Instax Mini Sky Blue Film");

        mSisterGiftDesc.add("Snuggle up with this mini plushie heating pad from Smoko. Super-soft, plush design is there for you when you need a hug or some cozy comfort. Heat in microwave or pop in the freezer for a refreshing chill.");
        mSisterGiftDesc.add("Get your beauty rest with this pure silk sleep mask by Slip constructed of slipsilk™ – a specially-commissioned fabric developed and refined over 10 years to provide the ultimate combination of shine, thickness, softness and durability. High-grade (6A) long fiber mulberry silk with a 22 momme thickness.");
        mSisterGiftDesc.add("This three-panel mirror from Browgame Cosmetics provides a panoramic view of your face, with foldable wings for a range of angles and a three-dimensional makeup experience. Includes 21 bright and soft LED lights for perfect color reproduction, that can be adjusted by a touch sensor. Adjustable stand and adjustable angles make it a great travel companion.");
        mSisterGiftDesc.add("Perfect for cooling your crystal roller, serums, creams and sodas, too, this mini fridge from Cooluli is an ultra-versatile addition to your space. Compact, mini design switches from heating to cooling with a thermoelectric system that adapts to your needs with quiet, low-noise operation. Features a matte finish case.");
        mSisterGiftDesc.add("It's sunny skies ahead with this instant film framed in a pretty light blue hue. From the experts at Fujifilm, use it with your Instax mini camera (not included). Produces credit card-sized photos. Includes 10 sheets.");

        mSisterGiftPic.add(R.drawable.plushie);
        mSisterGiftPic.add(R.drawable.eyemask);
        mSisterGiftPic.add(R.drawable.mirror);
        mSisterGiftPic.add(R.drawable.fridge);
        mSisterGiftPic.add(R.drawable.fujifilm);

        mRecyclerView = findViewById(R.id.recyclerView);
        mAdapter = new GiftAdapter(this, mSisterGiftList, mSisterGiftDesc, mSisterGiftPic);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}