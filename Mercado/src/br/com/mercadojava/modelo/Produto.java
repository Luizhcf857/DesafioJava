package br.com.mercadojava.modelo;

public class Produto extends Cliente {
	
	//Atributos de produto
	private double preco;
	//Construtor
	public Produto(String nome, double preco) {
		super();
		this.preco = preco;
		
	}
	
	
	
	
	
	public double getPreco() {
		return preco;
	
	}
	
	public void setPreco(double p) {
		preco = p;
		
	}

}


