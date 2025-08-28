package br.com.mercado.servico;

import br.com.mercadojava.modelo.Cliente;
import br.com.mercadojava.modelo.Produto;
import br.com.mercadojava.modelo.Venda;
import java.util.Scanner;

//Classe do objeto
public class GerenciadorVenda extends GerenciadorEstoque {
	
	//objetos que foram criados
	Scanner entrada = new Scanner(System.in);
	Cliente cliente1 = new Cliente();
	Venda calculo = new Venda();
	
	//uma mensagem fixa para exibir
	public void mensagem() {
		System.out.println("O produto foi adicionado");
		System.out.print("Digite [1] para voltar\n");
		
	}
	
	//um metodo para calcular venda 
	public void calcularVenda() {
		// uma variavel local para fazer uma escolha
		int opcao;
		
		//apenas uma mensagem de boas vindas
		System.out.println("Bem vindo ao supermercado JAVA\n");
		
		// laco do while para exibir os itens para compra
		do {
			System.out.println("[1] CAFE EXPORT 22.99 R$");
			System.out.println("[2] SUCO DEL VALLE, 4.99 R$");
			System.out.print("[0] Sair\n");
			opcao = entrada.nextInt();
			
			switch(opcao) {
			case 1:
				mensagem();
				opcao = entrada.nextInt();
				calculo.setCalculo(22.99);
				
				
				break;
			
			case 2:
				mensagem();
				opcao = entrada.nextInt();
				calculo.setCalculo(4.99);
				break;
			}
			
			
			
		}while(opcao != 0);
		entrada.nextLine();
		
		
		
	}
	
	//um metodo  para cadastrar os dados pessoais 
	public void cadastrarDados() {
		
		System.out.println("Digite seu nome: ");
		cliente1.setNome(entrada.nextLine());
		
		System.out.println("Digite seu CPF: ");
		cliente1.setCpf(entrada.nextLine());
		
		System.out.println("Digite seu telefone: ");
		cliente1.setTelefone(entrada.nextLine());
		
		System.out.println("Digite seu email: ");
		cliente1.setEmail(entrada.nextLine());
		
	}
	
	//Metodo para exibir os dados e o total da compra
	public void exibirCompra() {
		System.out.println("NOME: "+ cliente1.getNome());
		System.out.println("CPF: "+ cliente1.getCpf());
		System.out.println("TELEFONE: "+ cliente1.getTelefone());
		System.out.println("EMAIL: "+ cliente1.getEmail());
		System.out.printf("\nTOTAL DA COMPRA: %.2f ", calculo.getCalculo());
		
	}
	
	//um metodo para fechar a entrada do Scanner
	public void fechar() {
		entrada.close();
		
	}
	
	
}



