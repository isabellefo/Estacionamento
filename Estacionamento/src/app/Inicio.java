package app;

import java.text.ParseException;

import estacionamento.*;
import veiculo.*;

public class Inicio {
	public static boolean sucesso = true;
	public static void main(String[] args) throws ParseException {
		double esperado;
		Veiculo passeio = new Passeio(2, 26, 300);
		Veiculo carga = new Carga(4, 24, 52, 4, 100);
		CalculoValor valorHora = new ValorHora();
		CalculoValor valorDiario = new ValorDiario();
		CalculoValor valorMensal = new ValorMensal();
		ContaEstacionamento conta =  new ContaEstacionamento(passeio,"2020-09-01T07:10:00", valorHora);
		//valorHora
		conta.setSaida("2020-09-01T08:09:00");
		double passeioHora = conta.calcular();
		esperado = 2 * 1;
		testar("Teste de carro de passeio e cobrança por hora", passeioHora, esperado);
		
		conta.setSaida("2020-09-01T08:09:00");
		conta.setVeiculo(carga);
		double cargaHora = conta.calcular();
		esperado = (4 + 2 + 20) * 1;
		testar("Teste de carro de carga e cobrança por hora", cargaHora, esperado);
		
		//valorDia
		conta.setConta(valorDiario);
		conta.setSaida("2020-09-02T07:10:00");
		conta.setVeiculo(passeio);
		double passeioDia = conta.calcular();
		esperado = 26 * 2;
		testar("Teste de carro de passeio e cobrança por dia", passeioDia, esperado);  
		
		conta.setSaida("2020-09-02T07:10:00");
		conta.setVeiculo(carga);
		double cargaDia = conta.calcular();
		esperado = (24 + 2 + 20) * 2;
		testar("Teste de carro de carga e cobrança por dia", cargaDia, esperado);
		
		//ValorMes
		conta.setConta(valorMensal);
		conta.setSaida("2020-11-02T00:00:00");
		conta.setVeiculo(passeio);
		double passeioMes = conta.calcular();
		esperado = 300 * 3;
		testar("Teste de carro de passeio e cobrança por mes", passeioMes, esperado);  
		
		conta.setSaida("2020-11-02T00:00:00");
		conta.setVeiculo(carga);
		double cargaMes = conta.calcular();
		esperado = (52  + 2 + 20) * 3;
		testar("Teste de carro de carga e cobrança por mes", cargaMes, esperado);
		
		if(sucesso) {
			System.out.println("SUCESSO");
		} else {
			System.out.println("ERRO");
		}
	}
	
	public static void testar(String descricao, double recebido , double esperado) {
		if(recebido == esperado) {
			System.out.println("PASSOU " + descricao);
		} else {
			System.out.println("FALHOU " + descricao);
			System.out.println("	esperado: " + esperado);
			System.out.println("	recebido: " + recebido);
			sucesso = false;
		}
	}
}
