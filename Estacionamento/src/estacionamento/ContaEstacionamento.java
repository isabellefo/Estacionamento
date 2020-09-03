package estacionamento;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import veiculo.Veiculo;

public class ContaEstacionamento {
	private static final DateFormat ISO8601 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	private Veiculo veiculo;
	private CalculoValor conta;
	private Date chegada;
	private Date saida;
	
	public ContaEstacionamento(Veiculo veiculo, String chegada) throws ParseException {
		this.veiculo = veiculo;
		this.chegada = ISO8601.parse(chegada);
		this.conta = conta;

	}
	
	public void setConta(CalculoValor conta) {
		this.conta = conta;
	}
	
	public void setSaida(String saida) throws ParseException {
		this.saida = ISO8601.parse(saida);
	}
	
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public double calcular() {
		long periodo = calcPeriodo();
		escolherValor(periodo);
		return conta.valorConta(veiculo, periodo);
	}
	
	private void escolherValor(long periodo) {
		long horasMaxima = TimeUnit.HOURS.toMillis(12);
		long diasMaximo = TimeUnit.DAYS.toMillis(15);
		if(periodo < horasMaxima) {
			setConta(new ValorHora());
		}else if(periodo < diasMaximo) {
			setConta(new ValorDiario());
		} else {
			setConta(new ValorMensal());
		}
	}
	
	private long calcPeriodo() {
		return saida.getTime() - chegada.getTime(); 
	}

}
