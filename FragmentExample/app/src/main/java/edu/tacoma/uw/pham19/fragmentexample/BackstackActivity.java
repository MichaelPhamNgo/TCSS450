package edu.tacoma.uw.pham19.fragmentexample;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class BackstackActivity extends AppCompatActivity {
    private Button btnFrag;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backstack);
        btnFrag = (Button)findViewById(R.id.btn_replace_fragment);
        btnFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addFragment(new Fragment2());
                Log.i("Replaced fragment", "2");
            }
        });
        replaceFragmentContent(new Fragment1());
    }

    protected void addFragment(Fragment fragment) {
        FragmentManager fmgr = getSupportFragmentManager();
        FragmentTransaction ft = fmgr.beginTransaction();
        ft.add(R.id.container_body, fragment);
        ft.addToBackStack(fragment.getClass().getSimpleName());
        ft.commit();
    }

    private void initFragment() {
        Fragment1 firstFragment = new Fragment1();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(R.id.container_body, firstFragment);
        ft.commit();
    }

    protected void replaceFragmentContent(Fragment fragment) {
        if(fragment != null) {
            FragmentManager fmgr = getSupportFragmentManager();
            FragmentTransaction ft = fmgr.beginTransaction();
            ft.replace(R.id.container_body, fragment);
            ft.commit();
        }
    }
}
