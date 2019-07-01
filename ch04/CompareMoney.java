public class CompareMoney{

  public static void main(String[] args){

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
      System.out.println("Both children have the same amount.")
    }
  }
}
