package com.example.juanes24.versionfinallab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private String correo, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle args = getIntent().getExtras();
        if (args != null) {
            correo = args.getString("correo");
            password = args.getString("password");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.mMenu) {
            Intent intent= new Intent (MainActivity.this,PerfilActivity.class);
            startActivity(intent);


        }else{
            onBackPressed();

        }


        return super.onOptionsItemSelected(item);

    }
}
