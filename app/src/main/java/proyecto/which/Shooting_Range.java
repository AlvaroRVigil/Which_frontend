package proyecto.which;


import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Shooting_Range extends AppCompatActivity {

    EditText etDato;
    Button btnGuardar, btnMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context = this;
        final SharedPreferences sharprefs = getSharedPreferences("ArchivoSP", context.MODE_PRIVATE);


        etDato = (EditText)findViewById(R.id.etDato);
        btnMostrar = (Button)findViewById(R.id.btnMostrar);
        btnGuardar = (Button)findViewById(R.id.btnGuardar);

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharpref = getPreferences(context.MODE_PRIVATE);
                String valor = sharpref.getString("MiDato","No hay dato");
                Toast.makeText(getApplicationContext(), "Dato guardado : "+valor,Toast.LENGTH_LONG).show();

            }
        });

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sharpref = getPreferences(context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharpref.edit();
                editor.putString("MiDato", etDato.getText().toString());
                editor.commit();

            }
        });


        /*
        Context context = this;
        SharedPreferences sharpref = context.getSharedPreferences("ArchivoSP",context.MODE_PRIVATE);


        etDato = (EditText)findViewById(R.id.etDato);
        btnGuardar = (Button)findViewById(R.id.btnGuardar);
        btnMostrar = (Button)findViewById(R.id.btnMostrar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("DatoGuardado", etDato.getText().toString());

                editor.commit();

            }
        });

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                String Valor = sharedPref.getString("DatoGuardado", "sin dato");
                Toast.makeText(getApplicationContext(), "Valor guardado : "+Valor, Toast.LENGTH_LONG).show();
            }
        });*/


    }
}