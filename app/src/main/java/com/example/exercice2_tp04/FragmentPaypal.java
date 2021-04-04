package com.example.exercice2_tp04;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class FragmentPaypal extends DialogFragment {
    private EditText pseudo, mot_de_passe;
    public FragmentPaypal() {
        // le fragment est créé par la méthode newInstance
    }

    public static FragmentPaypal newInstance(String title) {

        FragmentPaypal frag = new FragmentPaypal();
        Bundle args = new Bundle();
        args.putString("title", title);
        frag.setArguments(args);
        return frag;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,

                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment2, container);

    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        pseudo=view.findViewById(R.id.txt_pseudo);
        mot_de_passe=view.findViewById(R.id.txt_mdp);

    }
}
