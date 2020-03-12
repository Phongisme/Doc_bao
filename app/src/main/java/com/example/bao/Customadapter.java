package com.example.bao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class Customadapter extends ArrayAdapter<Docbao> {

    public Customadapter(Context context, int resource, List<Docbao> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            view =  inflater.inflate(R.layout.custom_listview, null);
        }
        Docbao p = getItem(position);
        if (p != null) {
            // Anh xa + Gan gia tri
            TextView txtTitle = (TextView) view.findViewById(R.id.txttitle);
            txtTitle.setText(p.title);
            ImageView imageView = view.findViewById(R.id.imganh);
            Picasso.with(getContext()).load(p.image).into(imageView);


        }
        return view;
    }

}