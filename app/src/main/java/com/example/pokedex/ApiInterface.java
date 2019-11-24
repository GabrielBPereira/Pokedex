package com.example.pokedex;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {
    @GET("api/v2/pokemon/{id}")
    Call<Pokemon> getPokemon(@Path("id") int id);
}
