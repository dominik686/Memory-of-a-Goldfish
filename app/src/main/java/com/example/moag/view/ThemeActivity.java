package com.example.moag.view;

import androidx.fragment.app.Fragment;

import com.example.moag.volley.AcceptSSLCerts;

public class ThemeActivity extends SingleFragmentActivity
{
    @Override
    protected Fragment createFragment()
    {
        AcceptSSLCerts.accept();
        return ThemeFragment.newInstance();
    }
}
