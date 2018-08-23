package com.cursojava.teoria.interfaces;

public class OracleDao implements IDao {
    @Override
    public void nuevo() {
        System.out.println("Agrega un nuevo registro desde Oracle");
    }

    @Override
    public void getTodo() {
        System.out.println("Lista desde Oracle");
    }
}
