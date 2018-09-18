package com.example.juanes24.versionfinallab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegistroActivity extends AppCompatActivity {
    private EditText eCorreo, ePassword, eRpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        eCorreo=findViewById(R.id.eCorreo);
        ePassword=findViewById(R.id.ePassword);
        eRpassword=findViewById(R.id.eRpassword);


    }

    public void RegistrarseClicked(View view) {
        String email, pass, repass;

        email=eCorreo.getText().toString();
        pass=ePassword.getText().toString();
        repass=eRpassword.getText().toString();

        if(email.equals("")|| pass.equals("")|| repass.equals(""))
            Toast.makeText(getApplicationContext(),"Debe llenar todos los campos", Toast.LENGTH_SHORT).show();
        else
        if (pass.equals(repass));
        else
            Toast.makeText(getApplicationContext(),"Las contraseñas no son iguales",Toast.LENGTH_SHORT).show();

        Intent i= new Intent();
        i.putExtra("correo",eCorreo.getText().toString());
        i.putExtra("password",ePassword.getText().toString());
        setResult(RESULT_OK,i);
        finish();
    }
}
