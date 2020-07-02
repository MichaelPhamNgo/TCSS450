package edu.tacoma.uw.pham19.myfirstapp;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    private final String CLASS_NAME = "MainActivity";
    //Edit Text
    private EditText inputData;
    //Button
    private Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Actionbar title
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Main Activity");

        //Mapping components on GUI
        inputData = (EditText) findViewById(R.id.editMessage);
        btnSubmit = (Button) findViewById(R.id.btnSend);

        //Button Action Listener
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Get data from edit view
                String message = inputData.getText().toString();
                //Activity intent
                Intent intent = new Intent(MainActivity.this, DisplayMessageActivity.class);
                //Send a message to Message Activity
                intent.putExtra("MESSAGE", message);
                //Start Message Activity
                startActivity(intent);
            }
        });
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