public class Stock{
  
  //Class variables
  String tickerSymbol;
  String companyName;
  int price;
  double percentChange;
  int totalShares;
  long marketCap;
  
  //constructor
  public Stock(String tickerSymbol, String companyName, int price, int totalShares){
    this.tickerSymbol = tickerSymbol.toUpperCase();
    this.companyName = companyName;
    this.price = price;
    this.totalShares = totalShares;
    this.percentChange = 0;
    this.marketCap = totalShares * price;
  }
  
  //methods
  public void adjustPrice(int change){
    price += change;
    this.percentChange = (price / ((double) price - change)) - 1;
    this.marketCap = totalShares * price;
  }
  
  public String toString(){
    return String.format("Ticker Symbol: %s\nCompany: %s.\nCurrent Price: %d (+%.1f%)\nMarket Cap: $%d", tickerSymbol, companyName, price, percentChange, marketCap);
  }
  
}