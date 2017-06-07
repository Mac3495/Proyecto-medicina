package com.example.marcelo.proyecto;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Marcelo on 31/05/2017.
 */

public class EnfermedadesAdapter extends ArrayAdapter<Enfermedades> {
    Context mycontext;
    int mylayoutResourceId;
    Enfermedades mydata[] = null;

    public EnfermedadesAdapter(Context context, int layoutResourceId, Enfermedades[] data){
        super(context,layoutResourceId,data);

        this.mycontext = context;
        this.mylayoutResourceId = layoutResourceId;
        this.mydata = data;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View row = convertView;
        EnfermedadesHolder holder = null;

        if(row == null){
            LayoutInflater inflater = ((Activity)mycontext).getLayoutInflater();
            row = inflater.inflate(mylayoutResourceId,parent,false);

            holder = new EnfermedadesHolder();
            holder.imagen = (ImageView) row.findViewById(R.id.imgn);
            holder.textView = (TextView) row.findViewById(R.id.tv);
            row.setTag(holder);
        }else{
            holder = (EnfermedadesHolder)row.getTag();
        }

        Enfermedades enfermedades = mydata[position];
        holder.textView.setText(enfermedades.tiulo);
        holder.imagen.setImageResource(enfermedades.icon);

        return row;
    }



    static class EnfermedadesHolder{
        ImageView imagen;
        TextView textView;
    }
}
