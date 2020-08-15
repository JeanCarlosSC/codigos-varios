public class Player{
  
  int vida;
  int puntaje;
  String nombre;
  double ataque;
  
  public Player(){
    vida = 3;
    puntaje = 0;
    nombre = "Carla";
    ataque = 10.0;
  }
  
  public Player(String name){
    nombre = name;
  }
  
  public static void printTypeObject(){
    System.out.print("Player");
  }
  
  public void restarVida(){
    this.vida -= 1;
  }
  
  public void sumarAtaque(){
    this.ataque += 2.5;
  }
  
}