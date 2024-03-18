// Project Title
// Your Name
// Date
//
// Extra for Experts:
// - describe what you did to take this project "above and beyond"

let x,y;
let w = 0;
let time=0
let timex = 0;
let timey = 0;
let timew = 0;


function setup() {
  createCanvas(windowWidth, windowHeight);
  //width and height are defined by canvas
  // put x and y in the center
  x = width/2;
  y =  height/2;
  //w = w+noise(time)
}

function draw() {
  background(noise(timex));

x = noise(timex) * width;
y = noise(timey) * height;
w = w+noise(time);
  fill (noise(timex)*255,noise(timey)*255, noise(timew)*255);
  circle(x,y,w);

  timex +=0.03;
  timey -=0.01;
  timew =timew+0.0000005;




}
