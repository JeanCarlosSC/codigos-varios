public class Card{
  
  private String name;
  private int value;
  private String suit;
  
  public Card(String n, int v, String s){
    name = n;
    value = v;
    suit = s;
  }
  
  public String getName(){
    return name;
  }
  
  public int getValue(){
    return value;
  }
  
  public String getSuit(){
    return suit;
  }
  
  public String toString(){
    return String.format("%s of %s", name, suit);
  }
  
}