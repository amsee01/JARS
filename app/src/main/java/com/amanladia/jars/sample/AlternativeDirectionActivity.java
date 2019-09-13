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
import com.amanladia.jars.model.Route;
import com.amanladia.jars.util.DirectionConverter;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;

public class AlternativeDirectionActivity extends AppCompatActivity implements OnMapReadyCallback, View.OnClickListener, DirectionCallback {
    private Button btnRequestDirection;
    private GoogleMap googleMap;
    private String serverKey = "INSERT KEY HERE";
    private LatLng camera = new LatLng(MainActivity.currentlat, MainActivity.currentlng);
    private LatLng origin = new LatLng(MainActivity.currentlat, MainActivity.currentlng);
    private LatLng destination = new LatLng(MainActivity.lat, MainActivity.lng);

    private String[] colors = {"#7fff7272", "#7f31c7c5", "#7fff8a00"};
    private int blueCol = -16776961;

    public static ArrayList <Polyline> poly = new ArrayList<Polyline>();
    public static ArrayList <Route> sRoute = new ArrayList<Route>();

    public static String polyIndex;
    public static ArrayList <String> storePolId = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alternative_direction);

        btnRequestDirection = (Button) findViewById(R.id.btn_request_direction);
        btnRequestDirection.setOnClickListener(this);

        ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        this.googleMap = googleMap;
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(camera, 15));
        googleMap.setOnPolylineClickListener(new GoogleMap.OnPolylineClickListener()
        {

            @Override
            public void onPolylineClick(Polyline poly)
            {

                Toast.makeText(AlternativeDirectionActivity.this,poly.getId(),Toast.LENGTH_SHORT).show();
                polyIndex = poly.getId();
                poly.setWidth(10);
                poly.setColor(blueCol);
                Snackbar.make(btnRequestDirection,"Route Successfully Selected",Snackbar.LENGTH_SHORT).show();
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
                .alternativeRoute(true)
                .execute(this);
    }

    @Override
    public void onDirectionSuccess(Direction direction, String rawBody) {
        Snackbar.make(btnRequestDirection, "Success with status : " + direction.getStatus(), Snackbar.LENGTH_SHORT).show();
        if (direction.isOK()) {
            googleMap.addMarker(new MarkerOptions().position(origin));
            googleMap.addMarker(new MarkerOptions().position(destination));

            storePolId.clear();

            for (int i = 0; i < direction.getRouteList().size(); i++) {
                Route route = direction.getRouteList().get(i);
                sRoute.add(i,route);
                String color = colors[i % colors.length];
                ArrayList<LatLng> directionPositionList = route.getLegList().get(0).getDirectionPoint();
                PolylineOptions opt = new PolylineOptions();
                opt = DirectionConverter.createPolyline(this, directionPositionList, 5, Color.parseColor(color));
                poly.add(i, googleMap.addPolyline(opt));
                poly.get(i).setClickable(true);
                storePolId.add(i,poly.get(i).getId());


                //googleMap.addPolyline(DirectionConverter.createPolyline(this, directionPositionList, 5, Color.parseColor(color))).setClickable(true);
            }

            btnRequestDirection.setVisibility(View.GONE);
        }
    }

    @Override
    public void onDirectionFailure(Throwable t) {
        Snackbar.make(btnRequestDirection, t.getMessage(), Snackbar.LENGTH_SHORT).show();
    }

}
