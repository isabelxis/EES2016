package br.uece.ees.padroesdeprojetos.q03_FactoryMethod;

public class VisualizadorBMP implements FabricaDeVisualizador {

	@Override
	public void visualizar() {
		Imagem img = new ImagemBMP();
		img.carregar();
		img.exibir();
		img.fechar();
	}

}
