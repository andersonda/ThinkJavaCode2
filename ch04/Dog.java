// David Anderson
public class Dog{

  public static void main(String[] args){
      System.out.println("Dog is not fed, has not been walked, has not been played with. isDogHappy?: " + isDogHappy(false, false, false));
      System.out.println("Dog is not fed, has not been walked, has been played with. isDogHappy?: " + isDogHappy(false, false, true));
      System.out.println("Dog is not fed, has been walked, has not been played with. isDogHappy?: " + isDogHappy(false, true, false));
      System.out.println("Dog is not fed, has been walked, has been played with. isDogHappy?: " + isDogHappy(false, true, true));
      System.out.println("Dog is fed, has not been walked, has not been played with. isDogHappy?: " + isDogHappy(true, false, false));
      System.out.println("Dog is fed, has not been walked, has been played with. isDogHappy?: " + isDogHappy(true, false, true));
      System.out.println("Dog is fed, has been walked, has not played with. isDogHappy?: " + isDogHappy(true, true, false));
      System.out.println("Dog is fed, has been walked, has not been played with. isDogHappy?: " + isDogHappy(true, true, true));
  }

  // dog is happy whenever it has been fed and has either been walked or played with (or both)
  public static boolean isDogHappy(boolean fed, boolean walked, boolean playedWith) {
      return fed && (walked || playedWith);
  }
}
