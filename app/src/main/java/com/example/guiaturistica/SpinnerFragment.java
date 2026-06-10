package com.example.guiaturistica;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView;

import androidx.fragment.app.Fragment;

import com.example.guiaturistica.R;

public class SpinnerFragment extends Fragment {

    private Spinner spinner;
    private TextView txtCategoria;

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState) {

        View view = inflater.inflate(
                R.layout.fragment_spinner,
                container,
                false);

        spinner = view.findViewById(R.id.spinnerCategorias);
        txtCategoria = view.findViewById(R.id.txtCategoria);

        String[] categorias = {
                "Playas",
                "Montañas",
                "Ciudades"
        };

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(
                        requireContext(),
                        android.R.layout.simple_spinner_item,
                        categorias);

        adapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {

                    @Override
                    public void onItemSelected(
                            AdapterView<?> parent,
                            View view,
                            int position,
                            long id) {

                        String categoria =
                                categorias[position];

                        txtCategoria.setText(
                                "Categoría seleccionada: "
                                        + categoria);
                    }

                    @Override
                    public void onNothingSelected(
                            AdapterView<?> parent) {

                    }
                });

        return view;
    }
}