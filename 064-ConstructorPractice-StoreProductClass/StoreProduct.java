public class StoreProduct{
  
  //class variables
  String label;
  int price;
  String category;
  boolean hasExpiration;
  int stock;
  
  //constructors
  public StoreProduct(String label, int price, String category, boolean hasExpiration, int stock){
    this.label = label;
    this.price = price;
    this.category = category;
    this.hasExpiration = hasExpiration;
    this.stock = stock;
  }
  
  public StoreProduct(String label, int price, int stock){
    this.label = label;
    this.price = price;
    this.category = "misc";
    this.hasExpiration = false;
    this.stock = stock;
  }
  
  public StoreProduct(String label, int price){
    this.label = label;
    this.price = price;
    this.category = "misc";
    this.hasExpiration = false;
    this.stock = 0;
  }
  
  public StoreProduct(String label, int price, String category, boolean hasExpiration){
    this.label = label;
    this.price = price;
    this.category = category;
    this.hasExpiration = hasExpiration;
    this.stock = 0;
  }
  
  //Methods
  public void expired(boolean hasExpired){
    if(hasExpired) this.stock = 0;
  }
  
  public boolean sale(int quantity){
    if(stock >= quantity){
      stock -= quantity;
      return true;
    }
    return false;
  }
  
  public double getDiscountedPrice(double discount){
    return price * (1 - discount);
  }
  
}