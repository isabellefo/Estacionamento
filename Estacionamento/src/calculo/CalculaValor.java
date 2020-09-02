package calculo;

import veiculo.Veiculo;

public abstract class CalculaValor {
	
	public long periodo = 0;

	public CalculaValor(long periodo) {
		this.periodo = periodo;
	}
	
	public abstract double calcTempo();
	
	public abstract double valorConta(Veiculo veiculo, long periodo); 

}
