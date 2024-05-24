class Ball{
 
 
 int x ,y,d; // declare position and radius variables
 int cr, cg,cb;// rgb values
 int dx,dy;// velocity/speed values
 int width, height; // variables for the screen dimensions
 
 
 
  // constructor method
Ball(int ballx, int bally, int balld, int windoww, int windowh){
   x = ballx;//set x cord
   y = bally;//set y cord
   d = balld;//set the radius

   //randomize colour values
   cr = int (random(0,225));
   cg = int (random(0,225));
   cb = int (random(0,225));


  //set speed
  dx = int (random(-10,10));
  dy = int (random(-10,10));

  // passing over the width and height data of the screen
  width = windoww;
  height = windowh;



}


void display(){

  fill(cr,cg,cb);
  circle(x,y,d);


}

void move(){
   // applying the rate of change
  x = x+dx;
  y=y+dy;

  if (x<= 0 +d/2 || x>= width - d/2 ){
    //reverse direction
    dx=dx *-1;
   
  }

  if (y<= 0 + d/2 || y>= height - d/2){
   dy=dy*-1;

  }
}
  void checkCollision (Ball otherBall){
      double distanceApart = dist(x,y, otherBall.x, otherBall.y);
       
      // bounce the ball
      if (distanceApart < d ){
        // store first velocity
        int tempdx = dx;
        int tempdy = dy;
        
      
      // ball 1 gets velocity 2 
      dx = otherBall.dx;
      dy = otherBall.dy;


      //ball 2 gets velocity 1 

      otherBall.dx = tempdx;
      otherBall.dy = tempdy;
      
      
      }


  }
  
  
   
}



















}