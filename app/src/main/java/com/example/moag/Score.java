package com.example.moag;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;

import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Set;

public class Score
{
    int mTurns;
    int mSequence;
    int mTime;


    public Score(int turns, int sequence, int time)
    {
        mTurns = turns;
        mSequence = sequence;
        mTime = time;
    }
    public Score()
    {
        mTurns = 0;
        mSequence = 0;
        mTime = 0;
    }

    public int getSequence() {
        return mSequence;
    }

    public int getTime() {
        return mTime;
    }

    public int getTurns() {
        return mTurns;
    }

    public void setSequence(int mSequence) {
        this.mSequence = mSequence;
    }

    public void setTime(int mTime) {
        this.mTime = mTime;
    }

    public void setTurns(int mTurns) {
        this.mTurns = mTurns;
    }


    public void addNewScore(Context context, String fileName)
    {
        SharedPreferences sharedPref = context.getSharedPreferences(fileName + "Scores", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();

        String string =(sharedPref.getString("score", "no scores"));
        //If the score file hasnt been initialized
        if(string == "no scores") {
            JSONArray jsonArray = new JSONArray();
            jsonArray.put(mTurns);
            jsonArray.put(mSequence);
            jsonArray.put(mTime);
            editor.putString("score", jsonArray.toString());
        }
        else
        {
            JSONArray jsonArray = null;
            try {
                jsonArray = new JSONArray(sharedPref.getString("score", "[]"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            jsonArray.put(mTurns);
            jsonArray.put(mSequence);
            jsonArray.put(mTime);
            editor.putString("score", jsonArray.toString());
        }

        editor.apply();


        ///In order to get chronocigal scores, go through it backwards when loading
    }


}

