
import java.util.Scanner;





public class App {
    
    public static void main(String[] args) throws Exception {
        
    
    
    
    
    //int input
    // System.out.println("Integers :   ");
    // int num = keys.nextInt()*2;
    
    // System.out.println("The number was :"  + num);
    
    //double input
    // System.out.println("Double :   ");
    // double dblnum = keys.nextDouble();
    
    // System.out.println("The number was :"  + dblnum);


    // next line input
//     System.out.println("Double :   ");
//     string word = keys.nextLine();
    
//     System.out.println("The word was :"  + word);
    
    
    
    
    Scanner keys = new Scanner(System.in);

    System.out.println("Enter an Integer: ");

    int num = keys.nextInt();

    
    Scanner str = new Scanner(System.in);
    
    System.out.println("Enter a sentence:  ");

    String sentence = str.nextLine();

    System.out.println(num + "\t " + sentence);

    }
}