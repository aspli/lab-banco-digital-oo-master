package model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Agencia agencia, double saldo, Cliente cliente) {
        super(agencia, saldo, cliente);
        this.setTipo("Poupança");
    }
    
}
