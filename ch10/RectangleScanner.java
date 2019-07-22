import java.awt.Rectangle;
import java.util.Scanner;

public class RectangleScanner{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    // System.out.println("Please enter a rectangle width:");
    // int width = s.nextInt();
    // System.out.println("Please enter a rectangle height:");
    // int height = s.nextInt();
    // System.out.println("Please enter the upper left x coordinate:");
    // int x = s.nextInt();
    // System.out.println("Please enter the upper left y coordinate:");
    // int y = s.nextInt();
    // Rectangle r = new Rectangle(x, y, width, height);

    Rectangle r1 = inputRectangle(s);
    Rectangle r2 = inputRectangle(s);
    Rectangle r3 = r1.intersection(r2);
    System.out.println(r1);
    System.out.println(r2);
    System.out.println(r3);
  }

  public static Rectangle inputRectangle(Scanner s){
    System.out.println("Please enter a rectangle width:");
    int width = s.nextInt();
    System.out.println("Please enter a rectangle height:");
    int height = s.nextInt();
    System.out.println("Please enter the upper left x coordinate:");
    int x = s.nextInt();
    System.out.println("Please enter the upper left y coordinate:");
    int y = s.nextInt();
    return new Rectangle(x, y, width, height);
  }
}
