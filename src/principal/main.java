package principal;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		//Declaração de variáveis
		float nota1, nota2, media, notar, mediar;
		String sn1, sn2, snr;
		
		//Entrada de dados
//		nota1 = 5;
//		nota2 = 4;
//		Scanner read = new Scanner(System.in);
//		
//		System.out.println("Digite o valor da primeira nota: ");
//		nota1 = read.nextFloat();
//		
//		System.out.println("Digite o valor da segunda nota: ");
//		nota2 = read.nextFloat();
		
		sn1 = JOptionPane.showInputDialog("Digite o valor da primeira nota: ");
		nota1 = Float.parseFloat(sn1);
		sn2 = JOptionPane.showInputDialog("Digite o valor da segunda nota: ");
		nota2 = Float.parseFloat(sn2);
		
		//processamento
		media = (nota1 + nota2)/2;
		
		//Saída de dados
		if(media>=7) {
			JOptionPane.showMessageDialog(null, "Aprovado com média: " + media);
//			System.out.println("Aprovado com média " + media);
		}else if(media < 7){
			JOptionPane.showMessageDialog(null, "Aluno em recuperação com média: " + media);
//			System.out.println("Aluno em recuperação com a média " + media);
			
//			System.out.println("Digite o valor da nota de recuperação: ");
//			notar = read.nextFloat();
			
			snr = JOptionPane.showInputDialog("Digite o valor da nota de recuperação: ");
			notar = Float.parseFloat(snr);
			
			mediar = (media + notar)/2;
			if(mediar > 0 && mediar >= 5) {
//				System.out.println("Aprovado em recuperação com média " + mediar);
				JOptionPane.showMessageDialog(null, "Aprovado recuperação com média: " + mediar);
				
			}else {
//			System.out.println("Reprovado com média " + mediar);	
				JOptionPane.showMessageDialog(null, "Reprovado com média: " + mediar);
				
			}

		}	
	}	

}	