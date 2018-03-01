import java.util.*;

class Forest{
	Random random = new Random();
	private Bag bag;
	private Pokemon wildPokemon;
	private Ball ball;
	private double mood;
	private String name;

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
		
		mood = (random.nextInt(10)+1) /10.0;
		
		System.out.println("Found " + wildPokemon.getName() + "!!");
	}

	public void catchPokemon(Bag bag){
		
		mood += 0.05;
		ball = new Ball(random.nextInt(3));
		System.out.println(("Throw the ") + ball.getName());
		
		if(catchSuccess()){
			System.out.println("Gotcha! You got " + wildPokemon.getName());
			bag.add(wildPokemon);
		}
		    			    
		else
		    System.out.println("It break free!");
		
	}

	public boolean catchSuccess(){
		if((this.mood * (ball.getOppotunity())) > 0.5)
			return true;
		else
			return false;
	}

	public Pokemon gotPokemon(){
		return wildPokemon;
	}
}
