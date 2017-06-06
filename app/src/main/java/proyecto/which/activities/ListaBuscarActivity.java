package proyecto.which.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

import proyecto.which.R;
import proyecto.which.managers.SmartphoneCallback;
import proyecto.which.managers.SmartphoneManager;
import proyecto.which.model.Smartphone;

public class ListaBuscarActivity extends AppCompatActivity implements SmartphoneCallback {

    private RecyclerView recyclerView;
    private List<Smartphone> smartphones;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_buscar);

        back =(ImageButton)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent Intentback = new Intent(ListaBuscarActivity.this, BuscarActivity.class);
                startActivity(Intentback);
            }


        });


        recyclerView = (RecyclerView) findViewById(R.id.smartphone_list_buscar);
        assert recyclerView != null;
    }


    @Override
    protected void onResume() {
        Intent intent = getIntent();
        super.onResume();
        HashMap<String, String> datos = (HashMap<String, String>) intent.getSerializableExtra("mapSmartphones");

        SmartphoneManager.getInstance().getSmartphoneByFiltros(ListaBuscarActivity.this, datos);
    }

    private void setupRecyclerView(@NonNull RecyclerView recyclerView) {
        Log.i("setupRecyclerView", "                     " + smartphones);
        recyclerView.setAdapter(new SimpleItemRecyclerViewAdapter(smartphones));
    }

    @Override
    public void onSuccess(List<Smartphone> smartphoneListBuscar) {
        smartphones = smartphoneListBuscar;
        setupRecyclerView(recyclerView);
    }

    @Override
    public void onSucces() {}

    @Override
    public void onSuccess(Smartphone smartphone) {}

    @Override
    public void onFailure(Throwable t) {
        Intent i = new Intent(ListaBuscarActivity.this, LoginActivity.class);
        startActivity(i);
        finish();
    }

    public class SimpleItemRecyclerViewAdapter
            extends RecyclerView.Adapter<SimpleItemRecyclerViewAdapter.ViewHolder> {

        private final List<Smartphone> valoresListaSmartphone;

        public SimpleItemRecyclerViewAdapter(List<Smartphone> items) {
            valoresListaSmartphone = items;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.content_perfil_buscar, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {
            // mostramos la lista de smartphones con los siguientes parametros
            // cogemos la posicion del array que recibimos
            holder.itemSmarthpone = valoresListaSmartphone.get(position);
            // Marca y modelo del smartphone
            holder.nombrePerfilSmartphone.setText(valoresListaSmartphone.get(position).getMarca().toString()
            + " " + valoresListaSmartphone.get(position).getModelo().toString());
            // bateria del smartphone
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
            public Smartphone itemSmarthpone;

            public ViewHolder(View view) {
                super(view);
                mView = view;
                nombrePerfilSmartphone = (TextView) view.findViewById(R.id.Nombre_perfil_buscar);
                bateriaPerfilSmartphone = (TextView) view.findViewById(R.id.bateria_perfil_buscar);
                smartPerfilSmartphone = (TextView) view.findViewById(R.id.smart_perfil_buscar);
                camaraPerfilSmartphone = (TextView) view.findViewById(R.id.camara_perfil_buscar);
                pulgadasPerfilSmartphone = (TextView) view.findViewById(R.id.pantalla_perfil_buscar);
            }

            @Override
            public String toString() {
                return super.toString() + " '" + bateriaPerfilSmartphone.getText() + "'";
            }
        }
    }
}