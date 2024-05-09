
import static java.lang.System.*;

import java.util.Scanner;

public class Loopstatrunner
{
	public int onetwo;
	public static void main ( String[] args )
	{
		//add test cases	
		
        Scanner keys = new Scanner(System.in);
		out.println( "Enter integer :::   ");
        int start = keys.nextInt();


		out.println("Enter second integer:::   ");
		int stop = keys.nextInt();

       
		LoopStats test = new LoopStats(start,stop);// runs Loopstats codes
		{
		System.out.println(start+ "  "+ stop);
		System.out.println("total:" + test.getTotal());// gets the total of the two numbers
		System.out.println("Even numbers: "+  test.getEvenCount());// test the even count 
		System.out.println("Odd numbers:   "+ test.getOddCount()); // testthe odd count
			
		} 

		

		
		

	}
	
	  

}