

import static java.lang.System.*;

public class LoopStats
{
	private int start, stop;
    
	

	public LoopStats(int beg, int end)
    {
        start = beg;
		stop = end;

	}


	public int getEvenCount()
	{
		int evenCount=0;
		for (int i = start; i <= stop; i++){
			
			if (i%2 ==0){
				evenCount++;
			}
		}
		


		return evenCount;
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
			total  += i ;
		}





		return total; // returns the total
		
	}
	
	
}