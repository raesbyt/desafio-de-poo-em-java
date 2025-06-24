package iphone.application;

import java.util.Scanner;

import iphone.entities.iPhone;
import iphone.services.AparelhoTelefonicoService;
import iphone.services.NavegadorInternetService;
import iphone.services.ReprodutorMusicalService;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		iPhone iphone = new iPhone(scanner);

		int opcao;
		do {
			System.out.println("\n*** Menu iPhone ***");
			System.out.println("1 - app Música");
			System.out.println("2 - App Telefone");
			System.out.println("3 - App Navegador");
			System.out.println("0 - Sair");

			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1 -> iphone.appMusica(new ReprodutorMusicalService());
			case 2 -> iphone.appTelefone(new AparelhoTelefonicoService());
			case 3 -> iphone.appNavegador(new NavegadorInternetService());
			case 0 -> System.out.println("Encerrando...");

			default -> System.out.println("Opção inválida.");
			}


		} while (opcao != 0);
		
		scanner.close();
		
	}

}
