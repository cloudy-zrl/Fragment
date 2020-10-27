package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private Fragment mFragments[];
    private RadioGroup radioGroup;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private RadioButton rbtHome,rbtFunc,rbtSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFragments = new Fragment[3];
        fragmentManager = getSupportFragmentManager();
        mFragments[0] = fragmentManager.findFragmentById(R.id.fragment_main);
        mFragments[1] = fragmentManager.findFragmentById(R.id.fragment_func);
        mFragments[2] = fragmentManager.findFragmentById(R.id.fragment_setting);
        fragmentTransaction = fragmentManager.beginTransaction().hide(mFragments[0]).hide(mFragments[1]).hide(mFragments[2]);
        fragmentTransaction.show(mFragments[0]).commit();

        rbtHome = (RadioButton)findViewById(R.id.rbtHome);
        rbtFunc = (RadioButton)findViewById(R.id.rbtFunc);
        rbtSetting = (RadioButton)findViewById(R.id.rbtSetting);
        radioGroup = (RadioGroup)findViewById(R.id.bottomGroup);
        radioGroup.setOnCheckedChangeListener(RadioGroup group,int checkd);
    }
}