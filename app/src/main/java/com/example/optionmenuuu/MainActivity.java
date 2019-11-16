package com.example.optionmenuuu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * @author liem
 * @since 16/11/19
 * in this activity the user can change the background to 3 different colors using option menu.
 */
public class MainActivity extends AppCompatActivity {
    LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll = (LinearLayout) findViewById(R.id.ll);
    }


    /**
     * inflating the menu
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    /**
     * changing the background according to the user's choice
     */
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.green) ll.setBackgroundColor(Color.GREEN);
        if (id == R.id.red) ll.setBackgroundColor(Color.RED);
        if (id == R.id.yellow) ll.setBackgroundColor(Color.YELLOW);
        return true;
    }


    /**
     *going to the next activity
     */
    public void click(View view) {
        Intent si = new Intent (this,FourColors.class);
        startActivity(si);

    }
}