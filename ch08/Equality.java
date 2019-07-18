import java.util.Arrays;
// David Anderson
public class Equality{

  public static void main(String[] args){
    // testing == with objects
    int[] a = {1, 2, 3};
    int[] b = {1, 2, 3};
    int[] c = {1, 2, 3, 4};
    System.out.println(a == b); // incorrect
    System.out.println(Arrays.equals(a, b)); // correct
    System.out.println(equals(a, b));
    System.out.println(equals(a, c));
    System.out.println(contains(a, 1));
    System.out.println(contains(a, 4));
  }

  public static boolean contains(int[] a, int n){
    if(a == null){
      return false;
    }

    for(int i = 0; i < a.length; i++){
      if(a[i] == n){
        return true;
      }
    }

    return false;
  }

  public static boolean equals(int[] a, int[] b){
    // If a == b, the arrays are equal.
    if (a == b) return true;
    // At this point, if a or b is null, the arrays aren't equal.
    if (a == null || b == null) return false;

    if(a.length != b.length){
      return false;
    }

    // check all array elements for equality
    for(int i = 0; i < a.length; i++){
      if(a[i] != b[i]){
        // found 2 elements in a and b that do not match. The arrays are not equal!
        return false;
      }
    }

    // all characters match. the arrays are equal!
    return true;
  }

  public static boolean equals(double[] a, double[] b){
    // If a == b, the arrays are equal.
    if (a == b) return true;
    // At this point, if a or b is null, the arrays aren't equal.
    if (a == null || b == null) return false;

    if(a.length != b.length){
      return false;
    }

    // check all array elements for equality
    for(int i = 0; i < a.length; i++){
      if(a[i] != b[i]){
        // found 2 elements in a and b that do not match. The arrays are not equal!
        return false;
      }
    }

    // all characters match. the arrays are equal!
    return true;
  }

  public static boolean equals(boolean[] a, boolean[] b){
    // If a == b, the arrays are equal.
    if (a == b) return true;
    // At this point, if a or b is null, the arrays aren't equal.
    if (a == null || b == null) return false;

    if(a.length != b.length){
      return false;
    }

    // check all array elements for equality
    for(int i = 0; i < a.length; i++){
      if(a[i] != b[i]){
        // found 2 elements in a and b that do not match. The arrays are not equal!
        return false;
      }
    }

    // all characters match. the arrays are equal!
    return true;
  }
}
