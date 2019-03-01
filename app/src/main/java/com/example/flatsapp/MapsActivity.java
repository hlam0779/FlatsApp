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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    private final static int PATTERN_GAP_LENGTH_PX = 12;
    private final static int PATTERN_DASH_LENGTH_PX = 12;
    private static final PatternItem GAP = new Gap(PATTERN_GAP_LENGTH_PX);
    private static final PatternItem DASH = new Dash(PATTERN_DASH_LENGTH_PX);
    private static final int STROKE_WIDTH = 2;
    private static final int FILL_COLOR = 0x20ffff00;

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
                .strokeColor(Color.RED).strokeWidth(STROKE_WIDTH)
                .fillColor(FILL_COLOR));

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

        Polygon angMoKio = mMap.addPolygon(new PolygonOptions()
                .addAll(angMokioBoundary)
                .strokeColor(Color.RED)
                .strokeWidth(STROKE_WIDTH)
                .fillColor(FILL_COLOR));

        List<LatLng> hougangBoundary = Arrays.asList(new LatLng(1.386931, 103.873637), new LatLng(1.384474, 103.876513),
                new LatLng(1.383393, 103.876880), new LatLng(1.378407, 103.876656), new LatLng(1.377999, 103.876707),
                new LatLng(1.376184, 103.877023), new LatLng(1.374073, 103.877023), new LatLng(1.369260, 103.876258),
                new LatLng(1.368077, 103.875952), new LatLng(1.363117, 103.873590), new LatLng(1.362611, 103.873346),
                new LatLng(1.362089, 103.873307), new LatLng(1.358735, 103.874082), new LatLng(1.358295, 103.874102),
                new LatLng(1.358152, 103.874673), new LatLng(1.357684, 103.875149), new LatLng(1.356094, 103.876149),
                new LatLng(1.354748, 103.877138), new LatLng(1.353871, 103.878077), new LatLng(1.352464, 103.876475),
                new LatLng(1.352005, 103.877414), new LatLng(1.351709, 103.878403), new LatLng(1.348782, 103.880224),
                new LatLng(1.347640, 103.880404), new LatLng(1.346710, 103.880711), new LatLng(1.344574, 103.882318),
                new LatLng(1.342608, 103.883302), new LatLng(1.342164, 103.883619), new LatLng(1.339711, 103.886009),
                new LatLng(1.338602, 103.886753), new LatLng(1.334796, 103.888561), new LatLng(1.333506, 103.888963),
                new LatLng(1.334214, 103.891047), new LatLng(1.334986, 103.892686), new LatLng(1.336667, 103.895118),
                new LatLng(1.338750, 103.897064), new LatLng(1.342217, 103.898819), new LatLng(1.343497, 103.899105),
                new LatLng(1.344797, 103.899105), new LatLng(1.346647, 103.898597), new LatLng(1.347704, 103.898343),
                new LatLng(1.347366, 103.895900), new LatLng(1.347789, 103.895562), new LatLng(1.347926, 103.893405),
                new LatLng(1.349195, 103.893257), new LatLng(1.353926, 103.895453), new LatLng(1.353450, 103.896586),
                new LatLng(1.353546, 103.897043), new LatLng(1.357002, 103.898783), new LatLng(1.357444, 103.899652),
                new LatLng(1.357429, 103.900787), new LatLng(1.358313, 103.901281), new LatLng(1.358436, 103.902211),
                new LatLng(1.358528, 103.902374), new LatLng(1.358388, 103.902727), new LatLng(1.365572, 103.906470),
                new LatLng(1.366349, 103.906753), new LatLng(1.374254, 103.909306), new LatLng(1.375786, 103.909958),
                new LatLng(1.378350, 103.908395), new LatLng(1.380170, 103.905695), new LatLng(1.380504, 103.904329),
                new LatLng(1.379336, 103.896773), new LatLng(1.379958, 103.895225), new LatLng(1.380155, 103.891311),
                new LatLng(1.380565, 103.890461), new LatLng(1.387405, 103.881919), new LatLng(1.388240, 103.879719),
                new LatLng(1.388437, 103.878125), new LatLng(1.388270, 103.877154), new LatLng(1.387254, 103.874742));

        Polygon hougang = mMap.addPolygon(new PolygonOptions()
                .addAll(hougangBoundary)
                .strokeColor(Color.RED)
                .strokeWidth(STROKE_WIDTH)
                .fillColor(FILL_COLOR));


        List<LatLng> punggolBoundary = Arrays.asList(new LatLng(1.401158, 103.886884), new LatLng(1.400142, 103.894405),
                new LatLng(1.399724, 103.896916), new LatLng(1.399037, 103.899233), new LatLng(1.397783, 103.902044),
                new LatLng(1.395176, 103.905949), new LatLng(1.392637, 103.908487), new LatLng(1.387521, 103.912907),
                new LatLng(1.385848, 103.914291), new LatLng(1.386920, 103.914999), new LatLng(1.390406, 103.916512),
                new LatLng(1.393871, 103.919451), new LatLng(1.396026, 103.921619), new LatLng(1.398086, 103.924354),
                new LatLng(1.399480, 103.926811), new LatLng(1.400456, 103.929290), new LatLng(1.401110, 103.929247),
                new LatLng(1.401100, 103.928946), new LatLng(1.401754, 103.929000), new LatLng(1.401518, 103.929676),
                new LatLng(1.401727, 103.930371), new LatLng(1.402233, 103.931002), new LatLng(1.402844, 103.931195),
                new LatLng(1.403745, 103.931120), new LatLng(1.406641, 103.927837), new LatLng(1.409773, 103.924608),
                new LatLng(1.410674, 103.924157), new LatLng(1.411489, 103.923256), new LatLng(1.412701, 103.921367),
                new LatLng(1.413409, 103.919297), new LatLng(1.414085, 103.918803), new LatLng(1.414793, 103.918889),
                new LatLng(1.415361, 103.918428), new LatLng(1.415983, 103.917505), new LatLng(1.417313, 103.916314),
                new LatLng(1.417334, 103.915746), new LatLng(1.417088, 103.915198), new LatLng(1.417109, 103.913997),
                new LatLng(1.418439, 103.914083), new LatLng(1.419861, 103.913129), new LatLng(1.421116, 103.912650),
                new LatLng(1.421439, 103.910702), new LatLng(1.420979, 103.908024), new LatLng(1.420059, 103.907044),
                new LatLng(1.420351, 103.905766), new LatLng(1.420373, 103.904824), new LatLng(1.420276, 103.904053),
                new LatLng(1.419245, 103.901997), new LatLng(1.416882, 103.899208), new LatLng(1.411579, 103.896552),
                new LatLng(1.407131, 103.894182), new LatLng(1.406241, 103.893180), new LatLng(1.405382, 103.892454),
                new LatLng(1.404597, 103.890615), new LatLng(1.403393, 103.888207), new LatLng(1.402182, 103.887153));

        Polygon punggol = mMap.addPolygon(new PolygonOptions()
                .addAll(punggolBoundary)
                .strokeColor(Color.RED)
                .strokeWidth(STROKE_WIDTH)
                .fillColor(FILL_COLOR));

        List<LatLng> sengkangBoundary = Arrays.asList(new LatLng(1.397052, 103.852186), new LatLng(1.397668, 103.854085),
                new LatLng(1.397697, 103.855412), new LatLng(1.397122, 103.856547), new LatLng(1.395944, 103.857549),
                new LatLng(1.394455, 103.857903), new LatLng(1.391110, 103.858124), new LatLng(1.389047, 103.865731),
                new LatLng(1.387868, 103.870315), new LatLng(1.387234, 103.873043), new LatLng(1.386911, 103.873650),
                new LatLng(1.387269, 103.874695), new LatLng(1.388250, 103.877130), new LatLng(1.388228, 103.877409),
                new LatLng(1.388386, 103.878074), new LatLng(1.388327, 103.879187), new LatLng(1.388032, 103.880300),
                new LatLng(1.387369, 103.881841), new LatLng(1.384554, 103.885467), new LatLng(1.382064, 103.888673),
                new LatLng(1.380531, 103.890501), new LatLng(1.380221, 103.891149), new LatLng(1.380096, 103.891754),
                new LatLng(1.379927, 103.895233), new LatLng(1.379875, 103.895446), new LatLng(1.379345, 103.896891),
                new LatLng(1.380067, 103.901896), new LatLng(1.380431, 103.904366), new LatLng(1.380405, 103.904872),
                new LatLng(1.380089, 103.905822), new LatLng(1.378455, 103.908280), new LatLng(1.376885, 103.909445),
                new LatLng(1.375796, 103.909965), new LatLng(1.377303, 103.911320), new LatLng(1.379633, 103.915120),
                new LatLng(1.382355, 103.917451), new LatLng(1.386344, 103.913866), new LatLng(1.391574, 103.909433),
                new LatLng(1.394031, 103.907191), new LatLng(1.395487, 103.905518), new LatLng(1.396741, 103.903720),
                new LatLng(1.398387, 103.900870), new LatLng(1.399387, 103.898222), new LatLng(1.400071, 103.895220),
                new LatLng(1.400654, 103.890989), new LatLng(1.401249, 103.886214), new LatLng(1.401287, 103.881160),
                new LatLng(1.401084, 103.871812), new LatLng(1.400996, 103.867302), new LatLng(1.400768, 103.859588),
                new LatLng(1.400135, 103.857282), new LatLng(1.399793, 103.856624), new LatLng(1.401692, 103.855471),
                new LatLng(1.400793, 103.855838), new LatLng(1.400173, 103.855813), new LatLng(1.399160, 103.855205),
                new LatLng(1.398007, 103.853774));

        Polygon sengkang = mMap.addPolygon(new PolygonOptions()
                .addAll(sengkangBoundary)
                .strokeColor(Color.RED)
                .strokeWidth(STROKE_WIDTH)
                .fillColor(FILL_COLOR));

        List<LatLng> serangoonBoundary = Arrays.asList(new LatLng(1.391094, 103.858123), new LatLng(1.384155, 103.858394),
                new LatLng(1.378629, 103.858323), new LatLng(1.377769, 103.858347), new LatLng(1.375154, 103.858854),
                new LatLng(1.374094, 103.859207), new LatLng(1.370760, 103.860657), new LatLng(1.369440, 103.860904),
                new LatLng(1.368318, 103.860914), new LatLng(1.366774, 103.860455), new LatLng(1.356395, 103.856964),
                new LatLng(1.354801, 103.856865), new LatLng(1.353446, 103.856978), new LatLng(1.351964, 103.857359),
                new LatLng(1.345712, 103.859617), new LatLng(1.343384, 103.860460), new LatLng(1.343694, 103.862531),
                new LatLng(1.344312, 103.864598), new LatLng(1.344287, 103.865635), new LatLng(1.343906, 103.866497),
                new LatLng(1.342747, 103.869154), new LatLng(1.342761, 103.870128), new LatLng(1.343551, 103.871836),
                new LatLng(1.343480, 103.873854), new LatLng(1.343607, 103.874701), new LatLng(1.344293, 103.876589),
                new LatLng(1.344253, 103.877287), new LatLng(1.343605, 103.878371), new LatLng(1.343123, 103.879159),
                new LatLng(1.342053, 103.881395), new LatLng(1.341005, 103.883679), new LatLng(1.340916, 103.884544),
                new LatLng(1.340929, 103.884973), new LatLng(1.342214, 103.883580), new LatLng(1.342823, 103.883150),
                new LatLng(1.343934, 103.882630), new LatLng(1.345117, 103.881957), new LatLng(1.346015, 103.881355),
                new LatLng(1.346718, 103.880651), new LatLng(1.347136, 103.880457), new LatLng(1.348289, 103.880314),
                new LatLng(1.348932, 103.880162), new LatLng(1.350864, 103.879319), new LatLng(1.351537, 103.878672),
                new LatLng(1.351811, 103.878108), new LatLng(1.352104, 103.877155), new LatLng(1.352483, 103.876471),
                new LatLng(1.353863, 103.878059), new LatLng(1.354755, 103.877119), new LatLng(1.356231, 103.876033),
                new LatLng(1.357817, 103.875030), new LatLng(1.358143, 103.874685), new LatLng(1.358316, 103.874328),
                new LatLng(1.358265, 103.874073), new LatLng(1.358734, 103.874094), new LatLng(1.362242, 103.873288),
                new LatLng(1.362457, 103.873287), new LatLng(1.362868, 103.873445), new LatLng(1.364201, 103.874160),
                new LatLng(1.368455, 103.876047), new LatLng(1.369822, 103.876374), new LatLng(1.374056, 103.877018),
                new LatLng(1.376568, 103.876985), new LatLng(1.378618, 103.876669), new LatLng(1.380511, 103.876739),
                new LatLng(1.383402, 103.876862), new LatLng(1.384454, 103.876476), new LatLng(1.386767, 103.873969),
                new LatLng(1.387363, 103.872637), new LatLng(1.388253, 103.868604), new LatLng(1.389620, 103.863713));

        Polygon serangoon = mMap.addPolygon(new PolygonOptions()
                .addAll(serangoonBoundary)
                .strokeColor(Color.RED)
                .strokeWidth(STROKE_WIDTH)
                .fillColor(FILL_COLOR));

        List<LatLng> bedokBoundary = Arrays.asList(new LatLng(1.337750, 103.896175), new LatLng(1.329449, 103.904826),
                new LatLng(1.328253, 103.905612), new LatLng(1.327048, 103.905844), new LatLng(1.326037, 103.905830),
                new LatLng(1.322251, 103.905341), new LatLng(1.319310, 103.904981), new LatLng(1.317602, 103.905119),
                new LatLng(1.316842, 103.905237), new LatLng(1.315838, 103.905615), new LatLng(1.311165, 103.907617),
                new LatLng(1.310458, 103.907912), new LatLng(1.308792, 103.908325), new LatLng(1.308174, 103.908605),
                new LatLng(1.305463, 103.909960), new LatLng(1.305797, 103.910714), new LatLng(1.306801, 103.915147),
                new LatLng(1.307282, 103.916985), new LatLng(1.307425, 103.917971), new LatLng(1.304683, 103.918742),
                new LatLng(1.303089, 103.919070), new LatLng(1.301858, 103.919353), new LatLng(1.301876, 103.919710),
                new LatLng(1.302068, 103.919764), new LatLng(1.302499, 103.920648), new LatLng(1.302695, 103.921542),
                new LatLng(1.302830, 103.921599), new LatLng(1.303273, 103.923203), new LatLng(1.303238, 103.923425),
                new LatLng(1.303026, 103.923544), new LatLng(1.303090, 103.923746), new LatLng(1.303258, 103.923833),
                new LatLng(1.303362, 103.923943), new LatLng(1.303667, 103.925369), new LatLng(1.303643, 103.925519),
                new LatLng(1.303511, 103.925712), new LatLng(1.303396, 103.925605), new LatLng(1.303337, 103.925694),
                new LatLng(1.303418, 103.925950), new LatLng(1.303516, 103.925926), new LatLng(1.303555, 103.925878),
                new LatLng(1.303706, 103.925968), new LatLng(1.303818, 103.926243), new LatLng(1.303843, 103.926569),
                new LatLng(1.303782, 103.926716), new LatLng(1.303675, 103.926774), new LatLng(1.303632, 103.926684),
                new LatLng(1.303571, 103.926736), new LatLng(1.303554, 103.926713), new LatLng(1.303640, 103.926981),
                new LatLng(1.303779, 103.926894), new LatLng(1.303945, 103.927047), new LatLng(1.304051, 103.927427),
                new LatLng(1.304018, 103.927646), new LatLng(1.303925, 103.927806), new LatLng(1.303891, 103.927698),
                new LatLng(1.303773, 103.927790), new LatLng(1.303866, 103.928085), new LatLng(1.303975, 103.928038),
                new LatLng(1.304214, 103.928326), new LatLng(1.304557, 103.929674), new LatLng(1.304932, 103.930424),
                new LatLng(1.305028, 103.931095), new LatLng(1.305220, 103.931494), new LatLng(1.305539, 103.931829),
                new LatLng(1.305451, 103.932579), new LatLng(1.305196, 103.933480), new LatLng(1.307098, 103.938709),
                new LatLng(1.310776, 103.948317), new LatLng(1.310529, 103.948989), new LatLng(1.310996, 103.950674),
                new LatLng(1.310868, 103.951209), new LatLng(1.310884, 103.951752), new LatLng(1.311275, 103.952597),
                new LatLng(1.311259, 103.953379), new LatLng(1.311395, 103.953794), new LatLng(1.311810, 103.955023),
                new LatLng(1.311738, 103.955358), new LatLng(1.311506, 103.955622), new LatLng(1.312536, 103.957848),
                new LatLng(1.312457, 103.958062), new LatLng(1.312999, 103.958710), new LatLng(1.314639, 103.962863),
                new LatLng(1.313912, 103.963260), new LatLng(1.314467, 103.964596), new LatLng(1.321331, 103.959689),
                new LatLng(1.324597, 103.957374), new LatLng(1.330290, 103.952379), new LatLng(1.333801, 103.949650),
                new LatLng(1.334456, 103.949116), new LatLng(1.336169, 103.940550), new LatLng(1.344034, 103.931111),
                new LatLng(1.345666, 103.928956), new LatLng(1.345650, 103.928925), new LatLng(1.348050, 103.924219),
                new LatLng(1.346115, 103.919881), new LatLng(1.345076, 103.918420), new LatLng(1.343983, 103.917194),
                new LatLng(1.342658, 103.916045), new LatLng(1.344137, 103.914201), new LatLng(1.342702, 103.912346),
                new LatLng(1.341664, 103.911440), new LatLng(1.340914, 103.910016), new LatLng(1.340556, 103.907622),
                new LatLng(1.339231, 103.907588), new LatLng(1.339143, 103.901493), new LatLng(1.338867, 103.901393),
                new LatLng(1.340335, 103.897870), new LatLng(1.338794, 103.897059));

        Polygon bedok = mMap.addPolygon(new PolygonOptions()
                .addAll(bedokBoundary)
                .strokeColor(Color.RED)
                .strokeWidth(STROKE_WIDTH)
                .fillColor(FILL_COLOR));

        List<LatLng> pasirRisBoundary = Arrays.asList(new LatLng(1.385921, 103.914231), new LatLng(1.380988, 103.918823),
                new LatLng(1.379701, 103.920754), new LatLng(1.378113, 103.924831), new LatLng(1.377255, 103.928414),
                new LatLng(1.374145, 103.935431), new LatLng(1.371292, 103.940581), new LatLng(1.369768, 103.942405),
                new LatLng(1.368674, 103.943564), new LatLng(1.367709, 103.945173), new LatLng(1.367173, 103.946482),
                new LatLng(1.365371, 103.953863), new LatLng(1.364749, 103.955580), new LatLng(1.363934, 103.957168),
                new LatLng(1.361917, 103.959721), new LatLng(1.359708, 103.961545), new LatLng(1.357198, 103.962811),
                new LatLng(1.352693, 103.964227), new LatLng(1.353851, 103.968004), new LatLng(1.354495, 103.968562),
                new LatLng(1.359836, 103.970064), new LatLng(1.361874, 103.971931), new LatLng(1.362550, 103.973636),
                new LatLng(1.363151, 103.974366), new LatLng(1.364084, 103.974817), new LatLng(1.366540, 103.975578),
                new LatLng(1.367141, 103.976104), new LatLng(1.369039, 103.978561), new LatLng(1.370273, 103.979773),
                new LatLng(1.370659, 103.979977), new LatLng(1.371388, 103.979988), new LatLng(1.371903, 103.979773),
                new LatLng(1.372504, 103.979001), new LatLng(1.373201, 103.975836), new LatLng(1.373930, 103.974972),
                new LatLng(1.377159, 103.978051), new LatLng(1.377942, 103.978416), new LatLng(1.378778, 103.978566),
                new LatLng(1.379770, 103.978078), new LatLng(1.386013, 103.974559), new LatLng(1.386763, 103.973808),
                new LatLng(1.387386, 103.972757), new LatLng(1.386994, 103.971566), new LatLng(1.384527, 103.969056),
                new LatLng(1.383154, 103.967232), new LatLng(1.381942, 103.967629), new LatLng(1.381304, 103.967591),
                new LatLng(1.380897, 103.967076), new LatLng(1.380242, 103.966980), new LatLng(1.380242, 103.966948),
                new LatLng(1.380800, 103.966808), new LatLng(1.381615, 103.966787), new LatLng(1.381583, 103.965971),
                new LatLng(1.381240, 103.966089), new LatLng(1.382055, 103.964587), new LatLng(1.381572, 103.961851),
                new LatLng(1.381283, 103.960146), new LatLng(1.381680, 103.956283), new LatLng(1.382302, 103.952281),
                new LatLng(1.382650, 103.951846), new LatLng(1.382543, 103.951524), new LatLng(1.382586, 103.950752),
                new LatLng(1.382929, 103.950119), new LatLng(1.383079, 103.949293), new LatLng(1.384988, 103.945677),
                new LatLng(1.385546, 103.944883), new LatLng(1.386157, 103.944400), new LatLng(1.388592, 103.940484),
                new LatLng(1.389922, 103.937888), new LatLng(1.391381, 103.937030), new LatLng(1.391853, 103.937663),
                new LatLng(1.392067, 103.937491), new LatLng(1.391670, 103.936783), new LatLng(1.391853, 103.936708),
                new LatLng(1.392496, 103.937255), new LatLng(1.392759, 103.937083), new LatLng(1.392137, 103.936504),
                new LatLng(1.396749, 103.934272), new LatLng(1.398403, 103.932558), new LatLng(1.398264, 103.932505),
                new LatLng(1.399106, 103.931287), new LatLng(1.399535, 103.930257), new LatLng(1.399127, 103.928262),
                new LatLng(1.399492, 103.926802), new LatLng(1.398055, 103.924270), new LatLng(1.393979, 103.919528),
                new LatLng(1.390440, 103.916481), new LatLng(1.386900, 103.915044));

        Polygon pasirRis = mMap.addPolygon(new PolygonOptions()
                .addAll(pasirRisBoundary)
                .strokeColor(Color.RED)
                .strokeWidth(STROKE_WIDTH)
                .fillColor(FILL_COLOR));

        List<LatLng> tampinesBoundary = Arrays.asList(new LatLng(1.375673, 103.931959), new LatLng(1.372755, 103.930586),
                new LatLng(1.370911, 103.930371), new LatLng(1.368079, 103.930801), new LatLng(1.361150, 103.930908),
                new LatLng(1.359691, 103.930736), new LatLng(1.358233, 103.930393), new LatLng(1.349909, 103.925930),
                new LatLng(1.348622, 103.924986), new LatLng(1.348065, 103.924299), new LatLng(1.346348, 103.927818),
                new LatLng(1.342230, 103.933311), new LatLng(1.336309, 103.940349), new LatLng(1.334421, 103.949147),
                new LatLng(1.330217, 103.952408), new LatLng(1.324382, 103.957472), new LatLng(1.314600, 103.964682),
                new LatLng(1.315029, 103.965455), new LatLng(1.314814, 103.966313), new LatLng(1.315586, 103.968373),
                new LatLng(1.316015, 103.970433), new LatLng(1.315930, 103.970776), new LatLng(1.316530, 103.976355),
                new LatLng(1.315586, 103.976527), new LatLng(1.316530, 103.978673), new LatLng(1.316702, 103.981505),
                new LatLng(1.316359, 103.984509), new LatLng(1.319276, 103.985797), new LatLng(1.321078, 103.980733),
                new LatLng(1.322108, 103.979874), new LatLng(1.323481, 103.979960), new LatLng(1.325969, 103.980990),
                new LatLng(1.326999, 103.980733), new LatLng(1.327600, 103.980303), new LatLng(1.335065, 103.982878),
                new LatLng(1.336523, 103.979703), new LatLng(1.337038, 103.979788), new LatLng(1.340385, 103.972150),
                new LatLng(1.342273, 103.970090), new LatLng(1.346906, 103.967086), new LatLng(1.350596, 103.964768),
                new LatLng(1.357203, 103.962708), new LatLng(1.359434, 103.961678), new LatLng(1.361922, 103.959790),
                new LatLng(1.363982, 103.957215), new LatLng(1.365612, 103.953267), new LatLng(1.366899, 103.947344),
                new LatLng(1.367843, 103.944770), new LatLng(1.369988, 103.942109), new LatLng(1.371618, 103.940306),
                new LatLng(1.373506, 103.936358));

        Polygon tampines = mMap.addPolygon(new PolygonOptions()
                .addAll(tampinesBoundary)
                .strokeColor(Color.RED)
                .strokeWidth(STROKE_WIDTH)
                .fillColor(FILL_COLOR));

        List<LatLng> bukitBatokBoundary = Arrays.asList(new LatLng(1.379716, 103.761252), new LatLng(1.377164, 103.755759),
                new LatLng(1.376713, 103.754343), new LatLng(1.375297, 103.753034), new LatLng(1.373238, 103.752154),
                new LatLng(1.372080, 103.751489), new LatLng(1.371736, 103.751188), new LatLng(1.365580, 103.744494),
                new LatLng(1.357042, 103.737262), new LatLng(1.356012, 103.736726), new LatLng(1.354382, 103.736554),
                new LatLng(1.353438, 103.736790), new LatLng(1.351186, 103.737777), new LatLng(1.348998, 103.738292),
                new LatLng(1.347904, 103.738206), new LatLng(1.345994, 103.737252), new LatLng(1.345351, 103.738625),
                new LatLng(1.345083, 103.739773), new LatLng(1.345029, 103.740620), new LatLng(1.344933, 103.741983),
                new LatLng(1.344664, 103.743013), new LatLng(1.343924, 103.744762), new LatLng(1.340379, 103.751032),
                new LatLng(1.333972, 103.762351), new LatLng(1.332899, 103.764325), new LatLng(1.332513, 103.765506),
                new LatLng(1.335602, 103.765570), new LatLng(1.336031, 103.765892), new LatLng(1.335881, 103.765484),
                new LatLng(1.336589, 103.764583), new LatLng(1.339399, 103.764154), new LatLng(1.339635, 103.764669),
                new LatLng(1.341630, 103.764089), new LatLng(1.341909, 103.766857), new LatLng(1.342531, 103.766857),
                new LatLng(1.342853, 103.767115), new LatLng(1.343282, 103.765935), new LatLng(1.343582, 103.765913),
                new LatLng(1.344590, 103.765248), new LatLng(1.344740, 103.764197), new LatLng(1.346650, 103.762968),
                new LatLng(1.347186, 103.765135), new LatLng(1.347272, 103.767067), new LatLng(1.348902, 103.770328),
                new LatLng(1.352420, 103.769792), new LatLng(1.353707, 103.769427), new LatLng(1.355788, 103.768654),
                new LatLng(1.356496, 103.768225), new LatLng(1.357097, 103.767710), new LatLng(1.357611, 103.767539),
                new LatLng(1.361151, 103.767045), new LatLng(1.363511, 103.767582), new LatLng(1.364240, 103.767560),
                new LatLng(1.364969, 103.767260), new LatLng(1.370225, 103.763848), new LatLng(1.371019, 103.763440),
                new LatLng(1.375223, 103.762561), new LatLng(1.378055, 103.762024), new LatLng(1.378655, 103.761767));

        Polygon bukiBatok = mMap.addPolygon(new PolygonOptions()
                .addAll(bukitBatokBoundary)
                .strokeColor(Color.RED)
                .strokeWidth(STROKE_WIDTH)
                .fillColor(FILL_COLOR));

        List<LatLng> bukitPanjangBoundary = Arrays.asList(new LatLng(1.388710, 103.755160), new LatLng(1.384913, 103.757692),
                new LatLng(1.383240, 103.759323), new LatLng(1.378478, 103.761812), new LatLng(1.377791, 103.762091),
                new LatLng(1.371334, 103.763335), new LatLng(1.370498, 103.763700), new LatLng(1.364513, 103.767519),
                new LatLng(1.364019, 103.767605), new LatLng(1.363419, 103.767584), new LatLng(1.361102, 103.767047),
                new LatLng(1.357498, 103.767541), new LatLng(1.357026, 103.767777), new LatLng(1.356361, 103.768313),
                new LatLng(1.355310, 103.768828), new LatLng(1.352371, 103.769815), new LatLng(1.350012, 103.770094),
                new LatLng(1.348939, 103.770309), new LatLng(1.346408, 103.772133), new LatLng(1.344091, 103.775888),
                new LatLng(1.340594, 103.778763), new LatLng(1.341511, 103.779466), new LatLng(1.341822, 103.780024),
                new LatLng(1.343024, 103.783446), new LatLng(1.344761, 103.787330), new LatLng(1.345662, 103.788210),
                new LatLng(1.347958, 103.786601), new LatLng(1.348151, 103.787212), new LatLng(1.349127, 103.788188),
                new LatLng(1.348837, 103.788210), new LatLng(1.349137, 103.789519), new LatLng(1.348000, 103.789347),
                new LatLng(1.348794, 103.790291), new LatLng(1.349266, 103.791579), new LatLng(1.351519, 103.790141),
                new LatLng(1.352484, 103.789176), new LatLng(1.355487, 103.784798), new LatLng(1.358319, 103.782137),
                new LatLng(1.361322, 103.780507), new LatLng(1.364025, 103.779863), new LatLng(1.368401, 103.779090),
                new LatLng(1.382302, 103.775400), new LatLng(1.390453, 103.774327), new LatLng(1.390668, 103.765787),
                new LatLng(1.390067, 103.761881), new LatLng(1.389230, 103.759306), new LatLng(1.388887, 103.757375),
                new LatLng(1.388758, 103.756367));

        Polygon bukitPanjang = mMap.addPolygon(new PolygonOptions()
                .addAll(bukitPanjangBoundary)
                .strokeColor(Color.RED)
                .strokeWidth(STROKE_WIDTH)
                .fillColor(FILL_COLOR));

        List<LatLng> choaChuKangBoundary = Arrays.asList(new LatLng(1.379035, 103.732675), new LatLng(1.377018, 103.734391),
                new LatLng(1.375431, 103.736194), new LatLng(1.374358, 103.737567), new LatLng(1.373457, 103.739198),
                new LatLng(1.372428, 103.742674), new LatLng(1.371698, 103.745549), new LatLng(1.369124, 103.748425),
                new LatLng(1.371870, 103.751322), new LatLng(1.372900, 103.752008), new LatLng(1.374165, 103.752394),
                new LatLng(1.375967, 103.753467), new LatLng(1.376825, 103.754411), new LatLng(1.377254, 103.755956),
                new LatLng(1.379743, 103.761192), new LatLng(1.383303, 103.759304), new LatLng(1.384848, 103.757759),
                new LatLng(1.387787, 103.755635), new LatLng(1.388709, 103.755162), new LatLng(1.388967, 103.753231),
                new LatLng(1.392163, 103.752909), new LatLng(1.397612, 103.752051), new LatLng(1.399542, 103.751987),
                new LatLng(1.401816, 103.752373), new LatLng(1.403167, 103.752867), new LatLng(1.403725, 103.752791),
                new LatLng(1.404165, 103.752352), new LatLng(1.404894, 103.750560), new LatLng(1.404894, 103.750560),
                new LatLng(1.405581, 103.746107), new LatLng(1.403736, 103.744477), new LatLng(1.402910, 103.743983),
                new LatLng(1.401526, 103.743500), new LatLng(1.399639, 103.743189), new LatLng(1.396850, 103.742835),
                new LatLng(1.396013, 103.742620), new LatLng(1.395574, 103.742481), new LatLng(1.395021, 103.742207),
                new LatLng(1.392265, 103.740587), new LatLng(1.392163, 103.740550), new LatLng(1.390575, 103.740142),
                new LatLng(1.389481, 103.740314), new LatLng(1.388902, 103.740507), new LatLng(1.386650, 103.741558),
                new LatLng(1.381094, 103.735121));

        Polygon choaChuKang = mMap.addPolygon(new PolygonOptions()
                .addAll(choaChuKangBoundary)
                .strokeColor(Color.RED)
                .strokeWidth(STROKE_WIDTH)
                .fillColor(FILL_COLOR));

        List<LatLng> clementiBoundary = Arrays.asList(new LatLng(1.341725, 103.748751), new LatLng(1.341274, 103.748493),
                new LatLng(1.340824, 103.748665), new LatLng(1.338764, 103.748751), new LatLng(1.330655, 103.749480),
                new LatLng(1.326719, 103.750006), new LatLng(1.322943, 103.751937), new LatLng(1.322579, 103.752012),
                new LatLng(1.321292, 103.751680), new LatLng(1.313011, 103.747238), new LatLng(1.309793, 103.747324),
                new LatLng(1.309547, 103.747539), new LatLng(1.309450, 103.747968), new LatLng(1.309364, 103.749899),
                new LatLng(1.308506, 103.751894), new LatLng(1.307691, 103.753053), new LatLng(1.305996, 103.754190),
                new LatLng(1.304355, 103.754094), new LatLng(1.298536, 103.756986), new LatLng(1.301690, 103.762190),
                new LatLng(1.293806, 103.765773), new LatLng(1.292744, 103.766331), new LatLng(1.292133, 103.766728),
                new LatLng(1.291596, 103.767340), new LatLng(1.293881, 103.769024), new LatLng(1.294653, 103.769432),
                new LatLng(1.295029, 103.769539), new LatLng(1.300113, 103.769850), new LatLng(1.300832, 103.770086),
                new LatLng(1.302773, 103.771009), new LatLng(1.303513, 103.771181), new LatLng(1.304543, 103.771234),
                new LatLng(1.306559, 103.771256), new LatLng(1.307128, 103.771342), new LatLng(1.312180, 103.772296),
                new LatLng(1.316492, 103.771739), new LatLng(1.320332, 103.770805), new LatLng(1.321018, 103.770794),
                new LatLng(1.321801, 103.771073), new LatLng(1.324482, 103.772887), new LatLng(1.324922, 103.773681),
                new LatLng(1.325501, 103.774989), new LatLng(1.326488, 103.775665), new LatLng(1.329663, 103.769625),
                new LatLng(1.329749, 103.769292), new LatLng(1.330446, 103.768810), new LatLng(1.331057, 103.768177),
                new LatLng(1.331369, 103.767662), new LatLng(1.332141, 103.765409), new LatLng(1.332870, 103.764454),
                new LatLng(1.337182, 103.756632), new LatLng(1.340325, 103.751086), new LatLng(1.341333, 103.749401));

        Polygon clementi = mMap.addPolygon(new PolygonOptions()
                .addAll(clementiBoundary)
                .strokeColor(Color.RED)
                .strokeWidth(STROKE_WIDTH)
                .fillColor(FILL_COLOR));

        List<LatLng> jurongEastBoundary = Arrays.asList(new LatLng(1.353480, 103.728186), new LatLng(1.344556, 103.728186),
                new LatLng(1.345114, 103.723937), new LatLng(1.344942, 103.721877), new LatLng(1.344256, 103.721834),
                new LatLng(1.343141, 103.721405), new LatLng(1.341939, 103.721405), new LatLng(1.340824, 103.722649),
                new LatLng(1.338250, 103.724366), new LatLng(1.337306, 103.724967), new LatLng(1.335504, 103.725053),
                new LatLng(1.329669, 103.724795), new LatLng(1.328553, 103.724795), new LatLng(1.325293, 103.725911),
                new LatLng(1.323491, 103.719645), new LatLng(1.320831, 103.720246), new LatLng(1.318428, 103.720332),
                new LatLng(1.314395, 103.719388), new LatLng(1.314738, 103.717414), new LatLng(1.314052, 103.709753),
                new LatLng(1.310019, 103.710118), new LatLng(1.309890, 103.709603), new LatLng(1.308174, 103.709689),
                new LatLng(1.308431, 103.710719), new LatLng(1.307316, 103.711320), new LatLng(1.297362, 103.711062),
                new LatLng(1.297362, 103.711921), new LatLng(1.299765, 103.711921), new LatLng(1.299593, 103.721963),
                new LatLng(1.299979, 103.721920), new LatLng(1.299958, 103.720354), new LatLng(1.301073, 103.721298),
                new LatLng(1.305964, 103.715461), new LatLng(1.306479, 103.712629), new LatLng(1.307423, 103.712114),
                new LatLng(1.308968, 103.712114), new LatLng(1.308539, 103.715719), new LatLng(1.303047, 103.722242),
                new LatLng(1.300902, 103.726962), new LatLng(1.301674, 103.729967), new LatLng(1.299443, 103.738550),
                new LatLng(1.299443, 103.740095), new LatLng(1.299872, 103.741296), new LatLng(1.301588, 103.743099),
                new LatLng(1.300644, 103.744472), new LatLng(1.299271, 103.743871), new LatLng(1.298156, 103.743957),
                new LatLng(1.297641, 103.745073), new LatLng(1.296440, 103.749450), new LatLng(1.297469, 103.755544),
                new LatLng(1.298585, 103.757089), new LatLng(1.304334, 103.754257), new LatLng(1.306393, 103.753999),
                new LatLng(1.308453, 103.752197), new LatLng(1.309568, 103.749536), new LatLng(1.309740, 103.747219),
                new LatLng(1.313172, 103.747304), new LatLng(1.322525, 103.751939), new LatLng(1.326730, 103.750137),
                new LatLng(1.341146, 103.748592), new LatLng(1.341832, 103.748592), new LatLng(1.344921, 103.742755),
                new LatLng(1.345178, 103.739065), new LatLng(1.346637, 103.736318), new LatLng(1.350928, 103.732370),
                new LatLng(1.352558, 103.730224));

        Polygon jurongEast = mMap.addPolygon(new PolygonOptions()
                .addAll(jurongEastBoundary)
                .strokeColor(Color.RED)
                .strokeWidth(STROKE_WIDTH)
                .fillColor(FILL_COLOR));
    }
}
