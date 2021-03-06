package proyecto.which.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import proyecto.which.SplashActivity;
import proyecto.which.MisDispositivos;
import proyecto.which.R;

public class SistemasActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ImageButton android;
    ImageButton ios;
    ImageButton windows;
    ImageButton blackberryos;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistemas);

        back =(ImageButton)findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent Intentback = new Intent(SistemasActivity.this, MainActivity.class);
                startActivity(Intentback);

            }


        });

        android =(ImageButton)findViewById(R.id.Android);
        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent android = new Intent(SistemasActivity.this, ListaSistemaActivity.class);
                android.putExtra("so", "Android");
                startActivity(android);
            }


        });

        ios =(ImageButton)findViewById(R.id.iOS);
        ios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent ios = new Intent(SistemasActivity.this, ListaSistemaActivity.class);
                ios.putExtra("so", "iOS");
                startActivity(ios);
            }


        });

        windows =(ImageButton)findViewById(R.id.Windows);
        windows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent windows = new Intent(SistemasActivity.this, ListaSistemaActivity.class);
                windows.putExtra("so", "Windows");
                startActivity(windows);
            }


        });

        blackberryos =(ImageButton)findViewById(R.id.Blackberryos);
        blackberryos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent blackberryos = new Intent(SistemasActivity.this, ListaSistemaActivity.class);
                blackberryos.putExtra("so", "BlackBerryOS");
                startActivity(blackberryos);
            }


        });




FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fabBuscar);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent devi = new Intent(SistemasActivity.this, BuscarActivity.class);
                startActivity(devi);

            }
        });



        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {

            Intent devi = new Intent(SistemasActivity.this, MainActivity.class);
            startActivity(devi);

        } else if (id == R.id.nav_home1) {

            Intent devi = new Intent(SistemasActivity.this, MainActivity.class);
            startActivity(devi);

        }else if (id == R.id.nav_top) {

            Intent devi = new Intent(SistemasActivity.this, ListaMejorActivity.class);
            startActivity(devi);

        }

        else if (id == R.id.nav_top1) {

            Intent set = new Intent(SistemasActivity.this, ListaMejorActivity.class);
            startActivity(set);

        }  else if (id == R.id.nav_buscar) {

            Intent search = new Intent(SistemasActivity.this, BuscarActivity.class);
            startActivity(search);

        }
        else if (id == R.id.nav_buscar1) {

            Intent search = new Intent(SistemasActivity.this, BuscarActivity.class);
            startActivity(search);
        }
        else if (id == R.id.nav_comparar) {

            Intent search = new Intent(SistemasActivity.this, SplashActivity.class);
            startActivity(search);

        }
        else if (id == R.id.nav_comparar1) {

            Intent search = new Intent(SistemasActivity.this, SplashActivity.class);
            startActivity(search);

        }
        else if (id == R.id.nav_noticias) {

            Intent search = new Intent(SistemasActivity.this, NoticiasActivity.class);
            startActivity(search);

        }
        else if (id == R.id.nav_noticias1) {

            Intent search = new Intent(SistemasActivity.this, NoticiasActivity.class);
            startActivity(search);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}

