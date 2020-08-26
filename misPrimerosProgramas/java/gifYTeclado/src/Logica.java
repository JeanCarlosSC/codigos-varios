import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Logica {
    private JPanel panel;
    private ImageIcon image;
    private JLabel label;
    
    public Logica(){
    }
    
    public JPanel panel(int x, int y, int ancho, int largo, Color color){
        panel = new JPanel();
        panel.setBounds(x, y, ancho, largo);
        panel.setLayout(null);
        panel.setBackground(color);
        return panel;
    }
    public JLabel icon(String ruta, int x, int y, int width, int height){
        image = new ImageIcon(getClass().getResource(ruta));
        Icon imageScaled = new ImageIcon(image.getImage().getScaledInstance(width, height,Image.SCALE_DEFAULT));
        label = new JLabel();
        label.setSize(width, height);
        label.setLocation(x, y);
        label.setIcon(imageScaled);
        return label;
    }
}