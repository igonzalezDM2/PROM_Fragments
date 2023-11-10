package com.example.fragments;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AdaptadorAnime extends ArrayAdapter<Anime> {
    Activity context;
    public AdaptadorAnime(Fragment contexto) {
        super(contexto.getActivity(), R.layout.listitem_anime, FragmentListado.DATOS);
        this.context = contexto.getActivity();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View item = inflater.inflate(R.layout.listitem_anime, null);
        Anime anime = FragmentListado.DATOS[position];
        TextView lblTitulo = item.findViewById(R.id.lblTitulo);
        lblTitulo.setText(anime.getTitulo());
        TextView lblAno = item.findViewById(R.id.lblAno);
        if (anime.getAno() > 0) {
            lblAno.setText(Integer.toString(anime.getAno()));
        }
        TextView lblCaps = item.findViewById(R.id.lblCaps);
        if (anime.getCapitulos() > 0) {
            lblCaps.setText(Integer.toString(anime.getCapitulos()));
        }

        return (item);
    }
}
