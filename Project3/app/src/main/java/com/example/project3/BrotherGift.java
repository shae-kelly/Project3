package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class BrotherGift extends AppCompatActivity {
    private final LinkedList<String> mBrotherGiftList = new LinkedList<>();
    private final LinkedList<String> mBrotherGiftDesc = new LinkedList<>();
    private LinkedList<Integer> mBrotherGiftPic = new LinkedList<>();
    private RecyclerView mRecyclerView;
    private GiftAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brother_gift);

        mBrotherGiftList.add("Nike SB: The Dunk Book By Nike SB");
        mBrotherGiftList.add("Crosley Record Crate");
        mBrotherGiftList.add("Pizza Bean Bag Chair");
        mBrotherGiftList.add("The Mandalorian 12 Days Of Socks Gift Set");
        mBrotherGiftList.add("Chums Cork Folding Sunglass Case");

        mBrotherGiftDesc.add("Created in 2002, the Nike Dunk was adopted from the court by skateboarders and sneakerheads to become an icon of the streets. An early catalyst to evolving sneaker culture as we know it today, the Nike Dunk has enjoyed a storied legacy of reinvention through numerous iterations and creative collaborations proving to be an integral part of a culture obsessed with sneakers. To celebrate this legacy, Nike SB: The Dunk Book is the first book to present the historical archive of one of the most important shoes ever created. Worn by an ever-growing list of elite riders at competitions all over the world, Nike Dunks are prized as much for their one-of-a-kind designs and high performance. Including Danny Supas, Staple Pigeon Dunks, De La Soul Highs, Paris Dunks, U.N.K.L.Es and Supreme Dunk SBs, this volume flaunts the signature color-ways and craftsmanship that Nike SBs are known for. Hardcover 2018, Rizzoli.");
        mBrotherGiftDesc.add("House your ever-expanding record collection in this specially designed crate from the experts at Crosley. Perfectly sized to fit your records, but show them off too, this crate is made from slats of wood with Crosley logo burnished at side. Holds 40-75 albums.");
        mBrotherGiftDesc.add("Match your meal to your seating with this pizza-shaped bean bag chair that looks like an oversized slice of goodness.");
        mBrotherGiftDesc.add("Gift yourself or a pal this set of 12 socks with Mandalorian theme motifs. Reveal a new pair of socks each day under the images printed at the back of the box.");
        mBrotherGiftDesc.add("A compact folding sunglass case made from a sustainable cork material, this case folds when not in use for convenient storage. This sleek case will protect your shades and has a magnetic closure for extra security.");

        mBrotherGiftPic.add(R.drawable.nikebook);
        mBrotherGiftPic.add(R.drawable.recordcrate);
        mBrotherGiftPic.add(R.drawable.pizzachair);
        mBrotherGiftPic.add(R.drawable.sockset);
        mBrotherGiftPic.add(R.drawable.sunglasscase);

        mRecyclerView = findViewById(R.id.recyclerView);
        mAdapter = new GiftAdapter(this, mBrotherGiftList, mBrotherGiftDesc, mBrotherGiftPic);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}