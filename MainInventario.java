import java.io.*;
import java.util.ArrayList;

public class MainInventario {

    public static void main(String[] args) {
       

        ArrayList<Persistencia> persistencia = new ArrayList<>();
        String linea, datos[];


        try{

            BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\julia\\OneDrive\\Escritorio\\Julio\\Proyecto APO\\inventario.txt"));

            while(  (linea = lector.readLine())  != null){
                datos = linea.split(";");
                if(datos.length == 4){
                    String clase = datos[0].trim();
                    String codigo = datos[1].trim();
                    String nombre = datos[2].trim();
                    int cantidad = Integer.parseInt(datos[3].trim());

                    Persistencia p = new Persistencia(clase, codigo, nombre, cantidad);
                    persistencia.add(p);
                }
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());

        }

        finally{


        }



        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter("C:\\Users\\julia\\OneDrive\\Escritorio\\Julio\\Proyecto APO\\resultado.txt"));
            int i = 0;
            while (  (i<6)  ) {
                System.out.println("Clase: " + persistencia.get(i).getClase());
                System.out.println("Codigo: " + persistencia.get(i).getCodigo()); 
                System.out.println("Nombre: " + persistencia.get(i).getNombre());
                System.out.println("Cantidad: " + persistencia.get(i).getCantidad());

                i++;


            }
            escritor.close();
        } 
        catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
