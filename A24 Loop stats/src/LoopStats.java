

import static java.lang.System.*;

public class LoopStats
{
	private int start, stop;
    
	

	public LoopStats(int beg, int end)
    {
        start = beg; // set int beg as start 

		stop = end; /// set int end as stop

	}


	public int getEvenCount()
	{
		int evenCount=0;
		for (int i = start; i <= stop; i++){
			
			if (i%2 ==0){
				evenCount++; // gets even count as if i remainder 2 equals 0 it changes the evencount 
			}
		}
		


		return evenCount; // returns even count
	}

	public int getOddCount()
	{
		int oddCount=0;
		for (int i = start; i <= stop; i++){ // counts the odd number from start to stop
			
			if (i%2 !=0){
				oddCount++;
			}
		}
		return oddCount;
	}

	public int getTotal()
	{
		int total=0;

		for (int i = start; i <= stop;i++){// sum of the total number from start to stop
			total  += i ;// changes the total variable to a number for i
		}





		return total; // returns the total
		
	}
	
	
}