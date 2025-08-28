package br.com.mercadojava.app;

import br.com.mercado.servico.GerenciadorEstoque;
import br.com.mercado.servico.GerenciadorVenda;
import br.com.mercadojava.modelo.Cliente;
import br.com.mercadojava.modelo.Produto;
import br.com.mercadojava.modelo.Venda;

public class MercadoApp {

	public static void main(String[] args) {
		//criando o objeto para poder utilizar seus metodos
		GerenciadorVenda venda = new GerenciadorVenda();
		
		//Classe main, que ira pegar os metodos do pacote venda
		venda.calcularVenda();
		venda.cadastrarDados();
		venda.exibirCompra();
		venda.fechar();
	}

}
