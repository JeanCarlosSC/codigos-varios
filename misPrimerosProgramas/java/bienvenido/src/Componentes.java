import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Componentes {
    private JPanel panel;
    private ImageIcon image;
    private JLabel label;
    private Font fuente, fuenteVersion;
    private ImageIcon iIcono;
    private Color color;
    
    public Componentes(){
    }
    
    public Font fuente(int i, int size) {
        if(i == 1){fuente = new Font("Gill Sans MT Condensed", Font.PLAIN, size);}
        if(i == 2){fuente = new Font("Arial", Font.PLAIN, size);}
        return fuente;
    }
    public Color color(String coloR){
        if(coloR.equals("cyan"))     {color = new Color(72, 206, 247);}
        if(coloR.equals("dark cyan")){color = new Color(70, 147, 171);}
        return color;
    }
    
    public JPanel panel(int x, int y, int ancho, int largo, Color color){
        panel = new JPanel();
        panel.setBounds(x, y, ancho, largo);
        panel.setLayout(null);
        panel.setBackground(color);
        return panel;
    }
    public JLabel labelIcono(Icon icono, int x, int y){
        label = new JLabel();
        label.setSize(icono.getIconWidth(), icono.getIconHeight());
        label.setLocation(x, y);
        label.setIcon(icono);
        return label;
    }
    public JLabel texto(String cadena, int x, int y, int ancho, int alto, Color colorFuente,Font fuente){        
        label= new JLabel(cadena);
        label.setSize(ancho, alto);
        label.setLocation(x, y);
        label.setForeground(colorFuente);
        label.setFont(fuente);
        return label;
    }
    public Icon icono(String ruta, int width, int height){
        iIcono = new ImageIcon(getClass().getResource(ruta));
        Icon icono = new ImageIcon(iIcono.getImage().getScaledInstance(width, height,Image.SCALE_DEFAULT));;
        return icono;
    }
}
