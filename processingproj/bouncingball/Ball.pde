class Ball{
 
 
 int x ,y,r; // declare position and radius variables
 int cr, cg,cb;// rgb values
 int dx,dy;// velocity/speed values
 
 
 
  // constructor method
Ball(int ballx, int bally, int ballr){
   x = ballx;//set x cord
   y = bally;//set y cord
   r = ballr;//set the radius

   //randomize colour values
   cr = int (random(0,225));
   cg = int (random(0,225));
   cb = int (random(0,225));


  //set speed
  dx = int (random(-10,10));
  dy = int (random(-10,10));



}


void display(){

  fill(cr,cg,cb);
  circle(x,y,r);


}

void move(){
   // applying the rate of change
  x = x+dx;
  y=y+dy;
  
  
   
}



















}