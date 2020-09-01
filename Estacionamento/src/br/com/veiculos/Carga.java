package br.com.veiculos;

public class Carga extends Veiculo {
	private int eixos;
	private double valorCarga;
	
	public Carga(double taxaHora, double taxaDia, double taxaMes, int eixos, double valorCarga) {
		super(taxaHora, taxaDia, taxaMes);
		this.eixos = eixos;
		this.valorCarga = valorCarga;
	}
	
	public double getTaxaCarga() {
		return valorCarga * 0.2;
	}
	
	public double getTaxaEixos() {
		return eixos/4;
	}
	
	private double getTaxa(double taxaTempo) {
		return taxaTempo + getTaxaCarga() + getTaxaEixos();
	}
	
	public double getTaxaHora() {
		return getTaxa(taxaHora);
	}
	
	public double getTaxaDia() {
		return getTaxa(taxaDia);
	}
	
	public double getTaxaMes() {
		return getTaxa(taxaMes);
	}
}
