package com.JuanDelgado.clase1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mensajeVisible;
    EditText nombreUsuario;
    int userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mensajeVisible = findViewById(R.id.mensajeVisible);
        nombreUsuario = findViewById(R.id.nombreUsuario);

        mensajeVisible.setText("Hola señor Usuario");
        nombreUsuario.getText();

        userName = Integer.parseInt(nombreUsuario.getText().toString());
    }
}