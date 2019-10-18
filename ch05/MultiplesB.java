public class MultiplesB{
  public static void main(String[] args){
    multiples(100, 100);
  }

  public static void multiples(int n, int count) {
    int multiple = n; // keeps track of the current multiple
    int number = 1; // keeps track of how many multiples printed so far
    while (count >= number) {
      System.out.println(multiple);
      number++;
      multiple = multiple + n; // No need to multiply!
    }
  }
}
