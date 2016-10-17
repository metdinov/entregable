package com.example.digitalhouse.entregable;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FotoFragment extends Fragment {
    private Integer imageID;
    private String nombre;

    public static FotoFragment crearFragmentFoto(String nombre, Integer imgID) {
        FotoFragment fragmento = new FotoFragment();
        fragmento.imageID = imgID;
        fragmento.nombre = nombre;
        return fragmento;
    }

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_foto, container, false);
        ImageView img = (ImageView) view.findViewById(R.id.fragment_foto_img);
        img.setImageResource(imageID);
        TextView txt = (TextView) view.findViewById(R.id.fragment_foto_txt_nombre);
        txt.setText(nombre);
        return view;
    }
}
