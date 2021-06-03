package edu.escuelaing.arsw.ASE.app;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;


/**
 * Program to count lines in a source code files
 * use tipocontar phy to physycal lines
 * use tipocontar loc to all lines of code
 *
 */

public class CountLines
{
    /**
     * Main of CountLines class
     * @param args
     */
    public static void main(String [] args)  {
        Logger log = LoggerFactory.getLogger(CountLines.class);
        if (args.length!=0 ){
        File nombreArchivo = new File(args[1]);
        String tipocontar  = args[0];
        try {
            int conteo = ReadFiles.muestraContenido(tipocontar, nombreArchivo);
            if (tipocontar.equals("loc")) {
                System.out.println("The number of Lines of code are" + conteo);
            } else {
                System.out.println("The number of Physical Lines are " + conteo);
            }
        }catch(Exception e) {
            log.error("Error on count lines o file", e);
        }
    }
    }
}
