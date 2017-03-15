package proyecto.which;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Check extends AppCompatActivity {

    ImageView txtRotacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        txtRotacion = (ImageView) findViewById(R.id.txtRotacion);

    }

    public void anima(View view){
        Animation a1 =
                AnimationUtils.loadAnimation(this, R.anim.rotaciondejemplo);
        a1.setRepeatMode(Animation.RESTART);
        a1.setRepeatCount(100);
        txtRotacion.startAnimation(a1);
    }

}
