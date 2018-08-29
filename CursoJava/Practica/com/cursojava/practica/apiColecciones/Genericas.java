package com.cursojava.practica.apiColecciones;

import com.cursojava.teoria.genericos.ClaseGenerica;

import java.util.*;

/**
 * @author Mauricio Montoya Medrano
 * @version 1.0.0
 */
public class Genericas {
    public static void main(String[] args) {
        System.out.println("Clase GENÉRICA |--------->");
        ClaseGenerica<Integer> claseGenerica = new ClaseGenerica<>(15);
        System.out.println("El tipo es: " + claseGenerica.getTipo());

        /*
        Una LISTA es una colección ordenadas de elementos en la cual se pueden almacenar cualquier tipo de elementos.
        El tipo de elementos que se almacenan por defecto es de tipo object
         */
        List<Integer> miLista = new ArrayList<>();
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        miLista.add(1);
        miLista.add(5);
        System.out.println("Contenido de la colección tipo: LIST |--------->");
        imprimir(miLista);

        /*
         Un SET es una colección ordenadas de elementos y solo permiten elementos únicos, por lo tanto no se almacenan
         elementos existentes en la lista.
         El tipo de elementos que se almacenan por defecto es de tipo object
          */
        Set<String> miSet = new HashSet<>();
        miSet.add("100");
        miSet.add("200");
        miSet.add("500");
        miSet.add("900");
        miSet.add("100");   // Este elemento por ser repetido no lo acepta el SET
        System.out.println("Contenido de la colección tipo: SET |--------->");
        imprimir(miSet);

        /*
        Un MAP relaciona una llave con un valor, formando una especie de tabla de datos
         */
        Map<Integer, String> miMap = new HashMap<>();
        miMap.put(1, "mcubico");
        miMap.put(2, "bitcubico");
        miMap.put(3, "LISSO TTP");
        miMap.put(4, "EVAXINEF");
        System.out.println("Contenido de la colección tipo: MAP |--------->");
        System.out.println("Keys:");
        imprimir(miMap.keySet());
        System.out.println("Values:");
        imprimir(miMap.values());
    }

    private static void imprimir(Collection coleccion){
        for (Object elm: coleccion)
            System.out.println(elm);
        System.out.println("");
    }
}
