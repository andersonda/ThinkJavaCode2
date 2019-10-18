public class Exponent {

  public static void main(String[] args){
    System.out.println(pow(3, 2));
    System.out.println(pow(2, 8));
  }

  public static int pow(int a, int b){
    int count = 0; // how many times we have multiplied "a"
    int result = 1; // the result so far
    while(count < b){
      result = result * a;
      count++;
    }
    return result;
  }

  // alternative solution
  // public static int pow(int a, int b) {
  //   int result = 1;
  //   while (b >= 1) {// multiply as long as b is positive
  //     result = a * result; // do some multiplication!
  //     b--; // reduce to a smaller problem!
  //   }
  //   return result;
  // }
}
