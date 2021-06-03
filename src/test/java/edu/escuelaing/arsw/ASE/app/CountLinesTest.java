package edu.escuelaing.arsw.ASE.app;
import junit.framework.TestCase;
import java.io.*;


/**
 * Unit test for count lines app
 */
public class CountLinesTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CountLinesTest(String testName )
    {
        super( testName );
    }

    /**
     * Test counttype PHY
     * @throws IOException
     */
    public void testphy() throws IOException {
        int resultadoEsperado=11;
        File ruta = new File("./src/main/resources/prueba.txt");
        int resusltadoObtenido= ReadFiles.muestraContenido("phy",ruta);
        assertEquals(resultadoEsperado,resusltadoObtenido);
    }

    /**
     *Test count type loc
     * @throws IOException
     */
    public void testloc() throws IOException {
        int resultado=5;
        File ruta = new File("./src/main/resources/prueba2.txt");
        int obtenido= ReadFiles.muestraContenido("loc",ruta);
        assertEquals(resultado,obtenido);
    }

    /**
     *Test count type test file not found
     * @throws IOException
     */
    public void testfilenotfound() throws IOException {
        boolean thrown = false;
        try {
            File ruta = new File("./src/main/resources/pruebanotexiste.txt");
            int resusltado= ReadFiles.muestraContenido("loc",ruta);
        } catch (FileNotFoundException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    /**
     *Test count type test file found
     * @throws IOException
     */
    public void testfilefound() throws IOException {
        boolean thrown = true;
        try {
            File ruta = new File("./src/main/resources/prueba.txt");
            int resultado= ReadFiles.muestraContenido("loc",ruta);
        } catch (FileNotFoundException e) {
            thrown = false;
        }
        assertTrue(thrown);
    }




}
