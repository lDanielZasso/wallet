package com.example.wallet.bean;

public class TarjetaBancaria extends Tarjeta{

    private BancoEmisor bancoEmisor;
    private Cliente cliente;

    public TarjetaBancaria(int nIdentificador, String numTarjeta, BancoEmisor bancoEmisor, Cliente cliente) {
        super(nIdentificador, numTarjeta);
        this.bancoEmisor = bancoEmisor;
        this.cliente = cliente;
    }

    public TarjetaBancaria(BancoEmisor bancoEmisor, Cliente cliente) {
        this.bancoEmisor = bancoEmisor;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "TarjetaBancaria{" +
                "bancoEmisor='" + bancoEmisor + '\'' +
                ", cliente=" + cliente +
                '}';
    }

    public BancoEmisor getBancoEmisor() {
        return bancoEmisor;
    }

    public void setBancoEmisor(BancoEmisor bancoEmisor) {
        this.bancoEmisor = bancoEmisor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
