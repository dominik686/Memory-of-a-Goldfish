package com.example.moag;

import android.graphics.Bitmap;

import androidx.lifecycle.MutableLiveData;

import com.android.volley.VolleyError;

public interface VolleyImageResponse
{
    void onResponse(Bitmap pBitmap, Tile pTile);
    void onError(VolleyError pError, String pTag);

}
