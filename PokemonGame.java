

class PokemonGame{
	public static void main(String[] args){
		PokemonFarm pokemonFarm = new PokemonFarm();
		Bag bag = new Bag();
		CommandParser commandParser = new CommandParser(pokemonFarm, bag);
		
		commandParser.run();
	}
}
