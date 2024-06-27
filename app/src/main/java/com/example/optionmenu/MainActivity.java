package com.example.optionmenu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int itemid = item.getItemId();
        if (itemid == R.id.menuProfile)
        {
            Toast.makeText(this, "Profile Clicked", Toast.LENGTH_SHORT).show();
        }
        if (itemid == R.id.menuSetting)
        {
            Toast.makeText(this, "Setting Clicked", Toast.LENGTH_SHORT).show();
        }
        if (itemid == R.id.menuMore)
        {
            Toast.makeText(this, "More Menu Clicked", Toast.LENGTH_SHORT).show();
        }
        if (itemid == R.id.menuExit)
        {
            Toast.makeText(this, "Exit Clicked", Toast.LENGTH_SHORT).show();
        }
            return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);
        return true;
    }
}
