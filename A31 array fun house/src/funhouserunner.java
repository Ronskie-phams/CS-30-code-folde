
import java.util.Arrays;



public class funhouserunner
{
	public static void main( String args[] )
	{
		int[] one = {4,10,0,1,7,6,5,3,2,9};

		System.out.println(Arrays.toString(one));
		System.out.println("sum of spots 3-6  =  " + funhouse.getSum(one,3,6));
		System.out.println("sum of spots 2-9  =  " + funhouse.getSum(one,2,9));
		System.out.println("# of 4s  =  " + funhouse.getCount(one,4));
		System.out.println("# of 9s  =  " + funhouse.getCount(one,9));
        
		int [] newArray = funhouse.removeVal(one,4);// new list 
	    System.out.println("Array after removing 4:"+ Arrays.toString(newArray));// prints new list 
		
		
		
		
		
		int[] two = {4,2,3,4,6,7,8,9,0,10,0,1,7,6,5,3,2,9,9,8,7};


		System.out.println(Arrays.toString(two));
		System.out.println("sum of spots 3-6  =  " + funhouse.getSum(two,3,6));// calls the function from funhouse and sets the array,start,and stop
		System.out.println("sum of spots 2-9  =  " + funhouse.getSum(two,2,9));
		System.out.println("# of 4s  =  " + funhouse.getCount(two,4));// sets the value to be counted from the array two
		System.out.println("# of 9s  =  " + funhouse.getCount(two,9));
        
		int [] newList = funhouse.removeVal(two,9); // creates the new list and removes the value of the of 9 in the array
	    System.out.println("Array after removing 9:"+ Arrays.toString(newList)); // prints the new list
		
		
		//add test cases


	}
}