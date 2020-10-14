package me.eperson.br.classes;

public class Item {
	private Prato prato;
	private int qtd;
	
	public Item(Prato prato, int qtd) {
		this.prato = prato;
		this.qtd = qtd;
	}
	
	public Item(String nome, float price, int qtd) {
		this.prato = new Prato(nome, price);
		this.qtd = qtd;
	}
	
	public Prato getPrato() {
		return prato;
	}
	
	public int getQtd() {
		return qtd;
	}
	
	public float getPrice() {
		return qtd * prato.getPrice();
	}
}
