package estacionamento;

import java.util.concurrent.TimeUnit;

import veiculo.Veiculo;

public class ValorHora extends CalculaValor{

	public ValorHora(long periodo) {
		super(periodo);
	}

	@Override
	public double valorConta(Veiculo veiculo, long periodo) {
		return veiculo.getTaxaHora() * calcTempo();
	}

	@Override
	public double calcTempo() {
		return TimeUnit.MILLISECONDS.toHours(this.periodo);
	}


}
