package com.adfbagio.aprendaingles;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.adfbagio.aprendaingles.Fragment.BichosFragment;
import com.adfbagio.aprendaingles.Fragment.NumerosFragment;
import com.adfbagio.aprendaingles.Fragment.VogaisFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {

    private SmartTabLayout smartTabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smartTabLayout=findViewById(R.id.viewPagerTab);
        viewPager=findViewById(R.id.viewPager);

        getSupportActionBar().setElevation(0);
//conf adapter p as abas
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                        .add("Bichos", BichosFragment.class)
                        .add("Números", NumerosFragment.class)
                        .add("Vogais", VogaisFragment.class)
                        .create());

        viewPager.setAdapter(adapter);
        smartTabLayout.setViewPager(viewPager);


    }
}