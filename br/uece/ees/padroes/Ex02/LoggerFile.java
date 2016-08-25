package br.uece.ees.padroesdeprojetos.q02_Strategy;

public class LoggerFile implements LoggerStrategy {
	
	@Override
	public void setLog() {
		System.out.println("EVENTO REGISTRADO EM ARQUIVO");
	}
}
