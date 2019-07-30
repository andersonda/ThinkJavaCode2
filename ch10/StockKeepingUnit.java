public class StockKeepingUnit{
  private String name;
  private double price;

  public StockKeepingUnit(String name, double price){
    if(price < 0){
      throw new IllegalArgumentException();
    }

    this.name = name;
    this.price = price;
  }

  public String getName(){ return this.name; }
  public double getPrice(){ return this.price; }

  public void setPrice(double price){
    if(price > 0){
      this.price = price;
    }
  }
}
