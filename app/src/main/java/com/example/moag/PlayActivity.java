package com.example.moag;

import androidx.fragment.app.Fragment;

public class PlayActivity extends SingleFragmentActivity
{
    @Override
    protected Fragment createFragment() {
        return PlayFragment.newInstance();
    }
}