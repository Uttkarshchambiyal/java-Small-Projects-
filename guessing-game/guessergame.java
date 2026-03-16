import java.lang.*;
import java.util.*;

class Guesser {
    int gNum;
    int guessingnum() {
        System.out.println("GUESSER, kindly enter your number");
        Scanner scan = new Scanner(System.in);
        gNum = scan.nextInt();
        return gNum; 
    }
}

    class Player {
        int pNum;
        int predictingnum(int playerNumber){
               System.out.println("PLAYER, "+ playerNumber +" kindly enter your number");
               Scanner scan = new Scanner(System.in);
               pNum = scan.nextInt();
               return pNum; 
        }
    }

 class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectingNumFromGuesser() {
       Guesser g1 = new Guesser();
              numFromGuesser  = g1.guessingnum();}
     void collectingNumFromPlayer(){       
      Player p1 = new Player();
       Player p2 = new Player();
        Player p3 = new Player();



    numFromPlayer1 = p1.predictingnum(1);
    numFromPlayer2 = p2.predictingnum(2);
    numFromPlayer3 = p3.predictingnum(3);
        
     }
        void comparing(){
            if(numFromGuesser ==  numFromPlayer1){
                System.out.println("player 1 is winner");
            }
             else if(numFromGuesser ==  numFromPlayer2){
                System.out.println("player 2 is winner");
            }
            else if(numFromGuesser ==  numFromPlayer3){
                System.out.println("player 3 is winner");
            }
             else{
                System.out.println("player losse start again");
            }
        }

    }

public class guessergame 
{
    public static void main(String[] args){
       Umpire u1 = new Umpire();
       u1.collectingNumFromGuesser();
              u1.collectingNumFromPlayer();
       u1.comparing();
    }    
}
