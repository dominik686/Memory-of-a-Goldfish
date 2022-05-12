package com.example.moag.volley;

import android.graphics.Bitmap;

import com.android.volley.VolleyError;
import com.example.moag.models.Tile;

public interface VolleyImageResponse
{
    void onResponse(Bitmap pBitmap, Tile pTile);
    void onError(VolleyError pError, String pTag);

}
