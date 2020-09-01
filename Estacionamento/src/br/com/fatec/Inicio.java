package br.com.fatec;

import java.util.Scanner;

public class Inicio {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		ContaEstacionamento calc = new ContaEstacionamento();
		
		long inicio, fim;
		double hora = 3600000;
		double dia = 86400000;
		double mes = 2592E6;
		double value = 0;
		
		System.out.println("Digite a entrada no estacionamento");
		inicio = scanner.nextInt();
		System.out.println("Digite o horário de entrada");
		fim = scanner.nextInt();
		
		long periodo = fim - inicio;
		
		if (periodo < 12 * hora) {
			calc.conta = new ValorHora(periodo);
			value = calc.conta.valorConta();
		}else if(periodo > 12 * hora && periodo < 15 * dia) {
			calc.conta = new ValorDiario(periodo);
		}else {
			calc.conta = new ValorMensal(periodo);
		}
		
		System.out.println(value);
		
		
		

	}

}
