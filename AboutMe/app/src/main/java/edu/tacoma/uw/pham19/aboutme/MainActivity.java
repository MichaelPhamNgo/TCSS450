package edu.tacoma.uw.pham19.aboutme;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Instead of using setOnClickActionListener, we're also able to set android:onClick function in activity_main.xml
    public void textOnClick(View view) {
        //Start Text Activity containing a string
        Intent intent = new Intent(MainActivity.this, TextActivity.class);
        startActivity(intent);
    }

    //Instead of using setOnClickActionListener, we're also able to set android:onClick function in activity_main.xml
    public void imageOnClick(View view) {
        //Start Image Activity containing an image
        Intent intent = new Intent(MainActivity.this, ImageActivity.class);
        startActivity(intent);
    }

    //Instead of using setOnClickActionListener, we're also able to set android:onClick function in activity_main.xml
    public void webOnClick(View view) {
        //Start chrome app
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.android.chrome");
        if (launchIntent != null) {
            startActivity(launchIntent);
        } else {
            Toast.makeText(MainActivity.this, "There is no package available in android", Toast.LENGTH_LONG).show();
        }
    }

    //Instead of using setOnClickActionListener, we're also able to set android:onClick function in activity_main.xml
    public void toastOnClick(View view) {
        //Pop up a string toast
        Toast.makeText(MainActivity.this, "Here's to a new quarter!", Toast.LENGTH_LONG).show();
    }

    //Instead of using setOnClickActionListener, we're also able to set android:onClick function in activity_main.xml
    public void dialogOnClick(View view) {
        //Show a dialog
        AboutMeDialog aboutme = new AboutMeDialog();
        aboutme.show(getSupportFragmentManager(), "About me dialog");
    }
}