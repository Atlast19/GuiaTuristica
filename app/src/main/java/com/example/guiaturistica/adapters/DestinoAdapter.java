package com.example.guiaturistica.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.guiaturistica.R;
import com.example.guiaturistica.models.Destino;

import java.util.List;

public class DestinoAdapter extends ArrayAdapter<Destino> {

    public DestinoAdapter(
            Context context,
            List<Destino> destinos) {

        super(context, 0, destinos);
    }

    @Override
    public View getView(
            int position,
            View convertView,
            ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater
                    .from(getContext())
                    .inflate(
                            R.layout.item_destino,
                            parent,
                            false);
        }

        Destino destino = getItem(position);

        ImageView imagen =
                convertView.findViewById(R.id.imgDestino);

        TextView nombre =
                convertView.findViewById(R.id.txtNombre);

        imagen.setImageResource(destino.getImagen());
        nombre.setText(destino.getNombre());

        return convertView;
    }
}