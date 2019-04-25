import kareltherobot.*;


public class application implements Directions {

    public static void main(String [] args) {

  BeeperDropper timmy = new BeeperDropper (1, 1, North, infinity);
  
  timmy.findRoom();
  timmy.lineRoom();
  timmy.turnOff();
     } // end main . . . 

    // the following static block is executed first, so that we can setup
    // the world and other housekeeping chores.
    static {
        World.setDelay(1); // delay set to a full second . . . 
        // The name of the world you read might change as well . . .
        World.readWorld("encircle.kwld");
        World.setVisible(true);
        World.showSpeedControl(true);
    } // end static . . .

} // end class beeperdropper