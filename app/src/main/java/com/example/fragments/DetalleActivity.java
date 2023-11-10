package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class DetalleActivity extends AppCompatActivity {

    public static final String EXTRA_TEXTO = "com.example.fragments.EXTRA_TEXTO";
    public static final String EXTRA_TEXTO_TITULO = "com.example.fragments.EXTRA_TEXTO_TITULO";
    public static final String EXTRA_TEXTO_CAPITULOS = "com.example.fragments.EXTRA_TEXTO_CAPITULOS";
    public static final String EXTRA_TEXTO_ANO = "com.example.fragments.EXTRA_TEXTO_ANO";
    Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        FragmentDetalle detalle = (FragmentDetalle) getSupportFragmentManager().findFragmentById(R.id.frgDetalle);
        detalle.mostrarDetalle(new Anime()
                .setSinopsis(getIntent().getStringExtra(EXTRA_TEXTO))
                .setTitulo(getIntent().getStringExtra(EXTRA_TEXTO_TITULO))
                .setCapitulos(getIntent().getIntExtra(EXTRA_TEXTO_CAPITULOS, 0))
                .setAno(getIntent().getIntExtra(EXTRA_TEXTO_ANO, 0))
        );

        btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(v -> {
            setResult(RESULT_OK);
            finish();
        });
    }
}