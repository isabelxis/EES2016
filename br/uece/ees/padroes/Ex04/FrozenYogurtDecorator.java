package br.uece.ees.padroesdeprojetos.q04_Decorator;

public abstract class FrozenYogurtDecorator extends FrozenYogurt {
	
	FrozenYogurt frozenYogurt;

	public FrozenYogurtDecorator(FrozenYogurt frozen) {
		super();
		this.frozenYogurt = frozen;
	}
	
	@Override
	public String getNome() {
		return frozenYogurt.getNome() + " + " + super.getNome();
	}
	
	@Override
	public double getPreco() {
		return frozenYogurt.getPreco() + super.getPreco();
	}


}
