package src;

public class Iphone implements NavegadorDeInternet, AparelhoTelefone, ReprodutorDeMusica{

	@Override
	public void iniciarMusica() {
		System.out.println("Iniciando música no Iphone.");
	}

	@Override
	public void pausarMusica() {
		System.out.println("Pausando música no Iphone.");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando música no Iphone.");
	}

	@Override
	public void atenderLigacao() {
		System.out.println("Atendendo ligação no Iphone.");
	}

	@Override
	public void iniciarLigacao() {
		System.out.println("Iniciando ligação no Iphone.");
	}

	@Override
	public void finalizarLigacao() {
		System.out.println("Finalizando ligação no Iphone.");
	}

	@Override
	public void acessarPagina() {
		System.out.println("Acessando página no Iphone.");
	}

	@Override
	public void mudarPagina() {
		System.out.println("Mudando página no Iphone.");
	}

	@Override
	public void fecharPagina() {
		System.out.println("Fechando página no Iphone.");
	}

}
