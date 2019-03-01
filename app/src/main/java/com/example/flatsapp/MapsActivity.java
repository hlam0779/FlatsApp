package com.example.flatsapp;

import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.Dash;
import com.google.android.gms.maps.model.Gap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    private final static int PATTERN_GAP_LENGTH_PX = 12;
    private final static int PATTERN_DASH_LENGTH_PX = 12;
    private static final PatternItem GAP = new Gap(PATTERN_GAP_LENGTH_PX);
    private static final PatternItem DASH = new Dash(PATTERN_DASH_LENGTH_PX);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
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
        LatLng singaporeCenter = new LatLng(1.359443, 103.848104);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(singaporeCenter, 10f));

        List<LatLng> woodLandsBoudary = Arrays.asList(new LatLng(1.461403, 103.790672), new LatLng(1.458014, 103.785458),
                new LatLng(1.455032, 103.782304), new LatLng(1.452994, 103.778827), new LatLng(1.452718, 103.778365),
                new LatLng(1.451903, 103.777324), new LatLng(1.451313, 103.777131), new LatLng(1.450884, 103.774738),
                new LatLng(1.449865, 103.772603), new LatLng(1.449147, 103.771724), new LatLng(1.448471, 103.770694),
                new LatLng(1.448385, 103.769449), new LatLng(1.447763, 103.768880), new LatLng(1.446690, 103.767507),
                new LatLng(1.445232, 103.766788), new LatLng(1.445253, 103.766756), new LatLng(1.444041, 103.766692),
                new LatLng(1.443473, 103.764997), new LatLng(1.442733, 103.765522), new LatLng(1.441875, 103.765587),
                new LatLng(1.441231, 103.765962), new LatLng(1.440373, 103.768355), new LatLng(1.432619, 103.768655),
                new LatLng(1.432619, 103.768655), new LatLng(1.425132, 103.770887), new LatLng(1.421464, 103.771230),
                new LatLng(1.424939, 103.775994), new LatLng(1.425840, 103.778139), new LatLng(1.426634, 103.783418),
                new LatLng(1.426376, 103.786572), new LatLng(1.425025, 103.790456), new LatLng(1.422494, 103.795048),
                new LatLng(1.441220, 103.811055), new LatLng(1.444266, 103.811613), new LatLng(1.446047, 103.807386),
                new LatLng(1.448835, 103.803738), new LatLng(1.453876, 103.801292));


        Polygon woodlands = mMap.addPolygon(new PolygonOptions()
                .addAll(woodLandsBoudary)
                .strokeColor(Color.RED).strokeWidth(2));

        List<LatLng> angMokioBoundary = Arrays.asList(new LatLng(1.355501, 103.856891), new LatLng(1.356918, 103.857017),
                new LatLng(1.368030, 103.860837), new LatLng(1.369424, 103.860923), new LatLng(1.370851, 103.860590),
                new LatLng(1.375516, 103.858756), new LatLng(1.378841, 103.858283), new LatLng(1.386006, 103.858316),
                new LatLng(1.391154, 103.858133), new LatLng(1.394597, 103.857876), new LatLng(1.395927, 103.857554),
                new LatLng(1.396657, 103.857071), new LatLng(1.397300, 103.856288), new LatLng(1.397665, 103.855419),
                new LatLng(1.397686, 103.854099), new LatLng(1.396667, 103.851149), new LatLng(1.396549, 103.849808),
                new LatLng(1.396657, 103.844658), new LatLng(1.396281, 103.841600), new LatLng(1.393010, 103.828114),
                new LatLng(1.392881, 103.826826), new LatLng(1.393117, 103.823447), new LatLng(1.393525, 103.821591),
                new LatLng(1.394329, 103.818866), new LatLng(1.390822, 103.818233), new LatLng(1.390768, 103.817932),
                new LatLng(1.389733, 103.817645), new LatLng(1.389318, 103.817693), new LatLng(1.388713, 103.817883),
                new LatLng(1.388369, 103.817812), new LatLng(1.387503, 103.816767), new LatLng(1.387111, 103.816672),
                new LatLng(1.386518, 103.816791), new LatLng(1.386304, 103.817384), new LatLng(1.386470, 103.818643),
                new LatLng(1.386257, 103.818904), new LatLng(1.385509, 103.819248), new LatLng(1.383610, 103.819165),
                new LatLng(1.380667, 103.817681), new LatLng(1.380359, 103.817657), new LatLng(1.380074, 103.818025),
                new LatLng(1.380442, 103.819735), new LatLng(1.380359, 103.820720), new LatLng(1.379623, 103.821444),
                new LatLng(1.379587, 103.821978), new LatLng(1.379659, 103.822583), new LatLng(1.378864, 103.823426),
                new LatLng(1.378686, 103.824103), new LatLng(1.379576, 103.825207), new LatLng(1.379730, 103.825753),
                new LatLng(1.379184, 103.827070), new LatLng(1.378330, 103.827604), new LatLng(1.377724, 103.827794),
                new LatLng(1.376704, 103.826406), new LatLng(1.376502, 103.826227), new LatLng(1.374663, 103.826453),
                new LatLng(1.373761, 103.826180), new LatLng(1.373322, 103.826346), new LatLng(1.373025, 103.827153),
                new LatLng(1.372539, 103.827640), new LatLng(1.371957, 103.827782), new LatLng(1.370320, 103.827782),
                new LatLng(1.369584, 103.827320), new LatLng(1.369038, 103.827355), new LatLng(1.367555, 103.828269),
                new LatLng(1.367982, 103.828352), new LatLng(1.367578, 103.832483), new LatLng(1.364541, 103.841397),
                new LatLng(1.364042, 103.846110), new LatLng(1.362666, 103.849457), new LatLng(1.359675, 103.853030),
                new LatLng(1.358500, 103.853873), new LatLng(1.356875, 103.854644), new LatLng(1.355949, 103.855618));

        Polygon angMoKio = mMap.addPolygon(new PolygonOptions().addAll(angMokioBoundary).strokeColor(Color.RED).strokeWidth(2));

        List<LatLng> hougangBoundary = Arrays.asList(new LatLng(1.386931, 103.873637), new LatLng(1.384474, 103.876513),
                new LatLng(1.383393, 103.876880), new LatLng(1.378407, 103.876656), new LatLng(1.377999, 103.876707),
                new LatLng(1.376184, 103.877023), new LatLng(1.374073, 103.877023), new LatLng(1.369260, 103.876258),
                new LatLng(1.368077, 103.875952), new LatLng(1.363117, 103.873590), new LatLng(1.362611, 103.873346),
                new LatLng(1.362089, 103.873307), new LatLng(1.358735, 103.874082), new LatLng(1.358295, 103.874102),
                new LatLng(1.358152, 103.874673), new LatLng(1.357684, 103.875149), new LatLng(1.356094, 103.876149),
                new LatLng(1.354748, 103.877138), new LatLng(1.353871, 103.878077), new LatLng(1.352464, 103.876475),
                new LatLng(1.352005, 103.877414), new LatLng(1.351709, 103.878403), new LatLng())
    }
}
