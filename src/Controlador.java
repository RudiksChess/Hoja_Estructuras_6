import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Controlador {
    /**
     * @return  Un HashMap con sus respectivas keys y un arraylist como argumento con varias de sus propiedades.
     */

    public Map<Integer, List<String>> ElHasho() throws FileNotFoundException {
        Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();

        File base = new File("ListadoProducto.txt");
        Scanner escaner = new Scanner(base);
        Lector lector = new Lector();
        int counter = 0;
        int inc = 1;
        while (escaner.hasNextLine()) {
            String data = escaner.nextLine();
            counter = counter + inc;
            List<String> linea = lector.lector(data);
            map.put(counter, linea);
        }
        escaner.close();

        return map;

    }




}
