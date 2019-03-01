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

        List<LatLng> geylangBoundary = Arrays.asList(new LatLng(1.327813, 103.868839),new LatLng(1.328083, 103.869388),new LatLng(1.328024, 103.869510),new LatLng(1.328519, 103.870403),
                                                    new LatLng(1.328718, 103.871395), new LatLng(1.329114, 103.872485), new LatLng(1.329412, 103.873080), new LatLng(1.329511, 103.873874),
                                                    new LatLng(1.329709, 103.874568), new LatLng(1.330205, 103.875460), new LatLng(1.330553, 103.876930),new LatLng(1.330884, 103.877758),
                                                    new LatLng(1.331050, 103.878420), new LatLng(1.331464, 103.879413), new LatLng(1.331546, 103.880241), new LatLng(1.331795, 103.881069),
                                                    new LatLng(1.332043, 103.881814), new LatLng(1.332208, 103.882559), new LatLng(1.332291, 103.883305), new LatLng(1.332540, 103.884132),
                                                    new LatLng(1.332705, 103.884878), new LatLng(1.332871, 103.885623), new LatLng(1.332953, 103.886368), new LatLng(1.333202, 103.887361),
                                                    new LatLng(1.333533, 103.888189), new LatLng(1.333578, 103.888918), new LatLng(1.333717, 103.889541), new LatLng(1.333993, 103.890370),
                                                    new LatLng(1.334270, 103.890992), new LatLng(1.334684, 103.891891), new LatLng(1.334961, 103.892513), new LatLng(1.335168, 103.893135),
                                                    new LatLng(1.335582, 103.893688), new LatLng(1.335928, 103.894241), new LatLng(1.336274, 103.894794), new LatLng(1.336826, 103.895346),
                                                    new LatLng(1.337045, 103.895512), new LatLng(1.337506, 103.895916), new LatLng(1.337759, 103.896128), new LatLng(1.337736, 103.896148),
                                                    new LatLng(1.337774, 103.896635), new LatLng(1.337431, 103.896635), new LatLng(1.336745, 103.897150), new LatLng(1.336487, 103.897665),
                                                    new LatLng(1.335801, 103.898351), new LatLng(1.335715, 103.898437), new LatLng(1.334771, 103.899296), new LatLng(1.334342, 103.899639),
                                                    new LatLng(1.333902, 103.900154), new LatLng(1.333741, 103.900498), new LatLng(1.333140, 103.900927), new LatLng(1.332711, 103.901442),
                                                    new LatLng(1.332197, 103.901871), new LatLng(1.331596, 103.902472), new LatLng(1.331081, 103.903073), new LatLng(1.330395, 103.903931),
                                                    new LatLng(1.329794, 103.904360), new LatLng(1.329107, 103.904961), new LatLng(1.329365, 103.904961), new LatLng(1.328764, 103.905304),
                                                    new LatLng(1.328192, 103.905622), new LatLng(1.327740, 103.905763), new LatLng(1.327022, 103.905704), new LatLng(1.326364, 103.905823),
                                                    new LatLng(1.325826, 103.905883), new LatLng(1.325049, 103.905524), new LatLng(1.324451, 103.905464), new LatLng(1.323673, 103.905404),
                                                    new LatLng(1.323015, 103.905345), new LatLng(1.322417, 103.905285), new LatLng(1.321759, 103.905225), new LatLng(1.321101, 103.905045),
                                                    new LatLng(1.320444, 103.905045), new LatLng(1.319846, 103.904926), new LatLng(1.319247, 103.904926), new LatLng(1.318829, 103.904986),
                                                    new LatLng(1.318291, 103.904926), new LatLng(1.317752, 103.904986), new LatLng(1.317094, 103.905165), new LatLng(1.317008, 103.905218),
                                                    new LatLng(1.316321, 103.905304), new LatLng(1.315721, 103.905562), new LatLng(1.315206, 103.905819), new LatLng(1.314519, 103.905991),
                                                    new LatLng(1.313747, 103.906420), new LatLng(1.313216, 103.906741), new LatLng(1.313124, 103.906478), new LatLng(1.309606, 103.901632),
                                                    new LatLng(1.309606, 103.901632), new LatLng(1.309606, 103.901632), new LatLng(1.309569, 103.901568), new LatLng(1.309536, 103.901453),
                                                    new LatLng(1.309603, 103.894556), new LatLng(1.308058, 103.886072), new LatLng(1.306052, 103.882202), new LatLng(1.307918, 103.878376),
                                                    new LatLng(1.308196, 103.877645), new LatLng(1.308440, 103.876705), new LatLng(1.308718, 103.876114), new LatLng(1.308858, 103.875986),
                                                    new LatLng(1.310398, 103.875551), new LatLng(1.313303, 103.874998), new LatLng(1.314436, 103.874824), new LatLng(1.315801, 103.874708),
                                                    new LatLng(1.316615, 103.874679), new LatLng(1.317428, 103.874766), new LatLng(1.318416, 103.874998), new LatLng(1.319288, 103.875376),
                                                    new LatLng(1.319863, 103.875920), new LatLng(1.320095, 103.876240), new LatLng(1.320299, 103.875688), new LatLng(1.320531, 103.875252),
                                                    new LatLng(1.320996, 103.874787), new LatLng(1.326283, 103.870690), new LatLng(1.327823, 103.868830));
        Polygon geylang = mMap.addPolygon(new PolygonOptions().addAll(geylangBoundary).strokeColor(Color.RED).strokeWidth(2));

        List<LatLng> kallangBoundary = Arrays.asList(new LatLng(1.330371, 103.862313), new LatLng(1.329242, 103.865130), new LatLng(1.328446, 103.867554), new LatLng(1.328342, 103.868072),
                                                    new LatLng(1.326987, 103.869839), new LatLng(1.326358, 103.870568), new LatLng(1.321112, 103.874669), new LatLng(1.320538, 103.875280),
                                                    new LatLng(1.320049, 103.876252), new LatLng(1.319913, 103.875994), new LatLng(1.319291, 103.875342), new LatLng(1.318608, 103.875069),
                                                    new LatLng(1.317668, 103.874811), new LatLng(1.316758, 103.874720), new LatLng(1.316075, 103.874659), new LatLng(1.314194, 103.874811),
                                                    new LatLng(1.310372, 103.875570), new LatLng(1.308931, 103.875949), new LatLng(1.308749, 103.876086), new LatLng(1.308673, 103.876146),
                                                    new LatLng(1.308460, 103.876617), new LatLng(1.308244, 103.877470), new LatLng(1.308092, 103.877964), new LatLng(1.307598, 103.879142),
                                                    new LatLng(1.306977, 103.880725), new LatLng(1.306521, 103.881574), new LatLng(1.306103, 103.882157), new LatLng(1.304445, 103.883879),
                                                    new LatLng(1.303887, 103.884323), new LatLng(1.303419, 103.884513), new LatLng(1.302798, 103.884601), new LatLng(1.302317, 103.884779),
                                                    new LatLng(1.302026, 103.885007), new LatLng(1.301608, 103.885374), new LatLng(1.301215, 103.885501), new LatLng(1.300810, 103.885513),
                                                    new LatLng(1.297961, 103.885311), new LatLng(1.295782, 103.885278), new LatLng(1.295254, 103.871117), new LatLng(1.294022, 103.864377),
                                                    new LatLng(1.294084, 103.863026), new LatLng(1.294154, 103.862623), new LatLng(1.294294, 103.862220), new LatLng(1.294912, 103.861617),
                                                    new LatLng(1.295632, 103.861153), new LatLng(1.296498, 103.861024), new LatLng(1.297860, 103.860854), new LatLng(1.298124, 103.860692),
                                                    new LatLng(1.299767, 103.859440), new LatLng(1.300505, 103.860351), new LatLng(1.301098, 103.861382), new LatLng(1.301526, 103.862275),
                                                    new LatLng(1.304876, 103.860269), new LatLng(1.305578, 103.859838), new LatLng(1.305741, 103.859695), new LatLng(1.306486, 103.858930),
                                                    new LatLng(1.306787, 103.858702), new LatLng(1.307129, 103.858325), new LatLng(1.310630, 103.854469), new LatLng(1.311814, 103.855353),
                                                    new LatLng(1.312627, 103.854881), new LatLng(1.312867, 103.854655), new LatLng(1.313601, 103.854316), new LatLng(1.312764, 103.853515),
                                                    new LatLng(1.312269, 103.853185), new LatLng(1.311974, 103.853079), new LatLng(1.312328, 103.852619), new LatLng(1.311609, 103.852548),
                                                    new LatLng(1.306704, 103.848825), new LatLng(1.308412, 103.846845), new LatLng(1.309897, 103.845714), new LatLng(1.310226, 103.845196),
                                                    new LatLng(1.310568, 103.844288), new LatLng(1.311713, 103.844713), new LatLng(1.312729, 103.844883), new LatLng(1.313279, 103.845052),
                                                    new LatLng(1.314959, 103.845885), new LatLng(1.315622, 103.846351), new LatLng(1.316285, 103.847042), new LatLng(1.317118, 103.848313),
                                                    new LatLng(1.317089, 103.848313), new LatLng(1.318966, 103.852548), new LatLng(1.319418, 103.853465), new LatLng(1.320928, 103.855597),
                                                    new LatLng(1.322001, 103.856655), new LatLng(1.323313, 103.857770), new LatLng(1.325839, 103.860424), new LatLng(1.326361, 103.860961),
                                                    new LatLng(1.327321, 103.861666), new LatLng(1.328041, 103.861977), new LatLng(1.328563, 103.862146), new LatLng(1.329057, 103.862302),
                                                    new LatLng(1.329805, 103.862372), new LatLng(1.330474, 103.862346));
        Polygon kallang = mMap.addPolygon(new PolygonOptions().addAll(kallangBoundary).strokeColor(Color.RED).strokeWidth(2));

        List<LatLng> marineParadeBoundary = Arrays.asList(new LatLng(1.284217, 103.880543), new LatLng(1.286421, 103.882963), new LatLng(1.287089, 103.883915), new LatLng(1.287342, 103.884816),
                                                    new LatLng(1.287342, 103.885556), new LatLng(1.288628, 103.886467), new LatLng(1.290552, 103.888776), new LatLng(1.290714, 103.889464),
                                                    new LatLng(1.290380, 103.889839), new LatLng(1.293498, 103.893383), new LatLng(1.293741, 103.894092), new LatLng(1.293619, 103.894356),
                                                    new LatLng(1.293265, 103.894305), new LatLng(1.293994, 103.895419), new LatLng(1.294130, 103.896201), new LatLng(1.293716, 103.896556),
                                                    new LatLng(1.294916, 103.897841), new LatLng(1.296598, 103.901569), new LatLng(1.298948, 103.910582), new LatLng(1.299590, 103.912070),
                                                    new LatLng(1.299607, 103.912332), new LatLng(1.299497, 103.912340), new LatLng(1.299658, 103.912678), new LatLng(1.299739, 103.912611),
                                                    new LatLng(1.300656, 103.915194), new LatLng(1.300640, 103.915103), new LatLng(1.300824, 103.915174), new LatLng(1.300993, 103.915395),
                                                    new LatLng(1.301626, 103.917036), new LatLng(1.301601, 103.917408), new LatLng(1.301525, 103.917577), new LatLng(1.301677, 103.917889),
                                                    new LatLng(1.301863, 103.919098), new LatLng(1.301863, 103.919335), new LatLng(1.304401, 103.918769), new LatLng(1.304679, 103.918734),
                                                    new LatLng(1.307428, 103.917968), new LatLng(1.307324, 103.917080), new LatLng(1.305775, 103.910710), new LatLng(1.305496, 103.909953),
                                                    new LatLng(1.308524, 103.908413), new LatLng(1.309125, 103.908180), new LatLng(1.310502, 103.907908), new LatLng(1.313139, 103.906764),
                                                    new LatLng(1.313110, 103.906448), new LatLng(1.309610, 103.901663), new LatLng(1.309563, 103.901463), new LatLng(1.309518, 103.901259),
                                                    new LatLng(1.309496, 103.901214), new LatLng(1.309593, 103.894586), new LatLng(1.307884, 103.886101), new LatLng(1.306057, 103.882213),
                                                    new LatLng(1.304461, 103.883900), new LatLng(1.303891, 103.884325), new LatLng(1.303430, 103.884519), new LatLng(1.302751, 103.884628),
                                                    new LatLng(1.302545, 103.884701), new LatLng(1.302351, 103.884786), new LatLng(1.302060, 103.884992), new LatLng(1.301562, 103.885392),
                                                    new LatLng(1.301199, 103.885514), new LatLng(1.300835, 103.885502), new LatLng(1.297912, 103.885308), new LatLng(1.295804, 103.885318),
                                                    new LatLng(1.295543, 103.877254), new LatLng(1.294802, 103.876251), new LatLng(1.294221, 103.875830), new LatLng(1.293495, 103.875641),
                                                    new LatLng(1.290691, 103.875714), new LatLng(1.289195, 103.876498), new LatLng(1.288120, 103.877574), new LatLng(1.284198, 103.880523));
        Polygon marineParade = mMap.addPolygon(new PolygonOptions().addAll(marineParadeBoundary).strokeColor(Color.RED).strokeWidth(2));

        List<LatLng> queenstownBoundary = Arrays.asList(new LatLng(1.255067, 103.785491), new LatLng(1.267406, 103.792746), new LatLng(1.269740, 103.796498), new LatLng(1.271908, 103.797832),
                                                        new LatLng(1.270741, 103.800000), new LatLng(1.272741, 103.801001), new LatLng(1.272575, 103.802169), new LatLng(1.275274, 103.801962),
                                                        new LatLng(1.278877, 103.803067), new LatLng(1.282770, 103.801207), new LatLng(1.283641, 103.801207), new LatLng(1.283641, 103.801265),
                                                        new LatLng(1.284629, 103.801730), new LatLng(1.286662, 103.803008), new LatLng(1.292390, 103.808843), new LatLng(1.292408, 103.809396),
                                                        new LatLng(1.291658, 103.815233), new LatLng(1.293547, 103.815781), new LatLng(1.296859, 103.816537), new LatLng(1.296706, 103.812661),
                                                        new LatLng(1.296864, 103.812433), new LatLng(1.297272, 103.812569), new LatLng(1.297320, 103.812519), new LatLng(1.298473, 103.809985),
                                                        new LatLng(1.299112, 103.809287), new LatLng(1.299042, 103.808770), new LatLng(1.299480, 103.808711), new LatLng(1.299481, 103.808664),
                                                        new LatLng(1.299655, 103.807560), new LatLng(1.299190, 103.806862), new LatLng(1.299888, 103.805642), new LatLng(1.300120, 103.804712),
                                                        new LatLng(1.300817, 103.804189), new LatLng(1.300817, 103.803898), new LatLng(1.301253, 103.803651), new LatLng(1.301660, 103.804291),
                                                        new LatLng(1.302532, 103.803826), new LatLng(1.303287, 103.803826), new LatLng(1.303461, 103.803535), new LatLng(1.306192, 103.803303),
                                                        new LatLng(1.306657, 103.803128), new LatLng(1.306889, 103.803012), new LatLng(1.307006, 103.802780), new LatLng(1.308923, 103.800048),
                                                        new LatLng(1.309853, 103.799467), new LatLng(1.308749, 103.799409), new LatLng(1.307993, 103.799002), new LatLng(1.308458, 103.798246),
                                                        new LatLng(1.309156, 103.797549), new LatLng(1.308865, 103.797316), new LatLng(1.309620, 103.796619), new LatLng(1.309853, 103.795108),
                                                        new LatLng(1.309969, 103.794585), new LatLng(1.310608, 103.794701), new LatLng(1.311247, 103.794527), new LatLng(1.311538, 103.794236),
                                                        new LatLng(1.312584, 103.794178), new LatLng(1.313339, 103.793016), new LatLng(1.311189, 103.791039), new LatLng(1.312351, 103.790400),
                                                        new LatLng(1.313223, 103.789528), new LatLng(1.314501, 103.787668), new LatLng(1.315896, 103.786390), new LatLng(1.314966, 103.784646),
                                                        new LatLng(1.314733, 103.784763), new LatLng(1.314733, 103.784763), new LatLng(1.314850, 103.785053), new LatLng(1.313978, 103.785460),
                                                        new LatLng(1.312768, 103.785324), new LatLng(1.312652, 103.785266), new LatLng(1.311141, 103.785324), new LatLng(1.311255, 103.784841),
                                                        new LatLng(1.310838, 103.784771), new LatLng(1.312800, 103.779077), new LatLng(1.314192, 103.777615), new LatLng(1.318786, 103.771280),
                                                        new LatLng(1.312264, 103.772320), new LatLng(1.306929, 103.771319), new LatLng(1.303928, 103.771152), new LatLng(1.302677, 103.770985),
                                                        new LatLng(1.300426, 103.769818), new LatLng(1.294591, 103.769484), new LatLng(1.291589, 103.767233), new LatLng(1.292340, 103.766399),
                                                        new LatLng(1.293007, 103.766204), new LatLng(1.301637, 103.762166), new LatLng(1.299270, 103.758129), new LatLng(1.298644, 103.759312),
                                                        new LatLng(1.296417, 103.761401), new LatLng(1.295251, 103.761980), new LatLng(1.295042, 103.761701), new LatLng(1.294834, 103.761910),
                                                        new LatLng(1.295321, 103.762258), new LatLng(1.295112, 103.762746), new LatLng(1.294555, 103.762885), new LatLng(1.294500, 103.762860),
                                                        new LatLng(1.293077, 103.761772), new LatLng(1.294334, 103.759597), new LatLng(1.292832, 103.761851), new LatLng(1.291058, 103.760856),
                                                        new LatLng(1.291600, 103.760083), new LatLng(1.291299, 103.760083), new LatLng(1.290889, 103.760722), new LatLng(1.290620, 103.760671),
                                                        new LatLng(1.283712, 103.772150), new LatLng(1.278011, 103.768830), new LatLng(1.285299, 103.756416), new LatLng(1.284794, 103.753240),
                                                        new LatLng(1.280681, 103.750858), new LatLng(1.276568, 103.757787), new LatLng(1.276135, 103.757498), new LatLng(1.268342, 103.770562),
                                                        new LatLng(1.279527, 103.777347), new LatLng(1.273682, 103.787163), new LatLng(1.259213, 103.778517));
        Polygon queenstown = mMap.addPolygon(new PolygonOptions().addAll(queenstownBoundary).strokeColor(Color.RED).strokeWidth(2));

        List<LatLng> toaPayohBoundary = Arrays.asList(new LatLng(1.341761, 103.835816), new LatLng(1.343563, 103.839077), new LatLng(1.344940, 103.840392), new LatLng(1.345060, 103.840990),
                                                    new LatLng(1.345000, 103.840990), new LatLng(1.345060, 103.841947), new LatLng(1.344462, 103.843024), new LatLng(1.343983, 103.844280),
                                                    new LatLng(1.343983, 103.845058), new LatLng(1.343983, 103.847630), new LatLng(1.343505, 103.851937), new LatLng(1.343265, 103.853433),
                                                    new LatLng(1.343206, 103.854629), new LatLng(1.343445, 103.860851), new LatLng(1.343684, 103.862526), new LatLng(1.344282, 103.864201),
                                                    new LatLng(1.344342, 103.865398), new LatLng(1.342727, 103.869107), new LatLng(1.342787, 103.870004), new LatLng(1.343505, 103.871619),
                                                    new LatLng(1.343565, 103.872337), new LatLng(1.343445, 103.873952), new LatLng(1.344342, 103.876106), new LatLng(1.344342, 103.877123),
                                                    new LatLng(1.342787, 103.879636), new LatLng(1.341113, 103.883585), new LatLng(1.340993, 103.884901), new LatLng(1.338780, 103.886696),
                                                    new LatLng(1.334414, 103.888670), new LatLng(1.333517, 103.888909), new LatLng(1.331268, 103.878969), new LatLng(1.327808, 103.868754),
                                                    new LatLng(1.328475, 103.867503), new LatLng(1.329267, 103.865126), new LatLng(1.330309, 103.862666), new LatLng(1.330560, 103.861165),
                                                    new LatLng(1.329101, 103.856663), new LatLng(1.329642, 103.848908), new LatLng(1.329517, 103.842445), new LatLng(1.328934, 103.840611),
                                                    new LatLng(1.329684, 103.840068), new LatLng(1.330685, 103.839110), new LatLng(1.333602, 103.837900), new LatLng(1.334644, 103.837150),
                                                    new LatLng(1.335103, 103.836983), new LatLng(1.337312, 103.837275), new LatLng(1.338563, 103.837233), new LatLng(1.338913, 103.837365),
                                                    new LatLng(1.339930, 103.836958), new LatLng(1.341760, 103.835912));
        Polygon toaPayoh= mMap.addPolygon(new PolygonOptions().addAll(toaPayohBoundary).strokeColor(Color.RED).strokeWidth(2));
    }
}
