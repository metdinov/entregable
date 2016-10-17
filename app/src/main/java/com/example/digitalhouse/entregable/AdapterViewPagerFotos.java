package com.example.digitalhouse.entregable;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 17/10/16.
 */
public class AdapterViewPagerFotos extends FragmentStatePagerAdapter {
    private List<Fragment> mFragmentList;

    public AdapterViewPagerFotos(FragmentManager fm) {
        super(fm);
        mFragmentList = new ArrayList<>();
        mFragmentList.add(FotoFragment.crearFragmentFoto("Astrid y Gaston", R.drawable.astridygaston));
        mFragmentList.add(FotoFragment.crearFragmentFoto("Borago", R.drawable.borago));
        mFragmentList.add(FotoFragment.crearFragmentFoto("Central", R.drawable.central));
        mFragmentList.add(FotoFragment.crearFragmentFoto("Dom", R.drawable.dom));
        mFragmentList.add(FotoFragment.crearFragmentFoto("Dom", R.drawable.dom));
        mFragmentList.add(FotoFragment.crearFragmentFoto("Dom", R.drawable.dom));
        
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }
}
