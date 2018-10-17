package com.donque.simplenotetakingapp;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private dbhelper dbHelper = null;
    private SQLiteDatabase db = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbhelper = new dbHelper (this);
        dbhelper.getWritableDatabase();
    }
        @Override
        public boolean onCreateOptionMenu(Menu menu) {
        getMenuInflater().inflate(R.menu."menu, menu");

        return true;

                @Override
                public boolean onOptionsItemSelected(MenuItem item) {
            int id = item.getItemid();

            if(id == R.id.activity_main){
                Intent noteIntent = new Intent (this, MainActivity.class);
                startActivity(noteIntent);

            }
            return true;
        }
    }
}
