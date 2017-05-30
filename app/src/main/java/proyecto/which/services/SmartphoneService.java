package proyecto.which.services;

import java.util.List;
import java.util.Map;

import proyecto.which.model.Smartphone;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;


public interface SmartphoneService {

    @GET("/api/smartphones")
        Call<List<Smartphone>> getAllSmartphones(
            @Header("Authorization") String Authorization
    );

    @POST("api/smartphones")
    Call<Smartphone> createSmartphone(
            @Header("Authorization") String Authorization,
            @Body Smartphone smartphone);


    @PUT("api/smartphones")
    Call<Smartphone> updateSmartphone(
            @Header("Authorization") String Authorization,
            @Body Smartphone smartphone);

    @DELETE("api/smartphones/{id}")
    Call<Void> deleteSmartphone(
            @Header("Authorization") String Authorization,
            @Path("id") Long id);


    /* FILTROS */
    @GET("api/smartphones/byModelo/{modelo}")
    Call<List<Smartphone>> getSmartphoneByModelo(
            @Header("Authorization") String Authorization,
            @Path("modelo") String modelo);

    @GET("api/smartphones/byMarca/{marca}")
    Call<List<Smartphone>> getSmartphoneByMarca(
            @Header("Authorization") String Authorization,
            @Path("marca") String marca);

    @GET("api/smartphones/bySo/{so}")
    Call<List<Smartphone>> getSmartphoneBySo(
            @Header("Authorization") String Authorization,
            @Path("so") String so);

    @GET("api/smartphones/byFiltros")
    Call<List<Smartphone>> getSmartphoneByFiltros(
            @Header("Authorization") String Authorization,
            @QueryMap Map<String, String> filtros);

}