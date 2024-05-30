import java.util.ArrayList;
import java.util.Random;


public class reverserafflerun {

   

    public static void runreverseraffleDraw(ArrayList<String> hat) throws java.lang.InterruptedException {
       Random winnerrand = new Random(); //creates random to generate random numbers
        System.out.println("reverse raffle draw, last to be drawn is the winner");

        while (hat.size() > 1){// loops until one name remains
            String winners = reverseraffle.winner(hat,winnerrand); //calls functions from reverseraffle and setting variables
            reverseraffle.saywinner(winners); // calls say winner and executes the function
            reverseraffle.removelist(hat); // calls the removes list
         

            try {Thread.sleep(1000);} //Delays the raffle for 1 second
             catch (InterruptedException exception){// catches any interruptions during the delay
              Thread.currentThread().interrupt();
            }

            


        





        }

        if (!hat.isEmpty()){ // checks if there is only one name in the loop 
            String finalwin= hat.get(0); // sets finalwin to getting index zero 
           reverseraffle.announceWin(finalwin); // calls announceWin and prints the final winner

        }
    }
}



        
    
    

