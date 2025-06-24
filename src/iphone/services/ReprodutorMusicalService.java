package iphone.services;

import iphone.interfaces.ReprodutorMusical;

public class ReprodutorMusicalService implements ReprodutorMusical{
	
private boolean tocando;
	
	public ReprodutorMusicalService() {
		this.tocando = false;
	}

	@Override
	public void tocar() {
		if (!tocando) {
			System.out.println("Tocando música...");
			tocando = true;
		} else {
			System.out.println("A música já esta tocando...");
		}
		
	}

	@Override
	public void pausar() {
		if (tocando) {
			System.out.println("Música pausada.");
			tocando = false;
		} else {
			System.out.println("Não tem música tocando.");
		}
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando a música: " + musica);
		
	}

}
