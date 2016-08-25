package br.uece.ees.padroesdeprojetos.q03_FactoryMethod;

public class ImagemBMP implements Imagem {
	
	@Override
	public void carregar() {System.out.println("Carregando imagem BMP...");
	}

	@Override
	public void exibir() {System.out.println("Exibindo imagem BMP por 20 segundos");
	}

	@Override
	public void fechar() {System.out.println("Fechando imagem");
		
	}

}
