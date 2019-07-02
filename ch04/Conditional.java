/**
 * Examples from Chapter 5.
 */
public class Conditional {

    public static void main(String[] args) {
      printFactsAboutX(5);
      printFactsAboutX(6);
      printFactsAboutX(0);
      printFactsAboutX(-1000);
    }

    public static void printFactsAboutX(int x){
      // first, check whether x is even or odd
      if (x % 2 == 0) {
          System.out.println(x + " is even");
      }
      else {
          System.out.println(x + " is odd");
      }

      // then, check whether x is positive, negative, or zero
      if (x > 0) {
          System.out.println(x + " is positive");
      }
      else if (x < 0) {
          System.out.println(x + " is negative");
      }
      else {
          System.out.println(x + " is zero");
      }
    }
}
