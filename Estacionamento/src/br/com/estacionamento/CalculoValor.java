package br.com.estacionamento;

import br.com.veiculos.Veiculo;

public interface CalculoValor{
	public abstract double valorConta(Veiculo veiculo, long periodo); 
	
}
