package com.example.moag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class ScoresActivity extends SingleFragmentActivity
{

    @Override
    protected Fragment createFragment() {
        return ScoresFragment.newInstance();
    }
}
