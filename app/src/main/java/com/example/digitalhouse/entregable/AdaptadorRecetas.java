package com.example.digitalhouse.entregable;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Juan Pablo on 18/10/2016.
 */

public class AdaptadorRecetas extends RecyclerView.Adapter implements View.OnClickListener {
    private List<Receta> mListaDeRecetas;

    public List<Receta> getListaDeRecetas() {
        return mListaDeRecetas;
    }

    private View.OnClickListener mListener;

    public AdaptadorRecetas(List<Receta> mListaDeRecetas, Context context) {
        this.mListaDeRecetas = mListaDeRecetas;
    }

    public void setListener(View.OnClickListener listener) {
        this.mListener = listener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_receta, parent, false);
        view.setOnClickListener(this);
        return new RecetasHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Receta receta = mListaDeRecetas.get(position);
        RecetasHolder holderReceta = (RecetasHolder) holder;
        holderReceta.mTitulo.setText(receta.getTitulo());
        holderReceta.mDescripcion.setText(receta.getDescripcion());
        holderReceta.mImagen.setImageResource(receta.getImagen());
    }

    @Override
    public int getItemCount() {
        return mListaDeRecetas.size();
    }

    @Override
    public void onClick(View view) {
        mListener.onClick(view);
    }

    private class RecetasHolder extends RecyclerView.ViewHolder {
        private TextView mTitulo;
        private TextView mDescripcion;
        private ImageView mImagen;

        public RecetasHolder(View view) {
            super(view);
            mTitulo = (TextView) view.findViewById(R.id.item_receta_txt_titulo);
            mDescripcion = (TextView) view.findViewById(R.id.item_receta_txt_desc);
            mImagen = (ImageView) view.findViewById(R.id.item_receta_img);
        }
    }
}