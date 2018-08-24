package com.cursojava.teoria;

import java.io.Serializable;

/**
 * Un JavaBeans es una clase pura en java. Es lo equivalente a una librería en windows; y la idea es que estas clases
 * puedan ser usadas por otras clases sin conocer a detalle el contenido de la misma.
 *
 * @author Mauricio Montoya Medrano
 * @version 1.0.0
 */
// 1. Debe implementar la interfaz Serializable esto permite que la clase se convierta a unos y ceros si se desea enviar a otro servidor
public class JavaBeans implements Serializable {
    // 2. Las propiedades deben ser privadas para que se cumpla con el concepto de encapsulamiento que hace que las clases
    //    que hagan uso del JavaBeans accedan a las propiedades por medio de los setter y getters
    private String nombre;
    private int edad;
    private boolean activo;

    // 3. En caso de contar con un constructor no vacío, se debe crear el constructor vacío para que las clases que
    //    usen el JavaBeans tengan libertad de usarlo libremente
    public JavaBeans(){

    }

    public JavaBeans(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.activo = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
