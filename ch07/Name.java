import java.util.Scanner;

public class Name {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    System.out.print("What is your first name? ");
    String firstName = kbd.nextLine();
    System.out.print("What is your last name? ");
    String lastName = kbd.nextLine();
    String fullName = firstName + lastName;

    System.out.println("Your first name has " + firstName.length() + " characters in it.");
    System.out.println("Your last name has " + lastName.length() + " characters in it.");


    System.out.print("Your name reversed is: ");
    for(int i = 0; i < fullName.length(); i++){
      System.out.print(fullName.charAt(fullName.length() - 1 - i));
    }
    System.out.println();

    int length = firstName.length() > lastName.length() ? firstName.length() : lastName.length();
    System.out.print("Your name zipped is: ");
    for(int i = 0; i < length; i++){
        System.out.print(firstName.charAt(i % firstName.length()));
        System.out.print(lastName.charAt(i % lastName.length()));
    }
    System.out.println();

    kbd.close();
  }
}
