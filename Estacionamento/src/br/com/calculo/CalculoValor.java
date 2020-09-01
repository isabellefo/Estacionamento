package br.com.calculo;

public abstract class CalculoValor{
	
	public double periodo = 0;
	
	public CalculoValor(long periodo) {
		this.periodo = periodo;
	}

	public abstract double valorConta(); 

}
