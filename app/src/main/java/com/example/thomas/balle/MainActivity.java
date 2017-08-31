package com.example.thomas.balle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gameView=new GameView(this);

        // et on l'affiche.
        setContentView(gameView);

    }
}
