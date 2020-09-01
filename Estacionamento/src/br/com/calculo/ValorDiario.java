package br.com.calculo;

import br.com.veiculos.Veiculo;

public class ValorDiario extends CalculoValor{
	
	private static final double DIA = 86400000;
	
	public ValorDiario(long periodo) {
		super(periodo);
	}
	
	private double calcTempo() {
		return Math.ceil((periodo)/DIA);
	}
	
	@Override
	public double valorConta(Veiculo veiculo) {
		return veiculo.getTaxaDia() * calcTempo();
	}

}
