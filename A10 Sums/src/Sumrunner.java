public class Sumrunner {
    public static void main(String[] args) throws Exception {
       Sums test = new Sums();

       test.setNums(2,6); // sets the numbers for int num1 and num2
       test.sum();//adds them together
       test.print(); // prints the sum of two numbers
       
       
       test.setNums(5,10);
       test.sum();
       test.print();


       test.setNums(20,100);
       test.sum();
       test.print();


 

       // add more test cases


    }
}
