public class CircleTester{
  public static void main(String[] args) {
    Circle c = new Circle(0, 0, .415);
    System.out.println(c);
    Circle c2 = new Circle(0, 0, .415);
    Circle c3 = new Circle(1, 1, 1.0);
    Circle c4 = new Circle(1, 1, 0.99);
    System.out.println(c.equals(c2)); // true
    System.out.println(c.equals(c3)); // false
    System.out.println(c.intersects(c3)); // true
    System.out.println(c.intersects(c4)); // false
  }
}
