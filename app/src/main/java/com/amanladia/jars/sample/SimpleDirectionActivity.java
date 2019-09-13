package com.amanladia.jars.sample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.amanladia.jars.DirectionCallback;
import com.amanladia.jars.GoogleDirection;
import com.amanladia.jars.constant.TransportMode;
import com.amanladia.jars.model.Direction;
import com.amanladia.jars.model.Leg;
import com.amanladia.jars.model.Route;
import com.amanladia.jars.util.DirectionConverter;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;

import java.util.ArrayList;

public class SimpleDirectionActivity extends AppCompatActivity implements OnMapReadyCallback, View.OnClickListener, DirectionCallback {
    private Button btnRequestDirection;
    private GoogleMap googleMap;
    public GoogleMap gMaps1;
    private String serverKey = "AIzaSyCeyoq4O4tPtIanRN-hmNBgVtQlIA2Vvng";
    private LatLng camera = new LatLng(MainActivity.currentlat, MainActivity.currentlng);
    private LatLng origin = new LatLng(MainActivity.currentlat, MainActivity.currentlng);
    private LatLng destination = new LatLng(MainActivity.lat,MainActivity.lng);
    public static String stepco[];
    public static String maps;
    public static String maneuver;
    public static String distance;
    public static int stepInd=0;
    public static Leg leg;
    public static int No_of_steps=0;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_direction);

        btnRequestDirection = (Button) findViewById(R.id.btn_request_direction);
        btnRequestDirection.setOnClickListener(this);

        ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        this.googleMap = googleMap;
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(camera, 13) );

        googleMap.setOnPolylineClickListener(new GoogleMap.OnPolylineClickListener()
        {
            @Override
            public void onPolylineClick(Polyline polyline)
            {
                Toast.makeText(SimpleDirectionActivity.this,"Your Route",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btn_request_direction) {
            requestDirection();
        }
    }

    public void requestDirection() {
        Snackbar.make(btnRequestDirection, "Direction Requesting...", Snackbar.LENGTH_SHORT).show();
        GoogleDirection.withServerKey(serverKey)
                .from(origin)
                .to(destination)
                .transportMode(TransportMode.DRIVING)
                .execute(this);
    }

    @Override
    public void onDirectionSuccess(Direction direction, String rawBody) {
        Snackbar.make(btnRequestDirection, "Success with status : " + direction.getStatus(), Snackbar.LENGTH_SHORT).show();
        if (direction.isOK()) {
            googleMap.addMarker(new MarkerOptions().position(origin));
            googleMap.addMarker(new MarkerOptions().position(destination));

            //start of individual latlng
            Route route = direction.getRouteList().get(0);
            leg = route.getLegList().get(0);
            //List<Step> hey= leg.getStepList();
            //Step b = leg.getStepList().get(stepInd);


            //maneuver = a.getManeuver();
            //distance = a.getDistance().getText();

            //getLong =b.getStartLocation().getLongitude();
            //getLat = b.getStartLocation().getLatitude();

            //String stpLat = Double.toString(getLat);
            //String stpLng = Double.toString(getLong);

            //Gmaps link
            //maps ="http://maps.google.com/maps?z=12&t=m&q=loc:"+stpLat+"+"+stpLng;
            //end on indiv latlng


            ArrayList<LatLng> directionPositionList = direction.getRouteList().get(0).getLegList().get(0).getDirectionPoint();
            //No_of_steps=directionPositionList.
            //stepco = LatLng.lat()
            Polyline polyline= googleMap.addPolyline(DirectionConverter.createPolyline(this, directionPositionList, 5, Color.RED));
            polyline.setClickable(true);
            btnRequestDirection.setVisibility(View.GONE);

        }
    }



    @Override
    public void onDirectionFailure(Throwable t) {
        Snackbar.make(btnRequestDirection, t.getMessage(), Snackbar.LENGTH_SHORT).show();
    }




}

