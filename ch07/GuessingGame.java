import java.util.Arrays;
import java.util.Scanner;

public class GuessingGame{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int length = 4;
    int differentDigits = 6;
    int[] secretCode = createSecretCode(length, differentDigits);

    while(true){
      // System.out.println(Arrays.toString(secretCode));
      System.out.print("Guess the secret code! Guesses should be of length "
        + length + " and contain the digits 1-" + differentDigits + ":");
      String input = scanner.nextLine();
      if (input.length() == length) {
        char[] characters = input.toCharArray();
        int[] guess = new int[length];
        for (int i = 0; i < characters.length; i++) {
          if(characters[i] >= '1' && characters[i] <= '0' + differentDigits) {
            guess[i] = characters[i] - '0';
          }
          else{
            System.out.println(characters[i] + " is not a valid guess character! " +
              "Must be a digit between 1 and " + differentDigits);
            break;
          }
        }

        int numBlackPegs = countBlackPegs(secretCode, guess);
        if(numBlackPegs == length){
          System.out.println("You guessed the secret code!");
          break;
        }
        else{
          int numWhitePegs = countWhitePegs(secretCode, guess);
          System.out.println("Number of correct characters in correct positions: "
            + numBlackPegs);
          System.out.println("Number of correct characters in incorrect positions: "
            + numWhitePegs);
        }
      }
      else {
        System.out.println("Input is the wrong length! Expected length " + length +
          " but got length " + input.length());
      }
    }
  }

  public static int[] createSecretCode(int length, int numColors) {
  	int[] code = new int[length];
  	for (int i = 0; i < length; i++) {
  		code[i] = (int)(Math.random()*numColors) + 1;
  	}
  	return code;
  }

  public static int countBlackPegs(int[] code, int[] guess) {
    // Assume arrays are the same length.
    // Loop through the elements of the arrays and count the ones that match.
    int count = 0;
    for (int i = 0; i < code.length; i++) {
      if (code[i] == guess[i]) {
        count = count + 1;
      }
    }
    return count;
  }

  public static int countWhitePegs(int[] code, int[] guess) {
    // Was this code digit matched?
    boolean[] wasCodeDigitMatched = new boolean[code.length];
    int count = 0;
    // Look at each of the guess digits
    for (int i = 0; i < guess.length; i++) {
        if (guess[i] == code[i]) continue; // If this guess was a perfect match, skip it
        // Try to match guess digit against each of the code digits
        for (int j = 0; j < code.length; j++) {
            if (guess[i] == code[j] // If there is a match
            && code[j] != guess[j] // and it's not a perfect match
            && !wasCodeDigitMatched[j]) { // and it wasn't already matched
                count++; // We have found a white-peg match!
                wasCodeDigitMatched[j] = true; // Don’t match the code digit again!
                break; // Don't keep trying to match this guess digit!
            }
        }
    }
    return count;
  }
}
