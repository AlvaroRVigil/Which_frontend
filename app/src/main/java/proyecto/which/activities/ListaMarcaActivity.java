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

import java.util.List;

import proyecto.which.R;
import proyecto.which.managers.SmartphoneCallback;
import proyecto.which.managers.SmartphoneManager;
import proyecto.which.model.Smartphone;

public class ListaMarcaActivity extends AppCompatActivity implements SmartphoneCallback {

    private RecyclerView recyclerView;
    private List<Smartphone> smartphones;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_marca);

        back =(ImageButton)findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent Intentback = new Intent(ListaMarcaActivity.this, MarcasActivity.class);
                startActivity(Intentback);

            }


        });





        recyclerView = (RecyclerView) findViewById(R.id.smartphone_list_marca);
        assert recyclerView != null;
    }



//    @Override
//    protected void onPostResume() {
//        super.onPostResume();
//        AtletaManager.getInstance().getAllAtletas(AtletaListActivity.this);
//    }

    @Override
    protected void onResume() {
        // Sirve para recoger los extra que recibimos de MarcasActivity.java a la hora de hacer clic
        // en un boton o en otro dependiendo de la marca donde se ha hecho click.
        Bundle bundle = getIntent().getExtras();
        super.onResume();
        SmartphoneManager.getInstance().getSmartphoneByMarca(ListaMarcaActivity.this, bundle.getString("marca"));
    }

    private void setupRecyclerView(@NonNull RecyclerView recyclerView) {
        Log.i("setupRecyclerView", "                     " + smartphones);
        recyclerView.setAdapter(new SimpleItemRecyclerViewAdapter(smartphones));
    }

    @Override
    public void onSuccess(List<Smartphone> smartphoneListMarca) {
        smartphones = smartphoneListMarca;
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
        Intent i = new Intent(ListaMarcaActivity.this, LoginActivity.class);
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
                    .inflate(R.layout.content_perfil_marca, parent, false);
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
            public Smartphone itemSmarthpone;

            public ViewHolder(View view) {
                super(view);
                mView = view;
                nombrePerfilSmartphone = (TextView) view.findViewById(R.id.Nombre_perfil_marca);
                bateriaPerfilSmartphone = (TextView) view.findViewById(R.id.bateria_perfil_marca);
            }

            @Override
            public String toString() {
                return super.toString() + " '" + bateriaPerfilSmartphone.getText() + "'";
            }
        }
    }
}