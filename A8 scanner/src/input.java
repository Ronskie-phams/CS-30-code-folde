



import java.util.Scanner;





public class input {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in); // scanner will scan for integer,decimals or strings and more 
        
        
        
        // adding integer
        int int1,int2;
        System.out.println("Enter an integer::  ");// input
        int1 = keyboard.nextInt(); // scans  int input


        System.out.println("Enter an integer::  ");
        int2 = keyboard.nextInt(); // scans  int input

        System.out.println(int1+int2);// adds up int1 and int2 which prints the total




        
        double one1, two2;
        System.out.println("Enter a decimal::   ");//input
        one1 = keyboard.nextDouble(); // scans  decimal input

        System.out.println("Enter a decimal::    ");
        two2 = keyboard.nextDouble();//scans  decimal input

        System.out.println(one1+two2);  // adds up two decimal inputs which outputs the total







        



       
         
 
     
    }
}
