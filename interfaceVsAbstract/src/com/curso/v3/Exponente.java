package com.curso.v3;

public class Exponente implements Operacion {
    @Override
    public int ejecuta(int x, int y) {
        return (int)Math.pow(x,y);
    }
}

