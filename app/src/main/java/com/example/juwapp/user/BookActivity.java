package com.example.juwapp.user;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.juwapp.R;

public class BookActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
    }
    public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu);
        popup.show();
    }


    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.computer_science:
                Toast.makeText(this, "Item 2 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.zoology:
                Toast.makeText(this, "Item 2 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mathematics:
                Toast.makeText(this, "Item 3 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.english:
                Toast.makeText(this, "Item 4 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.ir:
                Toast.makeText(this, "Item 5 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.isl:
                Toast.makeText(this, "Item 6 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.pharmaceutical_chemistry:
                Toast.makeText(this, "Item 7 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.pharmacology:
                Toast.makeText(this, "Item 8 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Pharmaceutics:
                Toast.makeText(this, "Item 9 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.BBA:
                Toast.makeText(this, "Item 10 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Economy:
                Toast.makeText(this, "Item 11 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Commerce:
                Toast.makeText(this, "Item 12 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.homoeopathy:
                Toast.makeText(this, "Item 13 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.EMS:
                Toast.makeText(this, "Item 14 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.physical_therapy:
                Toast.makeText(this, "Item 15 clicked", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }
}