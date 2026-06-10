package com.example.guiaturistica.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.guiaturistica.R;
import com.example.guiaturistica.models.Destino;

import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Destino> destinos;

    public GridAdapter(Context context,
                       ArrayList<Destino> destinos) {
        this.context = context;
        this.destinos = destinos;
    }

    @Override
    public int getCount() {
        return destinos.size();
    }

    @Override
    public Object getItem(int position) {
        return destinos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position,
                        View convertView,
                        ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(context)
                    .inflate(R.layout.item_grid,
                            parent,
                            false);
        }

        ImageView img =
                convertView.findViewById(R.id.imgGrid);

        TextView txt =
                convertView.findViewById(R.id.txtGrid);

        Destino destino = destinos.get(position);

        img.setImageResource(destino.getImagen());
        txt.setText(destino.getNombre());

        return convertView;
    }
}
