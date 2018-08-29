package com.cursojava.teoria.manejoArchivos;

import java.io.*;

/**
 * @author Mauricio Montoya Medrano
 * @version 1.0.0
 */
public class ArchivosUtil {
    /**
     * Función usada para crear un nuevo archivo.
     * @param pathArchivo Ubicación del archivo que se desea crear
     * @return boolean Verdadero si el proceso se ejecuta exitosamente
     * @apiNote El directorio del archivo debe estar creado y con permisos de escritura
     */
    public static boolean CrearArchivo(String pathArchivo){
        // Creo el objeto que contendrá los datos del archivo
        File archivo = new File(pathArchivo);

        try {
            // Con esto le doy a la variable de tipo writer lo requerido para empezar a escribir en el archivo o para crear uno
            // nuevo
            PrintWriter writer = new PrintWriter(new FileWriter(archivo));
            // En este contexto el archivo es creado y cerrado
            writer.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Función usada para escribir líneas en un archivo
     * @param pathArchivo Ubicación del archivo en el que se desea escribir
     * @param texto Texto que se desea escribir en el archivo
     * @return boolean Verdadero si el proceso se ejecuta exitosamente
     * @apiNote El directorio del archivo debe estar creado y con permisos de escritura
     */
    public static boolean EscribirLinea(String pathArchivo, String texto){
        // Creo el objeto que contendrá los datos del archivo
        File archivo = new File(pathArchivo);

        try {
            // Con esto le doy a la variable de tipo writer lo requerido para empezar a escribir en el archivo o para crear uno
            // nuevo
            PrintWriter writer = new PrintWriter(new FileWriter(archivo));
            writer.println(texto);

            // Cierro el archivo y por consiguiente la información es guardada en el mismo
            writer.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }


    /**
     * Función usada para agregar líneas en un archivo existente
     * @param pathArchivo Ubicación del archivo en el que se desea escribir
     * @param texto Texto que se desea escribir en el archivo
     * @return boolean Verdadero si el proceso se ejecuta exitosamente
     * @apiNote El directorio donde está ubicado el archivo debe estar creado y de igual forma el archivo
     * @throws IOException
     */
    public static boolean AgregarLinea(String pathArchivo, String texto) throws IOException {
        // Creo el objeto que contendrá los datos del archivo
        File archivo = new File(pathArchivo);
        if(!archivo.exists())
            throw new IOException("El archivo no existe");

        try {
            // Con esto le doy a la variable de tipo writer lo requerido para empezar a escribir en el archivo o para crear uno
            // nuevo
            PrintWriter writer = new PrintWriter(new FileWriter(archivo, true));
            writer.println(texto);

            // Cierro el archivo y por consiguiente la información es guardada en el mismo
            writer.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String LeerArchivo(String pathArchivo) throws IOException {
        // Creo el objeto que contendrá los datos del archivo
        File archivo = new File(pathArchivo);
        if(!archivo.exists())
            throw new IOException("El archivo no existe");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            StringBuilder cuaderno = new StringBuilder();
            String linea;
            do {
                linea = reader.readLine();
                if(linea != null)
                    cuaderno.append(linea).append("\n");
            } while (linea != null);

            reader.close();
            return cuaderno.toString();
        }catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
