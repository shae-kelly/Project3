package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class FriendsGift extends AppCompatActivity {
    private final LinkedList<String> mFriendGiftList = new LinkedList<>();
    private final LinkedList<String> mFriendGiftDesc = new LinkedList<>();
    private LinkedList<Integer> mFriendGiftPic = new LinkedList<>();
    private RecyclerView mRecyclerView;
    private GiftAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_gift);

        mFriendGiftList.add("Stargazer Knit Throw Blanket");
        mFriendGiftDesc.add("Matching Plaid Flannel Pajama Pants");
        mFriendGiftDesc.add("elago Charging Hub");
        mFriendGiftDesc.add("Lomography Simple Use Purple Film Disposable CameraLomography Simple Use Purple Film Disposable Camera");
        mFriendGiftDesc.add("Funko Games Signature Holiday Party Game");

        mFriendGiftDesc.add("So fluffy, this knit fleece throw blanket is as soft as a cloud. Featuring ribbed detailing at edges and rope harness for easy toting to and from slumber parties.");
        mFriendGiftDesc.add("Just in time for the holidays, get your friends together for a jam session with our matching Jingle Jammies");
        mFriendGiftDesc.add("Prop up every daily essential from your iPhone to your Apple Watch and AirPods while you charge with this hub from elago. Silicone stand features slots for each item, made from a soft-touch silicone in a compact, tabletop design that you can feed your chargers through (not included).");
        mFriendGiftDesc.add("Pre-loaded with 27 exposures of 35 mm purple monochrome film, Lomography's simple use disposable camera allows you to digitally detox while still taking customizable pics at your next party, wedding or road trip! Get even more creative with attached color filters and a built-in flash. Instructions are printed at the back for super simple, instant use. Be sure to ask your preferred film lab about recycling options for your disposable camera.");
        mFriendGiftDesc.add("Bring the cheer on holiday nights with these party games by Funko inspired by your favorite movies of the season. Choose to spend the cheer with Buddy, Ralphie or the Griswolds.");

        mFriendGiftPic.add(R.drawable.blanket);
        mFriendGiftPic.add(R.drawable.pj_pants);
        mFriendGiftPic.add(R.drawable.charger);
        mFriendGiftPic.add(R.drawable.camera);
        mFriendGiftPic.add(R.drawable.christmas_game);

        mRecyclerView = findViewById(R.id.recyclerView);
        mAdapter = new GiftAdapter(this, mFriendGiftList, mFriendGiftDesc, mFriendGiftPic);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}