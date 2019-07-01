// David Anderson
public class LogicIntro{
  public static void main(String[] args){
    System.out.println("5 is a dozen?: " + isDozen(5));
    System.out.println("100 is a dozen?: " + isDozen(100));
    System.out.println("12 is a dozen?: " + isDozen(12));
    //System.out.println("13 is a dozen?: " + isDozen(13));
  }

  public static boolean isDozen(int amount){
    return amount == 12;// || amount == 13;
  }
}
