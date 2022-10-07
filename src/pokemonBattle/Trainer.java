package pokemonBattle;

import java.util.ArrayList;

import pokemonBattle.pokemon.Pokemon;

public class Trainer {
	
	private String name;
	private int gold;
	private Pokemon[] pokemonArr= new Pokemon[6];
	
	public Pokemon[] getPokemonArr() {
		return pokemonArr;
	}

	public void setPokemonArr(Pokemon[] pokemonArr) {
		this.pokemonArr = pokemonArr;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public Trainer(String name, Pokemon pokemon) {
		this.name = name;
		this.gold = 100;
		this.pokemonArr[0] = pokemon;
	}

}
