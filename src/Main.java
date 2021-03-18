/**
 @author Rudik Roberto Rompich Cotzojay
 @version 1.0
 Hoja 5 - Algoritmos y Estrucutras de Datos
 Se trabajó individualmente.
 */
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Controlador control = new Controlador();
        Map<Integer, List<String>> maps = control.ElHasho();

        int opcion= 0;
        Scanner entrada = new Scanner(System.in);

        while(opcion != 6){
            System.out.println("-------- PROGRAMA INICIADO  ------");
            System.out.println("Seleccionar una opcion:");
            System.out.println("1. Encender programa");
            System.out.println("2. Cerrar");
            System.out.println("Respuesta: ");
            int a= entrada.nextInt();

            if (a == 1){
                System.out.println("-------------INVENTARIO DISPONIBLE---------- ");
                System.out.println(maps);
                System.out.println("\nSeleccionar lo que quiere hacer: ");
                System.out.println("1. Ver categoría de un producto");
                System.out.println("2. Datos de un producto");
                System.out.println("3. Datos de los productos - ORDENADAS POR TIPO");
                System.out.println("4. Mostrar categoría y producto del inventario ");
                System.out.println("5. Mostrar categoría y producto del inventario - ORDENADAS POR TIPO");
                System.out.println("Respuesta: ");

                int b= entrada.nextInt();

                if (b==1) {
                    System.out.println("Seleccionar el key del producto que quiere ver su categoria: ");
                    System.out.println("Respuesta: ");

                    int c= entrada.nextInt();
                    System.out.println(maps.get(c).get(0));
                    }
                else if (b==2) {
                    System.out.println("Seleccionar el key del producto que quiere ver sus datos: ");
                    System.out.println("Respuesta: ");
                    int c= entrada.nextInt();

                    System.out.print("Categoría: ");
                    System.out.println(maps.get(c).get(0));
                    System.out.print("Producto: ");
                    System.out.println(maps.get(c).get(1));
                    System.out.print("Cantidad: ");
                    System.out.println(maps.get(c).get(2));
                }

                else if (b==3) {
                    System.out.println("Categoría:");
                    System.out.println("Mueble de terraza: "+maps.get(1).get(1)+", "+maps.get(2).get(1)+", "+maps.get(3).get(1)+", "+maps.get(4).get(1));
                    System.out.println("\nSillones de masaje: "+maps.get(5).get(1)+", "+maps.get(6).get(1)+", "+maps.get(7).get(1)+", "+maps.get(8).get(1));
                    System.out.println("\nBebidas: "+maps.get(9).get(1)+", "+maps.get(10).get(1)+", "+maps.get(11).get(1)+", "+maps.get(12).get(1));
                    System.out.println("\nCondimentos: "+maps.get(13).get(1)+", "+maps.get(14).get(1)+", "+maps.get(15).get(1));
                    System.out.println("\nFrutas :"+maps.get(16).get(1)+", "+maps.get(17).get(1)+", "+maps.get(18).get(1)+", "+maps.get(19).get(1));
                    System.out.println("\nCarnes: "+maps.get(20).get(1)+", "+maps.get(21).get(1)+", "+maps.get(22).get(1)+", "+maps.get(23).get(1)+", "+maps.get(24).get(1));
                    System.out.println("\nLácteos: "+maps.get(25).get(1)+", "+maps.get(26).get(1)+", "+maps.get(27).get(1)+", "+maps.get(28).get(1)+", "+maps.get(29).get(1));

                }
                else if (b==4) {
                    for (int i=1; i<30;i++){
                        System.out.println(maps.get(i));
                    }
                }
                else if (b==5) {
                    System.out.println("Categoría:");
                    System.out.println("Mueble de terraza: "+maps.get(1).get(1)+", "+maps.get(2).get(1)+", "+maps.get(3).get(1)+", "+maps.get(4).get(1));
                    System.out.println("\nSillones de masaje: "+maps.get(5).get(1)+", "+maps.get(6).get(1)+", "+maps.get(7).get(1)+", "+maps.get(8).get(1));
                    System.out.println("\nBebidas: "+maps.get(9).get(1)+", "+maps.get(10).get(1)+", "+maps.get(11).get(1)+", "+maps.get(12).get(1));
                    System.out.println("\nCondimentos: "+maps.get(13).get(1)+", "+maps.get(14).get(1)+", "+maps.get(15).get(1));
                    System.out.println("\nFrutas :"+maps.get(16).get(1)+", "+maps.get(17).get(1)+", "+maps.get(18).get(1)+", "+maps.get(19).get(1));
                    System.out.println("\nCarnes: "+maps.get(20).get(1)+", "+maps.get(21).get(1)+", "+maps.get(22).get(1)+", "+maps.get(23).get(1)+", "+maps.get(24).get(1));
                    System.out.println("\nLácteos: "+maps.get(25).get(1)+", "+maps.get(26).get(1)+", "+maps.get(27).get(1)+", "+maps.get(28).get(1)+", "+maps.get(29).get(1));

                }

                else{
                    System.out.println("El programa se ha cerrado inesperadamente por haber colocado un valor inexistente.");
                }

                }

            else{
                System.out.println("El programa se ha cerrado inesperadamente por haber colocado un valor inexistente.");
            }



        }

    }

}
