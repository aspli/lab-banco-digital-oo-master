package model;

import service.IConta;

public abstract class Conta implements IConta {

    private static int SEQUENCIAL = 1;
    
    private long numeroAg;
    private int numero;
    private Cliente cliente;
    private double saldo;  
    private String tipo;  
    

    public Conta(Agencia agencia, double saldo, Cliente cliente) {
        this.numeroAg = agencia.getAgNumero();       
        this.cliente = cliente;           
        this.saldo = saldo;        
        this.numero = SEQUENCIAL++;
        cliente.addContas(this);
    }

    public Conta(Agencia agencia, long numeroAg, Cliente cliente, double saldoInicial){  
        this.saldo = saldoInicial;
    }

    @Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

    public long getNumeroAg() {
        return numeroAg;
    }

    public void setNumeroAg(long numeroAg) {
        this.numeroAg = numeroAg;
    }

    public int getNumeroCC() {
        return numero;
    }

    public void setNumeroCC(int numeroCC) {
        this.numero = numeroCC;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void imprimirExtrato(){
            System.out.println(String.format("#### EXTRATO CONTA %s ####", this.tipo.toUpperCase()));
            System.out.println(String.format("Titular: %s", this.cliente.getNome()));
            System.out.println(String.format("CPF: %s", this.cliente.getCpf()));
            System.out.println(String.format("Agencia: %d", this.numeroAg));
            System.out.println(String.format("Numero: %d", this.numero));
            System.out.println(String.format("Saldo: %.2f", this.saldo));
            System.out.println("################################\n");
    }     
    
}
