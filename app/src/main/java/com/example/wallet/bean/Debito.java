package com.example.wallet.bean;

public class Debito extends TarjetaBancaria{

    private double saldo;


    public Debito(int nIdentificador, String numTarjeta, BancoEmisor bancoEmisor, Cliente cliente, double saldo) {
        super(nIdentificador, numTarjeta, bancoEmisor, cliente);
        this.saldo = saldo;
    }

    public Debito(BancoEmisor bancoEmisor, Cliente cliente, double saldo) {
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
