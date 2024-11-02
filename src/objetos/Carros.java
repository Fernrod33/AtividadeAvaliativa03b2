package objetos;

public class Carros {

	private String placa;
	private String modelo;
	private int tamanho;
	
	public Carros() {
		
	}
	
	public Carros(String placa, String modelo, int tamanho) {
		this.placa = placa;
		this.modelo = modelo;
		this.tamanho = tamanho;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		if(tamanho == 1) {
			return "Carro: [Placa: " + placa + "; Modelo: " + modelo + "; Tamanho: Pequeno]\n";
		} else if(tamanho == 2) {
			return "Carro: [Placa: " + placa + "; Modelo: " + modelo + "; Tamanho: Medio]\n";
		} else {
			return "Carro: [Placa: " + placa + "; Modelo: " + modelo + "; Tamanho: Grande]\n";
		}
	}
	
}
