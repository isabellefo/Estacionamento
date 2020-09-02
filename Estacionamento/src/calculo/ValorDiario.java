package calculo;

import java.util.concurrent.TimeUnit;

import veiculo.Veiculo;

public class ValorDiario extends CalculaValor{
	
	public ValorDiario(long periodo) {
		super(periodo);
	}
	
	public double calcTempo() {
		return TimeUnit.MILLISECONDS.toDays(this.periodo) + 1;
	}

	public double valorConta(Veiculo veiculo, long periodo) {
		return veiculo.getTaxaDia() * calcTempo();
	}

}
