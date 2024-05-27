
import java.util.Scanner;
import java.lang.String;



public class Grocerylist {
 public static void main(String[] args) throws Exception{

    String [] groc = {} ;


    
   

    
int pos = 0;

  for (int i = 0; i < groc.length; i++){
    Scanner str = new Scanner(System.in);
    System.out.println("Add a grocery item:::    ");
    String g = str.nextLine();
        groc[pos++]= g;
       System.out.println(groc);

  }

  







    }
    
}
