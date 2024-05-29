import java.util.ArrayList;
import java.util.Random;


public class reverserafflerun {

    public static Object runreverseraffle;

    public static void runreverseraffleDraw(ArrayList<String> hat) {
       Random winnerrand = new Random();
        System.out.println("reverse raffle draw, last to be drawn is the winner");

        while (hat.size() > 1){
            String winners = reverseraffle.winner(hat,winnerrand); 
            reverseraffle.saywinner(winners); 
            reverseraffle.removelist(hat);

        }

        if (!hat.isEmpty()){
            String finalwin= hat.get(0);
           reverseraffle.announceWin(finalwin);

        }

        
    }
    
}
