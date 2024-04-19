

public class Fahrenheit
{
	private double one;
     
	public void setFahrenheit(double fahren)
	{

        one = fahren;
        



	}

	public double getCelsius()
	{    
		double celsius = (one - 32)* 5/9;
		//add code to convert fahrenheit to celsius
		return celsius;
	}

	public void print()
	{
		//this is part of the solution
		System.out.println("The convertion of fahrenheit to celsius is"+ getCelsius());
	}
}
