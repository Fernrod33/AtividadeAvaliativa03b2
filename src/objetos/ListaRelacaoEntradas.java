package objetos;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaRelacaoEntradas {
	
	private List<RelacaoEntradas> listaRelacaoEntradas;
	static Scanner scan = new Scanner(System.in);
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
	
	public ListaRelacaoEntradas() {
		listaRelacaoEntradas = new ArrayList<RelacaoEntradas>();
	}
	
	public void adicionarEntrada() {
		System.out.println("Digite o numero da vaga:");
		int buscaVaga = scan.nextInt();
		Vagas vaga = ListaVagas.buscarVaga(buscaVaga);
		if(vaga == null) {
			System.out.println("Vaga nao localizada.\n");
			return;
		}
		System.out.println("Digite a placa do carro (LLLNLNNN):");
		String buscaCarro = scan.next();
		Carros carro = ListaCarros.buscarCarro(buscaCarro);
		if(carro == null) {
			System.out.println("Carro nao localizado.\n");
			return;
		}
		if(carro.getTamanho() > vaga.getTamanho()) {
			System.out.println("Carro nao compativel com a vaga.\n");
			return;
		}
		System.out.println("Digite o horario de entrada (hh:mm):");
		String stringEntrada = scan.next();
		LocalTime entrada;
	    try {
	        entrada = LocalTime.parse(stringEntrada, formato);
	    } catch (DateTimeParseException e) {
	        System.out.println("Data invalida, use o formato correto (hh:mm).");
	        return;
	    }
		LocalTime saida = null;
		double valor = 0;
		double tempo = 0;
		LocalDate data = LocalDate.now();
		RelacaoEntradas novaRelacao = new RelacaoEntradas(vaga, carro, entrada, saida, valor, tempo, data);
		listaRelacaoEntradas.add(novaRelacao);
		novaRelacao.getVaga().setDisponibilidade(false);
		System.out.println("Entrada cadastrada com sucesso!\n");
	}
	
	public void removerEntrada() {
		if(listaRelacaoEntradas.isEmpty()) {
			System.out.println("Nao ha entradas cadastradas.\n");
		} else {
			System.out.println("Digite a placa do carro (LLLNLNNN):");
			String buscaCarro = scan.next();
			for(RelacaoEntradas novaRelacao : listaRelacaoEntradas) {
				if(novaRelacao.getCarro().getPlaca().equals(buscaCarro)) {
					listaRelacaoEntradas.remove(novaRelacao);
					System.out.println("Entrada removida com sucesso!\n");
					return;
				}
			}
			System.out.println("Carro nao localizado.\n");
			return;
		}
		return;
	}
	
	public void registrarSaida() {
		if(listaRelacaoEntradas.isEmpty()) {
			System.out.println("Nao ha entradas cadastradas.\n");
		} else {
			System.out.println("Digite a placa do carro (LLLNLNNN):");
			String buscaCarro = scan.next();
			for(RelacaoEntradas novaRelacao : listaRelacaoEntradas) {
				if(novaRelacao.getCarro().getPlaca().equals(buscaCarro)) {
					System.out.println("Digite o horario de saida (hh:mm):");
					String stringSaida = scan.next();
					LocalTime saida;
				    try {
				        saida = LocalTime.parse(stringSaida, formato);
				    } catch (DateTimeParseException e) {
				        System.out.println("Data invalida, use o formato correto (hh:mm).\n");
				        return;
				    }
				    novaRelacao.setSaida(saida);
				    Duration duracao = Duration.between(novaRelacao.getEntrada(), saida);
				    double tempo = duracao.toMinutes() / 60.0;
				    System.out.println(tempo);
				    novaRelacao.setTempo(tempo);
				    if(tempo <= 1) {
				    	double valor = 5;
				    	novaRelacao.setValor(valor);
				    	System.out.println("O valor a pagar e: R$" + valor + ".\n");
				    	novaRelacao.getVaga().setDisponibilidade(true);
				    	return;
				    } else if((tempo > 1) && (tempo <= 3)) {
				    	double valor = 10;
				    	novaRelacao.setValor(valor);
				    	System.out.println("O valor a pagar e: R$" + valor + ".\n");
				    	novaRelacao.getVaga().setDisponibilidade(true);
				    	return;
				    } else {
				    	double valor = 15;
				    	novaRelacao.setValor(valor);
				    	System.out.println("O valor a pagar e: R$" + valor + ".\n");
				    	novaRelacao.getVaga().setDisponibilidade(true);
				    	return;
				    }
						
				}
			}
			System.out.println("Carro nao localizado.\n");
			return;
		}
		return;
	}
	
	public void buscarEntradas() {
		if(listaRelacaoEntradas.isEmpty()) {
			System.out.println("Nao ha entradas cadastradas.\n");
		} else {
			System.out.println("Digite a placa do carro (LLLNLNNN):");
			String buscaCarro = scan.next();
			boolean encontrado = false;
			for(RelacaoEntradas novaRelacao : listaRelacaoEntradas) {
				if(novaRelacao.getCarro().getPlaca().equals(buscaCarro)) {
					System.out.println(novaRelacao.toString());
					encontrado = true;
				}
			}
			if(!encontrado) {
				System.out.println("Carro nao localizado.\n");
				return;
			}
		}
		return;
	}
}
