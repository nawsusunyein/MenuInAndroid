package com.example.menutest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnShowContext = (Button) findViewById(R.id.btnShowContextMenu);
        registerForContextMenu(btnShowContext);

    }


    // Creating options menu
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

    //Creating context menu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu,v,menuInfo);
        menu.setHeaderTitle("Actions Available");
        menu.add(0,v.getId(),0,"Delete");
        menu.add(0,v.getId(),0,"Top");
        menu.add(0,v.getId(),0,"Unread");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item){

        Toast.makeText(MainActivity.this,item.getTitle() + " is selected.",Toast.LENGTH_LONG).show();
        return true;
    }


    //Creating pop up menu
    public void showPopUpMenu(View view){
        PopupMenu popup = new PopupMenu(MainActivity.this,view);
        popup.setOnMenuItemClickListener(MainActivity.this);
        popup.inflate(R.menu.popup_menu);
        popup.show();

    }

    @Override
    public boolean onMenuItemClick(MenuItem item){
        Toast.makeText(MainActivity.this,item.getTitle() + " is selected.",Toast.LENGTH_LONG).show();

        switch (item.getItemId()){
            case R.id.save :
                return true;
            case R.id.delete:
                return true;
            case R.id.edit:
                return true;
                default:
                    return false;
        }
    }
}
