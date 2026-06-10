package com.example.guiaturistica;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

import com.example.guiaturistica.adapters.GridAdapter;
import com.example.guiaturistica.models.Destino;

import java.util.ArrayList;

public class GridViewFragment extends Fragment {

    GridView gridView;

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState) {

        View view = inflater.inflate(
                R.layout.fragment_grid_view,
                container,
                false);

        gridView =
                view.findViewById(R.id.gridViewDestinos);

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

        GridAdapter adapter =
                new GridAdapter(
                        getContext(),
                        destinos);

        gridView.setAdapter(adapter);

        return view;
    }
}