package Programa;
    import java.awt.Color;
    import java.awt.Dimension;
    import java.awt.Graphics;
    import java.awt.event.KeyEvent;
    import java.awt.event.KeyListener;
    import java.io.IOException;
    import javax.swing.*;

public class Vista extends JFrame{
    private JPanel jPanel1;
    int Cx = 500, Cy = 400, w = 0, a = 0, s = 0, d = 0;
    double v = 1,vv = 0,vh = 0;
    
    public class Imagen extends javax.swing.JPanel {

        public Imagen() {
            this.setSize(160, 160); //se selecciona el tamaño del panel
        }
        
        public void paint(Graphics grafico) {
            Dimension height = getSize();
            ImageIcon Img = new ImageIcon(getClass().getResource("/lib/imagen.png")); 
            grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
            setOpaque(false);
            super.paintComponent(grafico);
        }

    }
    
    public Vista() throws IOException{        
        jPanel1 = new JPanel();
        jPanel1.setBounds(Cx, Cy, 160, 160);
        jPanel1.setLayout(null);
        add(jPanel1);
        setContentPane(jPanel1);
        jPanel1.setFocusable(true);
        
        Imagen imagen = new Imagen();
        jPanel1.add(imagen);
        jPanel1.repaint();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Reto 3");
        setSize(1280, 720);
        setLayout(null);
        setVisible(true);
        
        jPanel1.addKeyListener(new KeyListener(){
            public void keyTyped(KeyEvent e){
                //Aqui no funcionara
            }
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode()==KeyEvent.VK_W){
                    w=1;
                }
                if(e.getKeyCode()==KeyEvent.VK_A){
                    a=1;
                }
                if(e.getKeyCode()==KeyEvent.VK_S){
                    s=1;
                }
                if(e.getKeyCode()==KeyEvent.VK_D){
                    d=1;
                }
                if(e.getKeyCode()==KeyEvent.VK_ESCAPE){
                    System.exit(0);
                }
            }
            public void keyReleased(KeyEvent e){
                if(e.getKeyCode()==KeyEvent.VK_W){
                    w=0;
                }
                if(e.getKeyCode()==KeyEvent.VK_A){
                    a=0;
                }
                if(e.getKeyCode()==KeyEvent.VK_S){
                    s=0;
                }
                if(e.getKeyCode()==KeyEvent.VK_D){
                    d=0;
                }
            }
            
        });
        
        while(true){
            jPanel1.setBounds(Cx, Cy, 160, 160);
            Cx+=vh;Cy+=vv;
            vv=(s - w)*v;vh=(d - a)*v;
            try {
                Thread.sleep(10L);
              } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            } 
            
        }
        
    }
    
}
