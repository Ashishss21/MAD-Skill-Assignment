package com.example.mad_skill_assignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_example, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.option1){
            Intent intent = new Intent(MainActivity.this, Activity1.class);
            startActivity(intent);
            return false;
        }
        else if(id == R.id.option2){
            Intent intent = new Intent(MainActivity.this, Activity2.class);
            startActivity(intent);
            return false;
        }
        return super.onOptionsItemSelected(item);
    }
}