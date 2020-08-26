import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jean K
 */
public class Programa {
    
    public Programa(){
        Sueño1 sueño1 = new Sueño1();
    }
    public class Sueño1 extends JFrame{
        private JPanel control;
        
        public Sueño1(){
            control = new JPanel();
            control.setFocusable(true);
            add(control);
            
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setTitle("Dreams v0.0.1");
            setSize(16*50+16, 9*50+38);
            setLocationRelativeTo(this);
            setLayout(null);
            setVisible(true);
            
            control.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    if(e.getKeyCode()== KeyEvent.VK_ESCAPE){
                        System.exit(0);
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {
                }
            });
            
            while(true){
                ;
            }
        }    
    }
}
