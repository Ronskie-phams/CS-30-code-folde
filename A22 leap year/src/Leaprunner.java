

import static java.lang.System.*; 
import java.util.Scanner;



public class Leaprunner {
    public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number::"    );
        int yr = keyboard.nextInt();

        if( leap.isLeapYear(yr)) System.out.println(yr + " is a leap year"); // conditional print statement calling out isleapyr if true prints its leap year otherwise it prints not leap year
         else System.out.println(yr + " is not a leap year");



       
        

        
		
					
	}
}
   