import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Programa extends JFrame{
    private int a = 3, b = 2, modulo;
    private JPanel pFondo, pContenedor;
    private JLabel lSuma, lResta, lProducto, lDivision, lModulo;
    
    public Programa(Componentes comp){
        
        pContenedor = comp.panel(8, 8, 284, 184+32, comp.color("cyan"));
        add(pContenedor);
        
        pFondo = comp.panel(0, 0, 300, 232, comp.color("dark cyan"));
        pFondo.setFocusable(true);
        add(pFondo);
        
        lSuma = comp.texto("Suma = "+(a+b), 32, 32, 500, 32, Color.BLACK, comp.font(2, 32));
        pContenedor.add(lSuma);
        
        lResta = comp.texto("Resta = "+(a-b), 32, 64, 500, 32, Color.BLACK, comp.font(2, 32));
        pContenedor.add(lResta);
        
        lProducto = comp.texto("Producto = "+(a*b), 32, 96, 450, 32, Color.BLACK, comp.font(2, 32));
        pContenedor.add(lProducto);
        
        lDivision = comp.texto("División = "+(a/b), 32, 128, 450, 32, Color.BLACK, comp.font(2, 32));
        pContenedor.add(lDivision);
        
        lModulo = comp.texto("Módulo = "+(Math.floorMod(a, b)), 32, 160, 450, 32, Color.BLACK, comp.font(2, 32));
        pContenedor.add(lModulo);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Ejercicio Básico 1");
        setSize(300+16, 232+38);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
        
        pFondo.addKeyListener(new KeyListener(){
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
