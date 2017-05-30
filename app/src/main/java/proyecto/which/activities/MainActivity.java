package proyecto.which.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import proyecto.which.Shooting_Range;
import proyecto.which.SplashActivity;
import proyecto.which.MisDispositivos;
import proyecto.which.R;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ImageButton ExplorarMarcas;
    ImageButton Buscar;
    ImageButton MisDispositivos;
    ImageButton ExplorarSistemas;
    ImageButton Best;
    ImageButton Prueba;
    ImageButton ic_inicio;
    ImageButton ic_top;
    ImageButton ic_buscar;
    ImageButton ic_comparar;
    ImageButton ic_noticias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        /*---------------------------------------------------------BARRA--------------------------------------------------

        ic_inicio =(ImageButton)findViewById(R.id.ic_inicio);

        ic_inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent ic_inicio = new Intent(MainActivity.this, BuscarActivity.class);
                startActivity(ic_inicio);
            }
        });

                
        ic_top =(ImageButton)findViewById(R.id.ic_top);

        ic_top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent ic_top = new Intent(MainActivity.this, BuscarActivity.class);
                startActivity(ic_top);
            }
        });

        ic_buscar =(ImageButton)findViewById(R.id.ic_buscar);

        ic_buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent ic_buscar = new Intent(MainActivity.this, BuscarActivity.class);
                startActivity(ic_buscar);
            }
        });

        ic_comparar =(ImageButton)findViewById(R.id.ic_comparar);

        ic_comparar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent ic_comparar = new Intent(MainActivity.this, BuscarActivity.class);
                startActivity(ic_comparar);
            }
        });

        ic_noticias =(ImageButton)findViewById(R.id.ic_noticias);

        ic_noticias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent ic_noticias = new Intent(MainActivity.this, BuscarActivity.class);
                startActivity(ic_noticias);
            }
        });
                        
                        
                        
                
                
        
        */
        //---------------------------------------------------------BARRA-END----------------------------------------------








        Best =(ImageButton)findViewById(R.id.todo);

        Best.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent IntentBest = new Intent(MainActivity.this, ListaMejorActivity.class);
                startActivity(IntentBest);

            }


        });
        
        
        
        

        Buscar =(ImageButton)findViewById(R.id.buscar);

        Buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent IntentBuscar = new Intent(MainActivity.this, BuscarActivity.class);
                startActivity(IntentBuscar);

            }


        });
         /* MisDispositivos =(ImageButton)findViewById(R.id.misDispositivos);

        MisDispositivos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent IntentBuscar = new Intent(MainActivity.this, MisDispositivos.class);
                startActivity(IntentBuscar);

            }


        }); */

        ExplorarMarcas =(ImageButton)findViewById(R.id.marcas);

        ExplorarMarcas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent ExplorarMarcas = new Intent(MainActivity.this, MarcasActivity.class);
                startActivity(ExplorarMarcas);

            }


        });

        ExplorarSistemas =(ImageButton)findViewById(R.id.sistemas);

        ExplorarSistemas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent ExplorarSistemas = new Intent(MainActivity.this, SistemasActivity.class);
                startActivity(ExplorarSistemas);

            }


        });









        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

      /*  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        }); */

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

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

            Intent sett = new Intent(MainActivity.this, Shooting_Range.class);
            startActivity(sett);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {



        } else if (id == R.id.nav_home1) {



        }else if (id == R.id.nav_top) {

            Intent devi = new Intent(MainActivity.this, ListaMejorActivity.class);
            startActivity(devi);

        }

        else if (id == R.id.nav_top1) {

            Intent set = new Intent(MainActivity.this, ListaMejorActivity.class);
            startActivity(set);

        }  else if (id == R.id.nav_buscar) {

            Intent search = new Intent(MainActivity.this, BuscarActivity.class);
            startActivity(search);

        }
        else if (id == R.id.nav_buscar1) {

            Intent search = new Intent(MainActivity.this, BuscarActivity.class);
            startActivity(search);
        }
        else if (id == R.id.nav_comparar) {

            Intent search = new Intent(MainActivity.this, SplashActivity.class);
            startActivity(search);

        }
        else if (id == R.id.nav_comparar1) {

            Intent search = new Intent(MainActivity.this, SplashActivity.class);
            startActivity(search);

        }
        else if (id == R.id.nav_noticias) {

            Intent search = new Intent(MainActivity.this, NoticiasActivity.class);
            startActivity(search);

        }
        else if (id == R.id.nav_noticias1) {

            Intent search = new Intent(MainActivity.this, NoticiasActivity.class);
            startActivity(search);

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
