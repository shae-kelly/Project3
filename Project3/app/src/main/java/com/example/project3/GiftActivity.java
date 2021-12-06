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

    public void momgift(View view) {
        Intent intent = new Intent(this, MomGift.class);
        startActivity(intent);
    }

    public void dadgift(View view) {
        Intent intent = new Intent(this, FatherGift.class);
        startActivity(intent);
    }

    public void grandparentsgift(View view) {
        Intent intent = new Intent(this, GrandparentsGift.class);
        startActivity(intent);
    }

    public void FavoriteGifts(View view){
        Intent intent = new Intent(this, FavoritesActivity.class);
        startActivity(intent);
    }

    public void sistergifts(View view) {
        Intent intent = new Intent(this, SisterGift.class);
        startActivity(intent);
    }

    public void brothergifts(View view) {
        Intent intent = new Intent(this, BrotherGift.class);
        startActivity(intent);
    }
}