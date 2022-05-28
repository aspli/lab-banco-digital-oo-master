package model;

import java.util.HashSet;
import java.util.Set; // Utilizei Set para melhor desempenho nas buscas

public class Agencia {

    private static int SEQUENCIAL = 1;

    private long agNumero;
    private String nome;
    private Set<Cliente> agClientes;

    public Agencia(Banco banco) {
        this.agNumero = SEQUENCIAL++;
        this.agClientes = new HashSet<>();
        banco.addAgencias(this);
        
    }

    public Agencia(long agNumero, String nome) {
        this.agNumero = agNumero;
        this.nome = nome;
    }

    public void addCliente(Cliente cliente){
        agClientes.add(cliente);
    }

    public long getAgNumero() {
        return agNumero;
    }

    public void setAgNumero(long agNumero) {
        this.agNumero = agNumero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    

    public Set<Cliente> getAgClientes() {
        return agClientes;
    }

    public void setAgClientes(Set<Cliente> agClientes) {
        this.agClientes = agClientes;
    }

    @Override
    public String toString() {
        return "Agencia [agNumero=" + agNumero + ", nome=" + nome + "]";
    }    
   
    
}
