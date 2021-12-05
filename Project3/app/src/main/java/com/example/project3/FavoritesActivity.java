package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class FavoritesActivity extends AppCompatActivity {
    private LinkedList<String> mNameList = new LinkedList<>();
    private LinkedList<String> mDescriptionList = new LinkedList<>();
    private LinkedList<Integer> links = new LinkedList<Integer>();

    private RecyclerView mRecyclerView;
    private GiftAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        String lon = readFile();
        Log.e("content", lon);

        if(lon.length() == 0){
            mNameList.add( "Favorites");
            mDescriptionList.add("This Shows your favorite gifts!");
            links.add(0);
        }
        else {
            String[] array = lon.split("\n");
            for (int i = 0; i < array.length; i++) {
                String[] sub = array[i].split(";");
                Log.e("content", String.valueOf(sub.length));
                if(!mNameList.contains(sub[0])){
                    mNameList.add(sub[0]);
                    mDescriptionList.add(sub[1]);
                    links.add(Integer.parseInt(sub[2]));
                }
            }
        }
            // Get a handle to the RecyclerView.
            mRecyclerView = findViewById(R.id.recyclerview);
            // Create an adapter and supply the data to be displayed.
            mAdapter = new GiftAdapter(this, mNameList, mDescriptionList, links);
            // Connect the adapter with the RecyclerView.
            mRecyclerView.setAdapter(mAdapter);
            // Give the RecyclerView a default layout manager.
            mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }


    public String readFile() {
        File path = getApplicationContext().getFilesDir();
        File readFrom = new File(path, "favoriteGifts.txt");
        byte[] content = new byte[(int) readFrom.length()];

        try {
            FileInputStream stream = new FileInputStream(readFrom);
            stream.read(content);
            return new String(content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }


}