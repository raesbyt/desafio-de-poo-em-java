package iphone.entities;

import java.util.Scanner;

import iphone.interfaces.AparelhoTelefonico;
import iphone.interfaces.NavegadorInternet;
import iphone.interfaces.ReprodutorMusical;

public class iPhone {
	
	private Scanner scanner;

	private int opcao;

	public iPhone(Scanner scanner) {
		this.scanner = scanner;
	}

	public void appMusica(ReprodutorMusical musica) {
		do {
			System.out.println("\n***Reprodutor Musical***");
			System.out.println("1 - Tocar música");
			System.out.println("2 - Pausar música");
			System.out.println("3 - Selecionar música");
			System.out.println("0 - Sair");

			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1 -> musica.tocar();
			case 2 -> musica.pausar();
			case 3 -> {
				System.out.print("Digite o nome da música: ");
				String selecionar = scanner.nextLine();
				musica.selecionarMusica(selecionar);
			}
			case 0 -> System.out.println("Encerrando App...");
			default -> System.out.println("Opção inválida.");
			}
			
			acessoMenu();

		} while (opcao != 0);

	}

	public void appTelefone(AparelhoTelefonico telefone) {
		do {
			System.out.println("\n***Aparelho Telefonico***");
			System.out.println("1 - Ligar");
			System.out.println("2 - Atender");
			System.out.println("3 - Iniciar correio de voz");
			System.out.println("0 - Sair");

			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1 -> {
				System.out.print("Digite o número para ligar: ");
				String numero = scanner.nextLine();
				telefone.ligar(numero);
			}
			case 2 -> telefone.atender();
			case 3 -> telefone.iniciarCorreioVoz();
			case 0 -> System.out.println("Encerrando App...");

			default -> System.out.println("Opção inválida.");
			}

			acessoMenu();

		} while (opcao != 0);

	}

	public void appNavegador(NavegadorInternet navagador) {
		do {
			System.out.println("\n***Navegador Internet***");
			System.out.println("1 - Exibir página");
			System.out.println("2 - Adicionar nova aba");
			System.out.println("3 - Atualizar página");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");

			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1 -> {
				System.out.print("Digite a URL da página: ");
				String url = scanner.nextLine();
				navagador.exibirPagina(url);
			}
			case 2 -> navagador.adicionarNovaAba();
			case 3 -> navagador.atualizarPagina();
			case 0 -> System.out.println("Encerrando App...");

			default -> System.out.println("Opção inválida.");
			}

			acessoMenu();

		} while (opcao != 0);

	}
	
	private void acessoMenu() {
		if (opcao != 0) {
			System.out.println("\nPressione enter para o menu: ");
			scanner.nextLine();
		}
		
	}

}
