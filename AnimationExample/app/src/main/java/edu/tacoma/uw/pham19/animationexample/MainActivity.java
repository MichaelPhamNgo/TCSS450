package edu.tacoma.uw.pham19.animationexample;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.LayoutTransition;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout container;
    private Button btnChange;
    private Button btnMove;
    private Button btnAdd;
    boolean clicked = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

        container = (LinearLayout) findViewById(R.id.activity_main);
        LayoutTransition l = new LayoutTransition();
        l.enableTransitionType(LayoutTransition.CHANGING);
        container.setLayoutTransition(l);

        btnAdd = (Button)findViewById(R.id.btn_add);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                container.addView(new Button(MainActivity.this));
            }
        });

        btnChange = (Button)findViewById(R.id.btn_change);
        final Intent changeActivity = new Intent(this, SecondActivity.class);
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(changeActivity);
            }
        });

        btnMove = (Button)findViewById(R.id.btn_move);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!clicked) {
                    btnMove.animate().translationX(400).withLayer();
                    clicked = true;
                } else {
                    btnMove.animate().translationX(0).withLayer();
                    clicked = false;
                }
            }
        });
    }
}