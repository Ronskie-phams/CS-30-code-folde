







import java.lang.System;
import java.lang.Math;


public class funhouse
{
	//instance variables and constructors could be used, but are not really needed

	//getSum() will return the sum of the numbers from start to stop, not including stop
	public static int getSum(int[] numArray, int start, int stop)
	{
	  int sum = 0;

	  for( int i = start; i<= stop; i++){ // loops that i = the start value and it stops at the value of "stop" and adds them
		sum +=numArray[i]; // adds the whatever the sum is to the variable "sum"
	  }
 	
		return sum; // returns sum

		
		
	}

	//getCount() will return number of times val is present
	public static int getCount(int[] numArray, int val)
	{
	  int count = 0;
      for (int number:numArray){
		if (number == val){// if number matches int val
			count++;// it counts how many int val are in the array
		}
	  }
		return count;// returns count 
	}

	public static int[] removeVal(int[] numArray, int val)
	{ 
	   int [] newarray = new int[numArray.length - getCount(numArray,val)]; // creates new array that counts a certain value of the array
	   int pos = 0; // sets position of each array
		
		for (int num : numArray){// it loops each of the element and specifies the array numbers to iterate over, it is an enhanced loop from the traditional loop method
		if ( num !=  val){ // if number in each element does not equal to the designated number of val
		    newarray[pos++] = num ; // places value of num to the  new array that was made and it will be placed at the "pos" position and will increment pos so that the next value will be placed in different positions of newarray.
			 
		}
	  }
	  
		return newarray;
	}
}