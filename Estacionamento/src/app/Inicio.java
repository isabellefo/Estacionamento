package app;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import estacionamento.ContaEstacionamento;
import estacionamento.ValorDiario;
import estacionamento.ValorHora;
import estacionamento.ValorMensal;
import veiculo.Passeio;


public class Inicio {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws ParseException {
		
		ContaEstacionamento calc = new ContaEstacionamento();
		
		DateFormat formato = new SimpleDateFormat("dd/MM/yyyy hh:mm");
	
		double hora = 3600000;
		double dia = 86400000;
	
		Date chegada = formato.parse("01/09/2020 16:50");
		Date saida = formato.parse("01/11/2020 18:50");
		
		long periodo = saida.getTime() - chegada.getTime(); 
		
		calc.veiculo = new Passeio(2.0, 26.0, 300.0);
		
		if (periodo <= 12 * hora) {
			
			calc.conta = new ValorHora(periodo);
			
		}else if(periodo > 12 * hora && periodo < 15 * dia) {
			
			calc.conta = new ValorDiario(periodo);
			
		}else {
			
			calc.conta = new ValorMensal(periodo);
			
		}
		
		System.out.println(calc.calcular());

	}
}
