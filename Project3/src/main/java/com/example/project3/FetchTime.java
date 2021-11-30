package com.example.project3;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;

public class FetchTime extends AsyncTask<String, Void, String> {
    private final WeakReference<TextView> mdays;

    FetchTime(TextView Days) {
        this.mdays = new WeakReference<>(Days);
    }

    protected String getDaysTill() throws IOException {
        // API URL
        String apiURL = "https://christmas-days.anvil.app/_/api/get_days";

        //Make connection to API
        URL requestURL = new URL(apiURL);
        HttpURLConnection urlConnection = (HttpURLConnection) requestURL.openConnection();
        urlConnection.setRequestMethod("GET");
        urlConnection.connect();

        //Receive the response
        InputStream inputStream = urlConnection.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        //Create a String with the reponse
        StringBuilder builder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            builder.append(line);
            builder.append("\n");
        }
        String jsonString = builder.toString();

        return jsonString;
    }

    @Override
    protected String doInBackground(String... days) {
        String jsonString = null;

        try {
            jsonString = getDaysTill();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.d("FetchTime.java", jsonString);

        return jsonString;
    }

    protected void onPostExecute(String s) {
        String result = null;
        super.onPostExecute(s);
        JSONObject jsonObject = null;

        try{
            jsonObject = new JSONObject(s);
            result = jsonObject.getString("Days to Christmas");
            mdays.get().setText(result);
        } catch (Exception e)   {
            e.printStackTrace();
        }
    }
}