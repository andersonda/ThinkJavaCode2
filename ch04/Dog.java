// David Anderson
public class Dog{

  public static void main(String[] args){
      System.out.println("Dog is not fed, has not been walked, has not been played with. dogIsHappy?: " + dogIsHappy(false, false, false));
      System.out.println("Dog is not fed, has not been walked, has been played with. dogIsHappy?: " + dogIsHappy(false, false, true));
      System.out.println("Dog is not fed, has been walked, has not been played with. dogIsHappy?: " + dogIsHappy(false, true, false));
      System.out.println("Dog is not fed, has been walked, has been played with. dogIsHappy?: " + dogIsHappy(false, true, true));
      System.out.println("Dog is fed, has not been walked, has not been played with. dogIsHappy?: " + dogIsHappy(true, false, false));
      System.out.println("Dog is fed, has not been walked, has been played with. dogIsHappy?: " + dogIsHappy(true, false, true));
      System.out.println("Dog is fed, has been walked, has not played with. dogIsHappy?: " + dogIsHappy(true, true, false));
      System.out.println("Dog is fed, has been walked, has not been played with. dogIsHappy?: " + dogIsHappy(true, true, true));
  }

  // dog is happy whenever it has been fed and has either been walked or played with (or both)
  public static boolean dogIsHappy(boolean fed, boolean walked, boolean playedWith) {
      return fed && (walked || playedWith);
  }
}
