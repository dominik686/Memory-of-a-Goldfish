package com.example.moag.view;

import androidx.fragment.app.Fragment;

public class ScoresActivity extends SingleFragmentActivity
{

    @Override
    protected Fragment createFragment() {
        return ScoresFragment.newInstance();
    }
}
