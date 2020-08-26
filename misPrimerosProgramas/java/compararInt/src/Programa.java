import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jean K
 */
public class Programa extends JFrame{
    private JPanel pFondo, pContenedor;
    private JLabel la, lb, lComparacion;
    private int a, b;
    private String comparacion;
    
    public Programa(Componentes comp){
        
        a = 8; b = 16;
        if(a == b){
            comparacion = "es igual a";
        } else if (a > b){
            comparacion = "es mayor que";
        } else {
            comparacion = "es menor que";
        }
        
        pContenedor = comp.panel(8, 8, 500, 96, comp.color("cyan"));
        add(pContenedor);
        
        pFondo = comp.panel(0, 0, 516, 112, comp.color("dark cyan"));
        pFondo.setFocusable(true);
        add(pFondo);
        
        la = comp.texto("a = "+ a, 0, 0, 500, 32, Color.BLACK, comp.font(2, 24));
        pContenedor.add(la);
        
        lb = comp.texto("b = "+ b, 0, 32, 500, 32, Color.BLACK, comp.font(2, 24));
        pContenedor.add(lb);
        
        lComparacion = comp.texto("a "+ comparacion +" b" , 0, 64, 500, 32, Color.BLACK, comp.font(2, 24));
        pContenedor.add(lComparacion);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Ejercicio Básico 2");
        setSize(532, 150);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
        
        pFondo.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ESCAPE){
                    System.exit(0);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }
}
