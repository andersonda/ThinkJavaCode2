public class Primes {
  public static void main(String[] args){
    int n = 100; // checking if all the values < 100 are prime
    boolean[] hasFactor = new boolean[n];

    for (int i = 2; i < n; i++) {
      if (!hasFactor[i]) {
        System.out.println(i + " is prime");
        for (int j = i + i; j < n; j = j + i) {
          hasFactor[j] = true; // i is a factor of j
        }
      }
    }
  }
}
