public class Geo {
    private double l,w,s,c; 
    
    public void perimeter(double len, double wid) {// double len and wid are set variables

        l = len;
        w = wid;

        double per = 2*(l+w); // perimeter formulat 
        System.out.println("Perimeter calculation is " + per);
    }

    // Surface area of a cube
    public void surfaceArea(double side) { //double side is set variable
        s = side;// making another variable for side
        double sid = 6*(s*s);// formula for side
      
        System.out.println("surface area calculation is "+ sid);// prints the calculation for side
    }

    // Area of a circle
    public void circleArea(double radius) { //radius 
        c = radius;// another variable for radius
        double rad = 3.14*(c*c); // formula for radius
        System.out.println("radius calculation is "+ rad);// prints the total radius
    }
}


