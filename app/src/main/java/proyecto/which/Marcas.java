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

public class Marcas extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ImageButton samsung;
    ImageButton apple;
    ImageButton nokia;
    ImageButton bq;
    ImageButton huawai;
    ImageButton blackberry;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcas);



        samsung =(ImageButton)findViewById(R.id.Samsung);

        samsung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent samsung = new Intent(Marcas.this, ListaMarca.class);
                samsung.putExtra("marca", "samsung");
                startActivity(samsung);

            }


        });




        apple =(ImageButton)findViewById(R.id.Apple);

        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent apple = new Intent(Marcas.this, ListaMarca.class);
                apple.putExtra("marca", "apple");
                startActivity(apple);

            }


        });




        nokia =(ImageButton)findViewById(R.id.Nokia);

        nokia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent nokia = new Intent(Marcas.this, ListaMarca.class);
                nokia.putExtra("marca", "nokia");
                startActivity(nokia);

            }


        });




        bq =(ImageButton)findViewById(R.id.BQ);

        bq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent bq = new Intent(Marcas.this, ListaMarca.class);
                bq.putExtra("marca", "bq");
                startActivity(bq);

            }


        });




        huawai =(ImageButton)findViewById(R.id.Huawai);

        huawai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent huawai = new Intent(Marcas.this, ListaMarca.class);
                huawai.putExtra("marca", "huawai");
                startActivity(huawai);

            }


        });




        blackberry =(ImageButton)findViewById(R.id.Blackberry);

        blackberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent blackberry = new Intent(Marcas.this, ListaMarca.class);
                blackberry.putExtra("marca", "blackberry");
                startActivity(blackberry);

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
            // Handle the camera action
        } else if (id == R.id.nav_devi) {

        } else if (id == R.id.nav_news) {

        } else if (id == R.id.nav_set) {


        }  else if (id == R.id.nav_search) {

        } else if (id == R.id.nav_contact) {}

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}

