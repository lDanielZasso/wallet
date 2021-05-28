package com.example.wallet.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.wallet.R;
import com.example.wallet.bean.TarjetaBancaria;

import java.util.ArrayList;

public class TarjetaAdapter extends ArrayAdapter<TarjetaBancaria> {

    private ArrayList<TarjetaBancaria> tarjetas;
    public TarjetaAdapter(@NonNull Context context, ArrayList<TarjetaBancaria> tarjetas) {
        super(context, 0,tarjetas);
        this.tarjetas = tarjetas;
    }

    public class TarjetaBancariaViewHolder extends View{

        private TextView idTarjeta,fechaTarjeta,nombreUsuario;

        public TarjetaBancariaViewHolder(View view) {
            super(view.getContext());
            this.idTarjeta = view.findViewById(R.id.numtarjeta);
            this.fechaTarjeta = view.findViewById(R.id.fechatarjeta);
            this.nombreUsuario = view.findViewById(R.id.nombreUsu);
        }
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        TarjetaBancaria tarjeta = getItem(position);

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.card_default,parent,false);

        TarjetaBancariaViewHolder tarjetaBancariaViewHolder = new TarjetaBancariaViewHolder(convertView);
        tarjetaBancariaViewHolder.nombreUsuario.setText(tarjeta.getCliente().getNombre());
        //tarjetaBancariaViewHolder.fechaTarjeta.setText(tarjeta.getBancoEmisor();
        tarjetaBancariaViewHolder.idTarjeta.setText(tarjeta.getNumTarjeta());

        return convertView;
    }
}
