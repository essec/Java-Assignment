import java.util.*;
import java.io.*;

class CommandParser{
	private PokemonFarm pokemonFarm;
	private Scanner commandScanner;
	private boolean isRunning;
	private String pokemonName;
	private String pokemonType;
	private float pokemonWeight;
	private float pokemonStepLength;


	public CommandParser(PokemonFarm pokemonFarm){
		this.pokemonFarm = pokemonFarm;
		commandScanner = new Scanner(System.in);
		isRunning = false;
	}

	public void run(){
		isRunning = true;
		String command;

		System.out.println("Hello Pokemon Game");
		while(isRunning){
			System.out.print("\nWhat do you want? Type: ");
			command = commandScanner.next();
			if(command.equals("quit")){
				isRunning = false;
				System.out.println("Good bye, See you next time.");
			}
			else if(command.equals("add"))
				this.addPokemon();
			else if(command.equals("list"))
				this.listPokemons();
			else if(command.equals("feed"))
				this.feedPokemons();
			else if(command.equals("walk"))
				this.walkPokemons();
			else if(command.equals("remove"))
				this.removePokemon();
		//	else if(command.equals("catch"))
		//		this.catchPokemon();
		}
	}

	private void addPokemon(){
		commandScanner.nextLine();
		System.out.print("Enter Type: ");
		pokemonType = commandScanner.nextLine();
		System.out.print("Name: ");
		pokemonName = commandScanner.nextLine();
		System.out.print("Weight: ");
		pokemonWeight = commandScanner.nextFloat();
		System.out.print("Step Length: ");
		pokemonStepLength = commandScanner.nextFloat();

		if(pokemonType.equals("Vulpix")){
			Vulpix vulpix = new Vulpix(pokemonName, pokemonWeight, pokemonStepLength);
			pokemonFarm.addPokemon(vulpix);
		}

		if(pokemonType.equals("Pikachu")){
			Pikachu pikachu = new Pikachu(pokemonName, pokemonWeight, pokemonStepLength);
			pokemonFarm.addPokemon(pikachu);
		}

		if(pokemonType.equals("Swinub")){
			Swinub swinub = new Swinub(pokemonName, pokemonWeight, pokemonStepLength);
			pokemonFarm.addPokemon(swinub);
		}
	}

	private void listPokemons(){
		System.out.println("=============================================");
		System.out.println("Pokemon list");
		System.out.println("=============================================");
		this.pokemonFarm.list();
		System.out.println("=============================================");
	}

	private void feedPokemons(){
		System.out.print("Which pokemon do you want to feed? ");
		pokemonName = this.commandScanner.next();
		if(pokemonName.equals("all")){
			this.pokemonFarm.feed("all");
		}
		else 
			this.pokemonFarm.feed(pokemonName);
		}

	private void walkPokemons(){
		System.out.print("Which pokemon do you want to promenade? ");
		pokemonName = this.commandScanner.next();
		System.out.print("How many step? ");
		int step = this.commandScanner.nextInt();
		if(pokemonName.equals("all"))
			this.pokemonFarm.walk("all", step);
		else
			this.pokemonFarm.walk(pokemonName, step);
	}

	private void removePokemon(){
		System.out.print("Which pokemon do you want to remove? ");
		pokemonName = this.commandScanner.next();
		this.pokemonFarm.remove(pokemonName);
	}

}