package edu.tacoma.uw.pham19.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String STATE = "Trạng thái";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(STATE, "onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(STATE, "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(STATE, "onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(STATE, "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(STATE, "onDestroy");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(STATE, "onRestoreInstanceState");
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        Log.i(STATE, "onSaveInstanceState");
    }
}