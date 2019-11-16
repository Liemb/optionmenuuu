package com.example.optionmenuuu;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

/**
 * in this activity the user can chnage the backgground to 4 different colors using the option meny
 */
public class FourColors extends AppCompatActivity {

    LinearLayout ll2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_colors);
        ll2 = (LinearLayout)findViewById(R.id.ll2);
    }


    /**
     * adding the 4th color
     */
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,400,"blue");
        return true;
    }


    /**
     * changing the background according to the choice
     */
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if (id == R.id.green) ll2.setBackgroundColor(Color.GREEN);
        if (id == R.id.red) ll2.setBackgroundColor(Color.RED);
        if (id == R.id.yellow) ll2.setBackgroundColor(Color.YELLOW);
        String st=item.getTitle().toString();
        if (st=="blue")ll2.setBackgroundColor(Color.BLUE);
        return true;
    }


    /**
     * going back to the first activity
     */
    public void click2(View view) {
        finish();
    }
}
