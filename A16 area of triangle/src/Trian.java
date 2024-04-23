
import java.util.Scanner; 
import java.lang.Math.*;

public class Trian
{
    private double setA,setB, setC;
	private double sideA, sideB, sideC;
	private double perimeter, per;
	private double theArea, area2;

	public Trian()
	{
	   setSides(0,0,0);
	   perimeter=0;
	   theArea=0;
	}

	public Trian(int a, int b, int c)
	{
      sideA= a;
      sideB = b;
      sideC = c;

      

	}


	public void setSides(int a, int b, int c)
	{
        setA = a;
        setB = b;
        setC = c;

	}

	public void calcPerimeter( )
	{
        perimeter = sideA + sideB + sideC ;
        per = setA + setB + setC;
        

     

	}

	public void calcArea( )
	{   
        
        double s = perimeter/2;
	    theArea = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));

        double r = per/2;
        area2 = Math.sqrt(r*(r-setA)*(r-setB)*(r-setC));


        



	}

	public void print( )
	{
     System.out.println("\n\n");
     System.out.println("The area is " + theArea);
     System.out.println("\n\n");
     System.out.println("The area is " + area2);
	}
}
    

