package com.example.exercice2_tp04;
//package sc.teach.fragmentsspeciaux;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import java.util.Calendar;



public class MainActivity extends AppCompatActivity  {

    Button btn_par_paypal;
    Button btn_par_carte;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_par_carte = findViewById(R.id.btn_carte);
        btn_par_paypal = findViewById(R.id.bnt_paypal);


        btn_par_carte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                afficher_fragment_carte();

            }
        });
        btn_par_paypal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                afficher_fragment_paypal();

            }

        });

    }
    private void afficher_fragment_carte() {

        FragmentManager fm = getSupportFragmentManager();
        FragmentParCarte affichage = FragmentParCarte.newInstance("");
        affichage.show(fm, "fragment_carte");

    }
    private void afficher_fragment_paypal() {

        FragmentManager fm = getSupportFragmentManager();
        FragmentPaypal affichage_fragment = FragmentPaypal.newInstance("");
        affichage_fragment.show(fm, "fragment_paypal");

    }

}