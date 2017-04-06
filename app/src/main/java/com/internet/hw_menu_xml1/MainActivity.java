package com.internet.hw_menu_xml1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout rl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.test_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        rl = (ConstraintLayout) findViewById(R.id.rl);
        switch (item.getItemId())
        {
            case R.id.red:
                rl.setBackgroundColor(Color.RED);
                break;
            case R.id.blue:
                rl.setBackgroundColor(Color.BLUE);
                break;
            case R.id.green:
                rl.setBackgroundColor(Color.GREEN);
                break;
            case R.id.yellow:
                rl.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.black:
                rl.setBackgroundColor(Color.BLACK);
                break;
            case R.id.gray:
                rl.setBackgroundColor(Color.GRAY);
                break;
            case R.id.pink:
                rl.setBackgroundColor(Color.MAGENTA);
                break;
            case R.id.white:
                rl.setBackgroundColor(Color.WHITE);
                break;
            case R.id.close:
                finish();
                break;
            default:
                rl.setBackgroundColor(Color.BLACK);

        }
        return super.onOptionsItemSelected(item);
    }
}
