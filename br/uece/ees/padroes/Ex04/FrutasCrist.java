package br.uece.ees.padroesdeprojetos.q04_Decorator;

public class FrutasCrist extends FrozenYogurtDecorator {
	
	public FrutasCrist (FrozenYogurt frozen) {
		super(frozen);
		nome = " Frutas Cristalizadas ";
		preco = 1.5;
	}

}
