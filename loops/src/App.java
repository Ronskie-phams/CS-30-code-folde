

import java.util.Scanner;





public class App {
    public static void main(String[] args) throws Exception {
        int x = 3;

        while (x>0) {
          System.out.println(x);
          x=x-1;

        }


        for (int i = 3 ; i>0; i--){
            System.out.println(i);
        }

        // game loop concept


        // three requirements
        

        boolean playagain = true;
        Scanner keys = new Scanner (System.in);

        while (playagain){
           // entire game
            System.out.println("this is my program , it would be ");
            
            //entire game

         // play again conditions

         System.out.println ("do you want to play again? (1 = yes. 2 = no)");
         int inp = keys.nextInt();


         if (inp == 0) {
             playagain = false;


         }





        }


    }
}
