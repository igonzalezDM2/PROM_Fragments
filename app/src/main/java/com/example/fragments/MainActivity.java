package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements AnimeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentListado fragmentListado = (FragmentListado) getSupportFragmentManager().findFragmentById(R.id.frgListado);
        fragmentListado.setAnimeListener(this);
    }

    @Override
    public void onAnimeSeleccionado(Anime anime) {
        FragmentDetalle frag = (FragmentDetalle) getSupportFragmentManager().findFragmentById(R.id.frgDetalle);
        if (frag != null) {
            frag.mostrarDetalle(anime);
        } else {
            Intent i = new Intent(this, DetalleActivity.class);
            i.putExtra(DetalleActivity.EXTRA_TEXTO, anime.getSinopsis());
            i.putExtra(DetalleActivity.EXTRA_TEXTO_TITULO, anime.getTitulo());
            i.putExtra(DetalleActivity.EXTRA_TEXTO_CAPITULOS, anime.getCapitulos());
            i.putExtra(DetalleActivity.EXTRA_TEXTO_ANO, anime.getAno());
            startActivity(i);
        }
    }
}