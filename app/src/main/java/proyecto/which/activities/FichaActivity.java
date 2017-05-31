package proyecto.which.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import proyecto.which.R;

public class FichaActivity extends AppCompatActivity {

    RelativeLayout infocamara, infomemoria, infopantalla, infootros;
    ImageButton mascamara, menoscamara, masmemoria, menosmemoria, maspantalla, menospantalla, masotros, menosotros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ficha);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        infocamara = (RelativeLayout) findViewById(R.id.infocamara);
        mascamara = (ImageButton) findViewById(R.id.mascamara);
        mascamara.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("mascamara button");
                mascamara.setVisibility(View.INVISIBLE);
                menoscamara.setVisibility(View.VISIBLE);
                infocamara.setVisibility(View.VISIBLE);
              //  infocamara.setMaxLines(Integer.MAX_VALUE);

            }
        });
        menoscamara = (ImageButton) findViewById(R.id.menoscamara);
        menoscamara.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("menoscamara button");
                menoscamara.setVisibility(View.INVISIBLE);
                mascamara.setVisibility(View.VISIBLE);
                infocamara.setVisibility(View.GONE);

            }
        });

        infomemoria = (RelativeLayout) findViewById(R.id.infomemoria);
        masmemoria = (ImageButton) findViewById(R.id.masmemoria);
        masmemoria.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("masmemoria button");
                masmemoria.setVisibility(View.INVISIBLE);
                menosmemoria.setVisibility(View.VISIBLE);
                infomemoria.setVisibility(View.VISIBLE);
                //  infomemoria.setMaxLines(Integer.MAX_VALUE);

            }
        });
        menosmemoria = (ImageButton) findViewById(R.id.menosmemoria);
        menosmemoria.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("menosmemoria button");
                menosmemoria.setVisibility(View.INVISIBLE);
                masmemoria.setVisibility(View.VISIBLE);
                infomemoria.setVisibility(View.GONE);

            }
        });

        infopantalla = (RelativeLayout) findViewById(R.id.infopantalla);
        maspantalla = (ImageButton) findViewById(R.id.maspantalla);
        maspantalla.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("maspantalla button");
                maspantalla.setVisibility(View.INVISIBLE);
                menospantalla.setVisibility(View.VISIBLE);
                infopantalla.setVisibility(View.VISIBLE);
                //  infopantalla.setMaxLines(Integer.MAX_VALUE);

            }
        });
        menospantalla = (ImageButton) findViewById(R.id.menospantalla);
        menospantalla.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("menospantalla button");
                menospantalla.setVisibility(View.INVISIBLE);
                maspantalla.setVisibility(View.VISIBLE);
                infopantalla.setVisibility(View.GONE);

            }
        });

        infootros = (RelativeLayout) findViewById(R.id.infootros);
        masotros = (ImageButton) findViewById(R.id.masotros);
        masotros.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("masotros button");
                masotros.setVisibility(View.INVISIBLE);
                menosotros.setVisibility(View.VISIBLE);
                infootros.setVisibility(View.VISIBLE);
                //  infootros.setMaxLines(Integer.MAX_VALUE);

            }
        });
        menosotros = (ImageButton) findViewById(R.id.menosotros);
        menosotros.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("menosotros button");
                menosotros.setVisibility(View.INVISIBLE);
                masotros.setVisibility(View.VISIBLE);
                infootros.setVisibility(View.GONE);

            }
        });

    }

}


