// Project Title
// Your Name
// Date
//
// Extra for Experts:
// - describe what you did to take this project "above and beyond"

let ballsarray = [];


function setup() {
  createCanvas(windowWidth, windowHeight);
  createBall();
  
  
  
}

function draw() {
  background(30);
  fill(255,0,0)

  for(let i =0; i<ballsarray.length;i++){
   circle(ballsarray[i].x,ballsarray[i].y,ballsarray[i].diameter);
   ballsarray[i].x += ballsarray[i].dx;//x rate of change
   ballsarray[i].y += ballsarray[i].dy;//y rate of change
  }
}


function createBall() {
  //create a temp ball object
  let newBall = {
    x: random(width),
    y: random(height),
    diameter: random(25, 100),
    dx: random(-5, 5),
    dy: random(-5, 5),
  };
  // copying the ball obj to the array
  ballsarray.push(newBall);
}

 function mousePressed (){
  createBall();
  ballsarray[ballsarray.legnth-1].x = mouseX;
  ballsarray[ballsarray.length-1].y = mouseY;
 }

