package com.cursojava.practica.entradaDatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Mauricio Montoya Medrano
 * @version 1.0.0
 */
public class Avanzado {
    public static void main(String[] args) {
        String captura;
        // Scanner permite leer una línea completa
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Introduzca un dato:");
            captura = input.nextLine();
            System.out.println("Dato ingresado: " + captura);
        } while (!captura.toLowerCase().equals("salir"));
    }
}
