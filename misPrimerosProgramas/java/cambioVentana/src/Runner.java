import java.io.IOException;

/**
 *
 * @author Jean K
 */
public class Runner {
    private Programa programa;
    private Componentes comp;
    
    public Runner()throws IOException{
        comp = new Componentes();
        programa = new Programa(comp);
    }
}
