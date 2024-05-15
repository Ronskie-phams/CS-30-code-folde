

import java.util.Scanner;
import java.util.Random;




public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner keys = new Scanner(System.in);
        Random rand = new Random ();
        
        int [] outcomes = new int [13];


        int numrolls;
        int result;


        System.out.print("How many rolls (max 13) ?");
        numrolls = keys.nextInt();
        keys.nextLine();

        //check if out of bounds
        if (numrolls> 13){
            numrolls = 13;
        }

        else if ( numrolls< 0 ) {
            numrolls=1;
        }



          // roll dice and add to outcomes array - Assume two dice

          for (int roll = 0; roll < numrolls; roll++){
            // rolling "two dice" - note  nextInt(x) is a number from 0 <= num<x
            System.out.print( "Roll 1:  ");
            int dice1 = rand.nextInt(6) +1;
            System.out.println(dice1);

            System.out.print("Roll 2 : ");
            int dice2 = rand.nextInt(6) +1;
            System.out.println(dice2);
          
            result = dice1+dice2;
            // store result in the outcomes array
            outcomes [roll] = result;

            System.out.println("Roll number   " + roll + "  Is   " + outcomes[roll]);


          }























    }
}
