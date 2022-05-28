package model;
import java.util.LinkedHashSet;
import java.util.Set;


public class Banco {

	private String nome;
	protected Set<Agencia> agenciasBanco = new LinkedHashSet<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public Set<Agencia> getAgenciasBanco() {
		return agenciasBanco;
	}

	public void setAgenciasBanco(Set<Agencia> agenciasBanco) {
		this.agenciasBanco = agenciasBanco;
	}

	public void setContas(Set<Agencia> agencias) {
		this.agenciasBanco = agencias;
	}

	public void addAgencias(Agencia agencia){
		this.agenciasBanco.add(agencia);
	}

	public void relatorioClientesPorAgencia(){
		System.out.println(String.format("<<<< Relatório de Clientes por Agencia do %s >>>>", this.nome));
		for (Agencia agencia : agenciasBanco) {
			System.out.println("\n" + agencia.getAgNumero() + " - " + agencia.getNome());
			Set<Cliente> teste = agencia.getAgClientes();
			for (Cliente cliente : teste) {
				System.out.println(cliente.getNome());				
			}		
		}
	}

	public void impExtrTodosClientes(){
		System.out.println(String.format("\n<<<< Extrato de todos Cliente do %s >>>>\n", this.nome));
		for (Agencia agencia : agenciasBanco) {			
			Set<Cliente> agencias = agencia.getAgClientes();
			for (Cliente cliente : agencias) {
				Set<Conta> contas = cliente.getContasCliente();
				 for(Conta conta : contas){
					 conta.imprimirExtrato();
				 }

			}
		}
	}
	

}
