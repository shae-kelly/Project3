package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class FatherGift extends AppCompatActivity {
    private final LinkedList<String> mFatherGiftList = new LinkedList<>();
    private final LinkedList<String> mFatherGiftDesc = new LinkedList<>();
    private LinkedList<Integer> mFatherGiftPic = new LinkedList<>();
    private RecyclerView mRecyclerView;
    private GiftAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_father_gift);

        mFatherGiftList.add("Packard Bell Home Theater Projector And Screen Set");
        mFatherGiftList.add("UGG Tasman Slipper");
        mFatherGiftList.add("Tooletries Toiletry Wall Organizer");
        mFatherGiftList.add("BDG Clark Sweater");
        mFatherGiftList.add("United By Blue Novelty Pompom Beanie");

        mFatherGiftPic.add(R.drawable.projector);
        mFatherGiftPic.add(R.drawable.ugg);
        mFatherGiftPic.add(R.drawable.tooletries);
        mFatherGiftPic.add(R.drawable.sweater);
        mFatherGiftPic.add(R.drawable.hat);


        mFatherGiftDesc.add("Make every movie marathon so much more cinematic with this home theater kit by Packard Bell that comes with a projector and screen. Offering stellar resolution, built-in speakers, multiple formats, stunning color and versatility for use with your cable box, streaming box, gaming systems and more, this will make your space the definitive place for the next binge watch or event viewing.");
        mFatherGiftDesc.add("Designed with a lightweight but durable sole for indoors + out, this classic UGG slipper is a versatile must-have. Soft suede upper in a slip-on silhouette with plush natural wool insole + sheepskin lining. Set on a Treadlite by UGG™ outsole for added traction and finished with an embroidered Tasman braid.");
        mFatherGiftDesc.add("Waterproof toiletry organizer from Tooletries made of 100% antibacterial silicone that uses patented technology to stick instantly to shiny surfaces. Place it on glass, mirrors or tile to solve small bathroom space and create organized storage space. Perfect for toothbrushes, razors and other small toiletries. Complete with a custom draining bottom to avoid mold and constant cleaning.");
        mFatherGiftDesc.add("Pullover sweater by BDG in a cotton blend fabrication. Fitted with rib-knit trims & contrast color tip accents. Only at Urban Outfitters.");
        mFatherGiftDesc.add("Patterned beanie by United By Blue with a ribbed fold-over cuff and topped with a pompom.");

        mRecyclerView = findViewById(R.id.recyclerView);
        mAdapter = new GiftAdapter(this, mFatherGiftList, mFatherGiftDesc, mFatherGiftPic);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}