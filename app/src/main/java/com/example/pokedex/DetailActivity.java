package com.example.pokedex;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailActivity extends AppCompatActivity {

    private TextView tvName, tvTypes, tvHeigth, tvWeigth;
    private ImageView ivPokemon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvName = (TextView) findViewById(R.id.tv_detail_name);
        tvTypes = (TextView) findViewById(R.id.tv_detail_types);
        tvHeigth = (TextView) findViewById(R.id.tv_detail_heigth);
        tvWeigth = (TextView) findViewById(R.id.tv_detail_weigth);
        ivPokemon = (ImageView) findViewById(R.id.iv_detail_pokemon);

        int id = getIntent().getIntExtra("ID", 0);
        requestData(id);
    }

    private void requestData(int id) {
        final ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<Pokemon> call = apiService.getPokemon(id);
        call.enqueue(new Callback<Pokemon>() {
            @Override
            public void onResponse(Call<Pokemon> call, Response<Pokemon> response) {
                Pokemon pokemon;

                if(response.isSuccessful()) {
                    pokemon = response.body();

                    tvName.setText(pokemon.getName());
                    tvTypes.setText(pokemon.pokeTypesToString());
                    tvHeigth.setText("Heigth: " + pokemon.getHeight());
                    tvWeigth.setText("Weigth: " + pokemon.getWeight());
                    // tvSpeed.setText("Speed: " + pokemon.getSpeed().toString());

                    Picasso.with(DetailActivity.this)
                            .load(pokemon.getSprite().getResourceUri())
                            .resize(128,128)
                            .into(ivPokemon);
                }
            }

            @Override
            public void onFailure(Call<Pokemon> call, Throwable t) {

            }
        });
    }

}
