public class References{
  public static void main(String[] args){
    int[] x = {3};
    int[] y = x; // Copy x's reference value into y
    int a = 3;
    int b = a; // Copy a's primitive value into b
    x[0] = 4;
    a = 4;
    System.out.println(x[0]); // Prints 4
    System.out.println(y[0]); // Also prints 4 (same object as x)
    System.out.println(a); // Prints 4
    System.out.println(b); // Prints 3 (b held a copy of a's value)

    // prints out the reference value for x and y
    System.out.println(x);
    System.out.println(y);
  }
}
