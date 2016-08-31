package br.uece.ees.padroesdeprojetos.q06_Command;

public class Luta implements JoystickCommand {

	@Override
	public void apertaBotaoA() {
		System.out.println("Luta: Chutando Alto...");
	}

	@Override
	public void apertaBotaoB() {
		System.out.println("Luta: Soco Forte...");
	}
}
