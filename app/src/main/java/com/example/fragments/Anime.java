package com.example.fragments;

public class Anime {
    private String titulo;
    private String sinopsis;
    private int ano;
    private int capitulos;

    public String getTitulo() {
        return titulo;
    }

    public Anime setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public Anime setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
        return this;
    }

    public int getAno() {
        return ano;
    }

    public Anime setAno(int ano) {
        this.ano = ano;
        return this;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public Anime setCapitulos(int capitulos) {
        this.capitulos = capitulos;
        return this;
    }
}
