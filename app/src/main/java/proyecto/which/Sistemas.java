package proyecto.which;

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

public class Sistemas extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ImageButton android;
    ImageButton ios;
    ImageButton windows;
    ImageButton blackberryos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistemas);



        android =(ImageButton)findViewById(R.id.Android);

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent android = new Intent(Sistemas.this, ListaMarca.class);
                android.putExtra("marca", "android");
                startActivity(android);

            }


        });




        ios =(ImageButton)findViewById(R.id.iOS);

        ios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent ios = new Intent(Sistemas.this, ListaMarca.class);
                ios.putExtra("marca", "ios");
                startActivity(ios);

            }


        });




        windows =(ImageButton)findViewById(R.id.Windows);

        windows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent windows = new Intent(Sistemas.this, Shooting_Range.class);
                windows.putExtra("marca", "windows");
                startActivity(windows);

            }


        });




        blackberryos =(ImageButton)findViewById(R.id.Blackberryos);

        blackberryos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent blackberryos = new Intent(Sistemas.this, ListaMarca.class);
                blackberryos.putExtra("marca", "blackberryos");
                startActivity(blackberryos);

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

            Intent siguiente = new Intent(Sistemas.this, MainActivity.class);
            startActivity(siguiente);

        } else if (id == R.id.nav_devi) {

            Intent siguiente = new Intent(Sistemas.this, MisDispositivos.class);
            startActivity(siguiente);

        } else if (id == R.id.nav_news) {

            Intent siguiente = new Intent(Sistemas.this, Check.class);
            startActivity(siguiente);

        } else if (id == R.id.nav_set) {

            Intent siguiente = new Intent(Sistemas.this, Check.class);
            startActivity(siguiente);

        }  else if (id == R.id.nav_search) {

            Intent siguiente = new Intent(Sistemas.this, Check.class);
            startActivity(siguiente);

        } else if (id == R.id.nav_contact) {

            Intent siguiente = new Intent(Sistemas.this, Check.class);
            startActivity(siguiente);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}

