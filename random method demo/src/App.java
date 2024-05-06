
import java.util.Scanner;





public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner (System.in);

        // System.out.println("enter an integer:  ");
        // int int1 = keys.nextInt();

        // System.out.println("enter another integer:  ");
        // int int2 = keys.nextInt();

        // System.out.println("enter a decimal :  ");
        // double dbl1 = keys.nextDouble();

        // System.out.println("enter another decimal:  ");
        // double dbl2 =  keys.nextDouble();

        for (int i =0; i<10; i++){
        System.out.println("the number is : " + rdInt(20,100));
        }
        
    }

    // custom random double generator

    public static double rdbl1(double max)
    
    
    {// generate random double between 0 and max
      double gen = Math.random() * max;





     return gen;

    }

    public static int rdInt (int min,int max)
    {
        max ++; //add one to max to include it in the result
        
        
        
        // generate random double between 0 and max
        double gen = Math.random() *(max - min) + min;

            // Math.random() * 80 =20 ---- number between 20 and 100
            // cast the double as an int to drop the decimals
        return (int) gen;

    }
    

    


    
}
