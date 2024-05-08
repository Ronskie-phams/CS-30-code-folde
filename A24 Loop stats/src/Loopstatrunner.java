
import static java.lang.System.*;

import java.util.Scanner;

public class Loopstatrunner
{
	public static void main ( String[] args )
	{
		//add test cases	
		
        Scanner keys = new Scanner(System.in);
		out.println( "Enter integer :::   ");
        int start = keys.nextInt();


		out.println("Enter second integer:::   ");
		int stop = keys.nextInt();

       
		LoopStats test = new LoopStats(start,stop);
		boolean t = true;
		while (t){
		System.out.println(start+ "  "+ stop);
		System.out.println("total:" + test.getTotal());
		System.out.println("Even numbers: "+  test.getEvenCount());
		System.out.println("Odd numbers:   "+ test.getOddCount());
		t = false;
		}
		System.out.println("again?(1/2) :: ");
		int onetwo = keys.nextInt();

		if (onetwo = "1"){
			t = true;
		}
		

	}
	  

}