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

    RelativeLayout infocamara, infomemoria;
    ImageButton mascamara, menoscamara, masmemoria, menosmemoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ficha);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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

    }

}


