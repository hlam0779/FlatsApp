package com.example.flatsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;


import com.example.flatsapp.R;

import org.json.JSONObject;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Button click;
    public static TextView data;
    String Flat_Type;
    String Selling_Price_range;
    String Remaining_Lease_range;
    String Storey_range;
    String Floor_Area_range;
    String[] flatdetail = new String[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //dropdown list

        Spinner FlatType = (Spinner) findViewById(R.id.FlatType);
        Spinner Selling_Price_Range = (Spinner) findViewById(R.id.Selling_Price_Range);
        Spinner Remaining_Lease_Range = (Spinner) findViewById(R.id.Remaining_Lease_Range);
        final Spinner Storey_Range = (Spinner) findViewById(R.id.Storey_Range);
        Spinner Floor_Area_Range = (Spinner) findViewById(R.id.Floor_Area_Range);
        //Flat Type DropDown
        ArrayAdapter<CharSequence> FlatTypeAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                R.array.FlatType, android.R.layout.simple_spinner_item);
        FlatTypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        FlatType.setAdapter(FlatTypeAdapter);
        FlatType.setOnItemSelectedListener(this);
        //--------------Selling Price Range DropDown---------------------
        ArrayAdapter<CharSequence> SellingPriceRangeAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                R.array.Selling_Price_Range, android.R.layout.simple_spinner_item);
        SellingPriceRangeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Selling_Price_Range.setAdapter(SellingPriceRangeAdapter);
        Selling_Price_Range.setOnItemSelectedListener(this);
        //Remaining Lease Range DropDown-----------------------
        ArrayAdapter<CharSequence> RemainingLeaseRangeAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                R.array.Remaining_Lease_Range, android.R.layout.simple_spinner_item);
        RemainingLeaseRangeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Remaining_Lease_Range.setAdapter(RemainingLeaseRangeAdapter);
        Remaining_Lease_Range.setOnItemSelectedListener(this);
        //Storey Range DropDown-----------------------
        ArrayAdapter<CharSequence> StoreyRangeAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                R.array.Storey_Range, android.R.layout.simple_spinner_item);
        StoreyRangeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Storey_Range.setAdapter(StoreyRangeAdapter);
        Storey_Range.setOnItemSelectedListener(this);
        //Floor Area Square DropDown-----------------------
        ArrayAdapter<CharSequence> FloorAreaSquareAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                R.array.Floor_Area_Range, android.R.layout.simple_spinner_item);
        FloorAreaSquareAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Floor_Area_Range.setAdapter(FloorAreaSquareAdapter);
        Floor_Area_Range.setOnItemSelectedListener(this);

        //Create Button to get to next page
        click =(Button) findViewById(R.id.button);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Flat_Type.equals("Choose FlatType"))
                {
                    Toast.makeText(MainActivity.this,"Please Fill in The Flat Type",Toast.LENGTH_LONG).show();
                }
                else{
                    flatdetail[0] = Flat_Type;
                    if(Selling_Price_range != null)
                        flatdetail[1] = Selling_Price_range;
                    if(Remaining_Lease_range != null)
                        flatdetail[2] = Remaining_Lease_range;
                    if(Storey_range != null)if(Selling_Price_range != null)
                        flatdetail[3] = Storey_range;
                    if(Floor_Area_range != null)
                        flatdetail[4] = Floor_Area_range;
                    Bundle extras = new Bundle();
                    extras.putStringArray("FLAT DETAILS", flatdetail);
                    //extras.putString("MORE STUFFS", MORESTUFFS); Can put multiple stuff in extra
                    Intent intent = new Intent(MainActivity.this,MapsActivity.class);
                    intent.putExtras(extras);
                    startActivity(intent);
                }

            }

        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        Log.d("FLAT","entered onitemselected class");
        switch (parent.getId()) {
            case R.id.FlatType:
                Flat_Type = parent.getItemAtPosition(pos).toString();
                Toast.makeText(this, Flat_Type, Toast.LENGTH_LONG).show();
                Log.d("FLAT","FLAT TYPE HAPPENED");
                break;
            case R.id.Selling_Price_Range:
                Selling_Price_range = parent.getItemAtPosition(pos).toString();
                Toast.makeText(this, Selling_Price_range, Toast.LENGTH_LONG).show();
                Log.d("FLAT","SPR HAPPENED");
                break;
            case R.id.Remaining_Lease_Range:
                Remaining_Lease_range = parent.getItemAtPosition(pos).toString();
                Toast.makeText(this, Remaining_Lease_range, Toast.LENGTH_LONG).show();
                Log.d("FLAT","RLR HAPPENED");
                break;
            case R.id.Storey_Range:
                Storey_range = parent.getItemAtPosition(pos).toString();
                Toast.makeText(this, Storey_range, Toast.LENGTH_LONG).show();
                Log.d("FLAT","SR HAPPENED");
                break;
            case R.id.Floor_Area_Range:
                Floor_Area_range = parent.getItemAtPosition(pos).toString();
                Toast.makeText(this, Floor_Area_range, Toast.LENGTH_LONG).show();
                Log.d("FLAT","FAR HAPPENED");
                break;
        }
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback.
            //This is for in the event when previous selection removes the next selection. abit like if else.
            /*This means that the method is called whenever the currently selected item is removed from the list of
            available items.
            As the doc describes, this can occur under different circumstances,
            but generally if the adapter is modified such that the currently selected item is no longer available
            then the method will be called.
            This method may be used so that you can set which item will be selected given that
            the previous item is no longer available. This is instead of letting the spinner
            automatically select the next item in the list.--from google*/
    }
    }
    /*

    //-----------------------------------------------------------------------------------------

    // 1st method
    click =(Button)

    findViewById(R.id.button);

    data =(TextView) findViewById(R.id.data);

        click.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View view)
        {
            data_api process = new data_api();
            process.execute();
        }
    });}

}
        //2nd method

        // can use json array request, string request or json object request

      /*  JsonObjectRequest objectRequest = new JsonObjectRequest(
                Request.Method.GET,
                URL,
                "resouceid=1b702208-44bf-4829-b620-4615ee19b57c",
                new Response.Listener<JSONObject>(){
                    @Override
                    public void onResponse(JSONObject response){
                        result.setText
                    }
                }
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError Error){

                    }
                }
        );
        requestQueue.add(objectRequest);
    }
    */