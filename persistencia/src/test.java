
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Jean Carlos Santoya Cabrera jeancarlosodi@gmail.com
 */
public class test {
    
    public static void main (String args[]) throws FileNotFoundException, IOException, ClassNotFoundException{
        //Escritura texto
    /*
        Formatter formatter = new Formatter("data.txt");
        formatter.format("Jean Carlos\nSantoya cabrera : %s", "Roronoa Zoro");
        formatter.close();
    */
        //Lectura texto
    /*
        Scanner scanner = new Scanner(new File("data.txt"));
        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }
        scanner.close();
    */
        //Escritura objeto serializable
    /*
        ObjectOutputStream salida = new ObjectOutputStream( new FileOutputStream("data.ser") );
        Data datos = new Data(19, 191020156, "Jean Carlos Santoya Cabrera");
        salida.writeObject(datos);
    */
        //Lectura objeto serializable
    /*
        ObjectInputStream entrada = new ObjectInputStream( new FileInputStream("data.ser") );
        Data datos = (Data) entrada.readObject();
        System.out.println(datos.getName());
        entrada.close();
    */
    }
    
}
