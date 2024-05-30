// //Declaring the object
// ArrayList <Ball> ballGroup= new ArrayList<Ball>();


// void setup(){
//      size(1400,700);
   
// }

                
// void draw(){
//  background(70,30,50);
 
 
// //  for (int i = 0; i<ballGroup.size(); i++){
   
// //     ballGroup.get(i).display();
// //     ballGroup.get(i).move();
// //  }
// for (Ball theBall : ballGroup){
//    theBall.move();

//   //check collision
//    for (Ball otherBall : ballGroup){
//       if ( theBall != otherBall){
//       theBall.checkCollision(otherBall);
//       }
   
//    }
//    theBall.display();
//  }
// }




// void mousePressed(){
//     // creates a new object at this array position
//     ballGroup.add(new Ball ( mouseX,mouseY,100, width, height)); // creates new object at the end of the array list


//   // if (pos<ballGroup.length){
//   //   ballGroup[pos] = new Ball(mouseX,  mouseY, 100);
//   //      pos++;

//   }



//Declaring the object Array List
ArrayList<Ball> ballGroup = new ArrayList<Ball>();

//Ball[] ballGroup = new Ball[10];
//int pos = 0;

void setup() {
    size(1400,700);
}

void draw() {
    background(70,30,50);
    
    for (Ball theBall : ballGroup) {
        theBall.move();

        //Check collision
        for (Ball otherBall : ballGroup) {
            if (theBall != otherBall) {
                theBall.checkCollision(otherBall);
            }
        }
        
        theBall.display();

    }
    
}

void mousePressed() {
    // Creates a new object at the end of the ArrayList
    ballGroup.add(new Ball(mouseX, mouseY, 100, width, height, false));

    // //Creates a new object at this array position
    // if (pos < ballGroup.length) {
    //     ballGroup[pos] = new Ball(mouseX, mouseY, 100);
    //     pos++;
    // }
}

void keyPressed() {
    if (key == 'j'){
        // true because it is infected
        ballGroup.add(new Ball(width/2, height/2, 50, width,height, true));
    }
}




