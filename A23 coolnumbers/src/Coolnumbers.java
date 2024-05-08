import static java.lang.System.*;




public class Coolnumbers 

    
{
	/*
	 *method isCoolNumber will return true if
	 *	num % 3-6 all have a remainder of 1
	 *it will return false otherwize
	 */
	public static boolean isCoolNumber(  int num )

	{

       
		 return num % 3 ==1 && num % 4 ==1 && num % 5 ==1 && num%6 ==1 ;// returns true if the numbers are prime numbers or cool numbers
        
         
         
	} 
    
    
	
		/*
	 *method countCoolNumbers will return the count
	 *of the coolNumbers between 6 and stop
	 */

     
	public static int countCoolNumbers( int stop )// end number is the input cool

	{
       int count = 0;
	   for (int i = 6; i<= stop ; i++){// it counts how many cool numbers are there until the number you have input.
		 if (isCoolNumber(i)){
			count++;
		 }
	   }
    
        
		return count;
        
	}
}