package com.example.bijesh.myapplication;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.MapFragment;

public class MapsActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        getFragmentManager().beginTransaction().replace(R.id.map_1, new GMapFragment()).commit();
    }

}
