package com.amanladia.jars.sample;

import android.Manifest;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Criteria;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.IBinder;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.SimpleExpandableListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.amanladia.jars.model.Step;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MainActivity extends AppCompatActivity implements View.OnClickListener, LocationListener {

    private Button btnClick;
    private Button btnCood;
    private Button nextStep;
    public static double lat;
    public static double lng;
    public static TextView cood;
    public static double getLat;
    public static double getLong;

    //current location code below
    private LocationManager locationManager;
    private String provider;
    public TextView latituteField;
    public TextView longitudeField;
    public static double currentlat;
    public static double currentlng;
    public static int manInd=1;
    public static float[] results= new float[1];
    public static Step a;
    public static Step man;
    public static boolean checkInit=false;
    public static boolean inRange= false;
    public static boolean indCheck = false;
    public static float radius = 60;
    public static float distance;

    //BT Send below
    BluetoothAdapter mBluetoothAdapter;
    BluetoothSocket mmSocket;
    BluetoothDevice mmDevice;
    OutputStream mmOutputStream;
    InputStream mmInputStream;
    Thread workerThread;
    byte[] readBuffer;
    int readBufferPosition;
    int counter;
    volatile boolean stopWorker;
    public static boolean isSpeeding = false;

    public static boolean turntaken = false;


    private final static String TAG = MainActivity.class.getSimpleName();

    public static final String EXTRAS_DEVICE_NAME = "DEVICE_NAME";
    public static final String EXTRAS_DEVICE_ADDRESS = "DEVICE_ADDRESS";

    private TextView mConnectionState;
    private TextView mDataField;
    private String mDeviceName;
    private String mDeviceAddress;
    private ExpandableListView mGattServicesList;
    private BluetoothLeService mBluetoothLeService;
    private ArrayList<ArrayList<BluetoothGattCharacteristic>> mGattCharacteristics =
            new ArrayList<ArrayList<BluetoothGattCharacteristic>>();
    private boolean mConnected = false;
    private BluetoothGattCharacteristic mNotifyCharacteristic;

    private final String LIST_NAME = "NAME";
    private final String LIST_UUID = "UUID";

    // Code to manage Service lifecycle.
    private final ServiceConnection mServiceConnection = new ServiceConnection() {

        @Override
        public void onServiceConnected(ComponentName componentName, IBinder service) {
            mBluetoothLeService = ((BluetoothLeService.LocalBinder) service).getService();
            if (!mBluetoothLeService.initialize()) {
                Log.e(TAG, "Unable to initialize Bluetooth");
                finish();
            }
            // Automatically connects to the device upon successful start-up initialization.
            mBluetoothLeService.connect(mDeviceAddress);
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            mBluetoothLeService = null;
        }
    };

    // Handles various events fired by the Service.
    // ACTION_GATT_CONNECTED: connected to a GATT server.
    // ACTION_GATT_DISCONNECTED: disconnected from a GATT server.
    // ACTION_GATT_SERVICES_DISCOVERED: discovered GATT services.
    // ACTION_DATA_AVAILABLE: received data from the device.  This can be a result of read
    //                        or notification operations.
    private final BroadcastReceiver mGattUpdateReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            final String action = intent.getAction();
            if (BluetoothLeService.ACTION_GATT_CONNECTED.equals(action)) {
                mConnected = true;
                updateConnectionState(R.string.connected);
                invalidateOptionsMenu();
            } else if (BluetoothLeService.ACTION_GATT_DISCONNECTED.equals(action)) {
                mConnected = false;
                updateConnectionState(R.string.disconnected);
                invalidateOptionsMenu();
                clearUI();
            } else if (BluetoothLeService.ACTION_GATT_SERVICES_DISCOVERED.equals(action)) {
                // Show all the supported services and characteristics on the user interface.
                //displayGattServices(mBluetoothLeService.getSupportedGattServices());
            } else if (BluetoothLeService.ACTION_DATA_AVAILABLE.equals(action)) {
                displayData(intent.getStringExtra(BluetoothLeService.EXTRA_DATA));
            }
        }
    };

    // If a given GATT characteristic is selected, check for supported features.  This sample
    // demonstrates 'Read' and 'Notify' features.  See
    // http://d.android.com/reference/android/bluetooth/BluetoothGatt.html for the complete
    // list of supported characteristic features.
    private final ExpandableListView.OnChildClickListener servicesListClickListner =
            new ExpandableListView.OnChildClickListener() {
                @Override
                public boolean onChildClick(ExpandableListView parent, View v, int groupPosition,
                                            int childPosition, long id) {
                    if (mGattCharacteristics != null) {
                        final BluetoothGattCharacteristic characteristic =
                                mGattCharacteristics.get(groupPosition).get(childPosition);
                        final int charaProp = characteristic.getProperties();
                        if ((charaProp | BluetoothGattCharacteristic.PROPERTY_READ) > 0) {
                            // If there is an active notification on a characteristic, clear
                            // it first so it doesn't update the data field on the user interface.
                            if (mNotifyCharacteristic != null) {
                                mBluetoothLeService.setCharacteristicNotification(
                                        mNotifyCharacteristic, false);
                                mNotifyCharacteristic = null;
                            }
                            mBluetoothLeService.readCharacteristic(characteristic);
                        }
                        if ((charaProp | BluetoothGattCharacteristic.PROPERTY_NOTIFY) > 0) {
                            mNotifyCharacteristic = characteristic;
                            mBluetoothLeService.setCharacteristicNotification(
                                    characteristic, true);
                        }
                        return true;
                    }
                    return false;
                }
            };

    private void clearUI() {
        //mGattServicesList.setAdapter((SimpleExpandableListAdapter) null);
        latituteField.setText(R.string.no_data);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_simple).setOnClickListener(this);
        findViewById(R.id.btn_transit).setOnClickListener(this);
        findViewById(R.id.btn_alternative).setOnClickListener(this);
        btnClick = (Button) findViewById(R.id.button);
        btnClick.setOnClickListener(this);
        btnCood = (Button) findViewById(R.id.button2);
        btnCood.setOnClickListener(this);
        nextStep = (Button) findViewById(R.id.button4);
        nextStep.setOnClickListener(this);

        latituteField = (TextView) findViewById(R.id.textView2);
        longitudeField = (TextView) findViewById(R.id.textView3);


        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        // Define the criteria how to select the locatioin provider -> use
        // default
        Criteria criteria = new Criteria();
        provider = locationManager.getBestProvider(criteria, false);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        Location location = locationManager.getLastKnownLocation(provider);

        // Initialize the location fields
        if (location != null) {
            System.out.println("Provider " + provider + " has been selected.");
            onLocationChanged(location);
        } else {
            latituteField.setText("Location not available");
            longitudeField.setText("Location not available");
        }
        /*
        try
        {
            findBT();
            openBT();
        }
        catch (IOException ex) {
            Toast.makeText(this,"Failed to initialize open and find classes",Toast.LENGTH_SHORT).show();
        }
*/
        final Intent intent = getIntent();
        mDeviceName = intent.getStringExtra(EXTRAS_DEVICE_NAME);
        mDeviceAddress = intent.getStringExtra(EXTRAS_DEVICE_ADDRESS);
        Intent gattServiceIntent = new Intent(this, BluetoothLeService.class);
        bindService(gattServiceIntent, mServiceConnection, BIND_AUTO_CREATE);

    }

    /*
    void findBT()
    {
        mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if(mBluetoothAdapter == null)
        {
            Toast.makeText(this,"No bluetooth adapter available",Toast.LENGTH_SHORT).show();
        }

        if(!mBluetoothAdapter.isEnabled())
        {
            Intent enableBluetooth = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableBluetooth, 0);
        }

        Set<BluetoothDevice> pairedDevices = mBluetoothAdapter.getBondedDevices();
        if(pairedDevices.size() > 0)
        {
            for(BluetoothDevice device : pairedDevices)
            {
                if(device.getName().equals("DBM BLE"))
                {
                    mmDevice = device;
                    break;
                }
            }
        }
        Toast.makeText(this,"Bluetooth Device Found",Toast.LENGTH_SHORT).show();

    }

    void openBT() throws IOException
    {
        if(mmDevice != null) {

            Log.e("Main Activity","Opening UUID");
            UUID uuid = UUID.fromString("0000FFF6-0000-1000-8000-00805F9B34FB"); //Standard SerialPortService ID
            Log.e("Main Activity","UUID SET");
            //UUID uuid = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB"); //Standard SerialPortService ID
            mmSocket = mmDevice.createRfcommSocketToServiceRecord(uuid);
            Log.e("Main Activity","Socket Created");
            try {
                mmSocket.connect();
            }catch(Exception ex)
            {
                Log.e("Main Activity",ex.toString());
            }
            Log.e("Main Activity","Socket Connected");
            mmOutputStream = mmSocket.getOutputStream();
            Log.e("Main Activity","OutputStream Set");
            mmInputStream = mmSocket.getInputStream();
            Log.e("Main Activity","InputStream Set");


            Toast.makeText(this, "Bluetooth opened", Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(this, "Bluetooth opened out of if", Toast.LENGTH_SHORT).show();
        }
        //Toast.makeText(this, "Bluetooth opened out of if", Toast.LENGTH_SHORT).show();


    void sendSpeed() throws IOException
    {

        if (mmDevice != null) {
            String msg = "s";
            //int trys = 73;
            msg += "\n";
            mmOutputStream.write(msg.getBytes());
            //mmOutputStream.write((byte) trys);
            Toast.makeText(this, "Data sent", Toast.LENGTH_SHORT).show();
        }
    }

    void sendNormal() throws IOException
    {
        if (mmDevice != null) {
            String msg = "q";
            msg += "\n";
            mmOutputStream.write(msg.getBytes());
            //Toast.makeText(this, "Data sent", Toast.LENGTH_SHORT).show();
        }
    }


    void sendLeft() throws IOException
    {
        String msg = "l";
        msg += "\n";
        mmOutputStream.write(msg.getBytes());
        Toast.makeText(this,"Left Data sent",Toast.LENGTH_SHORT).show();
    }

    void sendRight() throws IOException
    {
        String msg = "r";
        msg += "\n";
        mmOutputStream.write(msg.getBytes());
        Toast.makeText(this,"Right Data sent",Toast.LENGTH_SHORT).show();
    }

    void sendTurnOver() throws IOException
    {
        for(int i =0;i<5;i++) {
            String msg = "e";
            msg += "\n";
            mmOutputStream.write(msg.getBytes());
            Toast.makeText(this, "TurnOver Data sent", Toast.LENGTH_SHORT).show();
        }
    }


    void closeBT() throws IOException
    {
        stopWorker = true;
        mmOutputStream.close();
        mmInputStream.close();
        mmSocket.close();
        Toast.makeText(this,"Bluetooth Closed",Toast.LENGTH_SHORT).show();
    }

*/

    @Override
    protected void onResume() {
        super.onResume();
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        locationManager.requestLocationUpdates(provider, 400, 1, this);

        super.onResume();
        registerReceiver(mGattUpdateReceiver, makeGattUpdateIntentFilter());
        if (mBluetoothLeService != null) {
            final boolean result = mBluetoothLeService.connect(mDeviceAddress);
            Log.d(TAG, "Connect request result=" + result);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(mGattUpdateReceiver);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbindService(mServiceConnection);
        mBluetoothLeService = null;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.gatt_services, menu);
        if (mConnected) {
            menu.findItem(R.id.menu_connect).setVisible(false);
            menu.findItem(R.id.menu_disconnect).setVisible(true);
        } else {
            menu.findItem(R.id.menu_connect).setVisible(true);
            menu.findItem(R.id.menu_disconnect).setVisible(false);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.menu_connect:
                mBluetoothLeService.connect(mDeviceAddress);
                return true;
            case R.id.menu_disconnect:
                mBluetoothLeService.disconnect();
                return true;
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void updateConnectionState(final int resourceId) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                //mConnectionState.setText(resourceId);
            }
        });
    }

    private void displayData(String data) {
        if (data != null) {
            mDataField.setText(data);
        }
    }

    // Demonstrates how to iterate through the supported GATT Services/Characteristics.
    // In this sample, we populate the data structure that is bound to the ExpandableListView
    // on the UI.
    private void displayGattServices(List<BluetoothGattService> gattServices) {
        if (gattServices == null) return;
        String uuid = null;
        String unknownServiceString = getResources().getString(R.string.unknown_service);
        String unknownCharaString = getResources().getString(R.string.unknown_characteristic);
        ArrayList<HashMap<String, String>> gattServiceData = new ArrayList<HashMap<String, String>>();
        ArrayList<ArrayList<HashMap<String, String>>> gattCharacteristicData
                = new ArrayList<ArrayList<HashMap<String, String>>>();
        mGattCharacteristics = new ArrayList<ArrayList<BluetoothGattCharacteristic>>();

        // Loops through available GATT Services.
        for (BluetoothGattService gattService : gattServices) {
            HashMap<String, String> currentServiceData = new HashMap<String, String>();
            uuid = gattService.getUuid().toString();
            currentServiceData.put(
                    LIST_NAME, SampleGattAttributes.lookup(uuid, unknownServiceString));
            currentServiceData.put(LIST_UUID, uuid);
            gattServiceData.add(currentServiceData);

            ArrayList<HashMap<String, String>> gattCharacteristicGroupData =
                    new ArrayList<HashMap<String, String>>();
            List<BluetoothGattCharacteristic> gattCharacteristics =
                    gattService.getCharacteristics();
            ArrayList<BluetoothGattCharacteristic> charas =
                    new ArrayList<BluetoothGattCharacteristic>();

            // Loops through available Characteristics.
            for (BluetoothGattCharacteristic gattCharacteristic : gattCharacteristics) {
                charas.add(gattCharacteristic);
                HashMap<String, String> currentCharaData = new HashMap<String, String>();
                uuid = gattCharacteristic.getUuid().toString();
                currentCharaData.put(
                        LIST_NAME, SampleGattAttributes.lookup(uuid, unknownCharaString));
                currentCharaData.put(LIST_UUID, uuid);
                gattCharacteristicGroupData.add(currentCharaData);
            }
            mGattCharacteristics.add(charas);
            gattCharacteristicData.add(gattCharacteristicGroupData);
        }

        SimpleExpandableListAdapter gattServiceAdapter = new SimpleExpandableListAdapter(
                this,
                gattServiceData,
                android.R.layout.simple_expandable_list_item_2,
                new String[] {LIST_NAME, LIST_UUID},
                new int[] { android.R.id.text1, android.R.id.text2 },
                gattCharacteristicData,
                android.R.layout.simple_expandable_list_item_2,
                new String[] {LIST_NAME, LIST_UUID},
                new int[] { android.R.id.text1, android.R.id.text2 }
        );
        mGattServicesList.setAdapter(gattServiceAdapter);
    }

    private static IntentFilter makeGattUpdateIntentFilter() {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(BluetoothLeService.ACTION_GATT_CONNECTED);
        intentFilter.addAction(BluetoothLeService.ACTION_GATT_DISCONNECTED);
        intentFilter.addAction(BluetoothLeService.ACTION_GATT_SERVICES_DISCOVERED);
        intentFilter.addAction(BluetoothLeService.ACTION_DATA_AVAILABLE);
        return intentFilter;
    }

    public void SpeedWrite(){
        if(mBluetoothLeService != null) {
            mBluetoothLeService.writeCustomCharacteristic(0x73);
            Log.e("MainActivity","Written DATA !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        else if(mBluetoothLeService==null)
        {
            //Toast.makeText(null,"Null mBT Service!",Toast.LENGTH_SHORT).show();
        }

    }

    public void LeftWrite(){
        if(mBluetoothLeService != null) {
            mBluetoothLeService.writeCustomCharacteristic(0x6c);
            Log.e("MainActivity","Written DATA !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        else if(mBluetoothLeService==null)
        {
            Toast.makeText(null,"Null mBT Service!",Toast.LENGTH_SHORT).show();
        }

    }

    public void RightWrite(){
        if(mBluetoothLeService != null) {
            mBluetoothLeService.writeCustomCharacteristic(0x72);
            Log.e("MainActivity","Written DATA !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        else if(mBluetoothLeService==null)
        {
            Toast.makeText(null,"Null mBT Service!",Toast.LENGTH_SHORT).show();
        }

    }

    public void TurnOverWrite(){
        if(mBluetoothLeService != null) {
            mBluetoothLeService.writeCustomCharacteristic(0x65);
            Log.e("MainActivity","Written DATA !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        else if(mBluetoothLeService==null)
        {
            Toast.makeText(null,"Null mBT Service!",Toast.LENGTH_SHORT).show();
        }

    }

    public void NormalSpeedWrite(){
        if(mBluetoothLeService != null) {
            mBluetoothLeService.writeCustomCharacteristic(0x71);
            Log.e("MainActivity","Written DATA !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        else if(mBluetoothLeService==null)
        {
            //Toast.makeText(null,"Null mBT Service!",Toast.LENGTH_SHORT).show();
        }

    }

    public void onClickRead(){
        if(mBluetoothLeService != null) {
            mBluetoothLeService.readCustomCharacteristic();
        }
    }


    @Override
    public void onClick(View v) {
        Context context = this;
        EditText input = (EditText) findViewById(R.id.editText);
        String str = input.getText().toString();
        Geocoder gc = new Geocoder(context);
        cood = (TextView) this.findViewById(R.id.textView);
        if (v == btnClick) {
            try {
                if (gc.isPresent()) {

                    List<Address> list = null;
                    try {
                        list = gc.getFromLocationName(str, 1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    Address address = list.get(0);

                    lat = address.getLatitude();
                    lng = address.getLongitude();
                    //String strlat= Double.toString(lat);
                    //String strlong= Double.toString(lng);

                }
            }catch(Exception ex)
            {
                Toast.makeText(this,"Destination not found! Please Recheck!",Toast.LENGTH_SHORT).show();
            }


        }

        //code to display latlong
        if (v == btnCood) {
            /*
            a = SimpleDirectionActivity.leg.getStepList().get(SimpleDirectionActivity.stepInd);
            man = SimpleDirectionActivity.leg.getStepList().get(manInd);

            SimpleDirectionActivity.maneuver = man.getManeuver();
            //SimpleDirectionActivity.distance = a.getDistance().getText();

            //Code to determine distance to next coordinate
            getLong = a.getEndLocation().getLongitude();
            getLat = a.getEndLocation().getLatitude();




            cood.setText(Double.toString(getLat) + " , " + Double.toString(getLong) + "\n" + SimpleDirectionActivity.maneuver + "\n Distance to next turn: "+Float.toString(results[0])+"\t manIndex: "+Integer.toString(manInd)+" stepind: "+Integer.toString(SimpleDirectionActivity.stepInd));

            //Gmaps link
            String stpLat = Double.toString(getLat);
            String stpLng = Double.toString(getLong);
            SimpleDirectionActivity.maps = "http://maps.google.com/maps?z=12&t=m&q=loc:" + stpLat + "+" + stpLng;
            SimpleDirectionActivity.stepInd++;
            manInd++;
            */
            try
            {
                for(String s:AlternativeDirectionActivity.storePolId)
                {
                    if(s.equals(AlternativeDirectionActivity.polyIndex))
                    {
                        int finalRouteIndex = AlternativeDirectionActivity.storePolId.indexOf(s);
                        SimpleDirectionActivity.leg = AlternativeDirectionActivity.sRoute.get(finalRouteIndex).getLegList().get(0);
                        Toast.makeText(MainActivity.this,"Found at index" + Integer.toString(finalRouteIndex),Toast.LENGTH_SHORT).show();
                    }
                }
            }catch(Exception ex)
            {
                Toast.makeText(MainActivity.this,"Couldn't find index",Toast.LENGTH_SHORT).show();
            }

            /*
            try {
                if (AlternativeDirectionActivity.polyIndex.equals("pl1")) {
                    SimpleDirectionActivity.leg = AlternativeDirectionActivity.sRoute.get(1).getLegList().get(0);
                    //Toast.makeText(MainActivity.this,"Route 0",Toast.LENGTH_SHORT).show();
                } else if (AlternativeDirectionActivity.polyIndex.equals("pl2")) {
                    SimpleDirectionActivity.leg = AlternativeDirectionActivity.sRoute.get(2).getLegList().get(0);
                    //Toast.makeText(MainActivity.this,"Route 1",Toast.LENGTH_SHORT).show();
                } else if (AlternativeDirectionActivity.polyIndex.equals("pl3")) {
                    SimpleDirectionActivity.leg = AlternativeDirectionActivity.sRoute.get(3).getLegList().get(0);
                } else if (AlternativeDirectionActivity.polyIndex.equals("pl4")) {
                    SimpleDirectionActivity.leg = AlternativeDirectionActivity.sRoute.get(4).getLegList().get(0);
                } else {
                    Toast.makeText(MainActivity.this, "Error in setting route index", Toast.LENGTH_SHORT).show();
                }

                if (AlternativeDirectionActivity.sRoute.get(0).equals(AlternativeDirectionActivity.sRoute.get(1))) {
                    Toast.makeText(MainActivity.this, "Both index have same route", Toast.LENGTH_SHORT).show();
                } else {
                    //Toast.makeText(MainActivity.this,Integer.toString(AlternativeDirectionActivity.sRoute.size()),Toast.LENGTH_SHORT).show();
                }

            }catch(Exception ex)
            {
                Toast.makeText(MainActivity.this,"Exception!",Toast.LENGTH_SHORT).show();
            }*/

            checkInit = true;


        }

        if (v == nextStep) {
            //SimpleDirectionActivity.stepInd++;
            //AlternativeDirectionActivity.poly.clear();
            int index;
            for (index =0;index<AlternativeDirectionActivity.poly.size();index++) {
                AlternativeDirectionActivity.poly.remove(index);

            }
            AlternativeDirectionActivity.poly.trimToSize();

            try
            {
                NormalSpeedWrite();
                //sendSpeed();
                /*
                if(mBluetoothLeService != null) {
                    mBluetoothLeService.writeCustomCharacteristic(0x73);
                    Log.e("MainActivity","Written DATA !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                }
                else if(mBluetoothLeService==null)
                {
                    Toast.makeText(null,"Null mBT Service!",Toast.LENGTH_SHORT).show();
                }
                Toast.makeText(null,"Null mBT Service!",Toast.LENGTH_SHORT).show();
                Toast.makeText(this,"SENT",Toast.LENGTH_SHORT).show();
                */
            }catch(Exception ex)
            {
                //Toast.makeText(this,"Failed to send: "+ex.toString(),Toast.LENGTH_SHORT).show();
                Log.e("MainActivity",ex.toString());
            }


        }


        //code for other activities
        int id = v.getId();
        if (id == R.id.btn_simple) {
            goToSimpleDirection();
        } else if (id == R.id.btn_transit) {
            goToTransitDirection();
        } else if (id == R.id.btn_alternative) {
            goToAlternativeDirection();
        }
    }

    public void goToSimpleDirection() {
        openActivity(SimpleDirectionActivity.class);
    }

    public void goToTransitDirection() {
        openActivity(TransitDirectionActivity.class);
    }

    public void goToAlternativeDirection() {
        openActivity(AlternativeDirectionActivity.class);
    }

    public void openActivity(Class<?> cs) {
        startActivity(new Intent(this, cs));
    }

    public void goToSo(View view) {
        goToUrl(SimpleDirectionActivity.maps);
    }

    private void goToUrl(String s) {

        Uri uriUrl = Uri.parse(s);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    @Override
    public void onLocationChanged(Location location) {

        currentlat = location.getLatitude();
        currentlng = location.getLongitude();
        latituteField.setText(Double.toString(currentlat));
        longitudeField.setText(Double.toString(currentlng));

        if(checkInit==true) {
            a = SimpleDirectionActivity.leg.getStepList().get(SimpleDirectionActivity.stepInd);
            man = SimpleDirectionActivity.leg.getStepList().get(manInd);

            SimpleDirectionActivity.maneuver = man.getManeuver();

            getLong = a.getEndLocation().getLongitude();
            getLat = a.getEndLocation().getLatitude();
            Location.distanceBetween(getLat, getLong, currentlat, currentlng, results);
            distance=results[0];

            if(distance<15)
            {
                Toast.makeText(this,"indCheck=true",Toast.LENGTH_SHORT).show();
                indCheck=true;
            }

            if(distance>20 && indCheck)
            {
                Toast.makeText(this,"Indicator OFF",Toast.LENGTH_LONG).show();

                //sendTurnOver();
                TurnOverWrite();

                indCheck=false;
                Toast.makeText(this,"Ind: "+Integer.toString(SimpleDirectionActivity.stepInd)+"Step: "+Integer.toString(SimpleDirectionActivity.leg.getStepList().size()),Toast.LENGTH_SHORT).show();
                if(SimpleDirectionActivity.stepInd<SimpleDirectionActivity.leg.getStepList().size()) {
                    Toast.makeText(this, "updated indexes", Toast.LENGTH_SHORT).show();
                    SimpleDirectionActivity.stepInd++;

                }
                if ((manInd+1)<SimpleDirectionActivity.leg.getStepList().size())
                {
                    manInd++;
                }
                else
                {
                    Snackbar.make(longitudeField,"Route completed",Snackbar.LENGTH_LONG).show();
                    //sendTurnOver();
                    TurnOverWrite();
                }
                inRange=false;

                //update indexes result below

                a = SimpleDirectionActivity.leg.getStepList().get(SimpleDirectionActivity.stepInd);
                getLong = a.getEndLocation().getLongitude();
                getLat = a.getEndLocation().getLatitude();
                Location.distanceBetween(getLat, getLong, currentlat, currentlng, results);
                distance=results[0];

            } else if(distance>20 && !indCheck)
            {

                cood.setText(Double.toString(getLat) + " , " + Double.toString(getLong) + "\n" + SimpleDirectionActivity.maneuver + "\n Distance to next turn: " + Float.toString(distance) + "\t manIndex: " + Integer.toString(manInd) + " stepIndex: " + Integer.toString(SimpleDirectionActivity.stepInd));
            }


            if(distance<radius)
            {
                cood.setText(SimpleDirectionActivity.maneuver+"\n"+Float.toString(distance));
                for(int i =0;i<5;i++) {
                    if (SimpleDirectionActivity.maneuver.equals("turn-left")||SimpleDirectionActivity.maneuver.equals("uturn-left")) {

                        //sendLeft();
                        LeftWrite();

                    } else if (SimpleDirectionActivity.maneuver.equals("turn-right")||SimpleDirectionActivity.maneuver.equals("uturn-right")) {

                        //sendRight();
                        RightWrite();
                    }

                }
                //inRange=true;
            }
            /*else
            {
                if(inRange == true)
                {
                    Toast.makeText(this,"updated indexes",Toast.LENGTH_SHORT).show();
                    SimpleDirectionActivity.stepInd++;
                    manInd++;
                    inRange=false;
                }
                else
                {
                    cood.setText(Double.toString(getLat) + " , " + Double.toString(getLong) + "\n" + SimpleDirectionActivity.maneuver + "\n Distance to next turn: " + Float.toString(distance) + "\t manIndex: " + Integer.toString(manInd) + " stepIndex: " + Integer.toString(SimpleDirectionActivity.stepInd));

                }

            }
            */

            /*if(results[0]>100 && inRange)
            {
                SimpleDirectionActivity.stepInd++;
                manInd++;
                inRange=false;
            }
            if(results[0]>100 && !inRange)
            {
                cood.setText(Double.toString(getLat) + " , " + Double.toString(getLong) + "\n" + SimpleDirectionActivity.maneuver + "\n Distance to next turn: " + Float.toString(results[0]) + "\t manIndex: " + Integer.toString(manInd) + " stepIndex: " + Integer.toString(SimpleDirectionActivity.stepInd));

            }
            */

            //Gmaps link
            String stpLat = Double.toString(getLat);
            String stpLng = Double.toString(getLong);
            SimpleDirectionActivity.maps = "http://maps.google.com/maps?z=12&t=m&q=loc:" + stpLat + "+" + stpLng;
            //SimpleDirectionActivity.stepInd++;
            //manInd++;
        }

        //Speedometer code below

        float nCurrentSpeed = location.getSpeed();

        final Snackbar speedsnack = Snackbar.make(longitudeField,"OVER SPEED!",Snackbar.LENGTH_INDEFINITE);

        if(nCurrentSpeed<13.888) {
            speedsnack.dismiss();
            NormalSpeedWrite();
            //sendNormal();
        }

        if(nCurrentSpeed>13.888) {
            speedsnack.setAction("Dismiss", new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    speedsnack.dismiss();
                }
            });
            speedsnack.show();
            //sendSpeed();
            SpeedWrite();
            Toast.makeText(this,"Overspeed sent!",Toast.LENGTH_SHORT).show();

        }

        if(nCurrentSpeed<13.888) {
            speedsnack.dismiss();
            NormalSpeedWrite();
            Log.e("Main Activity","Sent NORMAL SPEED !!!!!!!!");
            Log.e("Main Activity","Sent NORMAL SPEED !!!!!!!!");
            Log.e("Main Activity","Sent NORMAL SPEED !!!!!!!!");
            Log.e("Main Activity","Sent NORMAL SPEED !!!!!!!!");
            Log.e("Main Activity","Sent NORMAL SPEED !!!!!!!!");
            //sendNormal();
        }

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {
        Toast.makeText(this, "Enabled new provider " + provider,
                Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onProviderDisabled(String provider) {
        Toast.makeText(this, "Disabled provider " + provider,
                Toast.LENGTH_SHORT).show();
    }


}
