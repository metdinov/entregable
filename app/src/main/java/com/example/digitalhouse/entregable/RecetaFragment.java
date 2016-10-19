package com.example.digitalhouse.entregable;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecetaFragment extends Fragment {
    public static final String BUNDLE_TITULO = "com.example.digitalhouse.entregable.TITULO_RECETA";
    public static final String BUNDLE_PREP = "com.example.digitalhouse.entregable.PREPARACION";

    public RecetaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_receta, container, false);

        Bundle bundle = getArguments();
        TextView txtTitulo = (TextView) view.findViewById(R.id.receta_txt_titulo);
        txtTitulo.setText(bundle.getString(BUNDLE_TITULO));
        TextView txtPreparacion = (TextView) view.findViewById(R.id.receta_txt_preparacion);
        txtPreparacion.setText(bundle.getString(BUNDLE_PREP));

        return view;
    }

}
