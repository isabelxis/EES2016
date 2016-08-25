package br.uece.ees.padroesdeprojetos.q05_Chain;

import java.text.NumberFormat;

public class Refrigerante extends MaquinaChain {
	
	private double preco = 1.0;

	public Refrigerante() {
		super(Produto.Refrigerante);
	}

	@Override
	protected void tentaEfetuarCompra() {

		if (dinheiro < preco) {
			System.out.println("Dinheiro insuficiente! Por favor, insira mais moedas.");
		} else {
			double troco = dinheiro - preco;
			dinheiro = dinheiro - preco;
			System.out.println("Compra efetuada com sucesso! Pegue seu Refrigerante no valor de: " + preco );
			NumberFormat nf = NumberFormat.getInstance();
			nf.setMaximumFractionDigits(2);
			nf.setMinimumFractionDigits(2);
			if (troco > 0.0){
			System.out.println("Retire seu troco: " + nf.format(troco));}
			dinheiro = 0.0;

		}

	}

}
