package br.uece.ees.padroesdeprojetos.q04_Decorator;

public class Castanha extends FrozenYogurtDecorator {
	
	public Castanha (FrozenYogurt frozen) {
		super(frozen);
		nome = " Castanha ";
		preco= 1.0;
	}

}
