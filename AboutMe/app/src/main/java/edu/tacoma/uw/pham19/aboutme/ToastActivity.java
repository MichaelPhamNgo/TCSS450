package edu.tacoma.uw.pham19.aboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ToastActivity extends AppCompatActivity {
    private String TAG = "About Me - Toast Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
    }
}