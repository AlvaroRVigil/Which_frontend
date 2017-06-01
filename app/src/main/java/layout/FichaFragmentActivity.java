package layout;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import proyecto.which.R;
import proyecto.which.managers.SmartphoneCallback;
import proyecto.which.managers.SmartphoneManager;
import proyecto.which.model.Smartphone;

public class FichaFragmentActivity extends Fragment implements SmartphoneCallback {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The player content this fragment is presenting.
     */
    private Smartphone mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public FichaFragmentActivity() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            String id = getArguments().getString(ARG_ITEM_ID);
            mItem = SmartphoneManager.getInstance().getSmartphone(id);
            assert mItem != null;
            final Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.getModelo());
            }
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_ficha, container, false);

        Date date = mItem.getFechaLancamiento();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int anyo = cal.get(Calendar.YEAR);
        int mes = cal.get(Calendar.MONTH);
        int dia = cal.get(Calendar.DAY_OF_MONTH);

        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.Nombre_ficha)).setText(
                    mItem.getMarca().toString() + " " + mItem.getModelo());
            //((TextView) rootView.findViewById(R.id.Dia_ficha)).setText(dia);
            //((TextView) rootView.findViewById(R.id.Mes_ficha)).setText(mes);
            //((TextView) rootView.findViewById(R.id.Anyo_ficha)).setText(anyo);
            ((TextView) rootView.findViewById(R.id.smart_ficha)).setText(
                    mItem.getPuntuacion().toString());
            ((TextView) rootView.findViewById(R.id.descripcion_ficha)).setText(
                    mItem.getDescripcion().toString());
            ((TextView) rootView.findViewById(R.id.camaratrasera_ficha)).setText(
                    mItem.getCamara().toString());
            ((TextView) rootView.findViewById(R.id.camaradelantera_ficha)).setText(
                    mItem.getFrontCamara().toString());
            ((TextView) rootView.findViewById(R.id.ram_ficha)).setText(
                    mItem.getRam().toString());
            ((TextView) rootView.findViewById(R.id.rom_ficha)).setText(
                    mItem.getRom().toString());
            ((TextView) rootView.findViewById(R.id.pantallapulgadas_ficha)).setText(
                    mItem.getPulgadasPantalla().toString());
            ((TextView) rootView.findViewById(R.id.liquido_ficha)).setText(
                    mItem.getProteccionLiquido().toString());
            ((TextView) rootView.findViewById(R.id.polvo_ficha)).setText(
                    mItem.getProteccionPolvo().toString());
            //((TextView) rootView.findViewById(R.id.ancho_ficha)).setText(
              //      mItem.getResolucionPantallaAncho().toString());
            //((TextView) rootView.findViewById(R.id.alto_ficha)).setText(
             //       mItem.getResolucionPantallaAlto().toString());
            ((TextView) rootView.findViewById(R.id.bateria_ficha)).setText(
                    mItem.getBateria().toString());
            /*((ImageView) rootView.findViewById(R.id.Imagen_ficha)).setImageBitmap(
                    mItem.getImagen().toString()); */
        }

        return rootView;
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
}
