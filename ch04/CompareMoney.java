public class CompareMoney{

  public static void main(String[] args){
    compareMoney(1.0, 10.0);
    compareMoney(100.0, 65.50);
    compareMoney(1000.0, 1000.0);
  }

  public static void compareMoney(double aDollars, double bDollars){
    if(aDollars > bDollars){
      System.out.println("Alyssa has " + (aDollars - bDollars) +
                       " more dollars than Bob.");
    }
    if(bDollars > aDollars){
      System.out.println("Bob has " +(bDollars - aDollars)+
                       " more dollars than Alyssa.");
    }
    if(aDollars == bDollars){
      System.out.println("Both children have " + aDollars + " dollars");
    }
  }
}
