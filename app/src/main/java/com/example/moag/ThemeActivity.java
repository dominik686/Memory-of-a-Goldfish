package com.example.moag;

import androidx.fragment.app.Fragment;

public class ThemeActivity extends  SingleFragmentActivity
{
    @Override
    protected Fragment createFragment()
    {
        AcceptSSLCerts.accept();
        return ThemeFragment.newInstance();
    }
}
