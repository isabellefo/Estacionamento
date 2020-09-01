package br.com.calculo;

public class ValorDiario extends CalculoValor{
	
	private final double dia = 86400000;
	
	public ValorDiario(long periodo) {
		super(periodo);
	}

	@Override
	public double valorConta() {
		return 26.0*Math.ceil((periodo)/dia);
	}

}
