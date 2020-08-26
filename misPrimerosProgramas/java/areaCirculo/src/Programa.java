import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Jean K
 */
public class Programa extends JFrame{
    private float radio;
    private double area;
    private JPanel pFondo, pContenedor;
    private JLabel lRadio, lTexto, lArea;
    public Programa(Componentes comp){
        JOptionPane.showMessageDialog(rootPane, "Bienvenido, este programa es para calcular el área de un circulo "+
                "a través de un radio dado", "Bienvenido", 1);
        radio= Float.valueOf(JOptionPane.showInputDialog("Inserte radio del círculo"));
        area= Math.PI * Math.pow(radio, 2);
        
        
        pContenedor= comp.panel(4, 4, 500, 96, comp.color("verde claro"));
        add(pContenedor);
        
        pFondo= comp.panel(0, 0, 508, 104, comp.color("morado"));
        pFondo.setFocusable(true);
        add(pFondo);
        
        lRadio= comp.texto("r = "+ Float.toString(radio), 10, 0, 500, 32, Color.BLACK, comp.fuente(2, 24)); 
        pContenedor.add(lRadio);
        
        lTexto= comp.texto("El área del circulo con radio r es:", 10, 32, 500, 32, Color.BLACK, comp.fuente(2, 24));
        pContenedor.add(lTexto);
        
        lArea= comp.texto("A = "+ area,10, 64, 500, 32, Color.BLACK, comp.fuente(2,24));
        pContenedor.add(lArea);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Ejercicio Básico 5");
        setSize(508+16, 104+38);
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
