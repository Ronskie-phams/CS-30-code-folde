


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
         hat.add("Craig");

     reverserafflerun.runreverseraffleDraw(hat);
     
    }
     


    public static String winner(ArrayList<String> hat, Random random){
        int pos = random.nextInt(hat.size());
        return hat.remove(pos);
    }

    public static void saywinner(String winner){
        System.out.println("eliminated  :: " + winner);
    }

    public static void removelist( ArrayList<String> hat){
        System.out.println("Remains::" );
        for (int i = 0 ; i<hat.size();i--){
            System.out.println(hat + "  ");
        }
        System.out.println();
       
    }

    public static void announceWin(String lastWinner){
        System.out.println("Final Winner:  "  + lastWinner);
    }

     












    }

