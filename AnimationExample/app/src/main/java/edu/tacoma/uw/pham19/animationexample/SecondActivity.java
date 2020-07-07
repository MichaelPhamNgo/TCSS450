package edu.tacoma.uw.pham19.animationexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}