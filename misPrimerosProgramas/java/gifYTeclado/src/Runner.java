import java.io.IOException;

/**
 *
 * @author Jean K
 */
public class Runner {
    private Vista vista;
    private Logica logica;
    
    public Runner() throws IOException{
        logica = new Logica();
        vista = new Vista(logica);
    }
}