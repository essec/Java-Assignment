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
	private Forest forest;
	private Bag bag;

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
			else if(command.equals("forest"))
				this.goForest();

		}
	}

	private void addPokemon(){
		commandScanner.nextLine();
		System.out.print("Enter Type: ");
		pokemonType = commandScanner.nextLine();
		System.out.print("Name: ");
		pokemonName = commandScanner.nextLine();

		if(pokemonType.equals("Vulpix")){
			Vulpix vulpix = new Vulpix(pokemonName);
			pokemonFarm.addPokemon(vulpix);
		}

		if(pokemonType.equals("Pikachu")){
			Pikachu pikachu = new Pikachu(pokemonName);
			pokemonFarm.addPokemon(pikachu);
		}

		if(pokemonType.equals("Swinub")){
			Swinub swinub = new Swinub(pokemonName);
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

	private void goForest(){
		bag = new Bag();
		forest = new Forest();
		String choice;
		System.out.println("Welcome to Forest");
		System.out.println("=================================================");

		do{
		forest.pokemonFound();
		System.out.print("Do you want to catch it? ");
		choice = this.commandScanner.next();
		if(choice.equals("yes"))
			forest.catchPokemon(bag);
		else if(choice.equals("No"))
			forest.pokemonFound();
		System.out.print("Want to go Home? ");
		choice = this.commandScanner.next();
	    } while(!(choice.equals("goHome")));



		pokemonFarm.push(bag.getPokemon());
		System.out.println("Welcome Home!");

		}
	



}
