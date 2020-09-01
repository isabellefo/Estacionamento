package br.com.calculo;

import br.com.veiculos.Veiculo;

public class ContaEstacionamento {
	
	public Veiculo veiculo;
	public CalculaValor conta;
	
	public double calcular(CalculaValor conta) {
		return conta.valorConta();
	}
	

}
