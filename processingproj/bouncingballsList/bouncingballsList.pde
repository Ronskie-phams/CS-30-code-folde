











//Declaring the object
ArrayList <Ball> ballGroup= new ArrayList<Ball>();


void setup(){
     size(1400,700);
   
}

                
void draw(){
 background(70,30,50);
 
 
 for (int i = 0; i<ballGroup.size(); i++){
   
    ballGroup.get(i).display().move();
 }


}

void mousePressed(){
    // creates a new object at this array position
    ballGroup.add(new Ball ( mouseX,mouseY,100)); // creates new object at the end of the array list


  // if (pos<ballGroup.length){
  //   ballGroup[pos] = new Ball(mouseX,  mouseY, 100);
  //      pos++;

  }








