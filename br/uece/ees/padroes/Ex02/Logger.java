package br.uece.ees.padroesdeprojetos.q02_Strategy;

public class Logger {

	private boolean ativo = false;

	private LoggerStrategy strategy;

	public Logger(LoggerStrategy strategy) {
		super();
		this.strategy = strategy;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public void log() {
		if (this.ativo) {
			this.strategy.setLog();
		}
	}
	
}
