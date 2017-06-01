package proyecto.which.managers;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import proyecto.which.model.Smartphone;
import proyecto.which.services.SmartphoneService;
import proyecto.which.util.CustomProperties;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SmartphoneManager {
    private static SmartphoneManager ourInstance;
    private List<Smartphone> smartphones;
    private Retrofit retrofit;
    private SmartphoneService smartphoneService;

    private SmartphoneManager() {
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd")
                .create();

        retrofit = new Retrofit.Builder()
                .baseUrl(CustomProperties.baseUrl)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        smartphoneService = retrofit.create(SmartphoneService.class);
    }

    public static SmartphoneManager getInstance() {
        if (ourInstance == null) {
            ourInstance = new SmartphoneManager();
        }

        return ourInstance;
    }

    /* GET ALL SMARTPHONES */

    public synchronized void getAllSmartphone(final SmartphoneCallback smartphoneCallback) {
        Call<List<Smartphone>> call = smartphoneService.getAllSmartphones(UserLoginManager.getInstance().getBearerToken());

        call.enqueue(new Callback<List<Smartphone>>() {
            @Override
            public void onResponse(Call<List<Smartphone>> call, Response<List<Smartphone>> response) {
                int code = response.code();

                if (code == 200 || code == 201) {
                    smartphones = response.body();
                    smartphoneCallback.onSuccess(smartphones);
                } else {
                    smartphoneCallback.onFailure(new Throwable("ERROR" + code + ", " + response.raw().message()));
                }
            }

            @Override
            public void onFailure(Call<List<Smartphone>> call, Throwable t) {
                Log.e("SmartphoneManager->", "getAllSmartphones()->ERROR: " + t);
                smartphoneCallback.onFailure(t);
            }
        });
    }

    /* GET A SMARTPHONE */

    public Smartphone getSmartphone(String id) {
        for (Smartphone smartphone : smartphones) {
            if (smartphone.getId().toString().equals(id)) {
                return smartphone;
            }
        }
        return null;
    }


    /* GET SMARTPHONES BY MODELO */

    public synchronized void getSmartphoneByModelo(final SmartphoneCallback smartphoneCallback, String modelo) {
        Call<List<Smartphone>> call = smartphoneService.getSmartphoneByModelo(UserLoginManager.getInstance().getBearerToken(), modelo);
        call.enqueue(new Callback<List<Smartphone>>() {
            @Override
            public void onResponse(Call<List<Smartphone>> call, Response<List<Smartphone>> response) {
                smartphones = response.body();

                int code = response.code();

                if (code == 200 || code == 201) {
                    smartphoneCallback.onSuccess(smartphones);
                } else {
                    smartphoneCallback.onFailure(new Throwable("ERROR" + code + ", " + response.raw().message()));
                }
            }

            @Override
            public void onFailure(Call<List<Smartphone>> call, Throwable t) {
                Log.e("SmartphoneManager->", "getSmartphoneByModelo: " + t);
                smartphoneCallback.onFailure(t);
            }
        });
    }

    /* GET SMARTPHONES BY MARCA */

    public synchronized void getSmartphoneByMarca(final SmartphoneCallback smartphoneCallback, String marca) {
        Call<List<Smartphone>> call = smartphoneService.getSmartphoneByMarca(UserLoginManager.getInstance().getBearerToken(), marca);
        call.enqueue(new Callback<List<Smartphone>>() {
            @Override
            public void onResponse(Call<List<Smartphone>> call, Response<List<Smartphone>> response) {
                smartphones = response.body();

                int code = response.code();

                if (code == 200 || code == 201) {
                    smartphoneCallback.onSuccess(smartphones);
                } else {
                    smartphoneCallback.onFailure(new Throwable("ERROR" + code + ", " + response.raw().message()));
                }
            }

            @Override
            public void onFailure(Call<List<Smartphone>> call, Throwable t) {
                Log.e("SmartphoneManager->", "getSmartphoneByMarca: " + t);
                smartphoneCallback.onFailure(t);
            }
        });
    }

    /* GET SMARTPHONES BY SO */

    public synchronized void getSmartphoneBySo(final SmartphoneCallback smartphoneCallback, String so) {
        Call<List<Smartphone>> call = smartphoneService.getSmartphoneBySo(UserLoginManager.getInstance().getBearerToken(), so);
        call.enqueue(new Callback<List<Smartphone>>() {
            @Override
            public void onResponse(Call<List<Smartphone>> call, Response<List<Smartphone>> response) {

            smartphones = response.body();

            int code = response.code();

                if (code == 200 || code == 201) {
                smartphoneCallback.onSuccess(smartphones);
            } else {
                smartphoneCallback.onFailure(new Throwable("ERROR" + code + ", " + response.raw().message()));
            }
        }
    public void onFailure(Call<List<Smartphone>> call, Throwable t) {
                Log.e("SmartphoneManager->", "getSmartphoneBySo: " + t);
                smartphoneCallback.onFailure(t);
            }
        });
    }

    /* GET SMARTPHONES BY FILTROS */

    public synchronized void getSmartphoneByFiltros(final SmartphoneCallback smartphoneCallback, HashMap filtros) {
        Call<List<Smartphone>> call = smartphoneService.getSmartphoneByFiltros(UserLoginManager.getInstance().getBearerToken(), filtros);
        call.enqueue(new Callback<List<Smartphone>>() {
            @Override
            public void onResponse(Call<List<Smartphone>> call, Response<List<Smartphone>> response) {

                smartphones = response.body();

                int code = response.code();

                if (code == 200 || code == 201) {
                    smartphoneCallback.onSuccess(smartphones);
                } else {
                    smartphoneCallback.onFailure(new Throwable("ERROR" + code + ", " + response.raw().message()));
                }
            }
            public void onFailure(Call<List<Smartphone>> call, Throwable t) {
                Log.e("SmartphoneManager->", "getSmartphoneByFiltros: " + t);
                smartphoneCallback.onFailure(t);
            }
        });
    }

    /* GET SMARTPHONES ORDER BY PUNTUACION */

    public synchronized void getSmartphoneByTop(final SmartphoneCallback smartphoneCallback) {
        Call<ArrayList<Smartphone>>call = smartphoneService.getSmartphoneByTop(UserLoginManager.getInstance().getBearerToken());
        call.enqueue(new Callback<ArrayList<Smartphone>>() {
            @Override
            public void onResponse(Call<ArrayList<Smartphone>> call, Response<ArrayList<Smartphone>> response) {

                smartphones = response.body();

                int code = response.code();

                if (code == 200 || code == 201) {
                    smartphoneCallback.onSuccess(smartphones);
                } else {
                    smartphoneCallback.onFailure(new Throwable("ERROR" + code + ", " + response.raw().message()));
                }
            }
            public void onFailure(Call<ArrayList<Smartphone>> call, Throwable t) {
                Log.e("SmartphoneManager->", "getSmartphoneByTop: " + t);
                smartphoneCallback.onFailure(t);
            }
        });
    }

    public synchronized void getAllSmartphoneByTop(final SmartphoneCallback smartphoneCallback) {
        Call<ArrayList<Smartphone>>call = smartphoneService.getAllSmartphoneByTop(UserLoginManager.getInstance().getBearerToken());
        call.enqueue(new Callback<ArrayList<Smartphone>>() {
            @Override
            public void onResponse(Call<ArrayList<Smartphone>> call, Response<ArrayList<Smartphone>> response) {

                smartphones = response.body();

                int code = response.code();

                if (code == 200 || code == 201) {
                    smartphoneCallback.onSuccess(smartphones);
                } else {
                    smartphoneCallback.onFailure(new Throwable("ERROR" + code + ", " + response.raw().message()));
                }
            }
            public void onFailure(Call<ArrayList<Smartphone>> call, Throwable t) {
                Log.e("SmartphoneManager->", "getAllSmartphoneByTop: " + t);
                smartphoneCallback.onFailure(t);
            }
        });
    }


}