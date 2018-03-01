import java.util.*;

class PokemonFarm{
	private ArrayList<Pokemon> pokemons;

	public PokemonFarm(){
		pokemons = new ArrayList<Pokemon>();
	}

	public void addPokemon(Pokemon pokemon){
		pokemons.add(pokemon);
		System.out.println("Added Complete");
	}

	public void list(){
		for(Pokemon pokemon: pokemons){
			pokemon.print();
		}
	}

	public void feed(String pokemonName){
		if(pokemonName.equals("all")){
			for(Pokemon pokemon: pokemons){
				pokemon.eat();
			}
		}

		else for(Pokemon pokemon : pokemons){
			if(pokemonName.equals(pokemon.getName()))
				pokemon.eat();

		}
	}

	public void walk(String pokemonName, int step){
		if(pokemonName.equals("all"))
			for(Pokemon pokemon: pokemons)
				for(int i = 0 ; i<step ; i++)
					pokemon.walk();

		else for(Pokemon pokemon : pokemons)
			if(pokemonName.equals(pokemon.getName()))
				for(int i = 0 ; i<step ; i++)
					pokemon.walk();
	}

	public void push(ArrayList<Pokemon> fromBag){
		for(Pokemon pokemon: fromBag){
			addPokemon(pokemon);
		System.out.println("Add Pokemon to Fram");
		}
	}
	
	public void remove(String pokemonName){
		for(Pokemon pokemon : pokemons)
			if(pokemonName.equals(pokemon.getName())){
				pokemons.remove(pokemon);
				break;
			}
		System.out.println("Remove Complete");
	}
}
