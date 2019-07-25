// David Anderson
public class Circle{
  double centerX, centerY;
  double radius;

  public Circle(double centerX, double centerY, double radius){
    this.centerX = centerX;
    this.centerY = centerY;
    this.radius = radius;
  }

  public String toString() {
    return "("+centerX+", "+centerY+") radius "+radius;
  }

  public boolean equals(Object object) {
    if (object instanceof Circle) {
        Circle c = (Circle)object;
        return centerX == c.centerX && centerY == c.centerY && radius == c.radius;
    }
    return false;
  }

  public boolean intersects(Circle c) {
    double dx = centerX - c.centerX;
    double dy = centerY - c.centerY;
    double d = Math.sqrt(dx*dx + dy*dy);
    return d <= radius + c.radius;
  }
}
