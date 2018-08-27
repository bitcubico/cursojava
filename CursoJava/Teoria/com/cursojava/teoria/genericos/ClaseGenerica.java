package com.cursojava.teoria.genericos;

public class ClaseGenerica<T> {
    // Variable de tipo generico
    T objeto;

    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }

    public String getTipo(){
        return objeto.getClass().getName();
    }
}
