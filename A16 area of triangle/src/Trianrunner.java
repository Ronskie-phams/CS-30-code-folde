
    import java.util.Scanner; 
   

public class Trianrunner  //this class is used to test Triangle
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		//ask for user input
		System.out.print("Enter side A ::  ");
		int a = keyboard.nextInt();// scans next int

		System.out.print("Enter side B ::  ");
		int b = keyboard.nextInt();

		System.out.print("Enter side C ::  ");
		int c = keyboard.nextInt();
        
		System.out.println(a+ "\t"+  b + "\t" + c);// prints each of the number input
		

		Trian test = new Trian(a, b, c);// running the codes for triangle, sides from the input above
		test.calcPerimeter();// calculates the perimeter
		test.calcArea();// calculates the area
		test.printTrian1(); // prints the total sides


		//ask for user input
		System.out.print("Enter side A ::  ");
		a = keyboard.nextInt();

		System.out.print("Enter side B ::  ");
		b = keyboard.nextInt();

		System.out.print("Enter side C ::  ");
		c = keyboard.nextInt();
          
		//prints the set numbers
        System.out.println(a+ "\t"+  b + "\t" + c);
		
		test.setSides(a,b,c); // sets the numbers from the input above
		test.calcPerimeter();
		test.calcArea();
		test.printTrian2();// prints the second inputs total


		
		// new added input
		System.out.print("Enter side A:  ");
		a = keyboard.nextInt();

		System.out.print("Enter side B:  ");
		b = keyboard.nextInt();

		System.out.print("Enter side C:  ");
		c = keyboard.nextInt();

        System.out.println(a+ "\t"+  b + "\t" + c);// prints the chosen numbers
		
		test.setSides2(a,b,c); // sets the sides for the third inputs 
		test.calcPerimeter();
		test.calcArea();
		test.printTrian3(); // total of the area of triangle in the third inputs
		
		
		
		
		
		




	}
}

