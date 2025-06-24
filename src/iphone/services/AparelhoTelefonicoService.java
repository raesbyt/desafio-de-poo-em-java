package iphone.services;

import iphone.interfaces.AparelhoTelefonico;

public class AparelhoTelefonicoService implements AparelhoTelefonico {

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada...");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz.");
		
	}
}
