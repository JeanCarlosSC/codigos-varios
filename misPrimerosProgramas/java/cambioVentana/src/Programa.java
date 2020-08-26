import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Programa{
    
    
    public Programa(Componentes comp)throws IOException{
        VentanaMenu v1 = new VentanaMenu(comp);
        
    }
    
    public class VentanaMenu extends JFrame implements ActionListener{
        private JPanel pfondo;
        private JLabel lzoom, lIngresar, lversion, lCambio;
        private int v1 = 0, v2 = 0, b1 = 0;
        private Icon iCambio, imCambio, iZoom, iIngresar, imIngresar;
        
        public VentanaMenu(Componentes comp)throws IOException{
            iCambio   = comp.icono("lib/btCambio.png", 200, 32);
            imCambio  = comp.icono("lib/btnCambio.png", 200, 32);
            iZoom     = comp.icono("lib/zoomLogo.png", 143, 32);
            iIngresar = comp.icono("lib/btIngresar.png", 200, 32);
            imIngresar= comp.icono("lib/btnIngresar.png",200,32);
            
            pfondo = comp.panel(0, 0, 594, 372, Color.WHITE);
            pfondo.setFocusable(true);
            add(pfondo);
            
            lzoom = comp.labelIcono(iZoom, 228, 35);
            pfondo.add(lzoom);
            
            lIngresar = comp.labelIcono(iIngresar, 197, 200);
            pfondo.add(lIngresar);
            
            lCambio = comp.labelIcono(imCambio, 197, 155);
            pfondo.add(lCambio);
            
            lversion = comp.texto("Versión: 4.6.11 (20559.0413)",220, 330, 170, 30, Color.GRAY, comp.font(1));
            pfondo.add(lversion);
            
            lCambio.addMouseListener(this.devolverEventoMouseBasico("bt1", comp));
            lIngresar.addMouseListener(this.devolverEventoMouseBasico("bt2", comp));
            
            
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setTitle("Reuniones de ZOOM en la nube");
            setSize(600+10, 410);
            setLayout(null);
            setLocationRelativeTo(this);
            setVisible(true);
            
            
            pfondo.addKeyListener(new KeyListener(){
                public void keyTyped(KeyEvent e) {
                }
                public void keyPressed(KeyEvent e) {
                    if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
                        System.exit(0);
                    }
                }
                public void keyReleased(KeyEvent e) {
                }
            });
            
            while(true){
                
                if(v1 == 1){
                    lCambio.setIcon(imCambio);
                } else if(v1 == 0){
                    lCambio.setIcon(iCambio);
                }
                if(v2 == 1){
                    lIngresar.setIcon(imIngresar);
                } else if(v2 == 0){
                    lIngresar.setIcon(iIngresar);
                }
                if(b1 == 1){
                    setVisible(false);
                    VentanaIngresar a = new VentanaIngresar(comp);
                    b1 = 0;
                }
            }
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
        }
        
        public MouseListener devolverEventoMouseBasico(String tipoComponente, Componentes comp){
            MouseListener eventoMouseBasico;
            eventoMouseBasico = new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent ae) {
                    if (tipoComponente.equals("bt1")){
                        b1=1;
                    }
                }
                @Override
                public void mousePressed(MouseEvent ae) {
                }
                @Override
                public void mouseReleased(MouseEvent ae) {
                }
                @Override
                public void mouseEntered(MouseEvent ae) {
                    if (tipoComponente.equals("bt1")){
                        v1=1;
                    }
                    if (tipoComponente.equals("bt2")){
                        v2=1;
                    }
                }
                @Override
                public void mouseExited(MouseEvent ae) {
                    if (tipoComponente.equals("bt1")){
                        v1=0;
                    }
                    if (tipoComponente.equals("bt2")){
                        v2=0;
                    }
                }
            };
            return eventoMouseBasico;
        }
    }
    public class VentanaIngresar extends JFrame implements ActionListener{
        private JPanel pfondo;
        private Icon iventana, iCancelar, imCancelar;
        private JLabel label, lCancelar;
        private int v1 = 0, b1 = 0;
        public VentanaIngresar(Componentes comp)throws IOException{
            iventana = comp.icono("lib/ventana2.png", 391, 361);
            iCancelar = comp.icono("lib/btCancelar.png", 79, 31);
            imCancelar = comp.icono("lib/btnCancelar.png", 79, 31);
            
            
            pfondo = comp.panel(0, 0, 800, 600, Color.WHITE);
            add(pfondo);
            
            lCancelar = comp.labelIcono(iCancelar, 279, 299);
            pfondo.add(lCancelar);
            
            label = comp.labelIcono(iventana, 0, 0);
            pfondo.add(label);
            
            
            lCancelar.addMouseListener(this.devolverEventoMouseBasico("bt1", comp));
            
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setTitle("zoom");
            setSize(395+16, 360+38);
            setLayout(null);
            setLocationRelativeTo(this);
            setVisible(true);
            
            
            pfondo.addKeyListener(new KeyListener(){
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
            
            while(true){
                if(v1 == 1){
                    lCancelar.setIcon(imCancelar);
                } else if(v1 == 0){
                    lCancelar.setIcon(iCancelar);
                }
                if(b1 == 2){
                    setVisible(false);
                    VentanaMenu a = new VentanaMenu(comp);
                    b1 = 0;
                }
            }
        }

        @Override
        public void actionPerformed(ActionEvent e) {
        }
        public MouseListener devolverEventoMouseBasico(String tipoComponente, Componentes comp){
            MouseListener eventoMouseBasico;
            eventoMouseBasico = new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent ae) {
                    if (tipoComponente.equals("bt1")){
                        b1=2;
                    }
                }
                @Override
                public void mousePressed(MouseEvent ae) {
                }
                @Override
                public void mouseReleased(MouseEvent ae) {
                }
                public void mouseEntered(MouseEvent ae) {
                    if (tipoComponente.equals("bt1")){
                        v1=1;
                    }
                }
                public void mouseExited(MouseEvent ae) {
                    if (tipoComponente.equals("bt1")){
                        v1=0;
                    }
                }
            };
            return eventoMouseBasico;
        }
        
    }
}