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
    private Font fuente, fVersion, fTexto;
    private ImageIcon iIcono;
    
    public Componentes(){
        fVersion= new Font("Gill Sans MT Condensed", Font.PLAIN,16);//1
        fTexto = new Font("Arial", Font.PLAIN, 11);//2
    }
    
    public Font font(int i) {
        if(i == 1){fuente = fVersion;}
        if(i == 2){fuente = fTexto  ;}
        return fuente;
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
