package com.example.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentListado#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentListado extends Fragment {

    protected static final Anime[] DATOS = new Anime[] {
            new Anime().setTitulo("Initial D First Stage").setAno(1993).setCapitulos(26).setSinopsis("Unlike his friends, Takumi Fujiwara is not particularly interested in cars, with little to no knowledge about the world of car enthusiasts and street racers. The son of a tofu shop owner, he is tasked to deliver tofu every morning without fail, driving along the mountain of Akina. Thus, conversations regarding cars or driving in general would only remind Takumi of the tiring daily routine forced upon him."),
            new Anime().setTitulo("Kimetsu no Yaiba S1").setAno(2019).setCapitulos(26).setSinopsis("Ever since the death of his father, the burden of supporting the family has fallen upon Tanjirou Kamado's shoulders. Though living impoverished on a remote mountain, the Kamado family are able to enjoy a relatively peaceful and happy life. One day, Tanjirou decides to go down to the local village to make a little money selling charcoal. On his way back, night falls, forcing Tanjirou to take shelter in the house of a strange man, who warns him of the existence of flesh-eating demons that lurk in the woods at night."),
            new Anime().setTitulo("Dragon Ball").setAno(1986).setCapitulos(153).setSinopsis("Gokuu Son is a young boy who lives in the woods all alone—that is, until a girl named Bulma runs into him in her search for a set of magical objects called the \"Dragon Balls.\" Since the artifacts are said to grant one wish to whoever collects all seven, Bulma hopes to gather them and wish for a perfect boyfriend. Gokuu happens to be in possession of a dragon ball, but unfortunately for Bulma, he refuses to part ways with it, so she makes him a deal: he can tag along on her journey if he lets her borrow the dragon ball's power. With that, the two set off on the journey of a lifetime."),
            new Anime().setTitulo("Bleach").setAno(2004).setCapitulos(366).setSinopsis("Ichigo Kurosaki is an ordinary high schooler—until his family is attacked by a Hollow, a corrupt spirit that seeks to devour human souls. It is then that he meets a Soul Reaper named Rukia Kuchiki, who gets injured while protecting Ichigo's family from the assailant. To save his family, Ichigo accepts Rukia's offer of taking her powers and becomes a Soul Reaper as a result."),
            new Anime().setTitulo("Shingeki no Kyojin S1").setAno(2013).setCapitulos(25).setSinopsis("Centuries ago, mankind was slaughtered to near extinction by monstrous humanoid creatures called Titans, forcing humans to hide in fear behind enormous concentric walls. What makes these giants truly terrifying is that their taste for human flesh is not born out of hunger but what appears to be out of pleasure. To ensure their survival, the remnants of humanity began living within defensive barriers, resulting in one hundred years without a single titan encounter. However, that fragile calm is soon shattered when a colossal Titan manages to breach the supposedly impregnable outer wall, reigniting the fight for survival against the man-eating abominations.")
    };

    private ListView lstListado;
    private AnimeListener listener;

    public void setAnimeListener(AnimeListener listener) {
        this.listener = listener;
    }

    public FragmentListado() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentListado.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentListado newInstance(String param1, String param2) {
        FragmentListado fragment = new FragmentListado();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_listado, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        lstListado = getView().findViewById(R.id.lstListado);
        lstListado.setAdapter(new AdaptadorAnime(this));
        lstListado.setOnItemClickListener((parent, view, position, id) -> {
            if (listener != null) {
                listener.onAnimeSeleccionado((Anime) lstListado.getAdapter().getItem(position));
            }
        });


    }
}