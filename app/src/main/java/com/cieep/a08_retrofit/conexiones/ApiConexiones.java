package com.cieep.a08_retrofit.conexiones;

import com.cieep.a08_retrofit.modelos.Album;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiConexiones {

    @GET("/albums")
    Call<ArrayList<Album>> getAlbums();

}
