package br.uece.ees.padroesdeprojetos.q05_Chain;

import java.text.NumberFormat;

public abstract class MaquinaChain {
	protected MaquinaChain next;
	protected Produto idProduto;
	public Double dinheiro;

	public MaquinaChain(Produto id) {
		next = null;
		idProduto = id;
		dinheiro = 0.0;
	}
	
	public void setNext(MaquinaChain forma) {
		if (next == null) {
			next = forma;
		} else {
			next.setNext(forma);
		}
	}

	public void efetuarCompra(Produto id) throws Exception {
		if (podeEfetuarCompra(id)) {
			tentaEfetuarCompra();
		} else {
			if (next == null) {
				NumberFormat nf = NumberFormat.getInstance();
				nf.setMinimumFractionDigits(2);
				nf.setMaximumFractionDigits(2);
				throw new Exception("Produto nao cadastrado.");
			}
			next.dinheiro = dinheiro;
			dinheiro = 0.0;
			next.efetuarCompra(id);
		}
	}

	private boolean podeEfetuarCompra(Produto id) {
		if (idProduto == id) {
			return true;
		}
		return false;
	}
	
	public void inserirMoeda(Slot id) {
		switch (id) {
		case slotUm:
			dinheiro += 0.10;
			break;
		case slotDois:
			dinheiro += 0.25;
			break;
		case slotTres:
			dinheiro += 0.50;
			break;
		default:
			System.out.println("Valor de moeda nao cadastrado.");
		}
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		nf.setMinimumFractionDigits(2);
		System.out.println("Dinheiro Inserido: " + nf.format(dinheiro));
	}
	
	protected abstract void tentaEfetuarCompra();
}
