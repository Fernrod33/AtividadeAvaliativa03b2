package objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaVagas {

	private static List<Vagas> listaVagas;
	static Scanner scan = new Scanner(System.in);
	
	public ListaVagas() {
		listaVagas = new ArrayList<Vagas>();
	}
	
	public void adicionarVaga() {
		System.out.println("Digite o numero da vaga:");
		int numero = scan.nextInt();
		int tamanho = 0;
		while((tamanho < 1) && (tamanho > 3)) {
			System.out.println("Digite o tamanho da vaga (1 - pequena; 2 - media; 3 - grande):");
			tamanho = scan.nextInt();
			if((tamanho < 1) && (tamanho > 3)) {
				System.out.println("Valor invalido, digite novamente.");
			}
		}
		boolean disponibilidade = true;
		Vagas novaVaga = new Vagas(numero, tamanho, disponibilidade);
		listaVagas.add(novaVaga);
		System.out.println("Vaga adicionada com sucesso!\n");
	}
	
	public void removerVaga() {
		if(listaVagas.isEmpty()) {
			System.out.println("Nao ha vagas cadastradas.\n");
		} else {
			System.out.println("Digite o numero da vaga:");
			int buscaVaga = scan.nextInt();
			for(Vagas novaVaga : listaVagas) {
				if(buscaVaga == novaVaga.getNumero()) {
					listaVagas.remove(novaVaga);
					System.out.println("Vaga removida com sucesso!\n");
					return;
				}
			}
			System.out.println("Vaga nao localizada.\n");
			return;
		}
		return;
	}
	
	public void listarVagas() {
		if(listaVagas.isEmpty()) {
			System.out.println("Nao ha vagas cadastradas.\n");
		} else {
			for(Vagas novaVaga : listaVagas) {
					System.out.println(novaVaga.toString());
					return;
			}
		}
		return;
	}
	
	public static Vagas buscarVaga(int buscaVaga) {
		if(listaVagas.isEmpty()) {
			System.out.println("Nao ha vagas cadastradas.\n");
		} else {
			for(Vagas novaVaga : listaVagas) {
				if(buscaVaga == novaVaga.getNumero()) {
					return novaVaga;
				}
			}
		}
		return null;
	}
	
	public void informacoes1() {
		int numero = 1;
		int tamanho = 1;
		boolean disponibilidade = true;
		Vagas novaVaga = new Vagas(numero, tamanho, disponibilidade);
		listaVagas.add(novaVaga);
	}
	
	public void informacoes2() {
		int numero = 2;
		int tamanho = 2;
		boolean disponibilidade = true;
		Vagas novaVaga = new Vagas(numero, tamanho, disponibilidade);
		listaVagas.add(novaVaga);
	}
	
	public void informacoes3() {
		int numero = 3;
		int tamanho = 3;
		boolean disponibilidade = true;
		Vagas novaVaga = new Vagas(numero, tamanho, disponibilidade);
		listaVagas.add(novaVaga);
	}
	
}
