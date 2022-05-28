package model;

import java.util.HashSet;
import java.util.Set;

public class Cliente extends Usuario {

    //private Conta conta;
    protected Set<Conta> contasCliente = new HashSet<>();
    private String cpf;
    public Cliente(String nascimento, String nome, String senha, String cpf, Agencia agencia) {
        super(nascimento, nome, senha);
        this.cpf = cpf;
        agencia.addCliente(this);
    }    


    public Set<Conta> getContasCliente() {
        return contasCliente;
    }

    public void setContasCliente(Set<Conta> contasCliente) {
        this.contasCliente = contasCliente;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }   
    
    public void addContas(Conta conta){
		this.contasCliente.add(conta);
	}


}
