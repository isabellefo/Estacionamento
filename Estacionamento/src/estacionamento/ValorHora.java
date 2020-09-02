package estacionamento;

import java.util.concurrent.TimeUnit;

import veiculo.Veiculo;

public class ValorHora implements CalculoValor{
	
	private long calcTempo(long periodo) {
		return TimeUnit.MILLISECONDS.toHours(periodo) + 1;
	}
	@Override
	public double valorConta(Veiculo veiculo, long periodo) {
		return veiculo.getTaxaHora() * calcTempo(periodo);
	}

}
