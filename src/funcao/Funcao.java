package funcao;

import javax.swing.JOptionPane;

public class Funcao {

	public void media(Float nota1, Float nota2) {
		//Declaração de variáveis
		float media, notar, mediar;
		String snr;
				
				
		//processamento
		media = (nota1 + nota2)/2;
				
				//Saída de dados
		if(media>=7) {
			JOptionPane.showMessageDialog(null, "Aprovado com média: " + media);

			}else if(media < 7){
				JOptionPane.showMessageDialog(null, "Aluno em recuperação com média: " + media);
					
				snr = JOptionPane.showInputDialog("Digite o valor da nota de recuperação: ");
				notar = Float.parseFloat(snr);
					
				mediar = (media + notar)/2;
				if(mediar > 0 && mediar >= 5) {

						JOptionPane.showMessageDialog(null, "Aprovado recuperação com média: " + mediar);
						
				}else {

						JOptionPane.showMessageDialog(null, "Reprovado com média: " + mediar);
						
			}

		}
	}
}