package estacionamento;

import veiculo.Veiculo;

public interface CalculoValor{
	public abstract double valorConta(Veiculo veiculo, long periodo); 
	
}
