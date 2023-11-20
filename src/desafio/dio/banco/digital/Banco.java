package desafio.dio.banco.digital;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void listarContas() {
		System.out.printf("== Imprimindo contas no banco: %s == \n", nome);
		contas.forEach(conta -> conta.imprimirInfosComuns());
	}
}
