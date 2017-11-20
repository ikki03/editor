package org.ulco;

public class ID {
    public int id = 0;
    private static ID instance = new ID();
    private ID(){
    }
    public static ID getInstance(){
        return instance;
    }
    public int suivant(){
        return ++id;
    }
    public int valeur(){
        return id;
    }
}