package br.uece.ees.padroesdeprojetos.q01_Singleton;

public class Aplicacao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Stub de método gerado automaticamente
		Logger logger = Logger.getInstance();
		logger.setAtivo(true);
		logger.log("PRIMEIRA MENSAGEM DE LOG");
		Logger logger2 = Logger.getInstance();
		logger2.log("SEGUNDA MENSAGEM DE LOG");


	}

}
