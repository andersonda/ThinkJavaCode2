public class Exponent {

  public static void main(String[] args){
    System.out.println(pow(3, 2));
    System.out.println(pow(2, 8));
  }

  public static int pow(int a, int b) {
    int result = 1;
    while (b >= 1) {// multiply as long as b is positive
      result = a * result; // do some multiplication!
      b--; // reduce to a smaller problem!
    }
    return result;
  }
}
