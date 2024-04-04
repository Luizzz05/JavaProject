package principal;

import java.util.Scanner;

import javax.swing.JOptionPane;

import funcao.Funcao;

public class main {

	public static void main(String[] args) {
		//Declaração de variáveis
		float nota1, nota2;
		String sn1, sn2;
		Funcao funcao = new Funcao();
		
		
		sn1 = JOptionPane.showInputDialog("Digite o valor da primeira nota: ");
		nota1 = Float.parseFloat(sn1);
		sn2 = JOptionPane.showInputDialog("Digite o valor da segunda nota: ");
		nota2 = Float.parseFloat(sn2);
		
		funcao.media(nota1, nota2);
	}	

}	