package br.uece.ees.padroesdeprojetos.q06_Command;

public class Joystick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JoystickCommand controleJogoDeFutebol = new Futebol();
		controleJogoDeFutebol.apertaBotaoA();
		controleJogoDeFutebol.apertaBotaoB();
		System.out.println();

		JoystickCommand controleJogoDeLuta = new Luta();
		controleJogoDeLuta.apertaBotaoA();
		controleJogoDeLuta.apertaBotaoB();
		System.out.println();

		JoystickCommand controleJogoDeCorrida = new Corrida();
		controleJogoDeCorrida.apertaBotaoA();
		controleJogoDeCorrida.apertaBotaoB();

	}

}
