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
    private String nombre;
    private JLabel lBienvenida;
    private JPanel pFondo, pContenedor;
    
    public Programa(Componentes comp){
        nombre = "Jean Carlos";
        
        pContenedor = comp.panel(8, 8, 400, 32, comp.color("cyan"));
        add(pContenedor);
        
        pFondo = comp.panel(0, 0, 416, 48, comp.color("dark cyan"));
        pFondo.setFocusable(true);
        add(pFondo);
        
        lBienvenida = comp.texto("Bienvenido "+nombre, 0, 0, 400, 32, Color.BLACK, comp.fuente(2, 24));
        pContenedor.add(lBienvenida);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Ejercicio Básico 3");
        setSize(416+16, 48+38);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
        
        pFondo.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
                    System.exit(0);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }
}
