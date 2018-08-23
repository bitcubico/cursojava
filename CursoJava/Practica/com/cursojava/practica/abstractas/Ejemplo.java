package com.cursojava.practica.abstractas;

import com.cursojava.teoria.abstractas.*;

public class Ejemplo {

    public static void main(String [] args){
        // Creación de objetos
        FiguraGeometrica circulo = new Circulo("Circulo");
        FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
        FiguraGeometrica triangulo = new Triangulo("Triangulo");

        System.out.println(circulo);
        circulo.dibujar();

        System.out.println(rectangulo);
        rectangulo.dibujar();

        System.out.println(triangulo);
        triangulo.dibujar();
    }

}
