package com.example.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentDetalle#} factory method to
 * create an instance of this fragment.
 */
public class FragmentDetalle extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detalle, container, false);
    }

    public void mostrarDetalle(Anime anime) {
        TextView txtDetalle = getView().findViewById(R.id.txtDetalle);
        txtDetalle.setText("Título: " + anime.getTitulo() + "\n" +
                "Capítulos: " + anime.getCapitulos() + "\n" +
                "Año: " + anime.getAno() + "\nSinopsis:\n" + anime.getSinopsis());
    }
}