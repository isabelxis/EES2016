package br.uece.ees.padroesdeprojetos.q01_Singleton;

public class Logger {
	private boolean ativo = false;
	public static Logger instance;
	
	protected Logger() {}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean b) {
		this.ativo = b;
	}

	public void log(String s) {
		if (this.ativo) {
			System.out.println("LOG :: " + s);
		}

	}

	public static Logger getInstance() {
		if (instance == null) {
			instance = new Logger();
			System.out.println("*** OBJETO CRIADO E INSTANCIADO ***");
		} else {
			System.out.println("******** OBJETO INSTANCIADO *******");
		}
		return instance;
	}
}
