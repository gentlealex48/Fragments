package com.kkaty.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.kkaty.fragments.Fragments.RedFragment;
import com.kkaty.fragments.Fragments.YellowFragment;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName() + "_TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d(TAG, "onStop:");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy:");
    }

    public void onAddingYellow(View view) {
        fm.beginTransaction()
                .add(R.id.fragmentHolder1,
                        YellowFragment.newInstance("wer", "Wer"), YellowFragment.TAG)
                .addToBackStack(YellowFragment.TAG)
                .commit();
    }

    @Override
    public void onFragmentInteraction(String data){
        tvMain.setText(data);
    }

    @Override
    public void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void sendDataRed(String textValue) {

        RedFragment redFragment = (RedFragment) fm.findFragmentById(R.id.fragmentHolder2);
        if (redFragment == null) addRedFragment(textValue);
        else redFragment.updateTextView(textValue);
    }

    public void onRemovingYellow(View view) {

    }

    private void addRedFragment(String textValue){
        fm.beginTransaction()
                .add(R.id.fragmentHolder2,
                        RedFragment.newInstance(textValue), RedFragment.TAG)
                .add
    }
}

