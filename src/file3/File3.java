/*
 * escirbe un programa que incialice 4objetos del tipo FILE, dos que hagan 
*referencia a ficheros, que uno exista y otro no, y los otros dos a directorios, 
*uno que exista y otro no
* el programa debe averiguar si existen. independientemente sea fichero
*o directorio.
*Tambien debe averiguar para cada objeto que exista si es un. a la hora de
*visualizar el nombre del fichero o directorio  prueba con diferentes metos GET
*que ofrece la clae File para ver la diferecia que hay entre cada uno de ellos
 */
package file3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner.*;


/**
 *
 * @author sergio palomo
 */
public class File3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File fichero1;
        fichero1 = new File("c:/pruebas/dir1");        // existe
        File fichero2;
        fichero2 = new File("c:/pruebas/dir2");        // no existe
        File fichero3;
        fichero3 = new File("c:/pruebas/","hola.txt");        // existe
     //   File fich = new File ("c:/pruebas"; "hola.txt");
        File fichero4;
        fichero4 = new File("c:\\pruebas\\hola1.txt");        // existe
        
        System.out.println("el fichero1 existe?"+ fichero1.exists());
        System.out.println("el fichero2 existe?"+ fichero2.exists());
        System.out.println("el fichero3 existe?"+ fichero3.exists());
        System.out.println("el fichero4 existe?"+ fichero4.exists());
        
        System.out.println("Vamos averiguar si son ficheros o directorios");
        System.out.println("el fichero 1 es directorio? "+ fichero1.isDirectory());
        System.out.println("el fichero 1 es archivo? "+ fichero1.isFile());
        System.out.println("el fichero 3 es directorio? "+ fichero3.isDirectory());
        System.out.println("el fichero 3 es archivo? "+ fichero3.isFile());
        
        System.out.println("fichero 3 absolutepath "+ fichero3.getAbsolutePath() );
        System.out.println("fichero 3 canonical"+ fichero3.getCanonicalPath() );
        System.out.println ("fichero3  " + fichero3.getParent() );
        System.out.println("fichero3 " + fichero3.getAbsoluteFile());
    }
    
}
