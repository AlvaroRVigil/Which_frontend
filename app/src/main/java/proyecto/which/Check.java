package proyecto.which;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

import proyecto.which.activities.MainActivity;

public class Check extends AppCompatActivity {

    ImageView txtRotacion;
    ImageButton logToMain;
    ImageView backgroundOut;
    ImageView log_which;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        logToMain =(ImageButton)findViewById(R.id.googleButton);

        logToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent ExplorarMarcas = new Intent(Check.this, MainActivity.class);
                startActivity(ExplorarMarcas);

            }


        });

        txtRotacion = (ImageView) findViewById(R.id.txtRotacion);
        backgroundOut = (ImageView) findViewById(R.id.background);
        log_which = (ImageView) findViewById(R.id.log_which);

        //animacion resaltar botón google

        Animation a1 =
                AnimationUtils.loadAnimation(this, R.anim.transparentarejemplo);
        a1.setRepeatMode(Animation.REVERSE);
        a1.setRepeatCount(-1);
        txtRotacion.startAnimation(a1);

        //animacion quitar el telón (background)

        Animation a2 =
                AnimationUtils.loadAnimation(this, R.anim.transicionbackground);
        a2.setRepeatCount(0);
        a2.setFillAfter(true);
        backgroundOut.startAnimation(a2);

        Animation a3 =
                AnimationUtils.loadAnimation(this, R.anim.fadein);
        a3.setRepeatCount(0);
        a3.setFillAfter(true);
        log_which.startAnimation(a3);

        /*Animation a4 =
                AnimationUtils.loadAnimation(this, R.anim.desplazarwhich);
        a4.setRepeatCount(0);
        a4.setFillAfter(true);
        log_which.startAnimation(a4);*/





    }

   /* public void anima(View view){
        Animation a1 =
                AnimationUtils.loadAnimation(this, R.anim.transparentarejemplo);
        a1.setRepeatMode(Animation.REVERSE);
        a1.setRepeatCount(100);
        txtRotacion.startAnimation(a1);
    }*/

}
