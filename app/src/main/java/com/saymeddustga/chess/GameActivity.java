package com.saymeddustga.chess;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
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
    private int KBFila = 7;
    private int KBColumna = 4;
    //private boolean KBselec = false;

    //reina Blanco:
    private int QBFila = 7;
    private int QBColumna = 3;
    //private boolean QBselec = false;

    //Negros

    //Peones

    //Peon Negro 01:
    private int PN1Fila = 1;
    private int PN1Columna = 0;
    private boolean PN1PrimerMovimiento = false;

    //Peon Negro 02:
    private int PN2Fila = 1;
    private int PN2Columna = 1;
    private boolean PN2PrimerMovimiento = false;

    //Peon Negro 03:

    private int PN3Fila = 1;
    private int PN3Columna = 2;
    private boolean PN3PrimerMovimiento = false;

    //Peon Negro 04:
    private int PN4Fila = 1;
    private int PN4Columna = 3;
    private boolean PN4PrimerMovimiento = false;

    //Peon Negro 05:
    private int PN5Fila = 1;
    private int PN5Columna = 4;
    private boolean PN5PrimerMovimiento = false;

    //Peon Negro 06:
    private int PN6Fila = 1;
    private int PN6Columna = 5;
    private boolean PN6PrimerMovimiento = false;

    //Peon Negro 07:
    private int PN7Fila = 1;
    private int PN7Columna = 6;
    private boolean PN7PrimerMovimiento = false;

    //Peon Negro 08:
    private int PN8Fila = 1;
    private int PN8Columna = 7;
    private boolean PN8PrimerMovimiento = false;

    //private boolean PNselec = false;

    //Torres

    //Tower Negro 01:
    private int TN1Fila = 0;
    private int TN1Columna = 0;

    //Tower Negro 02:
    private int TN2Fila = 0;
    private int TN2Columna = 7;

    //private boolean TNselec = false;

    //Caballos

    //Caballo Negro 01:
    private int CN1Fila = 0;
    private int CN1Columna = 1;

    //Caballo Negro 02:
    private int CN2Fila = 0;
    private int CN2Columna = 6;

    //private boolean CNselec = false;

    //Alfiles

    //Alfil Negro 01:
    private int AN1Fila = 0;
    private int AN1Columna = 2;

    //Alfil Negro 02:
    private int AN2Fila = 0;
    private int AN2Columna = 5;

    //private boolean ANselec = false;

    //Rey y Reina

    //Rey Negro:
    private int KNFila = 0;
    private int KNColumna = 4;
    //private boolean KNselec = false;

    //reina Negro:
    private int QNFila = 0;
    private int QNColumna = 3;
    //private boolean QNselec = false;

    private boolean piezaSeleccionadaGeneral = false;

    private int turno = 1;

    private int ganador = 0;

    private boolean finDelJuego = false;

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
                ejecutarAcciones(7,0);
            }
        });

        //Coordenada B1
        imageViews[7][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(7,1);
            }
        });

        //Coordenada C1
        imageViews[7][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(7,2);
            }
        });

        //Coordenada D1
        imageViews[7][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(7,3);
            }
        });

        //Coordenada E1
        imageViews[7][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(7,4);
            }
        });

        //Coordenada F1
        imageViews[7][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(7,5);
            }
        });

        //Coordenada G1
        imageViews[7][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(7,6);
            }
        });

        //Coordenada H1
        imageViews[7][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(7,7);
            }
        });

        //Coordenada A2
        imageViews[6][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(6,0);
            }
        });

        //Coordenada B2
        imageViews[6][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(6,1);
            }
        });

        //Coordenada C2
        imageViews[6][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(6,2);
            }
        });

        //Coordenada D2
        imageViews[6][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(6,3);
            }
        });

        //Coordenada E2
        imageViews[6][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(6,4);
            }
        });

        //Coordenada F2
        imageViews[6][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(6,5);
            }
        });

        //Coordenada G2
        imageViews[6][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(6,6);
            }
        });

        //Coordenada G2
        imageViews[6][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(6,7);
            }
        });

        //Coordenada A3
        imageViews[5][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(5,0);
            }
        });

        //Coordenada B3
        imageViews[5][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(5,1);
            }
        });

        //Coordenada C3
        imageViews[5][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(5,2);
            }
        });

        //Coordenada D3
        imageViews[5][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(5,3);
            }
        });

        //Coordenada E3
        imageViews[5][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(5,4);
            }
        });

        //Coordenada F3
        imageViews[5][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(5,5);
            }
        });

        //Coordenada G3
        imageViews[5][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(5,6);
            }
        });

        //Coordenada H3
        imageViews[5][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(5,7);
            }
        });

        //Coordenada A4
        imageViews[4][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(4,0);
            }
        });

        //Coordenada B4
        imageViews[4][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(4,1);
            }
        });

        //Coordenada C4
        imageViews[4][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(4,2);
            }
        });

        //Coordenada D4
        imageViews[4][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(4,3);
            }
        });

        //Coordenada E4
        imageViews[4][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(4,4);
            }
        });

        //Coordenada F4
        imageViews[4][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(4,5);
            }
        });

        //Coordenada G4
        imageViews[4][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(4,6);
            }
        });

        //Coordenada H4
        imageViews[4][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(4,7);
            }
        });

        //Coordenada A5
        imageViews[3][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(3,0);
            }
        });

        //Coordenada B5
        imageViews[3][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(3,1);
            }
        });

        //Coordenada C5
        imageViews[3][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(3,2);
            }
        });

        //Coordenada D5
        imageViews[3][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(3,3);
            }
        });

        //Coordenada E5
        imageViews[3][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(3,4);
            }
        });

        //Coordenada F5
        imageViews[3][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(3,5);
            }
        });

        //Coordenada G5
        imageViews[3][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(3,6);
            }
        });

        //Coordenada H5
        imageViews[3][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(3,7);
            }
        });

        //Coordenada A6
        imageViews[2][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(2,0);
            }
        });

        //Coordenada B6
        imageViews[2][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(2,1);
            }
        });

        //Coordenada C6
        imageViews[2][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(2,2);
            }
        });

        //Coordenada D6
        imageViews[2][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(2,3);
            }
        });

        //Coordenada E6
        imageViews[2][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(2,4);
            }
        });

        //Coordenada F6
        imageViews[2][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(2,5);
            }
        });

        //Coordenada G6
        imageViews[2][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(2,6);
            }
        });

        //Coordenada H6
        imageViews[2][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(2,7);
            }
        });

        //Coordenada A7
        imageViews[1][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(1,0);
            }
        });

        //Coordenada B7
        imageViews[1][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(1,1);
            }
        });

        //Coordenada C7
        imageViews[1][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(1,2);
            }
        });

        //Coordenada D7
        imageViews[1][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(1,3);
            }
        });

        //Coordenada E7
        imageViews[1][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(1,4);
            }
        });

        //Coordenada F7
        imageViews[1][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(1,5);
            }
        });

        //Coordenada G7
        imageViews[1][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(1,6);
            }
        });

        //Coordenada H7
        imageViews[1][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(1,7);
            }
        });

        //Coordenada A8
        imageViews[0][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(0,0);
            }
        });

        //Coordenada B8
        imageViews[0][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(0,1);
            }
        });

        //Coordenada C8
        imageViews[0][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(0,2);
            }
        });

        //Coordenada D8
        imageViews[0][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(0,3);
            }
        });

        //Coordenada E8
        imageViews[0][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(0,4);
            }
        });

        //Coordenada F8
        imageViews[0][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(0,5);
            }
        });

        //Coordenada G8
        imageViews[0][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(0,6);
            }
        });

        //Coordenada H8
        imageViews[0][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarAcciones(0,7);
            }
        });

    }

    private void mostrarDialogoGameOver(){

        // 1. Instantiate an <code><a href="/reference/android/app/AlertDialog.Builder.html">AlertDialog.Builder</a></code> with its constructor
        AlertDialog.Builder builder = new AlertDialog.Builder(GameActivity.this);

        // 2. Chain together various setter methods to set the dialog characteristics
        builder.setMessage("El ganador el es player "+ganador)
                .setTitle("Game Over");

        // Add the buttons
        /*builder.setPositiveButton("Jugar de nuevo", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User clicked OK button
                ganador = 0;
                deseleccionar();
                finDelJuego = false;
            }
        });*/
        builder.setNeutralButton("Salir", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User cancelled the dialog
                dialog.dismiss();
                finish();
            }
        });

        // 3. Get the <code><a href="/reference/android/app/AlertDialog.html">AlertDialog</a></code> from <code><a href="/reference/android/app/AlertDialog.Builder.html#create()">create()</a></code>
        AlertDialog dialog = builder.create();

        // 4. mostrar el dialogo
        dialog.show();

    }

    private void ejecutarAcciones(int filaTrabajando, int columnaTrabajando){

        /*
        Antiguo Condicional:
        TBselec == false && PBselec == false && CBselec == false && ABselec==false && KBselec == false && QBselec == false
        * */
        if(finDelJuego == false) {

            if (piezaSeleccionadaGeneral == false) {
                caso = buscarCaso(filaTrabajando, columnaTrabajando);
                if (caso != 'b') {
                    if (turnoCorrecto()) {
                        imageViews[filaTrabajando][columnaTrabajando].setBackgroundColor(Color.WHITE);
                    } else {
                        Toast.makeText(GameActivity.this, "No es tu turno", Toast.LENGTH_LONG).show();
                        deseleccionar();
                    }
                }
            } else if (filaPiezaCaso == filaTrabajando && columnaPiezaCaso == columnaTrabajando) {
                pintarFondo(filaTrabajando, columnaTrabajando);
                deseleccionar();
            } else if (filaPiezaCaso != filaTrabajando || columnaPiezaCaso != columnaTrabajando) {
                permiso = posibilidad(filaPiezaCaso, columnaPiezaCaso, filaTrabajando, columnaTrabajando);
                if (permiso) {
                    char aux = pixeles[filaPiezaCaso][columnaPiezaCaso];
                    pixeles[filaPiezaCaso][columnaPiezaCaso] = 'b';
                    pixeles[filaTrabajando][columnaTrabajando] = aux;
                    pintarFondo(filaPiezaCaso, columnaPiezaCaso);
                    permiso = false;
                    sincronizar(filaTrabajando, columnaTrabajando);
                    finDelJuego = GameOver();
                    if(finDelJuego == true){
                        mostrarDialogoGameOver();
                    }
                    turno++;
                }
            }
        }
    }

    private boolean GameOver(){
        boolean reyBlancoVivo = false, reyNegroVivo = false;
        for(int i = 0; i < 8; i ++){
            for(int j = 0; j < 8; j++){
                if(pixeles[i][j]=='R'){
                    reyBlancoVivo = true;
                }
                if(pixeles[i][j]=='Y'){
                    reyNegroVivo = true;
                }
                if(reyBlancoVivo && reyNegroVivo)
                    break;
            }
            if(reyBlancoVivo && reyNegroVivo)
                break;
        }

        if(!reyBlancoVivo){
            ganador = 2;
            return true;
        }else if(!reyNegroVivo){
            ganador = 1;
            return true;
        } else {
            return false;
        }
    }

    private boolean turnoCorrecto(){
        if((caso == 'T' || caso == 'C' || caso == 'A'
                || caso == 'R' || caso == 'r' || caso == 'P') && turno%2 != 0){
            return true;
        }else if((caso == 'Q' || caso == 'W' || caso == 'E'
                || caso == 'Y' || caso == 'y' || caso == 'p') && turno%2 == 0){
            return true;
        } else{
            return false;
        }
    }

    private void pintarFondo(int fila, int columna){
        if((fila+columna)%2==0) {
            imageViews[fila][columna].setBackgroundColor(Color.parseColor("#ff9a00"));
        }else{
            imageViews[fila][columna].setBackgroundColor(Color.parseColor("#494949"));
        }
    }

    private void deseleccionar(){
        /*
        System.out.println("");
        System.out.println("TESTEO VISUALIZACION DE LA MATRIZ PIXELES EN EL METODO -deseleccionar-");
        System.out.println("");
        for(int i = 0; i<8; i++){
            for(int j = 0; j < 8; j++){
                System.out.print(pixeles[i][j]+" ");
            }
            System.out.println("");
        }
         */
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

        //Sincronizacion Torres

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
        }else if(caso == 'Q'){
            if(TN1Fila == filaPiezaCaso && columnaPiezaCaso == TN1Columna) {
                TN1Fila = filaMod;
                TN1Columna = columnaMod;
            }else if(filaPiezaCaso == TN2Fila && columnaPiezaCaso == TN2Columna) {
                TN2Fila = filaMod;
                TN2Columna = columnaMod;
            }
            imageViews[filaMod][columnaMod].setImageResource(R.drawable.tower_negra);
            imageViews[filaPiezaCaso][columnaPiezaCaso].setImageResource(R.drawable.vacio);
        }

        //Sincronizacion Caballos

        if(caso == 'C'){
            if(CB1Fila == filaPiezaCaso && columnaPiezaCaso == CB1Columna) {
                CB1Fila = filaMod;
                CB1Columna = columnaMod;
            }else if(filaPiezaCaso == CB2Fila && columnaPiezaCaso == CB2Columna) {
                CB2Fila = filaMod;
                CB2Columna = columnaMod;
            }
            imageViews[filaMod][columnaMod].setImageResource(R.drawable.caballo_blanca);
            imageViews[filaPiezaCaso][columnaPiezaCaso].setImageResource(R.drawable.vacio);
        }else if(caso == 'W'){
            if(CN1Fila == filaPiezaCaso && columnaPiezaCaso == CN1Columna) {
                CN1Fila = filaMod;
                CN1Columna = columnaMod;
            }else if(filaPiezaCaso == CN2Fila && columnaPiezaCaso == CN2Columna) {
                CN2Fila = filaMod;
                CN2Columna = columnaMod;
            }
            imageViews[filaMod][columnaMod].setImageResource(R.drawable.caballo_negra);
            imageViews[filaPiezaCaso][columnaPiezaCaso].setImageResource(R.drawable.vacio);
        }

        //Sincronizacion Alfiles

        if(caso == 'A'){
            if(AB1Fila == filaPiezaCaso && columnaPiezaCaso == AB1Columna) {
                AB1Fila = filaMod;
                AB1Columna = columnaMod;
            }else if(filaPiezaCaso == AB2Fila && columnaPiezaCaso == AB2Columna) {
                AB2Fila = filaMod;
                AB2Columna = columnaMod;
            }
            imageViews[filaMod][columnaMod].setImageResource(R.drawable.alfil_blanca);
            imageViews[filaPiezaCaso][columnaPiezaCaso].setImageResource(R.drawable.vacio);
        }else if(caso == 'E'){
            if(AN1Fila == filaPiezaCaso && columnaPiezaCaso == AN1Columna) {
                AN1Fila = filaMod;
                AN1Columna = columnaMod;
            }else if(filaPiezaCaso == AN2Fila && columnaPiezaCaso == AN2Columna) {
                AN2Fila = filaMod;
                AN2Columna = columnaMod;
            }
            imageViews[filaMod][columnaMod].setImageResource(R.drawable.alfil_negra);
            imageViews[filaPiezaCaso][columnaPiezaCaso].setImageResource(R.drawable.vacio);
        }

        //Sincronizacion Reina

        if(caso == 'r'){
            if(QBFila == filaPiezaCaso && columnaPiezaCaso == QBColumna) {
                QBFila = filaMod;
                QBColumna = columnaMod;
            }
            imageViews[filaMod][columnaMod].setImageResource(R.drawable.reina_blanca);
            imageViews[filaPiezaCaso][columnaPiezaCaso].setImageResource(R.drawable.vacio);
        }else if(caso == 'y'){
            if(QNFila == filaPiezaCaso && columnaPiezaCaso == QNColumna) {
                QNFila = filaMod;
                QNColumna = columnaMod;
            }
            imageViews[filaMod][columnaMod].setImageResource(R.drawable.reina_negra);
            imageViews[filaPiezaCaso][columnaPiezaCaso].setImageResource(R.drawable.vacio);
        }

        //Sincronizacion Rey

        if(caso == 'R'){
            if(KBFila == filaPiezaCaso && columnaPiezaCaso == KBColumna) {
                KBFila = filaMod;
                KBColumna = columnaMod;
            }
            imageViews[filaMod][columnaMod].setImageResource(R.drawable.rey_blanca);
            imageViews[filaPiezaCaso][columnaPiezaCaso].setImageResource(R.drawable.vacio);
        }else if(caso == 'Y'){
            if(KNFila == filaPiezaCaso && columnaPiezaCaso == KNColumna) {
                KNFila = filaMod;
                KNColumna = columnaMod;
            }
            imageViews[filaMod][columnaMod].setImageResource(R.drawable.rey_negra);
            imageViews[filaPiezaCaso][columnaPiezaCaso].setImageResource(R.drawable.vacio);
        }

        //Sincronizacion Peones

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
        }else if(caso == 'p'){
            if(filaPiezaCaso == PN1Fila && columnaPiezaCaso == PN1Columna) {
                PN1Fila = filaMod;
                PN1Columna = columnaMod;
            }else if(filaPiezaCaso == PN2Fila && columnaPiezaCaso == PN2Columna) {
                PN2Fila = filaMod;
                PN2Columna = columnaMod;
            }else if(filaPiezaCaso == PN3Fila && columnaPiezaCaso == PN3Columna) {
                PN3Fila = filaMod;
                PN3Columna = columnaMod;
            }else if(filaPiezaCaso == PN4Fila && columnaPiezaCaso == PN4Columna) {
                PN4Fila = filaMod;
                PN4Columna = columnaMod;
            }else if(filaPiezaCaso == PN5Fila && columnaPiezaCaso == PN5Columna) {
                PN5Fila = filaMod;
                PN5Columna = columnaMod;
            }else if(filaPiezaCaso == PN6Fila && columnaPiezaCaso == PN6Columna) {
                PN6Fila = filaMod;
                PN6Columna = columnaMod;
            }else if(filaPiezaCaso == PN7Fila && columnaPiezaCaso == PN7Columna) {
                PN7Fila = filaMod;
                PN7Columna = columnaMod;
            }else if(filaPiezaCaso == PN8Fila && columnaPiezaCaso == PN8Columna) {
                PN8Fila = filaMod;
                PN8Columna = columnaMod;
            }
            imageViews[filaMod][columnaMod].setImageResource(R.drawable.peon_negra);
            imageViews[filaPiezaCaso][columnaPiezaCaso].setImageResource(R.drawable.vacio);
        }
        piezaSeleccionadaGeneral = false;
    }

    private char buscarCaso(int fila, int columna){

        char ocasion = pixeles[fila][columna];

        //Caso Torre

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
        }else if(ocasion == 'Q'){
            if(TN1Fila == fila && columna == TN1Columna) {
                filaPiezaCaso = TN1Fila;
                columnaPiezaCaso = TN1Columna;
            }else if(fila == TN2Fila && columna == TN2Columna) {
                filaPiezaCaso = TN2Fila;
                columnaPiezaCaso = TN2Columna;
            }
        }

        //Caso Caballo

        if(ocasion == 'C'){
            if(CB1Fila == fila && columna == CB1Columna) {
                filaPiezaCaso = CB1Fila;
                columnaPiezaCaso = CB1Columna;
            }else if(fila == CB2Fila && columna == CB2Columna) {
                filaPiezaCaso = CB2Fila;
                columnaPiezaCaso = CB2Columna;
            }
        }else if(ocasion == 'W'){
            if(CN1Fila == fila && columna == CN1Columna) {
                filaPiezaCaso = CN1Fila;
                columnaPiezaCaso = CN1Columna;
            }else if(fila == CN2Fila && columna == CN2Columna) {
                filaPiezaCaso = CN2Fila;
                columnaPiezaCaso = CN2Columna;
            }
        }

        //Caso Alfil

        if(ocasion == 'A'){
            if(AB1Fila == fila && columna == AB1Columna) {
                filaPiezaCaso = AB1Fila;
                columnaPiezaCaso = AB1Columna;
            }else if(fila == AB2Fila && columna == AB2Columna) {
                filaPiezaCaso = AB2Fila;
                columnaPiezaCaso = AB2Columna;
            }
        }else if(ocasion == 'E'){
            if(AN1Fila == fila && columna == AN1Columna) {
                filaPiezaCaso = AN1Fila;
                columnaPiezaCaso = AN1Columna;
            }else if(fila == AN2Fila && columna == AN2Columna) {
                filaPiezaCaso = AN2Fila;
                columnaPiezaCaso = AN2Columna;
            }
        }

        //Caso Reina

        if(ocasion == 'r'){
            if(QBFila == fila && columna == QBColumna) {
                filaPiezaCaso = QBFila;
                columnaPiezaCaso = QBColumna;
            }
        }else if(ocasion == 'y'){
            if(QNFila == fila && columna == QNColumna) {
                filaPiezaCaso = QNFila;
                columnaPiezaCaso = QNColumna;
            }
        }

        //Caso Rey

        if(ocasion == 'R'){
            if(KBFila == fila && columna == KBColumna) {
                filaPiezaCaso = KBFila;
                columnaPiezaCaso = KBColumna;
            }
        }else if(ocasion == 'Y'){
            if(KNFila == fila && columna == KNColumna) {
                filaPiezaCaso = KNFila;
                columnaPiezaCaso = KNColumna;
            }
        }

        //Caso Peones

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
        }else if(ocasion == 'p'){
            if(PN1Fila == fila && columna == PN1Columna) {
                filaPiezaCaso = PN1Fila;
                columnaPiezaCaso = PN1Columna;
            }else if(fila == PN2Fila && columna == PN2Columna) {
                filaPiezaCaso = PN2Fila;
                columnaPiezaCaso = PN2Columna;
            }else if(fila == PN3Fila && columna == PN3Columna) {
                filaPiezaCaso = PN3Fila;
                columnaPiezaCaso = PN3Columna;
            }else if(fila == PN4Fila && columna == PN4Columna) {
                filaPiezaCaso = PN4Fila;
                columnaPiezaCaso = PN4Columna;
            }else if(fila == PN5Fila && columna == PN5Columna) {
                filaPiezaCaso = PN5Fila;
                columnaPiezaCaso = PN5Columna;
            }else if(fila == PN6Fila && columna == PN6Columna) {
                filaPiezaCaso = PN6Fila;
                columnaPiezaCaso = PN6Columna;
            }else if(fila == PN7Fila && columna == PN7Columna) {
                filaPiezaCaso = PN7Fila;
                columnaPiezaCaso = PN7Columna;
            }else if(fila == PN8Fila && columna == PN8Columna) {
                filaPiezaCaso = PN8Fila;
                columnaPiezaCaso = PN8Columna;
            }
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

        //Posibilidad Torres

        if((caso == 'T' || caso == 'Q') || (caso == 'r' || caso == 'y')){
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
            //return false; ESTA COMENTADO PARA QUE SI LA REINA ENTRA, PERO EL MOVIMIENTO BUSCADO ES DIAGONAL, NO RETORNE FALSE Y AVANCE HASTA EL CODIGO DE LOS ALFILES

        }

        //Posibilidad Caballos

        if(caso == 'C' || caso == 'W'){
            if((filaSolicitud == filaPieza+2 && (columnaSolicitud == columnaPieza-1 || columnaSolicitud == columnaPieza+1))
            || (filaSolicitud == filaPieza-2 && (columnaSolicitud == columnaPieza-1 || columnaSolicitud == columnaPieza+1))
            || (columnaSolicitud == columnaPieza+2 && (filaSolicitud == filaPieza-1 || filaSolicitud == filaPieza+1))
            || (columnaSolicitud == columnaPieza-2 && (filaSolicitud == filaPieza-1 || filaSolicitud == filaPieza+1))){
                return true;
            }
            return false;
        }

        //Posibilidad Alfiles

        if((caso == 'A' || caso == 'E') || (caso == 'r' || caso == 'y')){
            if(filaSolicitud != filaPieza && columnaSolicitud != columnaPieza){
                if(filaSolicitud > filaPieza && columnaSolicitud > columnaPieza){
                    for(int i = filaPieza+1, j = columnaPieza+1; i < filaSolicitud && j < columnaSolicitud; i++, j++){
                        if(hayAliado(i,j) || hayEnemigo(i,j)){
                            return false;
                        }
                    }
                    return true;
                } else if(filaSolicitud > filaPieza && columnaSolicitud < columnaPieza){
                    for(int i = filaPieza+1, j = columnaPieza-1; i < filaSolicitud && j > columnaSolicitud; i++, j--){
                        if(hayAliado(i,j) || hayEnemigo(i,j)){
                            return false;
                        }
                    }
                    return true;
                }
                if(filaSolicitud < filaPieza && columnaSolicitud > columnaPieza){
                    for(int i = filaPieza-1, j = columnaPieza+1; i > filaSolicitud && j < columnaSolicitud; i--, j++){
                        if(hayAliado(i,j) || hayEnemigo(i,j)){
                            return false;
                        }
                    }
                    return true;
                } else if(columnaSolicitud < columnaPieza  && columnaSolicitud < columnaPieza){
                    for(int i = filaPieza-1, j = columnaPieza-1; i > filaSolicitud && j > columnaSolicitud; i--, j--){
                        if(hayAliado(i,j) || hayEnemigo(i,j)){
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        //Posibilidad Reina

        //Ya esta integrada tanto en el codigo de las torres como de los alfiles

        //Posibilidad Rey

        if(caso == 'R' || caso == 'Y'){

            if(((filaSolicitud == filaPieza || filaSolicitud == filaPieza+1 || filaSolicitud == filaPieza-1) && (columnaSolicitud == columnaPieza || columnaSolicitud == columnaPieza+1 || columnaSolicitud == columnaPieza-1))){
                return true;
            }
            return false;
        }

        //Posibilidad Peones

        if(caso == 'P'){

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

            if((filaSolicitud == filaPieza-1 && columnaSolicitud == columnaPieza) && pixeles[filaSolicitud][columnaSolicitud] == 'b'){
                if((filaPieza == PB1Fila && columnaPieza == PB1Columna) && !PB1PrimerMovimiento){
                    PB1PrimerMovimiento = true;
                }else if((filaPieza == PB2Fila && columnaPieza == PB2Columna) && !PB2PrimerMovimiento){
                    PB2PrimerMovimiento = true;
                }else if((filaPieza == PB3Fila && columnaPieza == PB3Columna) && !PB3PrimerMovimiento){
                    PB3PrimerMovimiento = true;
                }else if((filaPieza == PB4Fila && columnaPieza == PB4Columna) && !PB4PrimerMovimiento){
                    PB4PrimerMovimiento = true;
                }else if((filaPieza == PB5Fila && columnaPieza == PB5Columna) && !PB5PrimerMovimiento){
                    PB5PrimerMovimiento = true;
                }else if((filaPieza == PB6Fila && columnaPieza == PB6Columna) && !PB6PrimerMovimiento){
                    PB6PrimerMovimiento = true;
                }else if((filaPieza == PB7Fila && columnaPieza == PB7Columna) && !PB7PrimerMovimiento){
                    PB7PrimerMovimiento = true;
                }else if((filaPieza == PB8Fila && columnaPieza == PB8Columna) && !PB8PrimerMovimiento){
                    PB8PrimerMovimiento = true;
                }
                return true;
            }else if(filaSolicitud == filaPieza-1 && (columnaSolicitud == columnaPieza + 1 || columnaSolicitud == columnaPieza - 1) && hayEnemigo(filaSolicitud,columnaSolicitud) == true){
                if((filaPieza == PB1Fila && columnaPieza == PB1Columna) && !PB1PrimerMovimiento){
                    PB1PrimerMovimiento = true;
                }else if((filaPieza == PB2Fila && columnaPieza == PB2Columna) && !PB2PrimerMovimiento){
                    PB2PrimerMovimiento = true;
                }else if((filaPieza == PB3Fila && columnaPieza == PB3Columna) && !PB3PrimerMovimiento){
                    PB3PrimerMovimiento = true;
                }else if((filaPieza == PB4Fila && columnaPieza == PB4Columna) && !PB4PrimerMovimiento){
                    PB4PrimerMovimiento = true;
                }else if((filaPieza == PB5Fila && columnaPieza == PB5Columna) && !PB5PrimerMovimiento){
                    PB5PrimerMovimiento = true;
                }else if((filaPieza == PB6Fila && columnaPieza == PB6Columna) && !PB6PrimerMovimiento){
                    PB6PrimerMovimiento = true;
                }else if((filaPieza == PB7Fila && columnaPieza == PB7Columna) && !PB7PrimerMovimiento){
                    PB7PrimerMovimiento = true;
                }else if((filaPieza == PB8Fila && columnaPieza == PB8Columna) && !PB8PrimerMovimiento){
                    PB8PrimerMovimiento = true;
                }
                return true;
            }
        }else if(caso == 'p'){

            if((filaPieza == PN1Fila && columnaPieza == PN1Columna) && (!PN1PrimerMovimiento && filaSolicitud == filaPieza+2)
                    && (pixeles[filaSolicitud][columnaSolicitud] == 'b' && pixeles[filaSolicitud-1][columnaSolicitud] == 'b')){
                PN1PrimerMovimiento = true;
                return true;
            }else if((filaPieza == PN2Fila && columnaPieza == PN2Columna) && (!PN2PrimerMovimiento && filaSolicitud == filaPieza+2)
                    && (pixeles[filaSolicitud][columnaSolicitud] == 'b' && pixeles[filaSolicitud-1][columnaSolicitud] == 'b')){
                PN2PrimerMovimiento = true;
                return true;
            }else if((filaPieza == PN3Fila && columnaPieza == PN3Columna) && (!PN3PrimerMovimiento && filaSolicitud == filaPieza+2)
                    && (pixeles[filaSolicitud][columnaSolicitud] == 'b' && pixeles[filaSolicitud-1][columnaSolicitud] == 'b')){
                PN3PrimerMovimiento = true;
                return true;
            }else if((filaPieza == PN4Fila && columnaPieza == PN4Columna) && (!PN4PrimerMovimiento && filaSolicitud == filaPieza+2)
                    && (pixeles[filaSolicitud][columnaSolicitud] == 'b' && pixeles[filaSolicitud-1][columnaSolicitud] == 'b')){
                PN4PrimerMovimiento = true;
                return true;
            }else if((filaPieza == PN5Fila && columnaPieza == PN5Columna) && (!PN5PrimerMovimiento && filaSolicitud == filaPieza+2)
                    && (pixeles[filaSolicitud][columnaSolicitud] == 'b' && pixeles[filaSolicitud-1][columnaSolicitud] == 'b')){
                PN5PrimerMovimiento = true;
                return true;
            }else if((filaPieza == PN6Fila && columnaPieza == PN6Columna) && (!PN6PrimerMovimiento && filaSolicitud == filaPieza+2)
                    && (pixeles[filaSolicitud][columnaSolicitud] == 'b' && pixeles[filaSolicitud-1][columnaSolicitud] == 'b')){
                PN6PrimerMovimiento = true;
                return true;
            }else if((filaPieza == PN7Fila && columnaPieza == PN7Columna) && (!PN7PrimerMovimiento && filaSolicitud == filaPieza+2)
                    && (pixeles[filaSolicitud][columnaSolicitud] == 'b' && pixeles[filaSolicitud-1][columnaSolicitud] == 'b')){
                PN7PrimerMovimiento = true;
                return true;
            }else if((filaPieza == PN8Fila && columnaPieza == PN8Columna) && (!PN8PrimerMovimiento && filaSolicitud == filaPieza+2)
                    && (pixeles[filaSolicitud][columnaSolicitud] == 'b' && pixeles[filaSolicitud-1][columnaSolicitud] == 'b')){
                PN8PrimerMovimiento = true;
                return true;
            }

            if((filaSolicitud == filaPieza+1 && columnaSolicitud == columnaPieza) && pixeles[filaSolicitud][columnaSolicitud] == 'b'){
                if((filaPieza == PN1Fila && columnaPieza == PN1Columna) && !PN1PrimerMovimiento){
                    PN1PrimerMovimiento = true;
                }else if((filaPieza == PN2Fila && columnaPieza == PN2Columna) && !PN2PrimerMovimiento){
                    PN2PrimerMovimiento = true;
                }else if((filaPieza == PN3Fila && columnaPieza == PN3Columna) && !PN3PrimerMovimiento){
                    PN3PrimerMovimiento = true;
                }else if((filaPieza == PN4Fila && columnaPieza == PN4Columna) && !PN4PrimerMovimiento){
                    PN4PrimerMovimiento = true;
                }else if((filaPieza == PN5Fila && columnaPieza == PN5Columna) && !PN5PrimerMovimiento){
                    PN5PrimerMovimiento = true;
                }else if((filaPieza == PN6Fila && columnaPieza == PN6Columna) && !PN6PrimerMovimiento){
                    PN6PrimerMovimiento = true;
                }else if((filaPieza == PN7Fila && columnaPieza == PN7Columna) && !PN7PrimerMovimiento){
                    PN7PrimerMovimiento = true;
                }else if((filaPieza == PN8Fila && columnaPieza == PN8Columna) && !PN8PrimerMovimiento){
                    PN8PrimerMovimiento = true;
                }
                return true;
            }else if(filaSolicitud == filaPieza+1 && (columnaSolicitud == columnaPieza + 1 || columnaSolicitud == columnaPieza - 1) && hayEnemigo(filaSolicitud,columnaSolicitud) == true){
                if((filaPieza == PN1Fila && columnaPieza == PN1Columna) && !PN1PrimerMovimiento){
                    PN1PrimerMovimiento = true;
                }else if((filaPieza == PN2Fila && columnaPieza == PN2Columna) && !PN2PrimerMovimiento){
                    PN2PrimerMovimiento = true;
                }else if((filaPieza == PN3Fila && columnaPieza == PN3Columna) && !PN3PrimerMovimiento){
                    PN3PrimerMovimiento = true;
                }else if((filaPieza == PN4Fila && columnaPieza == PN4Columna) && !PN4PrimerMovimiento){
                    PN4PrimerMovimiento = true;
                }else if((filaPieza == PN5Fila && columnaPieza == PN5Columna) && !PN5PrimerMovimiento){
                    PN5PrimerMovimiento = true;
                }else if((filaPieza == PN6Fila && columnaPieza == PN6Columna) && !PN6PrimerMovimiento){
                    PN6PrimerMovimiento = true;
                }else if((filaPieza == PN7Fila && columnaPieza == PN7Columna) && !PN7PrimerMovimiento){
                    PN7PrimerMovimiento = true;
                }else if((filaPieza == PN8Fila && columnaPieza == PN8Columna) && !PN8PrimerMovimiento){
                    PN8PrimerMovimiento = true;
                }
                return true;
            }
        }
        return false;
    }

    private boolean hayAliado(int fila, int columna){
        if(turno%2 != 0) {
            if (pixeles[fila][columna] == 'T' || pixeles[fila][columna] == 'C' || pixeles[fila][columna] == 'A'
                    || pixeles[fila][columna] == 'R' || pixeles[fila][columna] == 'r' || pixeles[fila][columna] == 'P') {
                return true;
            }
        }else{
            if(pixeles[fila][columna] == 'Q' || pixeles[fila][columna] == 'W' || pixeles[fila][columna] == 'E'
                    || pixeles[fila][columna] == 'Y' || pixeles[fila][columna] == 'y' || pixeles[fila][columna] == 'p'){
                return true;
            }
        }
        return false;
    }

    private boolean hayEnemigo(int fila, int columna){
        if(turno%2 != 0) {
            if (pixeles[fila][columna] == 'Q' || pixeles[fila][columna] == 'W' || pixeles[fila][columna] == 'E'
                    || pixeles[fila][columna] == 'Y' || pixeles[fila][columna] == 'y' || pixeles[fila][columna] == 'p') {
                return true;
            }
        }else{
            if (pixeles[fila][columna] == 'T' || pixeles[fila][columna] == 'C' || pixeles[fila][columna] == 'A'
                    || pixeles[fila][columna] == 'R' || pixeles[fila][columna] == 'r' || pixeles[fila][columna] == 'P') {
                return true;
            }
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