package com.example.moag;


import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.sip.SipSession;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Timer;

public class MainMenuFragment extends Fragment
{
    Button mSettingsButton;
    Button mPlayButton;
    Button mAchievementsButton;
    Button mHighScoresButton;
    String mUrl;
    String TAG_URL = "URL";

    public MainMenuFragment()
    {

    }

    public static MainMenuFragment newInstance()
    {
        MainMenuFragment fragment = new MainMenuFragment();

        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_main_menu, container, false);

        mAchievementsButton = v.findViewById(R.id.achievements_button);
        mSettingsButton  = v.findViewById(R.id.settings_button);
        mHighScoresButton = v.findViewById(R.id.highScores_button);
        mPlayButton = v.findViewById(R.id.play_button);


        mPlayButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getContext(), PlayActivity.class);

                Bundle extras = getActivity().getIntent().getExtras();
                if (extras != null && extras.getString("URL") != null)
                {
                    mUrl = extras.getString("URL");
                    intent.putExtra(TAG_URL, mUrl);
                }


                getActivity().finish();
                startActivity(intent);
            }
        });

        mHighScoresButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent intent = new Intent(getContext(), ScoresActivity.class);

                Bundle extras = getActivity().getIntent().getExtras();
                if (extras != null && extras.getString("URL") != null)
                {
                    mUrl = extras.getString("URL");
                    intent.putExtra(TAG_URL, mUrl);
                }
                startActivity(intent);


            }
        });

        return v;
    }
}
