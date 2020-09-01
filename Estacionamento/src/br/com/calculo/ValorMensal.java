package br.com.calculo;

public class ValorMensal extends CalculaValor{
	
	private final double mes = 2592E6;
	
	public ValorMensal(long periodo) {
		super(periodo);
		// TODO Auto-generated constructor stub
	}


	@Override
	public double valorConta() {
		return 300.0*Math.ceil((periodo)/mes);
	}
	
	

}
