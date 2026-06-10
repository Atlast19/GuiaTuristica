package com.example.guiaturistica.models;

public class Destino {

    private String nombre;
    private int imagen;

    public Destino(String nombre, int imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public int getImagen() {
        return imagen;
    }
}
