import model.Agencia;
import model.Banco;
import model.Cliente;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Main {

	public static void main(String[] args) {

		//Banco instanciado
		Banco dioBank = new Banco();
		dioBank.setNome("DigitalInovation Bank");

		//Agencias instanciadas
		Agencia agDio = new Agencia(dioBank);
		agDio.setNome("DioAgencia");

		Agencia agGFT = new Agencia(dioBank);
		agGFT.setNome("GFTAgencia");

		//Instaciados clientes para teste
		Cliente alexandre = new Cliente("17/03/1985", "Alexandre S Pereira",
							"q1w2e3r4", "111.111.111-11", agDio);
		
		Cliente emily = new Cliente("05/12/2000", "Emily M Pereira",
							"q1w2e3r4", "222.222.222-22", agDio);
		
		Cliente poliana = new Cliente("03/03/1990", "Poliana A. Pereira",
							"q1w2e3r4", "333.333.333-33", agGFT);
		
		Cliente jesuino = new Cliente("10/10/1975", "Jesuino A. Pereira",
							"q1w2e3r4", "444.444.444-44", agGFT);

		ContaPoupanca poupancaEmily = new ContaPoupanca(agDio, 0.0, emily);
		ContaCorrente ccAlexandre = new ContaCorrente(agDio, 0.0, alexandre);
		ContaPoupanca poupancaAlexandre = new ContaPoupanca(agDio, 0.0, alexandre);
		ContaCorrente ccPoliana = new ContaCorrente(agDio, 0.0, poliana);
		ContaCorrente ccJesuino = new ContaCorrente(agDio, 0.0, jesuino);

		//Operações sacar, transferir e depositar
		poupancaEmily.depositar(100);
		ccAlexandre.depositar(100);
		poupancaAlexandre.depositar(100);
		ccAlexandre.sacar(10);
		ccAlexandre.transferir(10, poupancaEmily);
		ccPoliana.depositar(2500);		
		ccJesuino.depositar(4500);

		//Imprimi o extrato das contas após operações
		//poupancaEmily.imprimirExtrato();
		//ccAlexandre.imprimirExtrato();
		//poupancaAlexandre.imprimirExtrato();

		//imprime relatorio de clientes por Agencias
		dioBank.relatorioClientesPorAgencia();

		//imprime extato de todas as contas
		dioBank.impExtrTodosClientes();
	}
	

}
