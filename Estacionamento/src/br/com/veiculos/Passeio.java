package br.com.veiculos;

public class Passeio extends Veiculo{	
	
	public Passeio(double taxaHora, double taxaDia, double taxaMes) {
		super(taxaHora, taxaDia, taxaMes);
	}
	
	public double getTaxaHora() {
		return this.taxaHora;
	}
	
	public double getTaxaDia() {
		return this.taxaDia;
	}
	
	public double getTaxaMes() {
		return this.taxaMes;
	}
}
