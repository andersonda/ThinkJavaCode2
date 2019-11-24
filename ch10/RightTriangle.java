public class RightTriangle extends Shape {
  private int x;
  private int y;
  private int width;
  private int height;
  private double hypotenuse;

  public RightTriangle(int x, int y, int width, int height){
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    hypotenuse = Math.sqrt(width * width + height * height);
  }

  public int getX(){
    return x;
  }

  public int getY(){
    return y;
  }

  public void setCoordinates(int x, int y){
    this.x = x;
    this.y = y;
  }

  public int getWidth(){
    return width;
  }

  public void setWidth(int width){
    this.width = width;
    setHypotenuse();
  }

  public int getHeight(){
    return height;
  }

  public void setHeight(int height){
    this.height = height;
    setHypotenuse();
  }

  public double getHypotenuse(){
    return hypotenuse;
  }

  private void setHypotenuse(){
    hypotenuse = Math.sqrt(width * width + height * height);
  }

  @Override
  public double area(){
    return width * height / 2;
  }

  @Override
  public double perimeter(){
    return width + height + hypotenuse;
  }

  public Rectangle toRectangle(){
    return new Rectangle(x, y, width, height);
  }
}
