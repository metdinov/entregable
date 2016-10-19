package com.example.digitalhouse.entregable;

import java.util.ArrayList;

/**
 * Created by Juan Pablo on 18/10/2016.
 */

public class Receta {
    private String mTitulo;
    private String mDescripcion;
    private Integer mImagen;
    private String mPreparacion;

    public Receta(String titulo, String descripcion, Integer imagen, String preparacion) {
        mTitulo = titulo;
        mDescripcion = descripcion;
        mImagen = imagen;
        mPreparacion = preparacion;
    }

    public static ArrayList<Receta> crearListaDeRecetas() {
        ArrayList<Receta> listaDeRecetas = new ArrayList<>();
        listaDeRecetas.add(new Receta("Hummus", "Tradicional pasta de garbanzos del Medio Oriente",
                R.drawable.hummus, "400g de garbanzos\n1 cucharada de aceite\n1 diente de ajo\n" +
                "Se ponen todos los ingredientes en la batidora y se pican hasta que nos quede " +
                "una pasta suave con textura de pure espeso."));
        listaDeRecetas.add(new Receta("Salsa Huancaina", "Para las pastas, el arroz y las clásicas" +
                " papas a la huancaína", R.drawable.huancaina, "400g de garbanzos\n1 cucharada de " +
                "aceite\n1 diente de ajo\nSe ponen todos los ingredientes en la batidora y se pican " +
                "hasta que nos quede una pasta suave con textura de pure espeso."));
        listaDeRecetas.add(new Receta("Salsa Habanera", "Salsa picante que utiliza chiles Habaneros",
                R.drawable.habanera, "400g de garbanzos\n1 cucharada de aceite\n1 diente de ajo\n" +
                "Se ponen todos los ingredientes en la batidora y se pican hasta que nos quede " +
                "una pasta suave con textura de pure espeso."));
        listaDeRecetas.add(new Receta("Pesto", "Salsa tradicional de la cocina italiana",
                R.drawable.pesto, "400g de garbanzos\n1 cucharada de aceite\n1 diente de ajo\n" +
                "Se ponen todos los ingredientes en la batidora y se pican hasta que nos quede " +
                "una pasta suave con textura de pure espeso."));
        listaDeRecetas.add(new Receta("Salsa BBQ", "Ideal para acompañar carnes asadas",
                R.drawable.bbq, "400g de garbanzos\n1 cucharada de aceite\n1 diente de ajo\n" +
                "Se ponen todos los ingredientes en la batidora y se pican hasta que nos quede " +
                "una pasta suave con textura de pure espeso."));
        return listaDeRecetas;
    }

    public String getTitulo() {
        return mTitulo;
    }

    public String getDescripcion() {
        return mDescripcion;
    }

    public Integer getImagen() {
        return mImagen;
    }

    public String getPreparacion() {
        return mPreparacion;
    }
}