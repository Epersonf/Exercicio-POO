package me.eperson.br.classes;

public class Prato {
	private String nome;
	private float price;

	public Prato(String nome, float price) {
		this.nome = nome;
		this.price = price;
	}
	
	public String getNome() {
		return nome;
	}
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}
