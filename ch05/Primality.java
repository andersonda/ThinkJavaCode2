public class Primality{
  public static void main(String[] args){
    System.out.println("Is 1 prime? " + isPrime(1));
    System.out.println("Is 2 prime? " + isPrime(2));
    System.out.println("Is 5 prime? " + isPrime(5));
    System.out.println("Is 8 prime? " + isPrime(8));
    System.out.println("Is 37 prime? " + isPrime(37));
  }

  public static boolean isPrime(int n) {

    // special case (1 is neither prime or composite, by definition)
    if(n == 1){
      return false;
    }

    int d = 2; // smallest divisor
    while (d < n) {
        // try dividing n by the current divisor
        if (n % d == 0) {
            return false;
        }
        // set ourselves up for the next possible divisor
        d++;
    }

    // no factors divided evenly into n, it must be prime
    return true;
  }
}
