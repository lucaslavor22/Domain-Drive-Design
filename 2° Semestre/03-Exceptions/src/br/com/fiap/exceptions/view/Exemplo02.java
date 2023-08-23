package br.com.fiap.exceptions.view;
import javax.swing.JOptionPane;

import br.com.fiap.exceptions.model.Produto;
	
public class Exemplo02 {
	public static void main(String[] args) throws Exception {
	//Instanciar um produto com os valores
	Produto p = new Produto("Feijão", 3.5);
	
	//Ler o imposto
	try {
	double imposto = Integer.parseInt(JOptionPane.showInputDialog("Digite o imposto"));
	
	//Calcular e exibir o imposto
	double valor = p.calcularImposto(imposto);
	System.out.println(valor);
	} catch(NumberFormatException e) {
		System.err.println("Imposto deve ser um número");
	} catch(RuntimeException e) {
		System.err.println(e.getMessage());
	} finally {
		System.out.println("Final");
	}
	System.out.println("**************************");
	try {	
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
		double valorTotal = p.calcularValorTotal(quantidade);
		System.out.println(valorTotal);
	} catch(NumberFormatException e) {
		System.err.println("Imposto deve ser um número!");
	} catch(RuntimeException e) {
		System.err.println(e.getMessage());
	}
	finally {
		System.out.println("Acabou");
	}
	
	
}
	}
 