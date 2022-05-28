package model;


public abstract class Usuario {

    protected String nascimento;
    protected String nome;
    protected String senha ="123";

    public Usuario(String nascimento, String nome, String senha) {
        this.nascimento = nascimento;
        this.nome = nome;
        this.senha = senha;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    protected String getSenha() {
        return senha;
    }

    protected void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean senhaInvalida(String password){
        return this.senha.equals(password);
    }
    
}
