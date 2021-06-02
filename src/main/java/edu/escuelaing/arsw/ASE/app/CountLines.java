package edu.escuelaing.arsw.ASE.app;

/**
 * Program to count lines in a source code files
 * use tipocontar phy to physycal lines
 * use tipocontar loc to all lines of code
 *
 */

public class CountLines
{
    public static void main( String[] args )
    {
        if (args.length!=0 ){
        String tipocontar = args[0];
        String nombreArchivo = args[1];
        System.out.println(tipocontar);
        System.out.println(nombreArchivo);
    }
    }
}
