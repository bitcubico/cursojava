package com.cursojava.teoria.interfaces;

public class MysqlDao implements IDao {
    @Override
    public void nuevo() {
        System.out.println("Agrega un nuevo registro desde Mysql");
    }

    @Override
    public void getTodo() {
        System.out.println("Lista desde Mysql");
    }
}
