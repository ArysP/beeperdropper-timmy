import kareltherobot.*;
import kareltherobot.Robot;

public class BeeperDropper extends Robot {

   public BeeperDropper(int street, int avenue, Direction direction, int beepers) {
        super(street, avenue, direction, beepers);
    }
 // robot Turn Right
    public void turnRight() {

        turnLeft();
        turnLeft();
        turnLeft();

    } // end turnRight
 
 //  robot face west
 public void faceWest() {
    while (!facingWest()){
      turnLeft();}
 } // end_faceWest

 // robot face south
 public void faceSouth() {    
    while (!facingSouth()){
      turnLeft();} 
 }  // end-faceSouth

 //robot face east
 public void faceEast() {   
    while (!facingEast()){
    turnLeft();}  
 }//end-faceEast
  
    public void faceNorth() {   
      while (!facingNorth()){
    turnLeft();}  
 } //end-faceNorth

 // move the robot to a wall
 public void goToWall() {
    while (frontIsClear()){
      move();
    }
 } // end-goToWall
 
 public void goToOrigin() {
    faceWest();
    goToWall();
    faceSouth();
    goToWall();
    faceNorth();
    faceWest();
    goToWall();
    faceSouth();
    goToWall();
    faceNorth();

  } // end-goToOrigin
  
 //northwest diagonal 
  public void zigLeftUp () 
 { // Precondition: facingWest and frontIsClear
  // Postcondition: facingWest
    if (frontIsClear() ){ move();
    }
  else { putBeeper();}
  turnRight();
  if (frontIsClear() ) { move();
  }
  else { putBeeper();
 }
   turnLeft();
 }

 //southeast diagonal
 public void zagDownRight() 
 { // Precondition: facingSouth and frontIsClear
  // Postcondition: facingSouth 
   if (frontIsClear() ) {move();
   }
   else { putBeeper();}
  turnLeft();
  if (frontIsClear() ) {move();
  }
   else { putBeeper();
}
  turnRight();
 }
 
 //zig zag until robot finds room
 public void findRoom() 
 { goToOrigin();
 faceWest();
 while (  ! nextToABeeper() ) 
 { if ( facingWest() ) 
  { zigMove();
  }
  else 
  { zagMove();
  }
 }
 faceWest();
 }
 
 //Northwest diagonal until wall
 public void  zigMove() { 
 // Pre-condition: facingWest
 if ( frontIsClear() ) 
 { zigLeftUp ();
 }
 else 
 {advanceToNextDiagonal();
 }
 }
 
 //southeast diagonal until wall
 public void  zagMove() { 
 // Pre-condition: facingSouth()
 if ( frontIsClear() ) 
 { zagDownRight();
 }
 else 
 { advanceToNextDiagonal();
 }
 }

 public void  turnAround() { 
   turnLeft();
   turnLeft();
 }
 
//sets robot for zig or zag 
 public void  advanceToNextDiagonal() { 
   if ( facingWest() ) {
  faceNorth();
 }
 else { 
   faceEast();
 }
 if (frontIsClear() ) {
 move();
 turnAround();
}
 else {
   putBeeper();
} 
}
 
 //traces wall with beepers
 public void  lineRoom() {
   while (nextToABeeper()){ 
checkRight();
     }
 }

//function to check for wall to the right and place beeper/return to origin if it encounters an area it has already beepered
public void checkRight() {
  turnRight();
  if (frontIsClear()){
    move();
  } else
  { 
    hugWall();
    move();
  }
if (nextToABeeper()) {
    goToOrigin();
    turnOff();
  }  
if (!nextToABeeper()) {
    putBeeper();
  }
  } 
  
//function to keep the robot oriented along the wall
public void hugWall() {
  while (!frontIsClear()) {
    turnLeft();
  }
}
                    

}
 // end classSkeleton