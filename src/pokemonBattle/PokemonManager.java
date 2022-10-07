package pokemonBattle;

import java.util.ArrayList;

import pokemonBattle.pokemon.Bulbasaur;
import pokemonBattle.pokemon.Caterpie;
import pokemonBattle.pokemon.Charmander;
import pokemonBattle.pokemon.Nidoran;
import pokemonBattle.pokemon.Oddish;
import pokemonBattle.pokemon.Pidgey;
import pokemonBattle.pokemon.Pikachu;
import pokemonBattle.pokemon.Pokemon;
import pokemonBattle.pokemon.Rattata;
import pokemonBattle.pokemon.Squirtle;
import pokemonBattle.pokemon.Weedle;

public class PokemonManager {

	private Trainer trainer;
	
	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	
	public Pokemon randomPokemon() {
		
		Pokemon[] pokemonAll = {
				new Bulbasaur(),
				new Caterpie(),
				new Charmander(),
				new Nidoran(),
				new Oddish(),
				new Pidgey(),
				new Pikachu(),
				new Rattata(),
				new Squirtle(),
				new Weedle()
		};
		
		int rdm = (int)(Math.random()*(pokemonAll.length));
		
		return pokemonAll[rdm];
	}
}
