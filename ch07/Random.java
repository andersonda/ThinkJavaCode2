import java.util.Arrays;

public class Random{
  public static void main(String[] args){
    // testing Math.random()
    System.out.println(Math.random());
    System.out.println(Math.random());
    System.out.println(Math.random());
    // testing using Math.random to generate random numbers between 0 and 4
    System.out.println((int)(Math.random()* 5));
    System.out.println((int)(Math.random()* 5));
    System.out.println((int)(Math.random()* 5));
    // testing secret code generation (5 digits, each digit between 0 and 5)
    System.out.println(Arrays.toString(createSecretCode(5, 6)));
  }

  public static int[] createSecretCode(int length, int numColors) {
  	int[] code = new int[length];
  	for (int i = 0; i < length; i++) {
  		code[i] = (int)(Math.random()*numColors) + 1;
  	}
  	return code;
  }
}
