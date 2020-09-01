package br.com.veiculos;

public abstract class Veiculo {
	public static double taxaBase = 1;
	protected double taxaHora;
	protected double taxaDia;
	protected double taxaMes;
	
	
	public Veiculo(double taxaHora, double taxaDia, double taxaMes) {
		this.taxaHora = taxaHora;
		this.taxaDia = taxaDia;
		this.taxaMes = taxaMes;
	}
	
	public abstract double getTaxaHora();
	public abstract double getTaxaDia();
	public abstract double getTaxaMes();
}
