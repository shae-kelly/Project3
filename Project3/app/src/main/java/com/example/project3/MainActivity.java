package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        File path = getApplicationContext().getFilesDir();
        try {
            FileOutputStream writer = new FileOutputStream(new File(path, "favoriteGifts.txt"), false);
            String content = "";
            Log.e("content", content);
            writer.write(content.getBytes());
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
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