import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import javax.swing.*;
import java.awt.*;


public class Vista extends JFrame{
    private int w = 0;
    private JPanel pImagen1, pfondo2, pfondo3, pImagen2;
    private JLabel imageLabel, imageLabel2;
    private ImageIcon id, is;
  
    
    public Vista(Logica logica)throws IOException{
        is = new ImageIcon(getClass().getResource("lib/Imagen1.png")); 
        id = new ImageIcon(getClass().getResource("lib/Imagen1.gif"));

        Icon isa = new ImageIcon(is.getImage().getScaledInstance(240, 240,Image.SCALE_DEFAULT));
        Icon ida = new ImageIcon(id.getImage().getScaledInstance(240, 240,Image.SCALE_DEFAULT));
        
        
        pImagen1 = logica.panel(320,240,240,240,new Color(83,126,255));
        add(pImagen1);
        
        pImagen2 = logica.panel(720, 240, 240, 240, new Color(83,126,255));
        add(pImagen2);
        
        pfondo2 = logica.panel(40,40,1200,640,new Color(6,69,255));
        add(pfondo2);
        
        pfondo3 = logica.panel(0, 0, 1280, 720, new Color(3,35,128));
        pfondo3.setFocusable(true);
        add(pfondo3);
        
        imageLabel = logica.icon("lib/Imagen2.gif", 0, 0, 240, 240);
        pImagen1.add(imageLabel);
        
        imageLabel2 = logica.icon("lib/Imagen1.gif", 0, 0, 240, 240);
        pImagen2.add(imageLabel2);
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Reto 4");
        setSize(new Dimension (1280+16, 720+38));
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        
        
        pfondo3.addKeyListener(new KeyListener(){
            public void keyTyped(KeyEvent e) {
            }
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_W){
                    w = 1;
                }
                if(e.getKeyCode()==KeyEvent.VK_ESCAPE){
                    System.exit(0);
                }
            }
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_W){
                    w = 0;
                }
            }
        });
        
        
        while(true){
            if( w == 0){
                imageLabel2.setIcon(ida);
            }
            if( w == 1){
                imageLabel2.setIcon(isa);
            }
        }
    }   
}