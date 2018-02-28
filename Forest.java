import java.util.*;

class Forest{
	Random random = new Random();
	Scaner scaner = new Scanner(System.in);
	private Pokemon wildPokemon;
	private Ball ball;
	private double mood
	public Forest(){
	}
	
	public void pokemonFound(){
		int pokemonRand = random.nextInt(3);

		if(pokemonRand == 0)
			wildPokemon = new Vulpix("Wild Vulpix"); 
		else if(pokemonRand == 1)
			wildPokemon = new Pikachu("Wild Pikachu");
		else if(pokemonRand == 2)
			wildPokemon = new Swinub("Wild Swinub");
		
		
		System.out.println("Found " + wildPokemon.getName() + "!!");
	}

	public void catchPokemon(){
		mood += 0.05;
		
	}
}
