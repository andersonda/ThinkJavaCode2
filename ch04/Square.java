// David Anderson
public class Square{

  public static void main(String[] args){
      System.out.println("Is (5, 5) inside a square of size 5?: " + isInSquare(5, 5, 5));
      System.out.println("Is (6, 5) inside a square of size 5?: " + isInSquare(6, 5, 5));
      System.out.println("Is(0, 0) inside a square of size 100?: " + isInSquare(0, 0, 100));
      System.out.println("Is -99, 0 inside a square of size 100?: " + isInSquare(-99, 0, 100));
      System.out.println("Is (50, 61) inside a square of size 75?: " + isInSquare(50, 61, 75));
  }

  public static boolean isInSquare(int x, int y, int size){
    return x >= 0 && y >=0 && x <= size && y <= size;
  }
}
