import java.util.Scanner;

public class MoreScanner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int max = 5;

    int input = readInt(scanner, max);
    if(input == -1){
      System.out.println("User input was invalid!");
    }
    else{
      System.out.println("User typed " + input);
    }

    input = readIntWhile(scanner, max);
    System.out.println("User typed " + input);
    scanner.close();
  }

  public static int readInt(Scanner sc, int max){
    System.out.print("Enter an integer between 1 and " + max + ": ");

    int digit = -1;
    if(sc.hasNextInt()){
      digit = sc.nextInt();
      sc.nextLine(); // eat the rest of the line the user typed
    }
    if(digit < 1 || digit > max){
      return -1;
    }

    return digit;
  }

  public static int readIntWhile(Scanner sc, int max){
    int digit = -1;
    while(digit < 1 || digit > max){
      System.out.print("Enter an integer between 1 and " + max + ": ");
      if(sc.hasNextInt()){
        digit = sc.nextInt();
      }
      sc.nextLine(); // eat the rest of the line the user typed
    }

    return digit;
  }
}
