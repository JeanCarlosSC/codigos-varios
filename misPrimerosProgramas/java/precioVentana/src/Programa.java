import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Jean K
 */
public class Programa extends JFrame implements ActionListener{
    private int v1= 0, v2= 0, b1= 0, b2= 0;
    private float alto, largo, precio, descuento;
    private JPanel pFondo, pContenedor;
    private JLabel lPrecio, lPregunta, lAfirmacion, lSi, lNo;
    private Icon iSi, iNo, imSi, imNo;
    
    public Programa(Componentes comp){
        alto = Float.valueOf(JOptionPane.showInputDialog("Inserte la medida del alto de la ventana (cm)"));
        largo = Float.valueOf(JOptionPane.showInputDialog("Inserte la medida del largo de la ventana (cm)"));
        precio = alto*largo*13;
        
        pContenedor= comp.panel(8, 8, 500, 132, comp.color("cyan"));
        add(pContenedor);
        
        pFondo= comp.panel(0, 0, 516, 144, comp.color("dark cyan"));
        add(pFondo);
        
        lAfirmacion= comp.texto("El precio de la ventana es:", 0, 0, 500, 32, Color.BLACK, comp.fuente(2, 24));
        pContenedor.add(lAfirmacion);
        
        lPrecio= comp.texto("$"+Float.toString(precio), 0, 32, 500, 32, Color.BLACK, comp.fuente(2, 24));
        pContenedor.add(lPrecio);
        
        lPregunta= comp.texto("¿Desea hacer algún descuento?", 0, 64, 500, 32, Color.BLACK, comp.fuente(2, 24));
        pContenedor.add(lPregunta);
        
        iSi= comp.icono("lib/btSi.png", 32, 32);
        imSi= comp.icono("lib/btmSi.png", 32, 32);
        iNo= comp.icono("lib/btNo.png", 32, 32);
        imNo= comp.icono("lib/btmNo.png", 32, 32);
        
        lSi= comp.labelIcono(iSi, 64, 96);
        pContenedor.add(lSi);
        
        lNo= comp.labelIcono(iNo, 128+64, 96);
        pContenedor.add(lNo);
        
        lSi.addMouseListener(Mouse("bt1"));
        lNo.addMouseListener(Mouse("bt2"));
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calculadora precio de ventana");
        setSize(516+16, 144+38);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
        
        while (true){
            if(v1 == 1){
                lSi.setIcon(imSi);
            } else if(v1 == 0){
                lSi.setIcon(iSi);
            }
            if(v2 == 1){
                lNo.setIcon(imNo);
            } else if(v2 == 0){
                lNo.setIcon(iNo);
            }
            if(b1 == 1){
                descuento = Float.valueOf(JOptionPane.showInputDialog("Inserte valor a descontar"));
                pContenedor.remove(lPrecio);
                precio -= descuento;
                lPrecio= comp.texto("$"+Float.toString(precio), 0, 32, 500, 32, Color.BLACK, comp.fuente(2, 24));
                pContenedor.add(lPrecio);pContenedor.repaint();
                b1= 0;
            }
            if(b2 == 1){
                pContenedor.remove(lPregunta);
                pContenedor.remove(lSi);pContenedor.remove(lNo);
                pContenedor.repaint();
                b2= 0;
            }
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
    public MouseListener Mouse(String tipoComponente){
            MouseListener Mouse;
            Mouse = new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    if (tipoComponente.equals("bt1")){
                        b1=1;
                    }
                    if (tipoComponente.equals("bt2")){
                        b2=1;
                    }
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    if (tipoComponente.equals("bt1")){
                        v1=1;
                    }
                    if (tipoComponente.equals("bt2")){
                        v2=1;
                    }
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    if (tipoComponente.equals("bt1")){
                        v1=0;
                    }
                    if (tipoComponente.equals("bt2")){
                        v2=0;
                    }
                }
            };
            return Mouse;
    }
}

