

public class Fahrenheit
{
	private double one;
     
	public void setFahrenheit(double fahren)
	{

        one = fahren;




	}

	public double getCelsius()
	{    
		double celsius = (one - 32.0 *5.0)/9.0;
		//add code to convert fahrenheit to celsius
		return celsius;
	}

	public void print()
	{
		//this is part of the solution
		System.out.println(getCelsius());
	}
}
