/* Hoppy Beverage Problem

  **************************
  Recipe:
  **************************
  15 oz of hops
  12.5 lbs of malt
  1 packet of yeast

  Recipe brews 5 gallons
    of "Hoppy Beverage"

  **************************
  Prices:
  **************************
  2 oz pouch of hops: $3.99
  malt: $1.50 per lb
  yeast: $2.59 per pouch

*/
public class HoppyBeverage {

  public static final int GALLONS_PER_BATCH = 5;

  public static void main(String[] args){
    System.out.println("Testing pouchesOfHops...");
    System.out.println(pouchesOfHops(1));
    System.out.println(pouchesOfHops(5));
    System.out.println(pouchesOfHops(10));
    System.out.println();

    System.out.println("Testing poundsOfMalt...");
    System.out.println(poundsOfMalt(1));
    System.out.println(poundsOfMalt(5));
    System.out.println(poundsOfMalt(10));
    System.out.println();

    System.out.println("Testing packetsOfYeast...");
    System.out.println(packetsOfYeast(1));
    System.out.println(packetsOfYeast(5));
    System.out.println(packetsOfYeast(10));
    System.out.println();


    System.out.println("Testing totalCost...");
    System.out.println("$" + totalCost(5));
    System.out.println("$" + totalCost(7));
    System.out.println("$" + totalCost(10));
    System.out.println("$" + totalCost(100));

  }

  // given the desired number of gallons, returns the required number of hops pouches
  public static int pouchesOfHops(double gallons){
    int ozPerBatch = 15;
    int ozPerPouch = 2;
    return (int) Math.ceil(gallons * ozPerBatch / GALLONS_PER_BATCH / ozPerPouch);
  }

  // given the desired number of gallons, returns the required pounds of malt
  public static double poundsOfMalt(double gallons){
    double lbsPerBatch = 12.5;
    return gallons * lbsPerBatch / GALLONS_PER_BATCH;
  }

  // given the desired number of gallons, returns the required packets of yeast
  public static int packetsOfYeast(double gallons){
    return (int) Math.ceil(gallons / GALLONS_PER_BATCH);
  }

  // given the desired number of gallons, returns the required pouches of yeast
  public static double totalCost(double gallons){
    double pricePerPouchOfHops = 3.99;
    double pricePerPoundOfMalt = 1.50;
    double pricePerPacketOfYeast = 2.59;

    return pricePerPouchOfHops * pouchesOfHops(gallons) + pricePerPoundOfMalt * poundsOfMalt(gallons) + pricePerPacketOfYeast * packetsOfYeast(gallons);
  }
}
