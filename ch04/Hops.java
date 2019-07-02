public class Hops{

  public static void main(String[] args){
    printNumHopsPouches(0);
    printNumHopsPouches(1);
    printNumHopsPouches(100);
  }

  // cases are mutually exclusive, neededHopsPouches is either 0, 1, or < 1
  public static void printNumHopsPouches(int neededHopsPouches){
    if(neededHopsPouches == 0){
      System.out.println("No hops".);
    }
    else if(neededHopsPouches == 1){
      System.out.println("One pouch of hops.");
    }
    else{
      System.out.println(neededHopsPouches + " pouches of hops.");
    }
  }
}
