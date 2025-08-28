package br.com.mercadojava.modelo;

public class Cliente {
	
	//Atributos do objeto
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	
	//Construtor do objeto
	public Cliente() {
		
	}
	
	
	//metodos get e set, de cada um dos atributos
	public String getNome() {
		return this.nome;
		
	}
	
	public void setNome(String n) {
		this.nome = n;
		
	}
	
	public String getCpf() {
		return this.cpf;
		
	}
	
	public void setCpf(String c) {
		this.cpf = c;
		
	}
	
	public String getTelefone() {
		return this.telefone;
		
	}
	
	public void setTelefone(String t) {
		this.telefone = t;
		
	}
	
	public String getEmail() {
		return this.email;
		
	}
	
	public void setEmail(String e) {
		this.email = e;
		
	}
	
	
	
}
