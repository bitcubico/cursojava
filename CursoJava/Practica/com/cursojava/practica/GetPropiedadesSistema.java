package com.cursojava.practica;

import java.util.Enumeration;
import java.util.Properties;

/**
 * @author Mauricio Montoya Medrano
 * @version 1.0.0
 */
public class GetPropiedadesSistema {
    public static void main(String[] args) {
        Properties propiedades = System.getProperties();
        Enumeration nombrePropiedades = propiedades.propertyNames();

        while (nombrePropiedades.hasMoreElements()){
            String propiedad = (String) nombrePropiedades.nextElement();
            String valor = propiedades.getProperty(propiedad);
            System.out.println("|---> " + propiedad + " = " + valor);
        }
    }
}
