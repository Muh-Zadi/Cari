package com.zadi.cari.Recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.zadi.cari.R;

/**
 * Created by Muh. Zadi on 7/13/2017.
 */

public class MyHolder extends RecyclerView.ViewHolder{
    TextView nameTxt;
    public MyHolder(View itemView) {
        super(itemView);
        nameTxt= (TextView)itemView.findViewById(R.id.nameTxt);
    }
}
