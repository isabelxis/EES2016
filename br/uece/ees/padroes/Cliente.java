package br.uece.ees.padroesdeprojetos.q05_Chain;

public class Cliente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Stub de método gerado automaticamente		
		MaquinaChain maquina = new Refrigerante();
		maquina.setNext(new Salgadinhos());
		
		maquina.inserirMoeda(Slot.slotUm);
		maquina.inserirMoeda(Slot.slotUm);
		maquina.inserirMoeda(Slot.slotDois);
		maquina.inserirMoeda(Slot.slotTres);
				
		try {
			maquina.efetuarCompra(Produto.Refrigerante);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		maquina.inserirMoeda(Slot.slotTres);
		
		try {
			maquina.efetuarCompra(Produto.Refrigerante);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		maquina.inserirMoeda(Slot.slotDois);
		maquina.inserirMoeda(Slot.slotDois);
		maquina.inserirMoeda(Slot.slotTres);
		maquina.inserirMoeda(Slot.slotTres);
		maquina.inserirMoeda(Slot.slotTres);
		
		try {
			maquina.efetuarCompra(Produto.Salgadinhos);
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		
	}

}
