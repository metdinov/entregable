package com.example.digitalhouse.entregable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

public class TerceraActivity extends AppCompatActivity {
    private RecyclerView mRecyclerViewRecetas;
    private AdaptadorRecetas mAdaptadorRecetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera);

        mRecyclerViewRecetas = (RecyclerView) findViewById(R.id.recycler_view_recetas);
        mRecyclerViewRecetas.setHasFixedSize(true);
        mRecyclerViewRecetas.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false));

        mAdaptadorRecetas = new AdaptadorRecetas(Receta.crearListaDeRecetas(), this);
        mAdaptadorRecetas.setListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int posicion = mRecyclerViewRecetas.getChildAdapterPosition(v);
                List<Receta> listaDeRecetas = mAdaptadorRecetas.getListaDeRecetas();
                Receta receta = listaDeRecetas.get(posicion);

                RecetaFragment recetaFragment = new RecetaFragment();
                Bundle bundle = new Bundle();
                bundle.putString(RecetaFragment.BUNDLE_TITULO, receta.getTitulo());
                bundle.putString(RecetaFragment.BUNDLE_PREP, receta.getPreparacion());
                recetaFragment.setArguments(bundle);

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, recetaFragment)
                        .commit();
            }
        });

        mRecyclerViewRecetas.setAdapter(mAdaptadorRecetas);
    }
}
