package objetos;

import java.time.LocalDate;
import java.time.LocalTime;

public class RelacaoEntradas {
	
	private Vagas vaga;
	private Carros carro;
	private LocalTime entrada;
	private LocalTime saida;
	private double valor;
	private double tempo;
	private LocalDate data;
	
	public RelacaoEntradas() {
		
	}
	
	public RelacaoEntradas(Vagas vaga, Carros carro, LocalTime entrada, LocalTime saida, double valor, double tempo, LocalDate data) {
		this.vaga = vaga;
		this.carro = carro;
		this.entrada = entrada;
		this.saida = saida;
		this.valor = valor;
		this.tempo = tempo;
		this.data = data;
	}

	public Vagas getVaga() {
		return vaga;
	}
	
	public void setVaga(Vagas vaga) {
		this.vaga = vaga;
	}
	
	public Carros getCarro() {
		return carro;
	}
	
	public void setCarro(Carros carro) {
		this.carro = carro;
	}
	
	public LocalTime getEntrada() {
		return entrada;
	}
	
	public void setEntrada(LocalTime entrada) {
		this.entrada = entrada;
	}
	
	public LocalTime getSaida() {
		return saida;
	}
	
	public void setSaida(LocalTime saida) {
		this.saida = saida;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getTempo() {
		return tempo;
	}

	public void setTempo(double tempo) {
		this.tempo = tempo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		if(saida != null) {
			return vaga + "\n" + carro + "\nData: [" + data + "]\nEntrada: [" + entrada + "]\nSaida: [" + saida + "]\nTempo de estadia: [" + tempo + "]\nValor pago: [R$" + valor + "]\n";
		} else {
			return vaga +
					",\n" + carro +	"\nData: [" + data + "]\nEntrada: [" + entrada + "]\n";
		}
	}
	
}
