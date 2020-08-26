
import java.io.Serializable;
import javax.swing.JPanel;

public class Data implements Serializable{
    
    private int edad;
    private int codigo;
    private String name;
    private transient JPanel panel;
    
    public Data(int edad, int codigo, String name){
        this.edad = edad;
        this.codigo = codigo;
        this.name = name;
        panel = new JPanel();
    }

    public int getEdad() {
        return edad;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getName() {
        return name;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
