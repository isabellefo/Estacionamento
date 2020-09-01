package br.com.fatec;

public class ContaEstacionamento {
	
	public Veiculo veiculo;
	public CalculaValor conta;
	
	public double calcular(CalculaValor conta) {
		return conta.valorConta();
	}
	

}
