package funcao;

import javax.swing.JOptionPane;

import model.People;

public class Funcao {
	People p = new People();
	private String mensage;

	
	
	
	public void media() {
		//Declaração de variáveis
		float nota1, nota2, media, notar, mediar;
		String sn1, sn2, snr;
				
		sn1 = JOptionPane.showInputDialog("Digite o valor da primeira nota: ");
		nota1 = Float.parseFloat(sn1);
		sn2 = JOptionPane.showInputDialog("Digite o valor da segunda nota: ");
		nota2 = Float.parseFloat(sn2);
			
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
		
	public String mensagem(String mensagem) {
			this.mensage = (mensagem + " ! Vocẽ entrou na Função que retonra uma String ");
			return mensage;
	}
	
	public void printPerson() {
		People p = new People();
		int idade;
		String sidade;
		
		p.setName(JOptionPane.showInputDialog("Digite seu nome: "));
		p.setLastName(JOptionPane.showInputDialog("Digite Seu sobrenome: "));
		p.setCpf(JOptionPane.showInputDialog("Digite seu CPF: "));
		p.setBirtday(JOptionPane.showInputDialog("Digite sua data de nascimento no padrão 00/00/000: "));
		p.setPhoneNumber(JOptionPane.showInputDialog("Digite seu número de celular no padrão (00)00000-0000: "));
		sidade = JOptionPane.showInputDialog("Digite sua idade: ");
		p.setAge(idade = Integer.parseInt(sidade));
		
		JOptionPane.showMessageDialog(null, "Os dados da pessoa são: Nome: "+ p.getName()
																	+ " Sobrenome: "+ p.getLastName() 
																	+ " Seu CPF: "+ p.getCpf()
																	+ " Sua data de nascimento: "+ p.getBirtday() 
																	+ " Seu número de telefone: "+ p.getPhoneNumber()
																	+ " Sua idade: "+ p.getAge());
	}
}
