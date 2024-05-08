
   
        import java.util.Scanner; 
        import static java.lang.System.*;
        import static java.lang.Math.*; // imports math codes 
        
        public class MPH
        {
            private int d, h, dis , hou;// makes it private and can only be used in this side of the code
            private double speed,mph,m, minu, mcalc, mpspeed;
        
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
        
            public void setNums(int dista, int hors, int minus)
            {
            dis = dista;
            hou = hors;
            minu = minus;

        
            }
        
            public void calcMPH()

            {
              mph =  h + (m/60);
              speed =  Math.round(d / mph);// math round makes the answer round to the nearest number

              mcalc = hou + (minu/60);
              mpspeed = Math.round(dis/mcalc);
            
        
        
            }
        
            public void print1()
            {
             System.out.println(d + " miles in "+ h + "hours and " + m + " minutes =" + speed + " MPH");
        
            }
            public void print2()
            {
             System.out.println(dis + " miles in "+ hou + "hours and " + minu + " minutes =" + mpspeed + " MPH");
        
            }
        }
  

