public class Island {

  public static void main(String[] args){

    // location of center of circle, as well as radius
    int centerX = 100; // Island center x
    int centerY = 200; // Island center y
    int radius = 25;   // Island radius

    // parachuting position
    int x = 105;
    int y = 90;
    System.out.println("Parachuting at (" + x + ", " + y + ")");

    // A wind blows us +5 x and -10 y
    x = x + 5;
    y = y - 10;
    System.out.println("A wind blew us to (" + x + ", " + y + ")");

    // calculate the distance from our landing point to the center of the circle
    double distance = Math.sqrt((x - centerX)*(x - centerX) +
                            (y - centerY)*(y - centerY));

    if (distance > radius) {
      System.out.println("Oh no, you landed in the water!");
    }
    else {
      if (x >= 100 && x <= 110 && y >= 180 && y <= 195 ) {
        y = y - 4; // Slide -4 units
        System.out.println("You hit the patch of ice and slid to (" + x + ", " + y + ")");
      }
      if (x == 105 && y == 190) { // At the treasure
        System.out.println("You got the treasure!");
      }
    }
  }
}
