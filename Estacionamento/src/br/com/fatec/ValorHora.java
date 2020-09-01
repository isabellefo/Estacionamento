package br.com.fatec;

public class ValorHora extends CalculaValor{
	
	private final double hora = 3600000;
	
	public ValorHora(long periodo) {
		super(periodo);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double valorConta() {
		return 2.0*Math.ceil((periodo)/hora);
	}

}
