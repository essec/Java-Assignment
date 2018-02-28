import java.util.*;

class Ball{
    private Scanner ballScanner;
    private double opporunity;

    public Ball(){
        ballScanner = new Scanner(System.in);
    }

    public void chooseBall(){
        String ballCommand;
        ballCommand = ballScanner.next(); 
        System.out.println("Which Ball you want? ");

        if(ballCommand.equals("PokeBall")){
            this.PokeBall();
        }

        if(ballCommand.equals("GreatBall")){
            this.GreatBall();
        }

        if(ballCommand.equals("UltraBall")){
            this.UltraBall();            
        }
    }

    private double PokeBall(){
        return opporunity = 0.8;
    }

    private double GreatBall(){
	return opporunity = 0.9;

    }

    private double UltraBall(){
	return opporunity = 1.0;
    }
    

}
