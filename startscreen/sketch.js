// Button press
// Your Name: Ron Pama
// Date: 3/15/2024
//
// Extra for Experts:
// - press the rectangular button and click as many times for multiple circles




// State variable for the button

let ballsarray= [];
let buttonPressed = false;

function randball(){
  let balls = {
  x:random(width),
  y:random(height),
  diameter:random(525,100),
  dx:random(-5,5),
  dy:random(-5,5),

  
}
 
 fill(204,102,5);
 ballsarray.push(balls);
 
}



// Button object to store all of the button variable together
let myButton = {x: 0, y: 0, w: 0, h: 0, color: ""}

function setup() {
  createCanvas(windowWidth, windowHeight);
  
  //Set the initial properties of myButton
  //subtract 1/2 the w and h from x and y to get true center
  myButton.w = 120;
  myButton.h = 40;
  myButton.x = width/2 - myButton.w/2;
  myButton.y = height/2 - myButton.h/2;
  myButton.color= "red"
  
}

function draw() {
  background(0);
 
  if (buttonPressed===false) {
    //Calls the myButton function in the draw loop
    drawButton();
    
  }
  else if (buttonPressed ===true){
    
      for(let i =0; i<ballsarray.length;i++){
        circle(ballsarray[i].x,ballsarray[i].y,ballsarray[i].diameter);
        ballsarray[i].x += ballsarray[i].dx;//x rate of change
        ballsarray[i].y += ballsarray[i].dy;//y rate of change
        
       } 
       
      
      
  } 
  
  
}

//build in p5js funciton for mouse reactions
function mousePressed() {

  //Checks if the mouse is within the x coordinates of the button
  if (mouseX > myButton.x && mouseX < (myButton.x + myButton.w)) {
    buttonPressed = true
    //Switch "true" out for a similar condition that checks y coordinates
    
  } randball();
  ballsarray[ballsarray.legnth-1].x = mouseX;
  ballsarray[ballsarray.length-1].y = mouseY;
  

}

//custom function that draws the button when called
function drawButton() {
  fill(myButton.color);
  rect(myButton.x, myButton.y, myButton.w, myButton.h);
}






