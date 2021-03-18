import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lector {

    /**@param texto Se ingresa un string de la base de datos orginal.
     * @return  un array list ya con su cantidad de elementos, categoria y su respectivo nombre.
     */
    public List<String>  lector(String texto){
        String[] datos = texto.split("\\|", -2);
        List<String> listadatos = new ArrayList<String>();
        listadatos.add(datos[0].toString());
        listadatos.add(datos[1].toString());
        listadatos.add("10");
        return listadatos;
    }
}
