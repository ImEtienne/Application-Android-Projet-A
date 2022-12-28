package com.example.myapplicationtp5a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int compteurCroissant = 0;
    private int compteurProduction = 1;

    public static final String COMPTEURCROISSANT = "com.example.myapplicationtp5a.COMPTEURCROISSANT";
    public static final String COMPTEURPRODUCTION = "com.example.myapplicationtp5a.COMPTEURPRODUCTION";
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState != null){
            compteurCroissant = savedInstanceState.getInt(COMPTEURCROISSANT, compteurCroissant);
            compteurProduction = savedInstanceState.getInt(COMPTEURPRODUCTION, compteurProduction);
        }

        TextView textViewCroissant = findViewById(R.id.Croissant);
        TextView textViewProduction = findViewById(R.id.Production);

        ImageView imageViewCroissant = findViewById(R.id.imageViewCroissant);
        Button button = findViewById(R.id.button);

        textViewCroissant.setText("Nombre de Croissants : " + compteurCroissant);
        textViewProduction.setText("Production : " + compteurProduction);
        button.setText("AUGMENTER LA PRODUCTION :" + computeNextProd(compteurProduction));


        imageViewCroissant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compteurCroissant ++;
                textViewCroissant.setText("Nombre de Croissants : " + Integer.toString(compteurCroissant));

                /*compteurProduction ++;
                textViewProduction.setText("Production : " + Integer.toString(compteurProduction));*/
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(compteurCroissant > computeNextProd(compteurProduction)){
                    compteurCroissant = compteurCroissant - computeNextProd(compteurProduction);
                    textViewCroissant.setText("Nombre de Croissants : " + Integer.toString(compteurCroissant));
                    compteurProduction ++;
                    textViewProduction.setText("Production : " + Integer.toString(compteurProduction));
                    button.setText("AUGMENTAER LA PRODUCTION : " + computeNextProd(compteurProduction));
                    Toast.makeText(getApplicationContext(),"Augmentation de la prod est faite !",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext(),"Pas assez de croissants !",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    protected void onSaveInstanceState(Bundle outState){
        outState.putInt(COMPTEURCROISSANT,compteurCroissant);
        super.onSaveInstanceState(outState);

        outState.putInt(COMPTEURPRODUCTION,compteurProduction);
        super.onSaveInstanceState(outState);
    }


    public int computeNextProd(int compteurCroissant){
        return  10 * (compteurCroissant * compteurCroissant);
    }
}