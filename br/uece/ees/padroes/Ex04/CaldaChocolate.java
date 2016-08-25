package br.uece.ees.padroesdeprojetos.q04_Decorator;

public class CaldaChocolate extends FrozenYogurtDecorator {
	
	public CaldaChocolate (FrozenYogurt frozen) {
		super(frozen);
		nome = " Calda de Chocolate ";
		preco = 0.5;
	}
}
