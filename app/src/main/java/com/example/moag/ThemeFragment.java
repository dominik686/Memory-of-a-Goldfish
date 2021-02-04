package com.example.moag;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ThemeFragment extends Fragment
{
    ImageButton mElephantButton;
    ImageButton mGoldfishButton;
    String TAG = "URL";

    public ThemeFragment()
    {

    }
    public static ThemeFragment newInstance()
    {
        ThemeFragment fragment = new ThemeFragment();

        return fragment;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_theme, container, false);

        mElephantButton = v.findViewById(R.id.elephant_button);
        mGoldfishButton = v.findViewById(R.id.goldfish_button);



        mGoldfishButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String url = "https://goparker.com/600096/moag/puzzles/moag.json";


                Intent intent = new Intent(getContext(), MainMenuActivity.class);
                intent.putExtra(TAG, url);
                startActivity(intent);


            }
        });
        mElephantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goparker.com/600096/moag/puzzles/moae.json";


                Intent intent = new Intent(getContext(), MainMenuActivity.class);
                intent.putExtra(TAG, url);
                startActivity(intent);
            }
        });

        return v;
    }
}
