package br.com.fiap.teste;

import javax.swing.JOptionPane;


public class ConversaoStringPrimitivo {
	public static void main (String[] args) {
	//Definir uma variavel do tipo String
	String idade = "10";
	
	//Transformar a String em um tipo primitivo
	//byte, short, int, long, float, double
	
	byte idadeByte = Byte.parseByte(idade);
	short idadeShort = Short.parseShort(idade);
	int idadeInt = Integer.parseInt(idade);
	long idadeLong = Long.parseLong(idade);
	float idadeFloat = Float.parseFloat(idade);
	double idadeDouble = Double.parseDouble(idade);

	idade = JOptionPane.showInputDialog("Digite sua idade:");
	
	//Exiba quanto falta para atingir 18 anos
	int resultado = Integer.parseInt(idade);
	
	if (resultado < 18) {
		int resultadoFinal = (18 - resultado);
		JOptionPane.showMessageDialog(null, "Falta " + resultadoFinal + " anos para 18."); 
		}
	else if (resultado > 18 ) {
		int resultadoMaior = (resultado - 18);
		JOptionPane.showMessageDialog(null, "Voce tem " + resultado + " anos, " + resultadoMaior + " anos a mais que 18."); }
	else {
		JOptionPane.showMessageDialog(null, "você tem 18 anos");
	}
		
	}	
	
}
 
