public class MultiplesA{
  public static void main(String[] args){
    multiples(100, 100);
  }
  
  public static void multiples(int n, int count) {
    int x = 1;
    while (x <= count) {
      int multiple = n*x;
      System.out.println(multiple);
      x++;
    }
  }
}
