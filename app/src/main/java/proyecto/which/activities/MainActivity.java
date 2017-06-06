package proyecto.which.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.List;

import proyecto.which.R;
import proyecto.which.SplashActivity;
import proyecto.which.managers.SmartphoneCallback;
import proyecto.which.model.Smartphone;

public class MainActivity extends AppCompatActivity
        implements SmartphoneCallback, NavigationView.OnNavigationItemSelectedListener {

    private RecyclerView recyclerView;
    private List<Smartphone> smartphones;

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

        //SmartphoneManager.getInstance().getSmartphoneByTop(MainActivity.this);

        recyclerView = (RecyclerView) findViewById(R.id.smartphone_list_top);
        assert recyclerView != null;

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
    protected void onResume() {
        super.onResume();
        //SmartphoneManager.getInstance().getSmartphoneByTop(MainActivity.this);
    }

    private void setupRecyclerView(@NonNull RecyclerView recyclerView) {
        Log.i("setupRecyclerView", "                     " + smartphones);
        recyclerView.setAdapter(new MainActivity.SimpleItemRecyclerViewAdapter(smartphones));
    }

    @Override
    public void onSuccess(List<Smartphone> smartphoneListTop) {
        smartphones = smartphoneListTop;
        setupRecyclerView(recyclerView);
    }

    @Override
    public void onSucces() {

    }

    @Override
    public void onSuccess(Smartphone smartphone) {

    }

    @Override
    public void onFailure(Throwable t) {
        Intent i = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(i);
        finish();
    }

    public class SimpleItemRecyclerViewAdapter
            extends RecyclerView.Adapter<MainActivity.SimpleItemRecyclerViewAdapter.ViewHolder> {

        private final List<Smartphone> valoresListaSmartphone;

        public SimpleItemRecyclerViewAdapter(List<Smartphone> items) {
            valoresListaSmartphone = items;
        }

        @Override
        public MainActivity.SimpleItemRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.content_perfil_top, parent, false);
            return new MainActivity.SimpleItemRecyclerViewAdapter.ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final MainActivity.SimpleItemRecyclerViewAdapter.ViewHolder holder, final int position) {
            // mostramos la lista de smartphones con los siguientes parametros
            // cogemos la posicion del array que recibimos
            holder.itemSmarthpone = valoresListaSmartphone.get(position);
            // marca y modelo del smartphone
            holder.nombrePerfilSmartphone.setText(valoresListaSmartphone.get(position).getMarca().toString()
                    + " " + valoresListaSmartphone.get(position).getModelo().toString());
            // puntuacion del smartphone
            holder.puntuacionPerfilSmartphone.setText(valoresListaSmartphone.get(position).getPuntuacion());
            holder.porcentaje.setProgress(valoresListaSmartphone.get(position).getPuntuacion());
           /* holder.mView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = v.getContext();
                    Intent intent = new Intent(context, AtletaDetailActivity.class);
                    // A la nueva activity le envía la id del atleta seleccionado
                    intent.putExtra(AtletaDetailFragment.ARG_ITEM_ID, holder.itemSmarthpone.getId().toString());
                    context.startActivity(intent);
                }
            });
*/
        }

        @Override
        public int getItemCount() {
            return valoresListaSmartphone.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            public final View mView;
            public final TextView nombrePerfilSmartphone;
            public final TextView puntuacionPerfilSmartphone;
            public Smartphone itemSmarthpone;
            public ProgressBar porcentaje;

            public ViewHolder(View view) {
                super(view);
                mView = view;
                nombrePerfilSmartphone = (TextView) view.findViewById(R.id.Nombre_perfil_top);
                puntuacionPerfilSmartphone = (TextView) view.findViewById(R.id.percent_perfil_top);
                porcentaje = (ProgressBar) view.findViewById(R.id.progressBarTop);
            }

            @Override
            public String toString() {
                return super.toString() + " '" + puntuacionPerfilSmartphone.getText() + "'";
            }
        }
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

            Intent sett = new Intent(MainActivity.this, ContactActivity.class);
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
