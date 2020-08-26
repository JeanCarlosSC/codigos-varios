import java.lang.Math;
import java.util.concurrent.TimeUnit;

class Logica {

    public int Cx(float i) {
           int j=(int)(225+50*Math.sin(i));
           try{
                Thread.sleep(10);
           }
           catch(InterruptedException ex){
                Thread.currentThread().interrupt();
           }           
           return j;
    }
    
    public int Cy(float i){
            int j=(int)(225+50*Math.cos(i));
            return j;
    }
    
    public Logica() {
        
        
    }
    
}
