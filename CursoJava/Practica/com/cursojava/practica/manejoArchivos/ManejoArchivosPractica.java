package com.cursojava.practica.manejoArchivos;

import com.cursojava.teoria.manejoArchivos.ArchivosUtil;

import java.io.IOException;

/**
 * @author Mauricio Montoya Medrano
 * @version 1.0.0
 */
public class ManejoArchivosPractica {
    private static final String PATH_ARCHIVO = "c:\\temp\\manejoArchivosPracticaJava.txt";

    public static void main(String[] args) throws IOException {

        if(ArchivosUtil.CrearArchivo(PATH_ARCHIVO))
            Imprimir("|---> ESCRITURA: Archivo creado");

        if(ArchivosUtil.EscribirLinea(PATH_ARCHIVO, "Línea nueva"))
            Imprimir("|---> ESCRITURA: Línea agregada");

        if(ArchivosUtil.AgregarLinea(PATH_ARCHIVO, "Línea anexada"))
            Imprimir("|---> ESCRITURA: Línea anexada");

        Imprimir("|---> LECTURA:");
        Imprimir(ArchivosUtil.LeerArchivo(PATH_ARCHIVO));
    }

    private static void Imprimir(String mensaje) {
        System.out.println(mensaje);
    }
}
