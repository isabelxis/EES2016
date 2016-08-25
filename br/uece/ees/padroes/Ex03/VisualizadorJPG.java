package br.uece.ees.padroesdeprojetos.q03_FactoryMethod;

public class VisualizadorJPG implements FabricaDeVisualizador{
	
	@Override
	public void visualizar() {
		Imagem img = new ImagemJPG();
		img.carregar();
		img.exibir();
		img.fechar();
	}
}
