package objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaCarros {
	
	private static List<Carros> listaCarros;
	static Scanner scan = new Scanner(System.in);
	
	public ListaCarros() {
		listaCarros = new ArrayList<Carros>();
	}
	
	public void adicionarCarro() {
		System.out.println("Digite a placa do carro:");
		String placa = scan.next();
		System.out.println("Digite o modelo do carro:");
		String modelo = scan.next();
		int tamanho = 0;
		while((tamanho < 1) && (tamanho > 3)) {
			System.out.println("Digite o tamanho do carro (1 - pequena; 2 - media; 3 - grande):");
			tamanho = scan.nextInt();
			if((tamanho < 1) && (tamanho > 3)) {
				System.out.println("Valor invalido, digite novamente.\n");
			}
		}
		Carros novoCarro = new Carros(placa, modelo, tamanho);
		listaCarros.add(novoCarro);
		System.out.println("Carro adicionado com sucesso!\n");
	}
	
	public void removerCarro() {
		if(listaCarros.isEmpty()) {
			System.out.println("Nao ha carros cadastrados.\n");
		} else {
			System.out.println("Digite a placa do carro:");
			String buscaCarro = scan.next();
			for(Carros novoCarro : listaCarros) {
				if(novoCarro.getPlaca().equals(buscaCarro)) {
					listaCarros.remove(novoCarro);
					System.out.println("Carro removido com sucesso!\n");
					return;
				}
			}
			System.out.println("Carro nao localizado.\n");
			return;
		}
		return;
	}
	
	public void listarCarros() {
		if(listaCarros.isEmpty()) {
			System.out.println("Nao ha carros cadastrados.\n");
		} else {
			for(Carros novoCarro : listaCarros) {
				System.out.println(novoCarro.toString());
			}
		}
		return;
	}
	
	public static Carros buscarCarro(String buscaCarro) {
		if(listaCarros.isEmpty()) {
			System.out.println("Nao ha carros cadastrados.\n");
		} else {
			for(Carros carro : listaCarros) {
				if(buscaCarro.equalsIgnoreCase(carro.getPlaca())) {
					return carro;
				}
			}
		}
		return null;
	}
	
	public void informacoes1() {
		String placa = "aaa1a111";
		String modelo = "Fusca";
		int tamanho = 1;
		Carros novoCarro = new Carros(placa, modelo, tamanho);
		listaCarros.add(novoCarro);
	}
	
	public void informacoes2() {
		String placa = "bbb2b222";
		String modelo = "F1000";
		int tamanho = 3;
		Carros novoCarro = new Carros(placa, modelo, tamanho);
		listaCarros.add(novoCarro);
	}
	
}
