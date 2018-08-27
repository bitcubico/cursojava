package com.cursojava.practica.manejoExcepciones;

import com.cursojava.practica.ventas.Producto;
import com.cursojava.teoria.ManejoExcepciones.ArgumentoVacioException;

/**
 * @author Mauricio Montoya Medrano
 * @version 1.0.0
 */
public class ManejoExcepcionesPractica {
    public static void main(String[] args) {
        try {
            Producto producto = new Producto("", 47000);
        } catch (ArgumentoVacioException ave) {
            System.out.println("Ocurrió un error!!!");
            ave.printStackTrace();
        }
    }
}
