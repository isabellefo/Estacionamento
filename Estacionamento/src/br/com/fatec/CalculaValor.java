package br.com.fatec;

public abstract class CalculaValor{
	
	public double periodo = 0;
	
	public CalculaValor(long periodo) {
		this.periodo = periodo;
	}

	public abstract double valorConta(); 

}
