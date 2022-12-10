package com.example.finapp;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.finapp.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng locate = new LatLng(6.597404, -75.010643);
        LatLng bancolombia = new LatLng( 6.599328, -75.010116);
        LatLng efecty = new LatLng(6.598974, -75.011406);
        LatLng bancolombia2 = new LatLng(6.598859, -75.012531);

        mMap.addMarker(new MarkerOptions().position(locate).title("Tú ubicacion"));
        mMap.addMarker(new MarkerOptions().position(bancolombia).title("Corresponsal Bancolombia"));
        mMap.addMarker(new MarkerOptions().position(efecty).title("EFECTY"));
        mMap.addMarker(new MarkerOptions().position(bancolombia2).title("Corresponsal Bancolombia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(locate,13));
    }
}