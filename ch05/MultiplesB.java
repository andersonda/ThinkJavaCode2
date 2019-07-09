public class MultiplesB{
  public static void main(String[] args){
    multiples(100, 100);
  }

  public static void multiples(int n, int count) {
    int multiple = n;
    int number = 1;
    while (count >= number) {
      System.out.println(multiple);
      number++;
      multiple = multiple + n; // No need to multiply!
    }
  }
}
