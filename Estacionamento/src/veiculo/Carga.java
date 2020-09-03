package veiculo;

public class Carga extends Veiculo {
	private int eixos;
	private double valorCarga;
	private static final int EIXO_POR_REAL = 2;
	private static final double TAXA_DE_CUSTO = 0.2;
	
	public Carga(double taxaHora, double taxaDia, double taxaMes, int eixos, double valorCarga) {
		super(taxaHora, taxaDia, taxaMes);
		this.eixos = eixos;
		this.valorCarga = valorCarga;
	}
	
	private double getTaxaCarga() {
		return valorCarga * Carga.TAXA_DE_CUSTO;
	}
	
	private double getTaxaEixos() {
		return eixos / Carga.EIXO_POR_REAL;
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