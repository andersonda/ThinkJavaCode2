public class ArraysCS142{
  public static void main(String[] args){
    int[] someInts = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println("Length of the array: " + someInts.length);
    System.out.println("First element: " + someInts[0]);
    System.out.println("Second element: " + someInts[1]);
    System.out.print("The values of the array are: ");
    for(int i = 0; i < someInts.length; i++){
      System.out.print(someInts[i] + " ");
    }
    System.out.println();
    System.out.println("Last element: " + someInts[someInts.length - 1]);
    System.out.println("Sum of the elements in the array: " + sum(someInts));
    System.out.println("The largest element of the array: " + max(someInts));
    System.out.println("The smallest element of the array: " + min(someInts));
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
}
