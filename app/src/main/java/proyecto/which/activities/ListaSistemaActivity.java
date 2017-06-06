package proyecto.which.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

import proyecto.which.R;
import proyecto.which.managers.SmartphoneCallback;
import proyecto.which.managers.SmartphoneManager;
import proyecto.which.model.Smartphone;


public class ListaSistemaActivity extends AppCompatActivity implements SmartphoneCallback{

    private RecyclerView recyclerView;
    private List<Smartphone> smartphones;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sistema);

        back =(ImageButton)findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent Intentback = new Intent(ListaSistemaActivity.this, SistemasActivity.class);
                startActivity(Intentback);

            }


        });

        
        // Si hay actionbar (barra superior) mostramos el boton atras (la flecha en la izquierda)
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        recyclerView = (RecyclerView) findViewById(R.id.smartphone_list_sistema);
        assert recyclerView != null;
    }



    //    @Override
//    protected void onPostResume() {
//        super.onPostResume();
//        AtletaManager.getInstance().getAllAtletas(AtletaListActivity.this);
//    }

    @Override
    protected void onResume() {
        // Sirve para recoger los extra que recibimos de SistemasActivity.java a la hora de hacer clic
        // en un boton o en otro dependiendo del sistema donde se ha hecho click.
        Bundle bundle = getIntent().getExtras();
        super.onResume();
        SmartphoneManager.getInstance().getSmartphoneBySo(ListaSistemaActivity.this, bundle.getString("so"));
    }

    private void setupRecyclerView(@NonNull RecyclerView recyclerView) {
        Log.i("setupRecyclerView", "                     " + smartphones);
        recyclerView.setAdapter(new ListaSistemaActivity.SimpleItemRecyclerViewAdapter(smartphones));
    }

    @Override
    public void onSuccess(List<Smartphone> smartphoneListSistema) {
        smartphones = smartphoneListSistema;
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
        Intent i = new Intent(ListaSistemaActivity.this, LoginActivity.class);
        startActivity(i);
        finish();
    }

    public class SimpleItemRecyclerViewAdapter
            extends RecyclerView.Adapter<ListaSistemaActivity.SimpleItemRecyclerViewAdapter.ViewHolder> {

        private final List<Smartphone> valoresListaSmartphone;

        public SimpleItemRecyclerViewAdapter(List<Smartphone> items) {
            valoresListaSmartphone = items;
        }

        @Override
        public ListaSistemaActivity.SimpleItemRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.content_perfil_sistema, parent, false);
            return new ListaSistemaActivity.SimpleItemRecyclerViewAdapter.ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ListaSistemaActivity.SimpleItemRecyclerViewAdapter.ViewHolder holder, final int position) {
            // mostramos la lista de smartphones con los siguientes parametros
            // cogemos la posicion del array que recibimos
            holder.itemSmarthpone = valoresListaSmartphone.get(position);
            // Marca y modelo del smartphone
            holder.nombrePerfilSmartphone.setText(valoresListaSmartphone.get(position).getMarca().toString()
                    + " " + valoresListaSmartphone.get(position).getModelo().toString());
            holder.bateriaPerfilSmartphone.setText(""+valoresListaSmartphone.get(position).getBateria());
            holder.camaraPerfilSmartphone.setText(""+valoresListaSmartphone.get(position).getCamara());
            holder.smartPerfilSmartphone.setText(""+valoresListaSmartphone.get(position).getPuntuacion());
            holder.pulgadasPerfilSmartphone.setText(""+valoresListaSmartphone.get(position).getPulgadasPantalla().toString());

           /* holder.mView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = v.getContext();
                    Intent intent = new Intent(context, AtletaDetailActivity.class);
                    // A la nueva activity le envía la id del atleta seleccionado
                    intent.putExtra(AtletaDetailFragment.ARG_ITEM_ID, holder.itemSmarthpone.getId().toString());
                    context.startActivity(intent);
                }
            }); */
        }

        @Override
        public int getItemCount() {
            return valoresListaSmartphone.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            public final View mView;
            public final TextView nombrePerfilSmartphone;
            public final TextView bateriaPerfilSmartphone;
            public final TextView smartPerfilSmartphone;
            public final TextView camaraPerfilSmartphone;
            public final TextView pulgadasPerfilSmartphone;
            public final TextView diaPerfilSmartphone;
            public Smartphone itemSmarthpone;

            public ViewHolder(View view) {
                super(view);
                mView = view;
                nombrePerfilSmartphone = (TextView) view.findViewById(R.id.Nombre_perfil_sistema);
                bateriaPerfilSmartphone = (TextView) view.findViewById(R.id.bateria_perfil_sistema);
                smartPerfilSmartphone = (TextView) view.findViewById(R.id.smart_perfil_sistema);
                camaraPerfilSmartphone = (TextView) view.findViewById(R.id.camaratrasera_perfil_sistema);
                pulgadasPerfilSmartphone = (TextView) view.findViewById(R.id.pantalla_perfil_sistema);
                diaPerfilSmartphone = (TextView) view.findViewById(R.id.Dia_perfil_sistema);
            }

            @Override
            public String toString() {
                return super.toString() + " '" + bateriaPerfilSmartphone.getText() + "'";
            }
        }
    }
}
