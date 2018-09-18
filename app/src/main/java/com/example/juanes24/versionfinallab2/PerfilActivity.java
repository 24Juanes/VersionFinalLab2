package com.example.juanes24.versionfinallab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class PerfilActivity extends AppCompatActivity {
    private TextView tEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        tEmail= findViewById(R.id.tEmail);
        Bundle args=getIntent().getExtras();
        if (args!=null){
        tEmail.setText(args.getString("correo"));
        }



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu2, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.mCerrar) {
            Intent intent= new Intent (PerfilActivity.this,LoginActivity.class);
            startActivity(intent);


        }else{
            onBackPressed();

        }
        return super.onOptionsItemSelected(item);
    }
}
