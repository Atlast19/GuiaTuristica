package com.example.guiaturistica;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.guiaturistica.R;
import com.example.guiaturistica.adapters.DestinoAdapter;
import com.example.guiaturistica.models.Destino;

import java.util.ArrayList;

public class ListViewFragment extends Fragment {

    private ListView listView;

    public ListViewFragment() {
    }

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState) {

        View vista = inflater.inflate(
                R.layout.fragment_list_view,
                container,
                false);

        listView =
                vista.findViewById(R.id.listViewDestinos);

        ArrayList<Destino> destinos =
                new ArrayList<>();

        destinos.add(new Destino(
                "Punta Cana",
                R.drawable.puntacana));

        destinos.add(new Destino(
                "Samaná",
                R.drawable.samana));

        destinos.add(new Destino(
                "Jarabacoa",
                R.drawable.jarabacoa));

        destinos.add(new Destino(
                "Puerto Plata",
                R.drawable.puertoplata));

        destinos.add(new Destino(
                "Santo Domingo",
                R.drawable.santodomingo));

        DestinoAdapter adapter =
                new DestinoAdapter(
                        getContext(),
                        destinos);

        listView.setAdapter(adapter);

        return vista;
    }
}