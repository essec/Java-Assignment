import java.util.*;

class Forest{
	Random random = new Random();
	Scaner scaner = new Scanner(System.in);
	private Pokemon wildPokemon;
	private Ball ball;

	public Forest(){
	}
	
	public void pokemonFound(){
		int pokemonRand = random.nextInt(4);

		if(pokemonRand == 0)
			wildPokemon = new Vulpix("wildVulpix"); 
	}
}
