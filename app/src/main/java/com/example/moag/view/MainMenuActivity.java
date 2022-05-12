package com.example.moag.view;


import androidx.fragment.app.Fragment;

public class MainMenuActivity extends SingleFragmentActivity
{
    @Override
    protected Fragment createFragment()
    {
        return  MainMenuFragment.newInstance();
    }
}
