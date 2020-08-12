package com.saymeddustga.chess;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {

    private char pixeles[][] = {{'Q','W','E','y','Y','e','w','q'},
                        {'p','p','p','p','p','p','p','p'},
                        {'b','b','b','b','b','b','b','b'},
                        {'b','b','b','b','b','b','b','b'},
                        {'b','b','b','b','b','b','b','b'},
                        {'b','b','b','b','b','b','b','b'},
                        {'P','P','P','P','P','P','P','P'},
                        {'T','C','A','r','R','a','c','t'}};

    //caso a tratar
    char caso = 'b';
    boolean permiso = false;
    int filaPiezaCaso = 8;
    int columnaPiezaCaso = 8;

    //Coordenadas Piezas y estados:

    //Blancos

   //Peones

    //Peon Blanco 01:
    private int PB1Fila = 6;
    private int PB1Columna = 0;
    private boolean PB1PrimerMovimiento = false;

    //Peon Blanco 02:
    private int PB2Fila = 6;
    private int PB2Columna = 1;
    private boolean PB2PrimerMovimiento = false;

    //Peon Blanco 03:
    private int PB3Fila = 6;
    private int PB3Columna = 2;
    private boolean PB3PrimerMovimiento = false;

    //Peon Blanco 04:
    private int PB4Fila = 6;
    private int PB4Columna = 3;
    private boolean PB4PrimerMovimiento = false;

    //Peon Blanco 05:
    private int PB5Fila = 6;
    private int PB5Columna = 4;
    private boolean PB5PrimerMovimiento = false;

    //Peon Blanco 06:
    private int PB6Fila = 6;
    private int PB6Columna = 5;
    private boolean PB6PrimerMovimiento = false;

    //Peon Blanco 07:
    private int PB7Fila = 6;
    private int PB7Columna = 6;
    private boolean PB7PrimerMovimiento = false;

    //Peon Blanco 08:
    private int PB8Fila = 6;
    private int PB8Columna = 7;
    private boolean PB8PrimerMovimiento = false;

    private boolean PBselec = false;

    //Torres

    //Tower Blanco 01:
    private int TB1Fila = 7;
    private int TB1Columna = 0;

    //Tower Blanco 02:
    private int TB2Fila = 7;
    private int TB2Columna = 7;

    private boolean TBselec = false;

    //Caballos

    //Caballo Blanco 01:
    private int CB1Fila = 7;
    private int CB1Columna = 1;

    //Caballo Blanco 02:
    private int CB2Fila = 7;
    private int CB2Columna = 6;

    private boolean CBselec = false;

    //Alfiles

    //Alfil Blanco 01:
    private int AB1Fila = 7;
    private int AB1Columna = 2;

    //Alfil Blanco 02:
    private int AB2Fila = 7;
    private int AB2Columna = 5;

    private boolean ABselec = false;

    //Rey y Reina

    //Rey Blanco:
    private int KB1Fila = 7;
    private int KB1Columna = 2;
    private boolean KBselec = false;

    //reina Blanco:
    private int QB2Fila = 7;
    private int QB2Columna = 5;
    private boolean QBselec = false;



    private ImageView[][] imageViews = new ImageView[8][8];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        /*for(int i = 0; i < seleccionado.length;i++){
            seleccionado[i] = false;
        }*/

        imageViews[7][0] = findViewById(R.id.imageViewA1);
        imageViews[7][1] = findViewById(R.id.imageViewB1);
        imageViews[7][2] = findViewById(R.id.imageViewC1);
        imageViews[7][3] = findViewById(R.id.imageViewD1);
        imageViews[7][4] = findViewById(R.id.imageViewE1);
        imageViews[7][5] = findViewById(R.id.imageViewF1);
        imageViews[7][6] = findViewById(R.id.imageViewG1);
        imageViews[7][7] = findViewById(R.id.imageViewH1);
        imageViews[6][0] = findViewById(R.id.imageViewA2);
        imageViews[6][1] = findViewById(R.id.imageViewB2);
        imageViews[6][2] = findViewById(R.id.imageViewC2);
        imageViews[6][3] = findViewById(R.id.imageViewD2);
        imageViews[6][4] = findViewById(R.id.imageViewE2);
        imageViews[6][5] = findViewById(R.id.imageViewF2);
        imageViews[6][6] = findViewById(R.id.imageViewG2);
        imageViews[6][7] = findViewById(R.id.imageViewH2);
        imageViews[5][0] = findViewById(R.id.imageViewA3);
        imageViews[5][1] = findViewById(R.id.imageViewB3);
        imageViews[5][2] = findViewById(R.id.imageViewC3);
        imageViews[5][3] = findViewById(R.id.imageViewD3);
        imageViews[5][4] = findViewById(R.id.imageViewE3);
        imageViews[5][5] = findViewById(R.id.imageViewF3);
        imageViews[5][6] = findViewById(R.id.imageViewG3);
        imageViews[5][7] = findViewById(R.id.imageViewH3);
        imageViews[4][0] = findViewById(R.id.imageViewA4);
        imageViews[4][1] = findViewById(R.id.imageViewB4);
        imageViews[4][2] = findViewById(R.id.imageViewC4);
        imageViews[4][3] = findViewById(R.id.imageViewD4);
        imageViews[4][4] = findViewById(R.id.imageViewE4);
        imageViews[4][5] = findViewById(R.id.imageViewF4);
        imageViews[4][6] = findViewById(R.id.imageViewG4);
        imageViews[4][7] = findViewById(R.id.imageViewH4);
        imageViews[3][0] = findViewById(R.id.imageViewA5);
        imageViews[3][1] = findViewById(R.id.imageViewB5);
        imageViews[3][2] = findViewById(R.id.imageViewC5);
        imageViews[3][3] = findViewById(R.id.imageViewD5);
        imageViews[3][4] = findViewById(R.id.imageViewE5);
        imageViews[3][5] = findViewById(R.id.imageViewF5);
        imageViews[3][6] = findViewById(R.id.imageViewG5);
        imageViews[3][7] = findViewById(R.id.imageViewH5);
        imageViews[2][0] = findViewById(R.id.imageViewA6);
        imageViews[2][1] = findViewById(R.id.imageViewB6);
        imageViews[2][2] = findViewById(R.id.imageViewC6);
        imageViews[2][3] = findViewById(R.id.imageViewD6);
        imageViews[2][4] = findViewById(R.id.imageViewE6);
        imageViews[2][5] = findViewById(R.id.imageViewF6);
        imageViews[2][6] = findViewById(R.id.imageViewG6);
        imageViews[2][7] = findViewById(R.id.imageViewH6);
        imageViews[1][0] = findViewById(R.id.imageViewA7);
        imageViews[1][1] = findViewById(R.id.imageViewB7);
        imageViews[1][2] = findViewById(R.id.imageViewC7);
        imageViews[1][3] = findViewById(R.id.imageViewD7);
        imageViews[1][4] = findViewById(R.id.imageViewE7);
        imageViews[1][5] = findViewById(R.id.imageViewF7);
        imageViews[1][6] = findViewById(R.id.imageViewG7);
        imageViews[1][7] = findViewById(R.id.imageViewH7);
        imageViews[0][0] = findViewById(R.id.imageViewA8);
        imageViews[0][1] = findViewById(R.id.imageViewB8);
        imageViews[0][2] = findViewById(R.id.imageViewC8);
        imageViews[0][3] = findViewById(R.id.imageViewD8);
        imageViews[0][4] = findViewById(R.id.imageViewE8);
        imageViews[0][5] = findViewById(R.id.imageViewF8);
        imageViews[0][6] = findViewById(R.id.imageViewG8);
        imageViews[0][7] = findViewById(R.id.imageViewH8);


        //Coordenada A1
        imageViews[7][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TBselec == false && PBselec == false){
                    caso = buscarCaso(7,0);
                    if(caso != 'b') {
                        imageViews[7][0].setBackgroundColor(Color.WHITE);
                        movimientoDisponible(caso);
                    }
                }else if(filaPiezaCaso == 7 && columnaPiezaCaso == 0){
                    pintarFondo(7,0);
                    deseleccionar();
                } else if(filaPiezaCaso != 7 || columnaPiezaCaso != 0){
                    permiso = posibilidad(filaPiezaCaso, columnaPiezaCaso,7,0);
                    if(permiso){
                        char aux = pixeles[filaPiezaCaso][columnaPiezaCaso];
                        pixeles[filaPiezaCaso][columnaPiezaCaso] = 'b';
                        pixeles[7][0] = aux;
                        pintarFondo(filaPiezaCaso,columnaPiezaCaso);
                        permiso = false;
                        sincronizar(7,0);
                    }
                }
            }
        });

        //Coordenada A2
        imageViews[6][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TBselec == false && PBselec == false){
                    caso = buscarCaso(6,0);
                    if(caso != 'b') {
                        imageViews[6][0].setBackgroundColor(Color.WHITE);
                        movimientoDisponible(caso);
                    }
                }else if(filaPiezaCaso == 6 && columnaPiezaCaso == 0){
                    pintarFondo(6,0);
                    deseleccionar();
                } else if(filaPiezaCaso != 6 || columnaPiezaCaso != 0){
                    permiso = posibilidad(filaPiezaCaso, columnaPiezaCaso,6,0);
                    if(permiso){
                        char aux = pixeles[filaPiezaCaso][columnaPiezaCaso];
                        pixeles[filaPiezaCaso][columnaPiezaCaso] = 'b';
                        pixeles[6][0] = aux;
                        pintarFondo(filaPiezaCaso,columnaPiezaCaso);
                        permiso = false;
                        sincronizar(6,0);
                    }
                }
            }
        });

        //Coordenada A3
        imageViews[5][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TBselec == false && PBselec == false){
                    caso = buscarCaso(5,0);
                    if(caso != 'b') {
                        imageViews[5][0].setBackgroundColor(Color.WHITE);
                        movimientoDisponible(caso);
                    }
                }else if(filaPiezaCaso == 5 && columnaPiezaCaso == 0){
                    pintarFondo(5,0);
                    deseleccionar();
                } else if(filaPiezaCaso != 5 || columnaPiezaCaso != 0){
                    permiso = posibilidad(filaPiezaCaso, columnaPiezaCaso,5,0);
                    if(permiso){
                        char aux = pixeles[filaPiezaCaso][columnaPiezaCaso];
                        pixeles[filaPiezaCaso][columnaPiezaCaso] = 'b';
                        pixeles[5][0] = aux;
                        pintarFondo(filaPiezaCaso,columnaPiezaCaso);
                        permiso = false;
                        sincronizar(5,0);
                    }
                }
            }
        });

        //Coordenada A4
        imageViews[4][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TBselec == false && PBselec == false){
                    caso = buscarCaso(4,0);
                    if(caso != 'b') {
                        imageViews[4][0].setBackgroundColor(Color.WHITE);
                        movimientoDisponible(caso);
                    }
                }else if(filaPiezaCaso == 4 && columnaPiezaCaso == 0){
                    pintarFondo(4,0);
                    deseleccionar();
                } else if(filaPiezaCaso != 4 || columnaPiezaCaso != 0){
                    permiso = posibilidad(filaPiezaCaso, columnaPiezaCaso,4,0);
                    if(permiso){
                        char aux = pixeles[filaPiezaCaso][columnaPiezaCaso];
                        pixeles[filaPiezaCaso][columnaPiezaCaso] = 'b';
                        pixeles[4][0] = aux;
                        pintarFondo(filaPiezaCaso,columnaPiezaCaso);
                        permiso = false;
                        sincronizar(4,0);
                    }
                }
            }
        });


    }

    private void pintarFondo(int fila, int columna){
        if((fila+columna)%2==0) {
            imageViews[fila][columna].setBackgroundColor(Color.parseColor("#ff9a00"));
        }else{
            imageViews[fila][columna].setBackgroundColor(Color.parseColor("#494949"));
        }
    }

    private void deseleccionar(){
        if(caso == 'T' || caso == 't'){
            TBselec = false;
        }
        if(caso == 'C' || caso == 'c'){
            CBselec = false;
        }
        if(caso == 'A' || caso == 'a'){
            ABselec = false;
        }
        if(caso == 'R'){
            KBselec = false;
        }
        if(caso == 'r'){
            QBselec = false;
        }
        if(caso == 'P'){
            PBselec = false;
        }
        permiso = false;
        filaPiezaCaso = 8;
        columnaPiezaCaso = 8;
        caso = 'd';
    }

    private void sincronizar(int filaMod, int columnaMod) {
        if(caso == 'T'){
            TB1Fila = filaMod;
            TB1Columna = columnaMod;
            imageViews[filaMod][columnaMod].setImageResource(R.drawable.tower_blanca);
            imageViews[filaPiezaCaso][columnaPiezaCaso].setImageResource(R.drawable.vacio);
            TBselec = false;
        }
        if(caso == 'P'){
            if(filaPiezaCaso == PB1Fila && columnaPiezaCaso == PB1Columna) {
                PB1Fila = filaMod;
                PB1Columna = columnaMod;
            }else if(filaPiezaCaso == PB2Fila && columnaPiezaCaso == PB2Columna) {
                PB2Fila = filaMod;
                PB2Columna = columnaMod;
            }else if(filaPiezaCaso == PB3Fila && columnaPiezaCaso == PB3Columna) {
                PB3Fila = filaMod;
                PB3Columna = columnaMod;
            }else if(filaPiezaCaso == PB4Fila && columnaPiezaCaso == PB4Columna) {
                PB4Fila = filaMod;
                PB4Columna = columnaMod;
            }else if(filaPiezaCaso == PB5Fila && columnaPiezaCaso == PB5Columna) {
                PB5Fila = filaMod;
                PB5Columna = columnaMod;
            }else if(filaPiezaCaso == PB6Fila && columnaPiezaCaso == PB6Columna) {
                PB6Fila = filaMod;
                PB6Columna = columnaMod;
            }else if(filaPiezaCaso == PB7Fila && columnaPiezaCaso == PB7Columna) {
                PB7Fila = filaMod;
                PB7Columna = columnaMod;
            }else if(filaPiezaCaso == PB8Fila && columnaPiezaCaso == PB8Columna) {
                PB8Fila = filaMod;
                PB8Columna = columnaMod;
            }
            imageViews[filaMod][columnaMod].setImageResource(R.drawable.peon_blanca);
            imageViews[filaPiezaCaso][columnaPiezaCaso].setImageResource(R.drawable.vacio);
            PBselec = false;
        }
    }

    private char buscarCaso(int fila, int columna){
        return pixeles[fila][columna];
    }

    private void movimientoDisponible(char ocasion){
        if(ocasion == 'T'){
            filaPiezaCaso = TB1Fila;
            columnaPiezaCaso = TB1Columna;
            TBselec = true;
        }
        if(ocasion == 'P'){
            filaPiezaCaso = PB1Fila;
            columnaPiezaCaso = PB1Columna;
            PBselec = true;
        }
    }

    private boolean posibilidad(int filaPieza, int columnaPieza, int filaSolicitud, int columnaSolicitud){
        //return true;
        if(caso == 'T' || caso == 't'){
            int aux1 = filaPieza;
            int aux2 = columnaPieza;
            if(hayAliado(filaSolicitud,columnaSolicitud))
                return false;
            if(filaSolicitud == filaPieza || columnaSolicitud == columnaPieza){
                if(filaSolicitud > filaPieza){
                    for(int i = filaPieza+1; i < filaSolicitud; i++){
                        if(hayAliado(i,columnaPieza) || hayEnemigo(i,columnaPieza)){
                            return false;
                        }
                    }
                    return true;
                } else if(filaSolicitud < filaPieza){
                    for(int i = filaPieza-1; i > filaSolicitud; i--){
                        if(pixeles[i][columnaPieza] != 'b'){
                            return false;
                        }
                    }
                    return true;
                }
                if(columnaSolicitud > columnaPieza){
                    for(int i = columnaPieza+1; i < columnaSolicitud; i++){
                        if(hayAliado(filaPieza,i) || hayEnemigo(filaPieza,i)){
                            return false;
                        }
                    }
                    return true;
                } else if(columnaPieza < columnaPieza){
                    for(int i = columnaPieza-1; i > columnaPieza; i--){
                        if(hayAliado(filaPieza,i) || hayEnemigo(filaPieza,i)){
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        if(caso == 'P'){
            if(hayAliado(filaSolicitud,columnaSolicitud))
                return false;
            if((filaPieza == PB1Fila && columnaPieza == PB1Columna) && (!PB1PrimerMovimiento && filaSolicitud == filaPieza-2)){
                PB1PrimerMovimiento = true;
                return true;
            }else if((filaPieza == PB2Fila && columnaPieza == PB2Columna) && (!PB2PrimerMovimiento && filaSolicitud == filaPieza-2)){
                PB2PrimerMovimiento = true;
                return true;
            }else if((filaPieza == PB3Fila && columnaPieza == PB3Columna) && (!PB3PrimerMovimiento && filaSolicitud == filaPieza-2)){
                PB3PrimerMovimiento = true;
                return true;
            }else if((filaPieza == PB4Fila && columnaPieza == PB4Columna) && (!PB4PrimerMovimiento && filaSolicitud == filaPieza-2)){
                PB4PrimerMovimiento = true;
                return true;
            }else if((filaPieza == PB5Fila && columnaPieza == PB5Columna) && (!PB5PrimerMovimiento && filaSolicitud == filaPieza-2)){
                PB5PrimerMovimiento = true;
                return true;
            }else if((filaPieza == PB6Fila && columnaPieza == PB6Columna) && (!PB6PrimerMovimiento && filaSolicitud == filaPieza-2)){
                PB6PrimerMovimiento = true;
                return true;
            }else if((filaPieza == PB7Fila && columnaPieza == PB7Columna) && (!PB7PrimerMovimiento && filaSolicitud == filaPieza-2)){
                PB7PrimerMovimiento = true;
                return true;
            }else if((filaPieza == PB8Fila && columnaPieza == PB8Columna) && (!PB8PrimerMovimiento && filaSolicitud == filaPieza-2)){
                PB8PrimerMovimiento = true;
                return true;
            }


            if(filaSolicitud == filaPieza-1){
                return true;
            }else if((filaSolicitud == filaPieza-1 && (columnaSolicitud == columnaPieza + 1 || columnaSolicitud == columnaPieza - 1)) && hayEnemigo(filaSolicitud,columnaSolicitud)){
                return true;
            }
        }
        return false;
    }

    private boolean hayAliado(int fila, int columna){
        if(pixeles[fila][columna] == 'T' || pixeles[fila][columna] == 't' || pixeles[fila][columna] == 'C'
        || pixeles[fila][columna] == 'c' || pixeles[fila][columna] == 'A' || pixeles[fila][columna] == 'a'
        || pixeles[fila][columna] == 'R' || pixeles[fila][columna] == 'r' || pixeles[fila][columna] == 'P'){
            return true;
        }
        return false;
    }

    private boolean hayEnemigo(int fila, int columna){
        if(pixeles[fila][columna] == 'Q' || pixeles[fila][columna] == 'q' || pixeles[fila][columna] == 'W'
                || pixeles[fila][columna] == 'w' || pixeles[fila][columna] == 'E' || pixeles[fila][columna] == 'e'
                || pixeles[fila][columna] == 'Y' || pixeles[fila][columna] == 'y' || pixeles[fila][columna] == 'p'){
            return true;
        }
        return false;
    }
}

/*
    private char pixeles[][] = {{'Q','W','E','y','Y','e','w','q'},
                                {'p','p','p','p','p','p','p','p'},
                                {'b','b','b','b','b','b','b','b'},
                                {'b','b','b','b','b','b','b','b'},
                                {'b','b','b','b','b','b','b','b'},
                                {'b','b','b','b','b','b','b','b'},
                                {'P','P','P','P','P','P','P','P'},
                                {'T','C','A','r','R','a','c','t'}};
 */