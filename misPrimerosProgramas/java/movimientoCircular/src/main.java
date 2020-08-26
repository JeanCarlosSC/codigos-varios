import javax.swing.*;
/**
 *
 * @author Jean K
 */
public class main {
    private Vista vista;
    private Logica logica;
    
    public static void main(String args[]){
        Logica logica = new Logica();
        Vista vista = new Vista(logica);
    }    
}