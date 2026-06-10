package com.example.guiaturistica;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.guiaturistica.R;

public class ComentarioFragment extends Fragment {

    private EditText etComentario;
    private Button btnMostrar;
    private TextView txtResultado;

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState) {

        View view = inflater.inflate(
                R.layout.fragment_comentario,
                container,
                false);

        etComentario = view.findViewById(R.id.etComentario);
        btnMostrar = view.findViewById(R.id.btnMostrar);
        txtResultado = view.findViewById(R.id.txtResultado);

        btnMostrar.setOnClickListener(v -> {

            String comentario =
                    etComentario.getText().toString().trim();

            if (TextUtils.isEmpty(comentario)) {

                Toast.makeText(
                        getContext(),
                        "Debe escribir un comentario",
                        Toast.LENGTH_SHORT
                ).show();

                return;
            }

            txtResultado.setText(
                    "Tu comentario: " + comentario);
        });

        return view;
    }
}