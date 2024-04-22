public class Geo {
    private double l,w,s,c; 
    
    public void perimeter(double len, double wid) {

        l = len;
        w = wid;

        double per = 2*(l+w);
        System.out.println("Perimeter calculation is " + per);
    }

    // Surface area of a cube
    public void surfaceArea(double side) {
        s = side;
        double sid = 6*(s*s);
      
        System.out.println("surface area calculation is "+ sid);
    }

    // Area of a circle
    public void circleArea(double radius) {
        c = radius;
        double rad = 3.14*(c*c);
        System.out.println("radius calculation is "+ rad);
    }
}


