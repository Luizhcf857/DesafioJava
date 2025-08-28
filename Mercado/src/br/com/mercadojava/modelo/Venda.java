package br.com.mercadojava.modelo;

public class Venda extends Cliente {
	//Atributo de venda da classe
	private double calculo;
	
	//construtor da classe Venda
	public Venda() {
		super();
		
	}
	
	//get e set, do atributo calculo
	public double getCalculo() {
		return this.calculo;
		
	}
	
	public void setCalculo(double calculo) {
		this.calculo += calculo;
		
	}
	

}
