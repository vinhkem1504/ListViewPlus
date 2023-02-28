package com.example.listviewplusapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class SinhVienAdapter extends ArrayAdapter<SinhVien> {

    public SinhVienAdapter(@NonNull Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public SinhVienAdapter(@NonNull Context context, int resource, @NonNull List<SinhVien> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView; //giao dien cho tung dong
        if(v == null){
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.activity_list_item, null);
        }

        SinhVien sv = getItem(position);
        if(sv != null){
            // anh xa 2 TextView
            TextView textViewHoTen = (TextView) v.findViewById(R.id.textViewHoTen);
            TextView textViewNamSinh = (TextView) v.findViewById(R.id.textViewNamSinh);

            //gan gia tri
            textViewHoTen.setText(sv.Hoten);
            textViewNamSinh.setText(sv.Namsinh.toString());
        }
        return v;
    }
}
