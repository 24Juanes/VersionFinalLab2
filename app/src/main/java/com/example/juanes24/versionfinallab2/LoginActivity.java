package com.example.juanes24.versionfinallab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private String correo, password;
    private EditText eCorreo, ePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        eCorreo = findViewById(R.id.eCorreo);
        ePassword = findViewById(R.id.ePassword);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == 1234) {
            correo = data.getExtras().getString("correo");
            password = data.getExtras().getString("password");
        }
    }

    public void LoginClicked(View view) {
        if (eCorreo.getText().toString().equals(correo) && ePassword.getText().toString().equals(password)) {
            Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show();
            Intent i= new Intent(LoginActivity.this, MainActivity.class);
            i.putExtra("correo",correo );
            i.putExtra("password", password);
            startActivity(i);

        } else {
            Toast.makeText(this, "datos incorrectos", Toast.LENGTH_SHORT).show();
        }
    }

    public void RegistrarseClicked(View view) {
        Intent i= new Intent(LoginActivity.this, RegistroActivity.class);
        startActivityForResult(i, 1234);

    }
}
