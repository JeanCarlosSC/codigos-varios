import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Jean K
 */
public class Programa extends JFrame{
    private int codigo;
    private char letra;
    private JPanel pFondo;
    
    public Programa(Componentes comp){
        JOptionPane.showMessageDialog(rootPane, "Este programa muestra el caracter ASCII correspondiente"+
                " al valor numérico dado", "Bienvenido", 3);
        codigo= Integer.parseInt(JOptionPane.showInputDialog("Ingrese código ASCII a mostrar"));
        letra= (char)codigo;
        
        JOptionPane.showMessageDialog(rootPane,"El carácter correspondiente es: "+letra, "Resultado", 3);
        System.exit(0);
    }
}
