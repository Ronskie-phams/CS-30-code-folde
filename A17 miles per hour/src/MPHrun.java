import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

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

		MPH test = new MPH(dist, hrs, mins);
        test.calcMPH();
		test.print1();
		
		//add more test cases
		

       

		out.print("Enter the distance :: ");
		int dista = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hors = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int minus = keyboard.nextInt();

		test.setNums(dista, hors, minus);
        test.calcMPH();
		test.print2();
		
		
	}
}