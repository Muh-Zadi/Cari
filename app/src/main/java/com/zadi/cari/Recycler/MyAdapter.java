package com.zadi.cari.Recycler;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.zadi.cari.Detail;
import com.zadi.cari.R;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Muh. Zadi on 7/13/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyHolder>{

     Context c;
    ArrayList<String> names;
    public MyAdapter(Context c, ArrayList<String> names){
        this.c=c;
        this.names=names;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,parent,false);
        MyHolder holder = new MyHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, final int position) {
        holder.nameTxt.setText(names.get(position));
        holder.nameTxt.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                LayoutInflater mInflater = LayoutInflater.from(c);
                View v = mInflater.inflate(R.layout.zoom_result_search, null);
                ImageView zoomImage = (ImageView)v.findViewById(R.id.zoomImage);
                TextView txtIndo = (TextView)v.findViewById(R.id.txtIndo);
                Button btnArab = (Button)v.findViewById(R.id.btnArab);
                final AlertDialog dialog = new AlertDialog.Builder(c).create();
                dialog.setView(v);
                dialog.setTitle("Hasil pencarian");
                dialog.setIcon(R.mipmap.ic_launcher);
                txtIndo.setText(names.get(position));
                dialog.show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return names.size();
    }
}
