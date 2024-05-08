


import static java.lang.System.*;

import java.util.Scanner;


public class Coolnumrunner 
{
	public static void main( String[] args )
	{
		Scanner keys = new Scanner(System.in);
		System.out.println("Enter an integer ::  ") ;
	    int cool = keys.nextInt();
		
		  
        
		//add more test cases
       
        System.out.println( Coolnumbers.countCoolNumbers(cool) + " cool numbers between 6 - " + 250);// prints the cool numbers 
	
}
    
}
