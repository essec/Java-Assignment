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

        if(ballCommand.e:wquals("UltraBall")){
            this.UltraBall();            
        }
    }

    private void PokeBall(){
        
    }

    private void GreatBall(){

    }

    private void UltraBall(){

    }
    

}