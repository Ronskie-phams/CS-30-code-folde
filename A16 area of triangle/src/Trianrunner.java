
    import java.util.Scanner; 
   

public class Trianrunner  //this class is used to test Triangle
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		//ask for user input
		System.out.print("Enter side A ::  ");
		int a = keyboard.nextInt();

		System.out.print("Enter side B ::  ");
		int b = keyboard.nextInt();

		System.out.print("Enter side C ::  ");
		int c = keyboard.nextInt();
        
		System.out.println(a+ "\t"+  b + "\t" + c);
		

		Trian test = new Trian(a, b, c);// running the codes
		test.calcPerimeter();
		test.calcArea();
		test.printTrian1();


		//ask for user input
		System.out.print("Enter side A ::  ");
		a = keyboard.nextInt();

		System.out.print("Enter side B ::  ");
		b = keyboard.nextInt();

		System.out.print("Enter side C ::  ");
		c = keyboard.nextInt();
          
		//prints the set numbers
        System.out.println(a+ "\t"+  b + "\t" + c);
		
		test.setSides(a,b,c);
		test.calcPerimeter();
		test.calcArea();
		test.printTrian2();


		
		// new added input
		System.out.print("Enter side A:  ");
		a = keyboard.nextInt();

		System.out.print("Enter side B:  ");
		b = keyboard.nextInt();

		System.out.print("Enter side C:  ");
		c = keyboard.nextInt();

        System.out.println(a+ "\t"+  b + "\t" + c);// prints the chosen numbers
		
		test.setSides2(a,b,c);
		test.calcPerimeter();
		test.calcArea();
		test.printTrian3();
		
		
		
		
		
		




	}
}

