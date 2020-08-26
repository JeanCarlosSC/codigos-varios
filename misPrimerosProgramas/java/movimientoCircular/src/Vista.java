import java.awt.Color;
    import java.awt.Font;
    import javax.swing.*;

class Vista extends JFrame{
    private JPanel panel, negro;
    private JLabel label;
    private Font fuente;
    
    public Vista(Logica logica){
        fuente = new Font("Times New Roman", Font.BOLD, 48);
        
        panel = new JPanel();
        panel.setBounds(150, 50, 500, 500);
        panel.setBackground(Color.CYAN);
        panel.setLayout(null);
        add(panel);
        
        negro = new JPanel();
        negro.setBounds(0, 0, 800, 600);
        negro.setBackground(Color.black);
        negro.setLayout(null);
        add(negro);
        
        label= new JLabel("R2");
        label.setFont(fuente);
        
        label.setForeground(Color.black);
        panel.add(label);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Reto 2");
        setSize(800, 600);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
        
        for(float i=0; i > -1; i+=0.1){
            label.setBounds(logica.Cx(i), logica.Cy(i), 100, 50);
        }
    }
}
