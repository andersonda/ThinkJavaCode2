public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(0, 0, 3);
        shapes[1] = new Rectangle(new java.awt.Rectangle(-1, -1, 4, 5));
        shapes[2] = new Circle(1, 1, 2);
        double area = 0;
        for (int i = 0; i < shapes.length; i++) {
            area += shapes[i].area();
        }
        System.out.println("Total area: "+area);
    }
}
