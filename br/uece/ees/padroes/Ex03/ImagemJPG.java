package br.uece.ees.padroesdeprojetos.q03_FactoryMethod;

public class ImagemJPG implements Imagem {
	
	@Override
	public void carregar() {System.out.println("Carregando imagem JPG...");
	}

	@Override
	public void exibir() {System.out.println("Exibindo imagem JPG  por 20 segundos");
	}

	@Override
	public void fechar() {System.out.println("Fechando imagem");
		
	}


}
