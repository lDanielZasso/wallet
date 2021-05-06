package com.example.wallet.bean;

public class Debito extends TarjetaBancaria{

    private double saldo;


    public Debito(int nIdentificador, String bancoEmisor, Cliente cliente, double saldo) {
        super(nIdentificador, bancoEmisor, cliente);
        this.saldo = saldo;
    }

    public Debito(String bancoEmisor, Cliente cliente, double saldo) {
        super(bancoEmisor, cliente);
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Debito{" +
                "saldo=" + saldo +
                '}';
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
