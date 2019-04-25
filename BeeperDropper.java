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

  } // end-goToOrigin
  
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
 }
 
 public void  zigMove() { 
 // Pre-condition: facingWest
 if ( frontIsClear() ) 
 { zigLeftUp ();
 }
 else 
 {advanceToNextDiagonal();
 }
 }
 
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
 
public void  lineRoom() {
  putBeeper();
  move();
  putBeeper();
  faceNorth();
  move();
}


}
 // end classSkeleton