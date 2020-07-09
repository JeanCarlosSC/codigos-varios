public class Deck{
  
	private Card[] carta = new Card[52];
	
	public Deck(){
	  for(int i = 0; i < 52; i++){
	    carta[i] = new Card("Ace",i,"King");//Lo hice de esta manera porque no reconozco los valores correspondientes ni las reglas del juego establecidas
	  }
	}
  
  public Card Draw(){
    return carta[0];
  }
  
  public void shuffle(){//una vez más, sin estilo de juego, resetearé a la forma inicial
    for(int i = 0; i < 52; i++){
	    carta[i] = new Card("Ace",i,"King");
	  }
  }
  
}