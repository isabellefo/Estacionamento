package estacionamento;

import java.util.concurrent.TimeUnit;

import veiculos.Veiculo;

public class ValorDiario implements CalculoValor{
	
	private double calcTempo(long perido) {
		return TimeUnit.MILLISECONDS.toDays(perido) + 1;
	}
	
	@Override
	public double valorConta(Veiculo veiculo, long periodo) {
		return veiculo.getTaxaDia() * calcTempo(periodo);
	}
}
