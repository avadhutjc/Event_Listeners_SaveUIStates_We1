package com.masai.a419june_event_listeners_saveuistates_we1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTvWelcome;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("TAG","onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvWelcome = findViewById(R.id.tvWelcomeToMasai);
        mTvWelcome.setText("Welcome to Masai School");
        if (savedInstanceState != null) {
            String data = savedInstanceState.getString("key");
            mTvWelcome.setText(data);
        }

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("key", "Screen Rotated");
        Log.d("TAG","onSavedInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("TAG","onRestoreInstanceState");
    }
}
