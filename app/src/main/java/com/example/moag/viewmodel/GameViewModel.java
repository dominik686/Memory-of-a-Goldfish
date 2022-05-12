package com.example.moag.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.moag.models.Game;
import com.example.moag.models.Puzzle;
import com.example.moag.models.Score;
import com.example.moag.models.Tile;

import java.util.ArrayList;

public class GameViewModel extends AndroidViewModel
{
    private final Game mGame;
    private String mUrl;
    private LiveData<Puzzle> mPuzzle;

    public GameViewModel(@NonNull Application application, String pUrl){
        super(application);
        mGame = Game.getInstance(application.getApplicationContext());
        //If the url hasnt been provided then that means that a view model has been created already (maybe)?
        if(pUrl != null)
        {
            mUrl = pUrl;
        }

        getPuzzle(pUrl);
    }

    public LiveData<Puzzle> getPuzzle(String pUrl)
    {
        if (mPuzzle == null) {
            mPuzzle = mGame.getPuzzle(pUrl);
        }
        return mPuzzle;
    }
    public void setScore(Score score)
    {
        mGame.setScore(score);
    }



    public LiveData<Tile> getTile(String pName)
    {
        ArrayList<Tile> temp = mPuzzle.getValue().getAllTiles();

        //Look for the desired Tile
        for(Tile tile : temp)
        {
            if(tile.getName() == pName)
            {

            }
        }
        return  null;
    }




}
