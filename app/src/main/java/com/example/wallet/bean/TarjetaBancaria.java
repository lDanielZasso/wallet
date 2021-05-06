package com.example.wallet.bean;

public class TarjetaBancaria extends Tarjeta{

    private String bancoEmisor;
    private Cliente cliente;

    public TarjetaBancaria(int nIdentificador, String bancoEmisor, Cliente cliente) {
        super(nIdentificador);
        this.bancoEmisor = bancoEmisor;
        this.cliente = cliente;
    }

    public TarjetaBancaria(String bancoEmisor, Cliente cliente) {
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

    public String getBancoEmisor() {
        return bancoEmisor;
    }

    public void setBancoEmisor(String bancoEmisor) {
        this.bancoEmisor = bancoEmisor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
