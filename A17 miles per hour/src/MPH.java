
   
        import java.util.Scanner; 
        import static java.lang.System.*;
        import static java.lang.Math.*;
        
        public class MPH
        {
            private int d, h;
            private double speed,mph,m;
        
            public MPH()
            {
                setNums(0,0,0);
                mph=0.0;
            }
        
            public MPH(int dist, int hrs, int mins)
            {
              
             d = dist;
             h = hrs;
             m = mins;
        
            }
        
            public void setNums(int dist, int hrs, int mins)
            {
            
        
            }
        
            public void calcMPH()

            {
              mph =  h + (m/60);
              speed =  Math.round(d / mph);
            
        
        
            }
        
            public void print()
            {
             System.out.println(d + " miles in "+ h + "hours and " + m + " minutes =" + speed + " MPH");
        
            }
        }
  

