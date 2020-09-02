package estacionamento;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import veiculo.Veiculo;

public class ContaEstacionamento {
	private static final DateFormat ISO8601 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	private Veiculo veiculo;
	private CalculoValor conta;
	private Date chegada;
	private Date saida;
	
	public ContaEstacionamento(Veiculo veiculo, CalculoValor conta, String chegada) throws ParseException {
		this.veiculo = veiculo;
		this.conta = conta;
		this.chegada = ISO8601.parse(chegada);
	}
	
	public void setConta(CalculoValor conta) {
		this.conta = conta;
	}
	
	public void setSaida(String saida) throws ParseException {
		this.saida = ISO8601.parse(saida);
	}
	
	public double calcular(CalculoValor conta) {
		long periodo = calcPeriodo();
		return conta.valorConta(veiculo, periodo);
	}

	private long calcPeriodo() {
		return saida.getTime() - chegada.getTime(); 
	}

}
