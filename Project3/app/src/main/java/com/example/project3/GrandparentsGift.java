package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class GrandparentsGift extends AppCompatActivity {

    private final LinkedList<String> name = new LinkedList<>();
    private LinkedList<String> description = new LinkedList<>();
    private LinkedList<Integer> links = new LinkedList<>();
    private RecyclerView mRecyclerView;
    private GiftAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grandparents_gift);

        name.add("Digital Picture Frame");name.add("Amazon Echo");
        name.add("Anniversary Pushpin Map");name.add("Gratitude Gift Box");
        name.add("Photo Album");

        description.add("With Digital Frames parents can add new photos and video clips from their phone or computer, and they instantly appear in the frame. It means family is always just a glance away.");
        description.add("Designed as the ultimate smart hub, the Echo Show 10 is the perfect companion for the grandparents that do it all. The HD screen provides premium entertainment for grandparents that like to cook, video chat with little ones, and showcase family memories. It also offers comfort and ease");
        description.add("For their anniversary, gift them this personalized pushpin world map. It'll be a fun activity and a trip down memory lane for them to pin each place they've visited over their years of marriage. It might even inspire their choice of future destinations!");
        description.add("Nothing says “thank you” better than a gift encouraging a grandparent to take some time for themselves. This gratitude gift box includes everything your loved one would need for a spa night (like a eucalyptus candle and a sage and rose smudge stick), a gratitude journal, and a couple of insight cards." );
        description.add("One of the things that you can definitely count on your grandparents for is having a vault of throwback pictures of the family. Upgrade their picture organization with this elegant leather album. With 600 slots for photos, they can easily fit in all of their favorite memories.");

        links.add(R.drawable.frame);
        links.add(R.drawable.amazon);
        links.add(R.drawable.map);
        links.add(R.drawable.box);
        links.add(R.drawable.album);


        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new GiftAdapter(this, name, description, links);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}