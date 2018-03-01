import java.io.*;
import java.util.*;

class Bag{
	public ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
	public ArrayList<Ball> balls = new ArrayList<Ball>();


	public Bag(){
	}

	public void add(Pokemon pokemon){
		System.out.print("New Name: ");
		Scanner scanner = new Scanner(System.in);
		String newName = scanner.next();
		pokemon.setName(newName);
		pokemons.add(pokemon);
		System.out.println("Added Complete");
	}

	public ArrayList<Pokemon> getPokemon(){
		return pokemons;
	}

}
