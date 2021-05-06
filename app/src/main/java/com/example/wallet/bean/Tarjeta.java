package com.example.wallet.bean;

public class Tarjeta {
    private int nIdentificador;

    public Tarjeta(int nIdentificador) {
        this.nIdentificador = nIdentificador;
    }

    public Tarjeta() {
    }

    @Override
    public String toString() {
        return "Tarjeta{" +
                "nIdentificador=" + nIdentificador +
                '}';
    }

    public int getnIdentificador() {
        return nIdentificador;
    }

    public void setnIdentificador(int nIdentificador) {
        this.nIdentificador = nIdentificador;
    }
}
