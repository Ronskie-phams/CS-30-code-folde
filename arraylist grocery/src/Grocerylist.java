
import java.util.Scanner;
import java.util.ArrayList;



public class Grocerylist {
 public static void main(String[] args) throws Exception{
  Scanner keys = new Scanner(System.in);
  


ArrayList <String> groclist = new ArrayList<>();// creates blank list
 boolean s = true;



 // infinite loop
  for(;;){
  System.out.println("Enter Item:::   ");
  String item = keys.nextLine();
  groclist.add(item); // adds the items typed into the array groclist
  System.out.println("Would you like to add more? yes/no ::");
  String choice = keys.nextLine();
 
  if (choice.equalsIgnoreCase("no") ){// returns true if user type done without any case consideration as long as they are the same
     break; // breaks the whole loop

  }else {
    s =  true;


  }

 
}
 


System.out.println("\n your list of items:::    ");
for (int i = 0; i <groclist.size(); i++){// loops array
  System.out.println((i+1) + ".  " + groclist.get(i)); // prints the items that are in the array
}
 }
}










  
    
