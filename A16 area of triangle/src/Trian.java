
import java.util.Scanner; 
import java.lang.Math.*;

public class Trian
{    
	// set global variables
    private double setA,setB, setC, stA, stB, stC;
	private double sideA, sideB, sideC;
	private double perimeter1, per2, per3;
	private double theArea, area2, area3;

	public Trian()
	{
	   setSides(0,0,0);
	   perimeter1=0;
	   theArea=0;
	}

	public Trian(int a, int b, int c) // first triangle input
	{
      sideA = a;
      sideB = b;
      sideC = c;

      

	}


	public void setSides(int a, int b, int c) //second triangle input
	{
        setA = a;
        setB = b;
        setC = c;


	}

	public void setSides2( int a, int b, int c)// third trianlge input
	
	{
       stA = a;
	   stB = b;
	   stC = c;


	
	}

	public void calcPerimeter( )// perimeters
	{
        perimeter1 = sideA + sideB + sideC ; // for first triangle
        per2 = setA + setB + setC;// second triangle
		per3 = stA + stB + stC ;// third trianlge

        

     

	}

	public void calcArea( )// area
	{   
        
        double s = perimeter1/2;
	    theArea = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));// area calc for triangle 1

        double r = per2/2;
        area2 = Math.sqrt(r*(r-setA)*(r-setB)*(r-setC)); // area calc for triangle 2

		double a = per3/2;
		area3 = Math.sqrt(a*(a-stA)*(a-stB)*(a-stC)); // area calc for triangle 3


        



	}

	public void printTrian1( )
	{
     System.out.println("\n\n");
     System.out.println("The area is " + theArea); // prints triangle 1 answer
     
     
	}


	public void printTrian2()
	{
		System.out.println("\n\n");
		System.out.println("The area is " + area2);// prints triangle 2 answer
	}



	public void printTrian3()
	{
		System.out.println("\n\n");
		System.out.println("The area is " + area3);// prints triangle 3 answer
	}
}


    

