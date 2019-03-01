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
                .strokeColor(Color.RED).strokeWidth(STROKE_WIDTH));

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
                .strokeWidth(STROKE_WIDTH));

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
                .strokeWidth(STROKE_WIDTH));


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
                .strokeWidth(STROKE_WIDTH));

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
                .strokeWidth(STROKE_WIDTH));

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
                .strokeWidth(STROKE_WIDTH));

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
                .strokeWidth(STROKE_WIDTH));

        

    }
}
