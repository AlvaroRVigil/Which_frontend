package proyecto.which.activities;//package proyecto.which.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

import java.util.List;

import proyecto.which.R;
import proyecto.which.managers.SmartphoneCallback;
import proyecto.which.model.Smartphone;

public class ListaMejorActivity extends AppCompatActivity implements SmartphoneCallback {

    private RecyclerView recyclerView;
    private List<Smartphone> smartphones;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_mejor);

        back =(ImageButton)findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent Intentback = new Intent(ListaMejorActivity.this, MainActivity.class);
                startActivity(Intentback);

            }


        });

/*



        recyclerView = (RecyclerView) findViewById(R.id.smartphone_list_mejor);
        assert recyclerView != null;
    }



//    @Override
//    protected void onPostResume() {
//        super.onPostResume();
//        AtletaManager.getInstance().getAllAtletas(AtletaListActivity.this);
//    }

    @Override
    protected void onResume() {
        // Sirve para recoger los extra que recibimos de BuscarsActivity.java a la hora de hacer clic
        // en un boton o en otro dependiendo de la mejor donde se ha hecho click.
        Bundle bundle = getIntent().getExtras();
        super.onResume();
        SmartphoneManager.getInstance().getSmartphoneByBuscar(ListaBuscarActivity.this, bundle.getString("mejor"));
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
    public void onSucces() {

    }

    @Override
    public void onSuccess(Smartphone smartphone) {

    }

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
                    .inflate(R.layout.content_perfil_mejor, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {
            // mostramos la lista de smartphones con los siguientes parametros
            // cogemos la posicion del array que recibimos
            holder.itemSmarthpone = valoresListaSmartphone.get(position);
            // Buscar y modelo del smartphone
            holder.nombrePerfilSmartphone.setText(valoresListaSmartphone.get(position).getBuscar().toString()
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
    public void onSuccess(List<Smartphone> smartphoneList) {

    }

    @Override
    public void onSucces() {

    }

    @Override
    public void onSuccess(Smartphone smartphone) {

    }

    @Override
    public void onFailure(Throwable t) {

    }
/*
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
                nombrePerfilSmartphone = (TextView) view.findViewById(R.id.Nombre_perfil_mejor);
                bateriaPerfilSmartphone = (TextView) view.findViewById(R.id.bateria_mejor);
            }

            @Override
            public String toString() {
                return super.toString() + " '" + bateriaPerfilSmartphone.getText() + "'";
            }
        }
    }*/
}