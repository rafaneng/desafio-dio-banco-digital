package desafio.dio.banco.digital;

public class Main {

	public static void main(String[] args) {
		Banco bancoDoPovo = new Banco();
		bancoDoPovo.setNome("Banco do Povo");
		
		Cliente clienteRafael = new Cliente();
		clienteRafael.setNome("Rafael");
		
		Conta cc = new ContaCorrente(clienteRafael);
		Conta poupanca = new ContaPoupanca(clienteRafael);
		
		bancoDoPovo.getContas().add(cc);
		bancoDoPovo.getContas().add(poupanca);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		bancoDoPovo.listarContas();
	}

}
