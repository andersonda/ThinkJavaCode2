// David Anderson
public class BooleanEvaluation{

  public static void main(String[] args){
    int x = 1;
    int y = 2;
    boolean xGTy = x > y; // determine whether x > y
    boolean xLTy = x < y; // determine whether x < y
    boolean xGTEy = x >= y;// determine whether x >= y;
    boolean xLTEy = x <= y; // determine whether x <= y;
    boolean xEy = x == y; // determine whether x == y;
    boolean xNEy = x != y;

    System.out.println("x greater than y: " + xGTy);
    System.out.println("x less than y: " + xLTy);
    System.out.println("x greater than or equal to y: " + xGTEy);
    System.out.println("x less than or equal to y: " + xLTEy);
    System.out.println("x equal to y: " + xEy);
    System.out.println("x not equal to y: " + xNEy);
  }
}
