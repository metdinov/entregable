package com.example.digitalhouse.entregable;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FotoFragment extends Fragment {
    public static final String BUNDLE_NOMBRE = "com.example.digitalhouse.entregable.NOMBRE_RESTO";
    public static final String BUNDLE_FOTO = "com.example.digitalhouse.entregable.FOTO";

    public static FotoFragment crearFragmentFoto(String nombre, Integer imgID) {
        Bundle bundle = new Bundle();
        bundle.putString(BUNDLE_NOMBRE, nombre);
        bundle.putInt(BUNDLE_FOTO, imgID);
        FotoFragment fragmento = new FotoFragment();
        fragmento.setArguments(bundle);
        return fragmento;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        View view = inflater.inflate(R.layout.fragment_foto, container, false);
        ImageView img = (ImageView) view.findViewById(R.id.fragment_foto_img);
        img.setImageResource(bundle.getInt(BUNDLE_FOTO));
        TextView txt = (TextView) view.findViewById(R.id.fragment_foto_txt_nombre);
        txt.setText(bundle.getString(BUNDLE_NOMBRE));
        return view;
    }
}
