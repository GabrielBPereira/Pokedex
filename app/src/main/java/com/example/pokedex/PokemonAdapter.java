package com.example.pokedex;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.PokeViewHolder> {
    private List<Pokemon> pokemonList;


    public class PokeViewHolder extends RecyclerView.ViewHolder {
        public TextView name, type;
        public ImageView ivPokemon;
        public PokeViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.tv_name);
            type = (TextView) itemView.findViewById(R.id.tv_type);
            ivPokemon = (ImageView) itemView.findViewById(R.id.iv_pokemon);
        }
    }

    public PokemonAdapter(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    @Override
    public PokeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.pokemon_row, parent, false);

        return new PokeViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PokeViewHolder holder, int position) {
        Pokemon pokemon = pokemonList.get(position);
        holder.name.setText(pokemon.getName());
        holder.type.setText(pokemon.pokeTypesToString());
        Picasso.with(holder.ivPokemon.getContext())
                .load(pokemon.getSprite().getResourceUri())
                .resize(64, 64)
                .into(holder.ivPokemon);
    }

    @Override
    public int getItemCount() {
        return pokemonList.size();
    }
}
