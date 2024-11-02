package sistema;

import java.util.InputMismatchException;
import java.util.Scanner;
import objetos.ListaCarros;
import objetos.ListaRelacaoEntradas;
import objetos.ListaVagas;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	static ListaVagas novaListaVagas = new ListaVagas();
	static ListaCarros novaListaCarros = new ListaCarros();
	static ListaRelacaoEntradas novaRelacao = new ListaRelacaoEntradas();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bem vindo ao sistema!");
		novaListaVagas.informacoes1();
		novaListaVagas.informacoes2();
		novaListaVagas.informacoes3();
		novaListaCarros.informacoes1();
		novaListaCarros.informacoes2();
		executar();
	}

	static void executar() {
		boolean continuar = true;
		while(continuar) {
			exibirMenu();
			try {
				int escolha = scan.nextInt();
				switch(escolha) {
					case 1: {
						exibirMenuVagas();
						escolha = scan.nextInt();
						if(escolha == 1) {
							novaListaVagas.adicionarVaga();
						}
						if(escolha == 2) {
							novaListaVagas.removerVaga();
						}
						break;
					}
					case 2: {
						exibirMenuCarros();
						escolha = scan.nextInt();
						if(escolha == 1) {
							novaListaCarros.adicionarCarro();
						}
						if(escolha == 2) {
							novaListaCarros.removerCarro();
						}
						if(escolha == 3) {
							novaListaCarros.listarCarros();
						}
						break;
					}
					case 3: {
						novaRelacao.adicionarEntrada();
						break;
					}
					case 4: {
						novaRelacao.registrarSaida();
						break;
					}
					case 5: {
						novaRelacao.buscarEntradas();
						break;
					}
					case 6: {
						continuar = false;
						System.out.println("Saindo do sistema...");
						break;
					}
				}
			} catch (InputMismatchException e) {
	            System.out.println("Entrada invalida.");
	            executar();
			}
		}
	}
	
	static void exibirMenu() {
		System.out.println("Digite uma das opcoes:");
		System.out.println("1 - Gerenciar vagas");
		System.out.println("2 - Gerenciar carros");
		System.out.println("3 - Registrar entrada");
		System.out.println("4 - Registrar saida e calcular valor");
		System.out.println("5 - Buscar entradas por veiculo");
		System.out.println("6 - Sair do sistema");
	}
	
	static void exibirMenuVagas() {
		System.out.println("Digite uma das opcoes:");
		System.out.println("1 - Adicionar vaga");
		System.out.println("2 - Remover vaga");
		System.out.println("3 - Listar vagas");
	}
	
	static void exibirMenuCarros() {
		System.out.println("Digite uma das opcoes:");
		System.out.println("1 - Adicionar carro");
		System.out.println("2 - Remover carro");
		System.out.println("3 - Listar carros");
	}
	
}