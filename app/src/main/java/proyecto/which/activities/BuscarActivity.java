package proyecto.which.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Spinner;

import java.util.HashMap;

import proyecto.which.R;

public class BuscarActivity extends AppCompatActivity {

    ImageButton back;
    private CheckBox chkSamsung, chkApple ,chkNokia, chkHuawei, chkBberry, chkBq, chkTodasMarcas;
    private CheckBox chkIos, chkAndroid, chkWindows, chkBlackBerryOS, chkTodosSistemas;
    private CheckBox chkCTMin, chkCTMed, chkCTMax;
    private String minPuntuacion = "0", maxPuntuacion = "100";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);

        // checkbox Marcas
        chkSamsung = (CheckBox) findViewById(R.id.boxSamsung);
        chkApple = (CheckBox) findViewById(R.id.boxApple);
        chkNokia = (CheckBox) findViewById(R.id.boxNokia);
        chkHuawei = (CheckBox) findViewById(R.id.boxHuawei);
        chkBberry = (CheckBox) findViewById(R.id.boxBberry);
        chkTodasMarcas = (CheckBox) findViewById(R.id.boxMall);
        chkBq = (CheckBox) findViewById(R.id.boxBq);

        // checkbox Sistemas
        chkIos = (CheckBox) findViewById(R.id.boxIos);
        chkAndroid = (CheckBox) findViewById(R.id.boxAndroid);
        chkWindows = (CheckBox) findViewById(R.id.boxWindows);
        chkBlackBerryOS = (CheckBox) findViewById(R.id.boxbberryos);
        chkTodosSistemas = (CheckBox) findViewById(R.id.boxSall);

        // checkbox camara trasera
        chkCTMax = (CheckBox) findViewById(R.id.boxCTmax); // <10
        chkCTMed = (CheckBox) findViewById(R.id.boxCTmed); // 10 < 20
        chkCTMin = (CheckBox) findViewById(R.id.boxCTmin); // > 20

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

                String OSs = generateOsString();
                String Marcas = generateMarcaString();
                String CamaraTrasera = generateCamaraTraseraString();
                String CamaraFrontal = generateCamaraFrontalString();

                HashMap<String, String> datos = new HashMap<>();

                datos.put("so", OSs);
                datos.put("marca", Marcas);
                datos.put("camara", CamaraTrasera);
                datos.put("frontCamara", CamaraFrontal);
                datos.put("minPuntuacion", minPuntuacion);
                datos.put("maxPuntuacion", maxPuntuacion);

                Intent buscador = new Intent(BuscarActivity.this, ListaBuscarActivity.class);
                buscador.putExtra("mapSmartphones", datos);
                startActivity(buscador);

            }
        });



        // SPINNERS

        // puntuacionMin
        final Spinner spinnerpmin = (Spinner) findViewById(R.id.puntuacionMin);
        String[] valorespmin = {"0", "20", "40", "60", "80", "100"};
        spinnerpmin.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valorespmin));
        spinnerpmin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                minPuntuacion = spinnerpmin.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });


        // puntuacionMax
        final Spinner spinnerpmax = (Spinner) findViewById(R.id.puntuacionMax);
        String[] valorespmax = {"100","80","60","40","20","0"};
        spinnerpmax.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valorespmax));
        spinnerpmax.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                maxPuntuacion = spinnerpmax.getSelectedItem().toString();
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });


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
            public void onNothingSelected(AdapterView<?> parent) {}
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
            public void onNothingSelected(AdapterView<?> parent) {}
        });
    }

    private String generateOsString() {
        String OSs = "";
        boolean todosSistemasChecked = BuscarActivity.this.chkTodosSistemas.isChecked();
        boolean iosChecked = BuscarActivity.this.chkIos.isChecked();
        boolean androidChecked = BuscarActivity.this.chkAndroid.isChecked();
        boolean windowsChecked = BuscarActivity.this.chkWindows.isChecked();
        boolean bberryosChecked = BuscarActivity.this.chkBlackBerryOS.isChecked();
        if (todosSistemasChecked) {OSs = OSs + "iOS-Android-Windows-BlackBerryOS-";}
        else {
            if (iosChecked) {OSs = OSs + "iOS-";}
            if (androidChecked) {OSs = OSs + "Android-";}
            if (windowsChecked) {OSs = OSs + "Windows-";}
            if (bberryosChecked) {OSs = OSs + "BlackBerryOS-";}
        }
        return OSs;
    }

    private String generateMarcaString() {
        String Marcas = "";
        boolean todasMarcasChecked = BuscarActivity.this.chkTodasMarcas.isChecked();
        boolean samsungChecked = BuscarActivity.this.chkSamsung.isChecked();
        boolean appleChecked = BuscarActivity.this.chkApple.isChecked();
        boolean nokiaChecked = BuscarActivity.this.chkNokia.isChecked();
        boolean huawaiChecked = BuscarActivity.this.chkHuawei.isChecked();
        boolean blackBerryChecked = BuscarActivity.this.chkBberry.isChecked();
        boolean bqChecked = BuscarActivity.this.chkBq.isChecked();
        if (todasMarcasChecked) {Marcas = Marcas + "Samsung-Apple-Nokia-Huawai-BlackBerry-Bq-";}
        else {
            if (samsungChecked) {Marcas = Marcas + "Samsung-";}
            if (appleChecked) {Marcas = Marcas + "Apple-";}
            if (nokiaChecked) {Marcas = Marcas + "Nokia-";}
            if (huawaiChecked) {Marcas = Marcas + "Huawai-";}
            if (blackBerryChecked) {Marcas = Marcas + "BlackBerry-";}
            if (bqChecked) {Marcas = Marcas + "Bq-";}
        }
        return Marcas;
    }

    private String generateCamaraTraseraString() {
        String CamaraT = "";
        boolean CTMaxChecked = BuscarActivity.this.chkCTMax.isChecked();
        boolean CTMedChecked = BuscarActivity.this.chkCTMed.isChecked();
        boolean CTMinChecked = BuscarActivity.this.chkCTMin.isChecked();
        if (CTMinChecked) {CamaraT = CamaraT + "1-2-3-4-5-6-7-8-9-";}
        if (CTMedChecked) {CamaraT = CamaraT + "10-11-12-13-14-15-16-17-18-19-20-";}
        if (CTMaxChecked) {CamaraT = CamaraT + "21-22-23-24-25-26-27-28-29-30-31-32-33-34-35-36-37-38-39-40-41-";}
        return CamaraT;
    }

    private String generateCamaraFrontalString() {
        String CamaraF = "";
        boolean CTMaxChecked = BuscarActivity.this.chkCTMax.isChecked();
        boolean CTMedChecked = BuscarActivity.this.chkCTMed.isChecked();
        boolean CTMinChecked = BuscarActivity.this.chkCTMin.isChecked();
        if (CTMinChecked) {CamaraF = CamaraF + "1-2-3-4-";}
        if (CTMedChecked) {CamaraF = CamaraF + "5-6-7-8-9-10-";}
        if (CTMaxChecked) {CamaraF = CamaraF + "11-12-13-14-15-16-17-18-19-20-";}
        return CamaraF;
    }
}