package com.example.menutest;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.options_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        Toast.makeText(MainActivity.this,item.getTitle() + " is selected",Toast.LENGTH_LONG).show();
        switch (item.getItemId()){
            case R.id.search :
                return true;
            case R.id.print :
                return true;
            case R.id.copy :
                return true;
            case R.id.upload:
                return true;
            case R.id.bookmark:
                return true;
            case R.id.share:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
