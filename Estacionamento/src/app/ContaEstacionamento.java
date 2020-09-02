package app;

import calculo.CalculaValor;
import veiculo.Veiculo;

public class ContaEstacionamento {
	public Veiculo veiculo;
	public CalculaValor conta;
	public long periodo;
		
	public double calcular() {
		return conta.valorConta(veiculo, periodo);
	}
	
	public long calcularPeriodo(long periodo) {
		return periodo;
		
	}

}