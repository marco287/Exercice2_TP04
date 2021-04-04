package com.example.exercice2_tp04;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class FragmentParCarte extends DialogFragment {
    private EditText nom, prenom, numero_carte, code_cvc, date_expiration;
    private FragmentParCarte listener;
    private Button btn;


    public FragmentParCarte() {
        // le fragment est créé par la méthode newInstance
    }

    public static FragmentParCarte newInstance(String title) {

        FragmentParCarte frag = new FragmentParCarte();
        Bundle args = new Bundle();
        args.putString("title", title);
        frag.setArguments(args);
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,

                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment1, container);

    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        nom=view.findViewById(R.id.txt_nom);
        prenom=view.findViewById(R.id.txt_prenom);
        numero_carte=view.findViewById(R.id.txt_numero_carte);
        code_cvc=view.findViewById(R.id.txt_code_cvc);
        date_expiration=view.findViewById(R.id.txt_date_expiration);

    }
}
