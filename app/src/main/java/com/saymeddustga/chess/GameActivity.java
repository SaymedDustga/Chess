package com.saymeddustga.chess;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {

    private char pixeles[][] = {{'Q','W','E','y','Y','E','W','Q'},
                        {'p','p','p','p','p','p','p','p'},
                        {'b','b','b','b','b','b','b','b'},
                        {'b','b','b','b','b','b','b','b'},
                        {'b','b','b','b','b','b','b','b'},
                        {'b','b','b','b','b','b','b','b'},
                        {'P','P','P','P','P','P','P','P'},
                        {'T','C','A','r','R','A','C','T'}};

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

    //private boolean PBselec = false;

    //Torres

    //Tower Blanco 01:
    private int TB1Fila = 7;
    private int TB1Columna = 0;

    //Tower Blanco 02:
    private int TB2Fila = 7;
    private int TB2Columna = 7;

    //private boolean TBselec = false;

    //Caballos

    //Caballo Blanco 01:
    private int CB1Fila = 7;
    private int CB1Columna = 1;

    //Caballo Blanco 02:
    private int CB2Fila = 7;
    private int CB2Columna = 6;

    //private boolean CBselec = false;

    //Alfiles

    //Alfil Blanco 01:
    private int AB1Fila = 7;
    private int AB1Columna = 2;

    //Alfil Blanco 02:
    private int AB2Fila = 7;
    private int AB2Columna = 5;

    //private boolean ABselec = false;

    //Rey y Reina

    //Rey Blanco:
    private int KB1Fila = 7;
    private int KB1Columna = 2;
    //private boolean KBselec = false;

    //reina Blanco:
    private int QB2Fila = 7;
    private int QB2Columna = 5;
    //private boolean QBselec = false;

    private boolean piezaSeleccionadaGeneral = false;


    private ImageView[][] imageViews = new ImageView[8][8];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

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
                if(piezaSeleccionadaGeneral == false){
                    caso = buscarCaso(7,0);
                    if(caso != 'b') {
                        imageViews[7][0].setBackgroundColor(Color.WHITE);
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

        //Coordenada H1
        imageViews[7][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(piezaSeleccionadaGeneral == false/*TBselec == false && PBselec == false && CBselec == false && ABselec==false && KBselec == false && QBselec == false*/){
                    caso = buscarCaso(7,7);
                    if(caso != 'b') {
                        imageViews[7][7].setBackgroundColor(Color.WHITE);
                    }
                }else if(filaPiezaCaso == 7 && columnaPiezaCaso == 7){
                    pintarFondo(7,7);
                    deseleccionar();
                } else if(filaPiezaCaso != 7 || columnaPiezaCaso != 7){
                    permiso = posibilidad(filaPiezaCaso, columnaPiezaCaso,7,7);
                    if(permiso){
                        char aux = pixeles[filaPiezaCaso][columnaPiezaCaso];
                        pixeles[filaPiezaCaso][columnaPiezaCaso] = 'b';
                        pixeles[7][7] = aux;
                        pintarFondo(filaPiezaCaso,columnaPiezaCaso);
                        permiso = false;
                        sincronizar(7,7);
                    }
                }
            }
        });

        //Coordenada A2
        imageViews[6][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(piezaSeleccionadaGeneral == false){
                    caso = buscarCaso(6,0);
                    if(caso != 'b') {
                        imageViews[6][0].setBackgroundColor(Color.WHITE);
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

        //Coordenada B2
        imageViews[6][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(piezaSeleccionadaGeneral == false){
                    caso = buscarCaso(6,1);
                    if(caso != 'b') {
                        imageViews[6][1].setBackgroundColor(Color.WHITE);
                    }
                }else if(filaPiezaCaso == 6 && columnaPiezaCaso == 1){
                    pintarFondo(6,1);
                    deseleccionar();
                } else if(filaPiezaCaso != 6 || columnaPiezaCaso != 1){
                    permiso = posibilidad(filaPiezaCaso, columnaPiezaCaso,6,1);
                    if(permiso){
                        char aux = pixeles[filaPiezaCaso][columnaPiezaCaso];
                        pixeles[filaPiezaCaso][columnaPiezaCaso] = 'b';
                        pixeles[6][1] = aux;
                        pintarFondo(filaPiezaCaso,columnaPiezaCaso);
                        permiso = false;
                        sincronizar(6,1);
                    }
                }
            }
        });

        //Coordenada C2
        imageViews[6][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(piezaSeleccionadaGeneral == false){
                    caso = buscarCaso(6,2);
                    if(caso != 'b') {
                        imageViews[6][2].setBackgroundColor(Color.WHITE);
                    }
                }else if(filaPiezaCaso == 6 && columnaPiezaCaso == 2){
                    pintarFondo(6,2);
                    deseleccionar();
                } else if(filaPiezaCaso != 6 || columnaPiezaCaso != 2){
                    permiso = posibilidad(filaPiezaCaso, columnaPiezaCaso,6,2);
                    if(permiso){
                        char aux = pixeles[filaPiezaCaso][columnaPiezaCaso];
                        pixeles[filaPiezaCaso][columnaPiezaCaso] = 'b';
                        pixeles[6][2] = aux;
                        pintarFondo(filaPiezaCaso,columnaPiezaCaso);
                        permiso = false;
                        sincronizar(6,2);
                    }
                }
            }
        });

        //Coordenada D2
        imageViews[6][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(piezaSeleccionadaGeneral == false){
                    caso = buscarCaso(6,3);
                    if(caso != 'b') {
                        imageViews[6][3].setBackgroundColor(Color.WHITE);
                    }
                }else if(filaPiezaCaso == 6 && columnaPiezaCaso == 3){
                    pintarFondo(6,3);
                    deseleccionar();
                } else if(filaPiezaCaso != 6 || columnaPiezaCaso != 3){
                    permiso = posibilidad(filaPiezaCaso, columnaPiezaCaso,6,3);
                    if(permiso){
                        char aux = pixeles[filaPiezaCaso][columnaPiezaCaso];
                        pixeles[filaPiezaCaso][columnaPiezaCaso] = 'b';
                        pixeles[6][3] = aux;
                        pintarFondo(filaPiezaCaso,columnaPiezaCaso);
                        permiso = false;
                        sincronizar(6,3);
                    }
                }
            }
        });

        //Coordenada E2
        imageViews[6][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(piezaSeleccionadaGeneral == false){
                    caso = buscarCaso(6,4);
                    if(caso != 'b') {
                        imageViews[6][4].setBackgroundColor(Color.WHITE);
                    }
                }else if(filaPiezaCaso == 6 && columnaPiezaCaso == 4){
                    pintarFondo(6,4);
                    deseleccionar();
                } else if(filaPiezaCaso != 6 || columnaPiezaCaso != 4){
                    permiso = posibilidad(filaPiezaCaso, columnaPiezaCaso,6,4);
                    if(permiso){
                        char aux = pixeles[filaPiezaCaso][columnaPiezaCaso];
                        pixeles[filaPiezaCaso][columnaPiezaCaso] = 'b';
                        pixeles[6][4] = aux;
                        pintarFondo(filaPiezaCaso,columnaPiezaCaso);
                        permiso = false;
                        sincronizar(6,4);
                    }
                }
            }
        });

        //Coordenada F2
        imageViews[6][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(piezaSeleccionadaGeneral == false){
                    caso = buscarCaso(6,5);
                    if(caso != 'b') {
                        imageViews[6][5].setBackgroundColor(Color.WHITE);
                    }
                }else if(filaPiezaCaso == 6 && columnaPiezaCaso == 5){
                    pintarFondo(6,5);
                    deseleccionar();
                } else if(filaPiezaCaso != 6 || columnaPiezaCaso != 5){
                    permiso = posibilidad(filaPiezaCaso, columnaPiezaCaso,6,5);
                    if(permiso){
                        char aux = pixeles[filaPiezaCaso][columnaPiezaCaso];
                        pixeles[filaPiezaCaso][columnaPiezaCaso] = 'b';
                        pixeles[6][5] = aux;
                        pintarFondo(filaPiezaCaso,columnaPiezaCaso);
                        permiso = false;
                        sincronizar(6,5);
                    }
                }
            }
        });

        //Coordenada G2
        imageViews[6][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(piezaSeleccionadaGeneral == false){
                    caso = buscarCaso(6,6);
                    if(caso != 'b') {
                        imageViews[6][6].setBackgroundColor(Color.WHITE);
                    }
                }else if(filaPiezaCaso == 6 && columnaPiezaCaso == 6){
                    pintarFondo(6,6);
                    deseleccionar();
                } else if(filaPiezaCaso != 6 || columnaPiezaCaso != 6){
                    permiso = posibilidad(filaPiezaCaso, columnaPiezaCaso,6,6);
                    if(permiso){
                        char aux = pixeles[filaPiezaCaso][columnaPiezaCaso];
                        pixeles[filaPiezaCaso][columnaPiezaCaso] = 'b';
                        pixeles[6][6] = aux;
                        pintarFondo(filaPiezaCaso,columnaPiezaCaso);
                        permiso = false;
                        sincronizar(6,6);
                    }
                }
            }
        });

        //Coordenada G2
        imageViews[6][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(piezaSeleccionadaGeneral == false){
                    caso = buscarCaso(6,7);
                    if(caso != 'b') {
                        imageViews[6][7].setBackgroundColor(Color.WHITE);
                    }
                }else if(filaPiezaCaso == 6 && columnaPiezaCaso == 7){
                    pintarFondo(6,7);
                    deseleccionar();
                } else if(filaPiezaCaso != 6 || columnaPiezaCaso != 7){
                    permiso = posibilidad(filaPiezaCaso, columnaPiezaCaso,6,7);
                    if(permiso){
                        char aux = pixeles[filaPiezaCaso][columnaPiezaCaso];
                        pixeles[filaPiezaCaso][columnaPiezaCaso] = 'b';
                        pixeles[6][7] = aux;
                        pintarFondo(filaPiezaCaso,columnaPiezaCaso);
                        permiso = false;
                        sincronizar(6,7);
                    }
                }
            }
        });

        //Coordenada A3
        imageViews[5][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(piezaSeleccionadaGeneral == false){
                    caso = buscarCaso(5,0);
                    if(caso != 'b') {
                        imageViews[5][0].setBackgroundColor(Color.WHITE);
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

        //Coordenada B3
        imageViews[5][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(piezaSeleccionadaGeneral == false){
                    caso = buscarCaso(5,1);
                    if(caso != 'b') {
                        imageViews[5][1].setBackgroundColor(Color.WHITE);
                    }
                }else if(filaPiezaCaso == 5 && columnaPiezaCaso == 1){
                    pintarFondo(5,1);
                    deseleccionar();
                } else if(filaPiezaCaso != 5 || columnaPiezaCaso != 1){
                    permiso = posibilidad(filaPiezaCaso, columnaPiezaCaso,5,1);
                    if(permiso){
                        char aux = pixeles[filaPiezaCaso][columnaPiezaCaso];
                        pixeles[filaPiezaCaso][columnaPiezaCaso] = 'b';
                        pixeles[5][1] = aux;
                        pintarFondo(filaPiezaCaso,columnaPiezaCaso);
                        permiso = false;
                        sincronizar(5,1);
                    }
                }
            }
        });

        //Coordenada C3
        imageViews[5][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(piezaSeleccionadaGeneral == false){
                    caso = buscarCaso(5,2);
                    if(caso != 'b') {
                        imageViews[5][2].setBackgroundColor(Color.WHITE);
                    }
                }else if(filaPiezaCaso == 5 && columnaPiezaCaso == 2){
                    pintarFondo(5,2);
                    deseleccionar();
                } else if(filaPiezaCaso != 5 || columnaPiezaCaso != 2){
                    permiso = posibilidad(filaPiezaCaso, columnaPiezaCaso,5,2);
                    if(permiso){
                        char aux = pixeles[filaPiezaCaso][columnaPiezaCaso];
                        pixeles[filaPiezaCaso][columnaPiezaCaso] = 'b';
                        pixeles[5][2] = aux;
                        pintarFondo(filaPiezaCaso,columnaPiezaCaso);
                        permiso = false;
                        sincronizar(5,2);
                    }
                }
            }
        });

        //Coordenada D3
        imageViews[5][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(piezaSeleccionadaGeneral == false){
                    caso = buscarCaso(5,3);
                    if(caso != 'b') {
                        imageViews[5][3].setBackgroundColor(Color.WHITE);
                    }
                }else if(filaPiezaCaso == 5 && columnaPiezaCaso == 3){
                    pintarFondo(5,3);
                    deseleccionar();
                } else if(filaPiezaCaso != 5 || columnaPiezaCaso != 3){
                    permiso = posibilidad(filaPiezaCaso, columnaPiezaCaso,5,3);
                    if(permiso){
                        char aux = pixeles[filaPiezaCaso][columnaPiezaCaso];
                        pixeles[filaPiezaCaso][columnaPiezaCaso] = 'b';
                        pixeles[5][3] = aux;
                        pintarFondo(filaPiezaCaso,columnaPiezaCaso);
                        permiso = false;
                        sincronizar(5,3);
                    }
                }
            }
        });

        //Coordenada E3
        imageViews[5][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(piezaSeleccionadaGeneral == false){
                    caso = buscarCaso(5,4);
                    if(caso != 'b') {
                        imageViews[5][4].setBackgroundColor(Color.WHITE);
                    }
                }else if(filaPiezaCaso == 5 && columnaPiezaCaso == 4){
                    pintarFondo(5,4);
                    deseleccionar();
                } else if(filaPiezaCaso != 5 || columnaPiezaCaso != 4){
                    permiso = posibilidad(filaPiezaCaso, columnaPiezaCaso,5,4);
                    if(permiso){
                        char aux = pixeles[filaPiezaCaso][columnaPiezaCaso];
                        pixeles[filaPiezaCaso][columnaPiezaCaso] = 'b';
                        pixeles[5][4] = aux;
                        pintarFondo(filaPiezaCaso,columnaPiezaCaso);
                        permiso = false;
                        sincronizar(5,4);
                    }
                }
            }
        });

        //Coordenada F3
        imageViews[5][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(piezaSeleccionadaGeneral == false){
                    caso = buscarCaso(5,5);
                    if(caso != 'b') {
                        imageViews[5][5].setBackgroundColor(Color.WHITE);
                    }
                }else if(filaPiezaCaso == 5 && columnaPiezaCaso == 5){
                    pintarFondo(5,5);
                    deseleccionar();
                } else if(filaPiezaCaso != 5 || columnaPiezaCaso != 5){
                    permiso = posibilidad(filaPiezaCaso, columnaPiezaCaso,5,5);
                    if(permiso){
                        char aux = pixeles[filaPiezaCaso][columnaPiezaCaso];
                        pixeles[filaPiezaCaso][columnaPiezaCaso] = 'b';
                        pixeles[5][5] = aux;
                        pintarFondo(filaPiezaCaso,columnaPiezaCaso);
                        permiso = false;
                        sincronizar(5,5);
                    }
                }
            }
        });

        //Coordenada G3
        imageViews[5][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(piezaSeleccionadaGeneral == false){
                    caso = buscarCaso(5,6);
                    if(caso != 'b') {
                        imageViews[5][6].setBackgroundColor(Color.WHITE);
                    }
                }else if(filaPiezaCaso == 5 && columnaPiezaCaso == 6){
                    pintarFondo(5,6);
                    deseleccionar();
                } else if(filaPiezaCaso != 5 || columnaPiezaCaso != 6){
                    permiso = posibilidad(filaPiezaCaso, columnaPiezaCaso,5,6);
                    if(permiso){
                        char aux = pixeles[filaPiezaCaso][columnaPiezaCaso];
                        pixeles[filaPiezaCaso][columnaPiezaCaso] = 'b';
                        pixeles[5][6] = aux;
                        pintarFondo(filaPiezaCaso,columnaPiezaCaso);
                        permiso = false;
                        sincronizar(5,6);
                    }
                }
            }
        });

        //Coordenada H3
        imageViews[5][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(piezaSeleccionadaGeneral == false){
                    caso = buscarCaso(5,7);
                    if(caso != 'b') {
                        imageViews[5][7].setBackgroundColor(Color.WHITE);
                    }
                }else if(filaPiezaCaso == 5 && columnaPiezaCaso == 7){
                    pintarFondo(5,7);
                    deseleccionar();
                } else if(filaPiezaCaso != 5 || columnaPiezaCaso != 7){
                    permiso = posibilidad(filaPiezaCaso, columnaPiezaCaso,5,7);
                    if(permiso){
                        char aux = pixeles[filaPiezaCaso][columnaPiezaCaso];
                        pixeles[filaPiezaCaso][columnaPiezaCaso] = 'b';
                        pixeles[5][7] = aux;
                        pintarFondo(filaPiezaCaso,columnaPiezaCaso);
                        permiso = false;
                        sincronizar(5,7);
                    }
                }
            }
        });

        //Coordenada A4
        imageViews[4][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(piezaSeleccionadaGeneral == false){
                    caso = buscarCaso(4,0);
                    if(caso != 'b') {
                        imageViews[4][0].setBackgroundColor(Color.WHITE);
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

        //Coordenada B4
        imageViews[4][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(piezaSeleccionadaGeneral == false){
                    caso = buscarCaso(4,1);
                    if(caso != 'b') {
                        imageViews[4][1].setBackgroundColor(Color.WHITE);
                    }
                }else if(filaPiezaCaso == 4 && columnaPiezaCaso == 1){
                    pintarFondo(4,1);
                    deseleccionar();
                } else if(filaPiezaCaso != 4 || columnaPiezaCaso != 1){
                    permiso = posibilidad(filaPiezaCaso, columnaPiezaCaso,4,1);
                    if(permiso){
                        char aux = pixeles[filaPiezaCaso][columnaPiezaCaso];
                        pixeles[filaPiezaCaso][columnaPiezaCaso] = 'b';
                        pixeles[4][1] = aux;
                        pintarFondo(filaPiezaCaso,columnaPiezaCaso);
                        permiso = false;
                        sincronizar(4,1);
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

        System.out.println("");
        System.out.println("TESTEO VISUALIZACION DE LA MATRIZ PIXELES EN EL METODO -deseleccionar-");
        System.out.println("");
        for(int i = 0; i<8; i++){
            for(int j = 0; j < 8; j++){
                System.out.print(pixeles[i][j]+" ");
            }
            System.out.println("");
        }
/*
        if(caso == 'T'){
            TBselec = false;
        }
        if(caso == 'C'){
            CBselec = false;
        }
        if(caso == 'A'){
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
        }*/
        piezaSeleccionadaGeneral = false;
        permiso = false;
        filaPiezaCaso = 8;
        columnaPiezaCaso = 8;
        caso = 'd';
    }

    private void sincronizar(int filaMod, int columnaMod) {
        if(caso == 'T'){
            if(TB1Fila == filaPiezaCaso && columnaPiezaCaso == TB1Columna) {
                TB1Fila = filaMod;
                TB1Columna = columnaMod;
            }else if(filaPiezaCaso == TB2Fila && columnaPiezaCaso == TB2Columna) {
                TB2Fila = filaMod;
                TB2Columna = columnaMod;
            }
            /*TB1Fila = filaMod;
            TB1Columna = columnaMod;*/
            imageViews[filaMod][columnaMod].setImageResource(R.drawable.tower_blanca);
            imageViews[filaPiezaCaso][columnaPiezaCaso].setImageResource(R.drawable.vacio);
            //TBselec = false;
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
            //PBselec = false;
        }
        piezaSeleccionadaGeneral = false;
    }

    private char buscarCaso(int fila, int columna){

        char ocasion = pixeles[fila][columna];

        if(ocasion == 'T'){
            if(TB1Fila == fila && columna == TB1Columna) {
                filaPiezaCaso = TB1Fila;
                columnaPiezaCaso = TB1Columna;
            }else if(fila == TB2Fila && columna == TB2Columna) {
                filaPiezaCaso = TB2Fila;
                columnaPiezaCaso = TB2Columna;
            }
            /*filaPiezaCaso = TB1Fila;
            columnaPiezaCaso = TB1Columna;*/
            //TBselec = true;
        }
        if(ocasion == 'P'){
            if(PB1Fila == fila && columna == PB1Columna) {
                filaPiezaCaso = PB1Fila;
                columnaPiezaCaso = PB1Columna;
            }else if(fila == PB2Fila && columna == PB2Columna) {
                filaPiezaCaso = PB2Fila;
                columnaPiezaCaso = PB2Columna;
            }else if(fila == PB3Fila && columna == PB3Columna) {
                filaPiezaCaso = PB3Fila;
                columnaPiezaCaso = PB3Columna;
            }else if(fila == PB4Fila && columna == PB4Columna) {
                filaPiezaCaso = PB4Fila;
                columnaPiezaCaso = PB4Columna;
            }else if(fila == PB5Fila && columna == PB5Columna) {
                filaPiezaCaso = PB5Fila;
                columnaPiezaCaso = PB5Columna;
            }else if(fila == PB6Fila && columna == PB6Columna) {
                filaPiezaCaso = PB6Fila;
                columnaPiezaCaso = PB6Columna;
            }else if(fila == PB7Fila && columna == PB7Columna) {
                filaPiezaCaso = PB7Fila;
                columnaPiezaCaso = PB7Columna;
            }else if(fila == PB8Fila && columna == PB8Columna) {
                filaPiezaCaso = PB8Fila;
                columnaPiezaCaso = PB8Columna;
            }
            //PBselec = true;
        }

        if(ocasion != 'b')
            piezaSeleccionadaGeneral = true;

        return pixeles[fila][columna];
    }

    private boolean posibilidad(int filaPieza, int columnaPieza, int filaSolicitud, int columnaSolicitud){

        //boolean excepcion = false;

        if(hayAliado(filaSolicitud,columnaSolicitud))
            return false;

        /*if(hayEnemigo(filaSolicitud,columnaSolicitud))
            excepcion = true;*/

        if(caso == 'T'){
            /*if(hayAliado(filaSolicitud,columnaSolicitud))
                return false;*/
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
                        if(hayAliado(i,columnaPieza) || hayEnemigo(i,columnaPieza)){
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
                } else if(columnaSolicitud < columnaPieza){
                    for(int i = columnaPieza-1; i > columnaSolicitud; i--){
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
            /*if(hayAliado(filaSolicitud,columnaSolicitud))
                return false;*/
            if((filaPieza == PB1Fila && columnaPieza == PB1Columna) && (!PB1PrimerMovimiento && filaSolicitud == filaPieza-2)
            && (pixeles[filaSolicitud][columnaSolicitud] == 'b' && pixeles[filaSolicitud+1][columnaSolicitud] == 'b')){
                PB1PrimerMovimiento = true;
                return true;
            }else if((filaPieza == PB2Fila && columnaPieza == PB2Columna) && (!PB2PrimerMovimiento && filaSolicitud == filaPieza-2)
                    && (pixeles[filaSolicitud][columnaSolicitud] == 'b' && pixeles[filaSolicitud+1][columnaSolicitud] == 'b')){
                PB2PrimerMovimiento = true;
                return true;
            }else if((filaPieza == PB3Fila && columnaPieza == PB3Columna) && (!PB3PrimerMovimiento && filaSolicitud == filaPieza-2)
                    && (pixeles[filaSolicitud][columnaSolicitud] == 'b' && pixeles[filaSolicitud+1][columnaSolicitud] == 'b')){
                PB3PrimerMovimiento = true;
                return true;
            }else if((filaPieza == PB4Fila && columnaPieza == PB4Columna) && (!PB4PrimerMovimiento && filaSolicitud == filaPieza-2)
                    && (pixeles[filaSolicitud][columnaSolicitud] == 'b' && pixeles[filaSolicitud+1][columnaSolicitud] == 'b')){
                PB4PrimerMovimiento = true;
                return true;
            }else if((filaPieza == PB5Fila && columnaPieza == PB5Columna) && (!PB5PrimerMovimiento && filaSolicitud == filaPieza-2)
                    && (pixeles[filaSolicitud][columnaSolicitud] == 'b' && pixeles[filaSolicitud+1][columnaSolicitud] == 'b')){
                PB5PrimerMovimiento = true;
                return true;
            }else if((filaPieza == PB6Fila && columnaPieza == PB6Columna) && (!PB6PrimerMovimiento && filaSolicitud == filaPieza-2)
                    && (pixeles[filaSolicitud][columnaSolicitud] == 'b' && pixeles[filaSolicitud+1][columnaSolicitud] == 'b')){
                PB6PrimerMovimiento = true;
                return true;
            }else if((filaPieza == PB7Fila && columnaPieza == PB7Columna) && (!PB7PrimerMovimiento && filaSolicitud == filaPieza-2)
                    && (pixeles[filaSolicitud][columnaSolicitud] == 'b' && pixeles[filaSolicitud+1][columnaSolicitud] == 'b')){
                PB7PrimerMovimiento = true;
                return true;
            }else if((filaPieza == PB8Fila && columnaPieza == PB8Columna) && (!PB8PrimerMovimiento && filaSolicitud == filaPieza-2)
                    && (pixeles[filaSolicitud][columnaSolicitud] == 'b' && pixeles[filaSolicitud+1][columnaSolicitud] == 'b')){
                PB8PrimerMovimiento = true;
                return true;
            }


            if(filaSolicitud == filaPieza-1 && pixeles[filaSolicitud][columnaSolicitud] == 'b'){
                return true;
            }else if((filaSolicitud == filaPieza-1 && (columnaSolicitud == columnaPieza + 1 || columnaSolicitud == columnaPieza - 1)) && hayEnemigo(filaSolicitud,columnaSolicitud)){
                return true;
            }
        }
        return false;
    }

    private boolean hayAliado(int fila, int columna){
        if(pixeles[fila][columna] == 'T' || pixeles[fila][columna] == 'C' || pixeles[fila][columna] == 'A'
                || pixeles[fila][columna] == 'R' || pixeles[fila][columna] == 'r' || pixeles[fila][columna] == 'P'){
            return true;
        }
        return false;
    }

    private boolean hayEnemigo(int fila, int columna){
        if(pixeles[fila][columna] == 'Q' || pixeles[fila][columna] == 'W' || pixeles[fila][columna] == 'E'
                || pixeles[fila][columna] == 'Y' || pixeles[fila][columna] == 'y' || pixeles[fila][columna] == 'p'){
            return true;
        }
        return false;
    }
}

/*
    private char pixeles[][] = {{'Q','W','E','y','Y','E','W','Q'},
                                {'p','p','p','p','p','p','p','p'},
                                {'b','b','b','b','b','b','b','b'},
                                {'b','b','b','b','b','b','b','b'},
                                {'b','b','b','b','b','b','b','b'},
                                {'b','b','b','b','b','b','b','b'},
                                {'P','P','P','P','P','P','P','P'},
                                {'T','C','A','r','R','A','C','T'}};
 */