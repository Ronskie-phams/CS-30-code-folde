import java.util.Scanner; 
import static java.lang.System.*;


public class MPHrun
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		MPH test = new MPH(dist, hrs, mins); // sets the variables using the int inputs
        test.calcMPH();// calculates the miles per hour
		test.print1(); // prints the answer
		
		//add more test cases
		

       

		out.print("Enter the distance :: ");
		int dista = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hors = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int minus = keyboard.nextInt();

		test.setNums(dista, hors, minus);// calculates using the int inputs
        test.calcMPH(); // calculates the mph
		test.print2();// total mph 
		
		
	}
}