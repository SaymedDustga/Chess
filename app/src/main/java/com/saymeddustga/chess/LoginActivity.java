package com.saymeddustga.chess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.saymeddustga.chess.common.Constantes;

public class LoginActivity extends AppCompatActivity {

    EditText etNick1;
    EditText etNick2;
    Button btnStartGame;
    String nick1 , nick2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //salto de juego mientras se testea
        Intent test = new Intent(LoginActivity.this,GameActivity.class);
        startActivity(test);

        etNick1 = findViewById(R.id.editTextNicknameP1);
        etNick2 = findViewById(R.id.editTextNicknameP2);
        btnStartGame = findViewById(R.id.buttonStartGame);

        //cambiar tipo de fuente:


        Typeface typeface = Typeface.createFromAsset(getAssets(),"pixel.ttf");

        etNick1.setTypeface(typeface);
        etNick2.setTypeface(typeface);
        btnStartGame.setTypeface(typeface);

        //Eventos: evento click

        btnStartGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nick1 = etNick1.getText().toString();
                nick2 = etNick1.getText().toString();
                if(nick1.isEmpty() || nick2.isEmpty()){
                    if(nick1.isEmpty())
                        etNick1.setError("Introduzca el NickName");
                    if(nick2.isEmpty())
                        etNick2.setError("Introduzca el NickName");
                }else if(nick1 == nick2){
                    etNick1.setError("No puedes tener el mismo NickName que P2");
                    etNick2.setError("No puedes tener el mismo NickName que P1");
                } else{
                    etNick1.setText("");
                    etNick2.setText("");
                    Intent i = new Intent(LoginActivity.this,GameActivity.class);
                    i.putExtra(Constantes.EXTRA_NICK1,nick1);
                    i.putExtra(Constantes.EXTRA_NICK2,nick2);
                    startActivity(i);
                }
            }
        });
    }
}