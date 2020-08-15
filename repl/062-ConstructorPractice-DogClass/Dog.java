public class Dog{
  
  String name;
  String breed;
  int weight;
  
  public Dog(String name, String breed, int weight){
    this.name = name;
    this.weight = weight;
    this.breed = breed;
  }
  
  public Dog(String name, int weight){
    this.name = name;
    this.weight = weight;
    this.breed = "Mutt";
  }
}