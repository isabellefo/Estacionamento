package estacionamento;

import veiculos.Veiculo;

public interface CalculoValor{
	public abstract double valorConta(Veiculo veiculo, long periodo); 
	
}
