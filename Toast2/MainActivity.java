package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId()) {
            case R.id.message:Toast.makeText(getApplicationContext(),"Shows message icon",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.picture:Toast.makeText(getApplicationContext(),"Shows picure icon",Toast.LENGTH_SHORT).show();
                return (true);
            case R.id.mode:Toast.makeText(getApplicationContext(),"Shows call icon",Toast.LENGTH_SHORT).show();
                return (true);
            case R.id.about:Toast.makeText(getApplicationContext(),"about menu",Toast.LENGTH_SHORT).show();
                return (true);
            case R.id.exit:finish();
                return (true);
        }
        return (super.onOptionsItemSelected(item));
    }
}
