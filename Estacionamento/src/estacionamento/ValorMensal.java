package estacionamento;

import java.util.concurrent.TimeUnit;

import veiculo.Veiculo;

public class ValorMensal implements CalculoValor{

	private long calcTempo(long periodo) {
		long dias = TimeUnit.MILLISECONDS.toDays(periodo); 
		return (long) Math.ceil(dias / 30.0);
	}
	@Override
	public double valorConta(Veiculo veiculo, long periodo) {
		return veiculo.getTaxaMes() * calcTempo(periodo);
	}
	
	

}
