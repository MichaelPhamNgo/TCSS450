package edu.tacoma.uw.pham19.myfirstapp;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
public class DisplayMessageActivity extends AppCompatActivity {
    private final String CLASS_NAME = "DisplayMessageActivity";
    //Text View
    private TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        //Actionbar title
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Display Message Activity");

        //Get intent
        Intent intent = getIntent();
        String message = intent.getStringExtra("MESSAGE");

        //Mapping text view component on GUI
        output = (TextView)findViewById(R.id.txtMessage);

        //Set message to text view
        output.setText(message);
        Log.i(CLASS_NAME, "onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e(CLASS_NAME,"onStart");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(CLASS_NAME,"onPause");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.w(CLASS_NAME,"onResume");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(CLASS_NAME,"onStop");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(CLASS_NAME,"onRestart");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(CLASS_NAME,"onDestroy");
    }
}
