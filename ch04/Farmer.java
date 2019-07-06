// David Anderson
public class Farmer{

  public static void main(String[] args){
    // try to move more than one thing
    isMoveLegal(1, 1, 1, 1, 2, 2, 2);
    // try to move the wolf when it isnt on the same side as the boat
    isMoveLegal(2, 1, 1, 1, 1, 1, 1);
    // try to move the goat when it isnt on the same side as the boat
    isMoveLegal(1, 2, 1, 1, 1, 1, 1);
    // try to move the cabbage when it isnt on the same side as the boat
    isMoveLegal(1, 1, 2, 1, 1, 1, 1);
    // try to make a move where the wolf would eat the goat
    isMoveLegal(2, 2, 2, 2, 2, 2, 1);
    // try to make a move where the goat would eat the cabbage
    isMoveLegal(2, 2, 2, 2, 1, 2, 2);
    // make a legal move (move the goat, leaving wolf and cabbage together)
    isMoveLegal(1, 1, 1, 1, 1, 2, 1);
  }

  // no parameter for boatAfter because the boat always moves
  public static boolean isMoveLegal(int wolfBefore, int goatBefore, int cabbageBefore, int boatBefore, int wolfAfter, int goatAfter, int cabbageAfter){

    int numMoving = 0;
    // is the wolf moving?
    if(wolfBefore != wolfAfter){
      // ensure the wolf can actually move (boat must be on the same side)
      if(wolfBefore != boatBefore){
        System.out.println("Cannot move the wolf if the boat isn't on the same side!");
        return false;
      }
      numMoving++;
    }

    // is the goat moving?
    if(goatBefore != goatAfter){
      // ensure the goat can actually move (boat must be on the same side)
      if(goatBefore != boatBefore){
        System.out.println("Cannot move the goat if the boat isn't on the same side!");
        return false;
      }
      numMoving++;
    }

    // is the cabbage moving?
    if(cabbageBefore != cabbageAfter){
      // ensure the cabbage can actually move (boat must be on the same side)
      if(cabbageBefore != boatBefore){
        System.out.println("Cannot move the cabbage if the boat isn't on the same side!");
        return false;
      }
      numMoving++;
    }

    // ensure that only one item is moving
    if(numMoving > 1){
      System.out.println("The boat cannot hold more than one item at a time!");
      return false;
    }

    // switch the boat to the other side
    int boatAfter = boatBefore == 1 ? 2 : 1;

    // ensure the wolf wont eat the goat
    if(wolfAfter == goatAfter && wolfAfter != boatAfter){
      System.out.println("The wolf would eat the goat!");
      return false;
    }

    // ensure the goat wont eat the cabbage
    if(goatAfter == cabbageAfter && goatAfter != boatAfter){
      System.out.println("The goat would eat the cabbage!");
      return false;
    }

    // valid move
    System.out.println("Valid move!");
    return true;
  }
}
