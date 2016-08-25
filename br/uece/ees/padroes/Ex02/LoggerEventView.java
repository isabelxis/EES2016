package br.uece.ees.padroesdeprojetos.q02_Strategy;

public class LoggerEventView implements LoggerStrategy {
	
	@Override
	public void setLog() {
		System.out.println("EVENTO REGISTRADO EM EVENTVIEWER");
	}
}

