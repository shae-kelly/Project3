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

    FetchTime(TextView Days) { //TextView authorText) {
        this.mdays = new WeakReference<>(Days);
        //this.mAuthorText = new WeakReference<>(authorText);
    }

    protected String getDaysTill(String query) throws IOException {
        // API URL
        String apiURL = "https://christmas-days.anvil.app/_/api/get_days";
        //Append query
        apiURL += query;

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
        Log.d("CountActivityJsonString", jsonString);
        return jsonString;
    }

    @Override
    protected String doInBackground(String[] days) {
        String jsonString = null;
        try {
            jsonString = getDaysTill(days[1]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonString;
    }

    protected void onPostExecute(String s) {
        //string s is ^^ json string
        super.onPostExecute(s);
        String days = null;
        //String authors= null;
        JSONObject jsonObject = null;
        //JSONArray itemsArray = null;

        int i = 0;
        try{
//
//            jsonObject = new JSONObject(s);
//            System.out.println(jsonObject);
            //String result = jsonObject.getString();
//            for (int i =0; i < jsonObject.length(); i++)    {
//                if (result.charAt(i) == ":") {
//                    result = result;
//
//                }
//            }
        } catch (Exception e)   {
            e.printStackTrace();
        }

    }
}