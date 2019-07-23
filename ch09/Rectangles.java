import java.awt.Rectangle;

public class Rectangles{
  public static void main(String[] args){
      // special method called a constructor: constructs an object from the class blueprint
      Rectangle r1 = new Rectangle(0, 0, 10, 100);
      Rectangle r2 = new Rectangle(0, 0, 5, 50);

      // does r2 exist within the boundaries of r1?: YES
      System.out.println(r1.contains(r2));
      // does r1 exist within the bounaries of r2?: NO
      System.out.println(r2.contains(r1));

      // are r1 and r2 the same rectangle?: NO, they differ in width and height
      System.out.println(r1.equals(r2));

      Rectangle r3 = new Rectangle(0, 0, 10, 100);
      // are r1 and r3 the same rectangle? YES
      System.out.println(r1.equals(r3));
  }
}
