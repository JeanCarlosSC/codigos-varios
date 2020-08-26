import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jean K
 */
public class Programa extends JFrame{
    private int numero;
    private String resultado;
    
    public Programa(Componentes comp){
        JOptionPane.showMessageDialog(rootPane, "Este programa verifica si un número dado es divisible entre 2", "Bienvenido", 3);
        numero= Integer.parseInt(JOptionPane.showInputDialog("Inserte número"));
        
        if(numero % 2 == 0){
            resultado= "Tu número es divisible por 2";
        } else {
            resultado= "Tu número no es divisible por 2";
        }
        
        JOptionPane.showMessageDialog(rootPane, resultado, "Ejercicio 6", 3);
        
        System.exit(0);
    }
}
