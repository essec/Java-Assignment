import java.util.*;

class Pokemon{
	private String name;
	private float weight;
	private float stepLength;
	private int step;
	private float gainingWeightStep;
	private String[] types;
	Random rnd = new Random();

	public Pokemon(String name,
			float gainingWeightStep,
			String[] types){
		this.name = name;
		this.weight = rnd.nextInt(100)+1;
		this.stepLength = (float)(rnd.nextInt(1)+0.1);
		this.gainingWeightStep = gainingWeightStep;
		step = 0;
		

		if(types == null)
			this.types = new String[] {"normal"};
		else
			this.types = types;
	}

	public void walk(){
		step += 1;
		weight -= .5f;
	}

	public void eat(){
		weight += gainingWeightStep;
	}

	public void print(){
		System.out.println("Pokemon name: " + name);
		System.out.print("Type: ");
		for(String type: types){
			System.out.print(type+",");
		}
		System.out.println();
		System.out.println("Weight: " + weight);
		System.out.println("Step Length: " + stepLength);
		System.out.println("Today Step: " + step);
		System.out.println("---------------------------------------------------------");

	}

	public String getName(){
		return name;
	}

	public void setName(String newName){
		this.name = newName;
	}
	
}
