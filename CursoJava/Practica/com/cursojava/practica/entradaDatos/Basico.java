package com.cursojava.practica.entradaDatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Mauricio Montoya Medrano
 * @version 1.0.0
 */
public class Basico {
    public static void main(String[] args) {
        String captura;
        // InputStreamReader permite leer caracter a caracter lo que se ingresa por consola
        InputStreamReader input = new InputStreamReader(System.in);
        // Para poder leer una linea completa usaremos BufferedReader
        BufferedReader brInput = new BufferedReader(input);

        try {
            do {
                System.out.println("Introduzca un dato:");
                captura = brInput.readLine();
                System.out.println("Dato ingresado: " + captura);
            } while (!captura.toLowerCase().equals("salir"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
