package proyecto.which.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
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

public class MarcasActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ImageButton samsung;
    ImageButton apple;
    ImageButton nokia;
    ImageButton bq;
    ImageButton huawai;
    ImageButton blackberry;
    ImageButton back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcas);

        back =(ImageButton)findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent Intentback = new Intent(MarcasActivity.this, MainActivity.class);
                startActivity(Intentback);

            }


        });

        samsung =(ImageButton)findViewById(R.id.Samsung);
        samsung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent samsung = new Intent(MarcasActivity.this, ListaMarcaActivity.class);
                samsung.putExtra("marca", "Samsung");
                startActivity(samsung);
            }
        });

        apple =(ImageButton)findViewById(R.id.Apple);
        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent apple = new Intent(MarcasActivity.this, ListaMarcaActivity.class);
                apple.putExtra("marca", "Apple");
                startActivity(apple);
            }


        });

        nokia =(ImageButton)findViewById(R.id.Nokia);
        nokia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent nokia = new Intent(MarcasActivity.this, ListaMarcaActivity.class);
                nokia.putExtra("marca", "Nokia");
                startActivity(nokia);
            }


        });

        bq =(ImageButton)findViewById(R.id.BQ);
        bq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent bq = new Intent(MarcasActivity.this, ListaMarcaActivity.class);
                bq.putExtra("marca", "Bq");
                startActivity(bq);
            }


        });

        huawai =(ImageButton)findViewById(R.id.Huawai);
        huawai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent huawai = new Intent(MarcasActivity.this, ListaMarcaActivity.class);
                huawai.putExtra("marca", "Huawai");
                startActivity(huawai);
            }


        });

        blackberry =(ImageButton)findViewById(R.id.Blackberry);
        blackberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent blackberry = new Intent(MarcasActivity.this, ListaMarcaActivity.class);
                blackberry.putExtra("marca", "BlackBerry");
                startActivity(blackberry);
            }


        });






      FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fabBuscar);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent devi = new Intent(MarcasActivity.this, BuscarActivity.class);
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

            Intent devi = new Intent(MarcasActivity.this, MainActivity.class);
            startActivity(devi);

        } else if (id == R.id.nav_home1) {

            Intent devi = new Intent(MarcasActivity.this, MainActivity.class);
            startActivity(devi);

        }else if (id == R.id.nav_top) {

            Intent devi = new Intent(MarcasActivity.this, ListaMejorActivity.class);
            startActivity(devi);

        }

        else if (id == R.id.nav_top1) {

            Intent set = new Intent(MarcasActivity.this, ListaMejorActivity.class);
            startActivity(set);

        }  else if (id == R.id.nav_buscar) {

            Intent search = new Intent(MarcasActivity.this, BuscarActivity.class);
            startActivity(search);

        }
        else if (id == R.id.nav_buscar1) {

            Intent search = new Intent(MarcasActivity.this, BuscarActivity.class);
            startActivity(search);
        }
        else if (id == R.id.nav_comparar) {

            Intent search = new Intent(MarcasActivity.this, SplashActivity.class);
            startActivity(search);

        }
        else if (id == R.id.nav_comparar1) {

            Intent search = new Intent(MarcasActivity.this, SplashActivity.class);
            startActivity(search);

        }
        else if (id == R.id.nav_noticias) {

            Intent search = new Intent(MarcasActivity.this, NoticiasActivity.class);
            startActivity(search);

        }
        else if (id == R.id.nav_noticias1) {

            Intent search = new Intent(MarcasActivity.this, NoticiasActivity.class);
            startActivity(search);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}

