package edu.escuelaing.arsw.ASE.app;
import java.io.*;
import java.util.Scanner;

/**
 * This class Read the file that get from main class and count the number of lines if the type of count is LOC or PHY
 */
public class ReadFiles {
    private static String cadena;

    /**
     * Principle class of ReadFiles, it recieve the file and count the number of lines deppends on it count type
     * @param tipocontar
     * @param nombreArchivo
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static int muestraContenido( String tipocontar,File nombreArchivo) throws FileNotFoundException, IOException {
        int contador = 0;
        Scanner sc = new Scanner(nombreArchivo);
        FileReader f = new FileReader(nombreArchivo);
        BufferedReader b = new BufferedReader(f);
        if(tipocontar.equals("phy")) {
            while(sc.hasNextLine()) {
                sc.nextLine();
                contador++;
            }
        }
        else if (tipocontar.equals("loc")){
            while((cadena = b.readLine())!=null) {
                if (!(cadena.startsWith("/") || (cadena.isEmpty()) || (cadena.startsWith("*") ))){
                    contador++;
                }
            }
        }
        b.close();
        return contador;
    }
}
