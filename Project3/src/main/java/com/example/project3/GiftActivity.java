package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GiftActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gift);
    }

    public void launchmomgift(View view) {
        Intent intent = new Intent(this, MomGift.class);
        startActivity(intent);
    }

    public void launchgrandparentsgift(View view) {
        Intent intent = new Intent(this, GrandparentsGift.class);
        startActivity(intent);
    }

    public void launchfathergift(View view) {
        Intent intent = new Intent(this, FatherGift.class);
        startActivity(intent);
    }

    public void launchfriendsgift(View view) {
        Intent intent = new Intent(this, FriendsGift.class);
        startActivity(intent);
    }



}