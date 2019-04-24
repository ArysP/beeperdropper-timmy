import kareltherobot.*;


public class BeeperDropper implements Directions {

    public static void main(String [] args) {

  BeeperDropper timmy = new BeeperDropper (1, 1, North, infinity);
  timmy.move();
    } // end main . . . 

    // the following static block is executed first, so that we can setup
    // the world and other housekeeping chores.
    static {
        World.setDelay(100); // delay set to a full second . . . 
        // The name of the world you read might change as well . . .
        World.readWorld("default.kwld");
        World.setVisible(true);
        World.showSpeedControl(true);
    } // end static . . .

} // end class beeperdropper