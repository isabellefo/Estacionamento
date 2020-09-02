package estacionamento;

import veiculo.Veiculo;

public class ValorMensal extends CalculaValor{

	public ValorMensal(long periodo) {
		super(periodo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcTempo() {
		return Math.ceil(this.periodo/2592E6);
	}

	@Override
	public double valorConta(Veiculo veiculo, long periodo) {
		return veiculo.getTaxaMes() * calcTempo();
	}

}
