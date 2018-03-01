import java.util.*;

class Ball{
    private double oppotunity;
    private String name = "";

    public Ball(int ball){

        if(ball == 0){
	    this.name = "PokeBall";
	    this.oppotunity = 0.8;
        }

	else if(ball == 1){
	    this.name = "GreatBall";
	    this.oppotunity = 0.9;
        }

	else if(ball == 2){
            this.name = "UltraBall";
	    this.oppotunity = 1.0;

        }
    }

    public String getName(){
        return this.name;	
    }

    public double getOppotunity(){
	return this.oppotunity;
    }


}
