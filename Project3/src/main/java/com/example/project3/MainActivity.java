package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecretSantaActivity(View view) {
        Intent intent = new Intent(this, SecretSantaActivity.class);
        startActivity(intent);
    }

    public void launchGiftsActivity(View view) {
        Intent intent = new Intent(this, GiftActivity.class);
        startActivity(intent);
    }

    public void launchCountdownActivity(View view) {
        Intent intent = new Intent(this, CountDownActivity.class);
        startActivity(intent);
    }


}