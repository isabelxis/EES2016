package br.uece.ees.padroesdeprojetos.q03_FactoryMethod;

public class Cliente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Stub de método gerado automaticamente
		
		FabricaDeVisualizador visualizar = new VisualizadorBMP();
		visualizar.visualizar();
		System.out.println("----------------------------------------------------------");
		visualizar = new VisualizadorJPG();
		visualizar.visualizar();

	}

}
