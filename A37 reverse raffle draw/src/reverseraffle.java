


import java.util.ArrayList;
import java.util. Random;
import java.lang.String;



public class reverseraffle {
    public static void main(String[] args) throws Exception {
        
     
     
     
        ArrayList <String> hat = new ArrayList<>();
         hat.add("Stan");
         hat.add("Eric");
         hat.add("Timmy");
         hat.add("Kyle");
         hat.add("Mr.Garrison");
         hat.add("Chef");
         hat.add("Kenny");
         hat.add("Officer Barbrady");
         hat.add("Butters");
         hat.add("Craig"); // adds 10 names into the array

     reverserafflerun.runreverseraffleDraw(hat); // calls the array hat and runs it in the runner
     
    }
     


    public static String winner(ArrayList<String> hat, Random random){ // sets variables in the function winner which is the list hat and random
        int pos = random.nextInt(hat.size()); // selects random index of the array hat
        return hat.remove(pos); // it removes and returns name of the position chosen by the random code
    }

    public static void saywinner(String winner){// String winner variable from above
        System.out.println("eliminated  :: " + winner); // announces that the name has been removed
    }

    public static void removelist( ArrayList<String> hat){// prints the remaining names available
        System.out.println("Remains::" );
        for (String p : hat){// code for index and the length of array
            System.out.println(p + "  "); // prints all the remaining names in the array
        }
        System.out.println();
       
    }

    public static void announceWin(String lastWinner) {
        System.out.println("Final Winner:  "  + lastWinner); // announces the final winner
    }

     












    }

