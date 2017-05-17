package proyecto.which.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;

import proyecto.which.R;

public class BuscarActivity extends AppCompatActivity {

    CheckBox BoxSamsung, BoxApple, BoxNokia, BoxHuawei, BoxBlackBerry, BoxOtros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        BoxSamsung = (CheckBox) findViewById(R.id.boxSamsung);
        BoxApple = (CheckBox) findViewById(R.id.boxApple);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fabBuscar);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
