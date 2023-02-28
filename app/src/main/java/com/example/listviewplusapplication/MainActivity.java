package com.example.listviewplusapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listViewSinhVien;
    ArrayList<SinhVien> sinhVienArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewSinhVien = (ListView) findViewById(R.id.listViewSinhVien);

        //tao du lieu
        sinhVienArrayList = new ArrayList<SinhVien>();
        sinhVienArrayList.add(new SinhVien("Nguyen Van A", 2000));
        sinhVienArrayList.add(new SinhVien("Nguyen Van B", 2000));
        sinhVienArrayList.add(new SinhVien("Nguyen Van C", 2000));
        sinhVienArrayList.add(new SinhVien("Nguyen Van D", 2000));
        sinhVienArrayList.add(new SinhVien("Nguyen Van E", 2000));
        sinhVienArrayList.add(new SinhVien("Nguyen Van F", 2000));
        sinhVienArrayList.add(new SinhVien("Nguyen Van G", 2000));

        //tao Adapter
        SinhVienAdapter adapter = new SinhVienAdapter(MainActivity.this, R.layout.activity_list_item, sinhVienArrayList);
        listViewSinhVien.setAdapter(adapter);
    }
}