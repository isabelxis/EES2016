package br.uece.ees.padroesdeprojetos.q02_Strategy;

import java.util.Scanner;

public class Aplicacao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Stub de método gerado automaticamente
		
		Logger logger;
		System.out.println("Escolha o registro de log: 1-File, 2-EventView, 3-Database");
		Scanner scan = new Scanner(System.in);
		String select = scan.nextLine();
		switch (select) {
		case "1":
			logger = new Logger(new LoggerFile());
			logger.setAtivo(true);
			logger.log();
			break;
		case "2":
			logger = new Logger(new LoggerEventView());
			logger.setAtivo(true);
			logger.log();
			break;
		case "3":
			logger = new Logger(new LoggerDatabase());
			logger.setAtivo(true);
			logger.log();
		default:
			break;
		}

	}


	}

