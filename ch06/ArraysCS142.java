import java.util.Arrays;

public class ArraysCS142{
  public static void main(String[] args){
    int[] someInts = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println("Length of the array: " + someInts.length);
    System.out.println("First element: " + someInts[0]);
    System.out.println("Second element: " + someInts[1]);
    System.out.print("The values of the array are: ");
    // could be replaced by Arrays.toString(someInts)
    for(int i = 0; i < someInts.length; i++){
      System.out.print(someInts[i] + " ");
    }
    System.out.println();
    System.out.println("Last element: " + someInts[someInts.length - 1]);
    System.out.println("Sum of the elements in the array: " + sum(someInts));
    System.out.println("The largest element of the array: " + max(someInts));
    System.out.println("The smallest element of the array: " + min(someInts));

    System.out.println("the array before doubling: " + Arrays.toString(someInts));
    // double each element
    for(int i = 0; i < someInts.length; i++){
      // we can modify array elements just like variables.
      // arrays can be thought of as a collection of variables with the same type
      someInts[i] = someInts[i] * 2;
    }
    System.out.println("the array after doubling: " + Arrays.toString(someInts));

    int[] otherInts = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1};// new array has a duplicate

    System.out.println("Does " + Arrays.toString(someInts) + " contain any duplicates?: "
      + containsDuplicates(someInts));
    System.out.println("Does " + Arrays.toString(otherInts) + " contain any duplicates?: "
      + containsDuplicates(otherInts));
  }

  public static int sum(int[] array){
    int sum = 0;
    for(int i = 0; i < array.length; i++){
      sum += array[i];
    }
    return sum;
  }

  public static int max(int[] array){
    int largestSoFar = array[0];
    for(int i = 1; i < array.length; i++){
      if(array[i] > largestSoFar){
        largestSoFar = array[i];
      }
    }
    return largestSoFar;
  }

  public static int min(int[] array){
    int smallestSoFar = array[0];
    for(int i = 1; i < array.length; i++){
      if(array[i] < smallestSoFar){
        smallestSoFar = array[i];
      }
    }
    return smallestSoFar;
  }

  public static boolean containsDuplicates(int[] array){
    for(int left = 0; left < array.length; left++){
      for(int right = left + 1; right < array.length; right++){
        // System.out.println("i = " + i + " j = " + j);
        if(array[left] == array[right])
          return true; // found a duplicate!
      }
    }
    // looped through the whole array, found no duplicates
    return false;
  }
}
