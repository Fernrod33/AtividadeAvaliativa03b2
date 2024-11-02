package objetos;

public class Vagas {
	
	private int numero;
	private int tamanho;
	private boolean disponibilidade;
	
	public Vagas() {
	
	}
	
	public Vagas(int numero, int tamanho, boolean disponibilidade) {
		this.numero = numero;
		this.tamanho = tamanho;
		this.disponibilidade = disponibilidade;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	@Override
	public String toString() {
		if(disponibilidade) {
			switch(tamanho) {
				case 1: {
					return "Vaga: [Numero: " + numero + "; Tamanho: Pequena; Disponivel]\n";
				}
				case 2: {
					return "Vaga: [Numero: " + numero + "; Tamanho: Media; Disponivel]\n";
				}
				default: {
					return "Vaga: [Numero: " + numero + "; Tamanho: Grande; Disponivel]\n";
				}
			}	
		} else {
			switch(tamanho) {
				case 1: {
					return "Vaga: [Numero: " + numero + "; Tamanho: Pequena; Indisponivel]\n";
				}
				case 2: {
					return "Vaga: [Numero: " + numero + "; Tamanho: Media; Indisponivel]\n";
				}
				default: {
					return "Vaga: [Numero: " + numero + "; Tamanho: Grande; Indisponivel]\n";
				}
			}	
		}
	}
	
}