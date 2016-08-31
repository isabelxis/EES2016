package br.uece.ees.padroesdeprojetos.q06_Command;

public class Corrida implements JoystickCommand {
	
	@Override
	public void apertaBotaoA() {
		System.out.println("Corrida: Acelerando...");
	}

	@Override
	public void apertaBotaoB() {
		System.out.println("Corrida: Parando...");
	}

}
