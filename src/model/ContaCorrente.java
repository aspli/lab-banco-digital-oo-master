package model;


public class ContaCorrente extends Conta{      
    

    public ContaCorrente(Agencia agencia, double saldo, Cliente cliente) {
        super(agencia, saldo, cliente);
        this.setTipo("Corrente");

    }

       
}
