package proyecto.which.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import proyecto.which.R;

public class BuscarActivity extends AppCompatActivity {

    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);


        back =(ImageButton)findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent Intentback = new Intent(BuscarActivity.this, MainActivity.class);
                startActivity(Intentback);

            }


        });
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fabBuscar);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



        // SPINNERS

            // puntuacionMin
        Spinner spinnerpmin = (Spinner) findViewById(R.id.puntuacionMin);
        String[] valorespmin = {"0","20","40","60","80","100"};
        spinnerpmin.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valorespmin));
        spinnerpmin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
            {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                // vacio

            }
        });

        // puntuacionMax
        Spinner spinnerpmax = (Spinner) findViewById(R.id.puntuacionMax);
        String[] valorespmax = {"100","80","60","40","20","0"};
        spinnerpmax.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valorespmax));
        spinnerpmax.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
            {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                // vacio

            }
        });

/*

        // precioMin
        Spinner spinnerpreciomin = (Spinner) findViewById(R.id.precioMin);
        String[] valorespreciomin = {"0","200","400","600","800","1000","1500"};
        spinnerpreciomin.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valorespreciomin));
        spinnerpreciomin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
            {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                // vacio

            }
        });

         precioMax
        Spinner spinnerpreciomax = (Spinner) findViewById(R.id.precioMax);
        String[] valorespreciomax = {"1500","1000","800","600","400","200","0"};
        spinnerpreciomax.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valorespreciomax));
        spinnerpreciomax.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
            {
           }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                // vacio

            }
        });*/

        // memoMin
        Spinner spinnermemomin = (Spinner) findViewById(R.id.memoMin);
        String[] valoresmemomin= {"1","16","32","64","128","256","512"};
        spinnermemomin.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valoresmemomin));
        spinnermemomin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
            {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                // vacio

            }
        });

        // memoMax
        Spinner spinnermemomax = (Spinner) findViewById(R.id.memoMax);
        String[] valoresmemomax= {"512","256","128","64","32","16","1"};
        spinnermemomax.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valoresmemomax));
        spinnermemomax.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
            {
           }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                // vacio

            }
        });
    }

}



