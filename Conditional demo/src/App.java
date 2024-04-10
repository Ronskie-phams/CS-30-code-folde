public class App {
    public static void main(String[] args) throws Exception {
        

       int x = 10;



       // This condition checks if x over 5
        if (x>5){
       System.out.println("big number");

        }
        //This is -12 <x<5 because 5 already checked
       else if (x> -12 ){
        System.out.println("Mild weather");
       }
       // This is x =< -12 because the others have been checked
       else {
        System.out.println("Very cold");
       }


       boolean isCold = false;

       if (!isCold) {
        System.out.println("Wear a coat");
        System.out.println("Wear gloves");
       }

    }
}
