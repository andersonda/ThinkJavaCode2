public class Rectangle extends Shape {
    public java.awt.Rectangle rect; // Delegating to java.awt.Rectangle
    public Rectangle(java.awt.Rectangle rect) {
        this.rect = rect;
    }

    public Rectangle(int x, int y, int width, int height){
      this.rect = new java.awt.Rectangle(x, y, width, height);
    }

    public double area() {
        return rect.width*rect.height;
    }
    public double perimeter() {
        return 2*(rect.width+rect.height);
    }
}
