import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jean K
 */
public class Programa extends JFrame{
    private int codigo;
    private char caracter;
    public Programa(Componentes comp){
        JOptionPane.showMessageDialog(rootPane, "Este programa muestra el código ASCII de un carácter dado", "Bienvenido", 3);
        caracter=JOptionPane.showInputDialog("Inserte carácter").charAt(0);
        
        codigo= (int)caracter;
        JOptionPane.showMessageDialog(rootPane,"El código correspondiente es: "+codigo, "Resultado", 3);
        System.exit(0);
    }
}
