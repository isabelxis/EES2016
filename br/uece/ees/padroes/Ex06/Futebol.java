package br.uece.ees.padroesdeprojetos.q06_Command;

public class Futebol implements JoystickCommand {
	
	@Override
	public void apertaBotaoA() {
		System.out.println("Futebol: Correndo...");
		
	}

	@Override
	public void apertaBotaoB() {
		System.out.println("Futebol: Chutando a bola...");
		
	}

}
