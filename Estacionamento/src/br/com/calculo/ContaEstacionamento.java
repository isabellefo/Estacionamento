package br.com.calculo;

import br.com.veiculos.Veiculo;

public class ContaEstacionamento {
	
	public Veiculo veiculo;
	public CalculoValor conta;
	
	public double calcular(CalculoValor conta) {
		return conta.valorConta();
	}
	

}
