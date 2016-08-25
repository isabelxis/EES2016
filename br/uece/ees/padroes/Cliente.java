package br.uece.ees.padroesdeprojetos.q04_Decorator;

public class Cliente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Stub de método gerado automaticamente
		
		FrozenYogurt Frozen1 = new FrozenYogurtMorango();
		System.out.println("Yorgute 1: " + Frozen1.getNome() + " = " + Frozen1.getPreco());
		Frozen1 = new Castanha(Frozen1);
		Frozen1 = new CaldaChocolate(Frozen1);
		System.out.println(Frozen1.getNome());
		System.out.println("Preço Yorgute 1:" + Frozen1.getPreco());
		System.out.println("---------------------------------------------------------------------------------------------------");
		FrozenYogurt Frozen2 = new FrozenYogurtUva();
		System.out.println("Yorgute 2: "  + Frozen2.getNome() + " = " + Frozen2.getPreco());
		Frozen2 = new FrutasCrist(Frozen2);
		System.out.println(Frozen2.getNome());
		System.out.println("Preço Yorgute 2:" + Frozen2.getPreco());

	}

}
