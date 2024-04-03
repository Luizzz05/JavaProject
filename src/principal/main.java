package principal;

public class main {

	public static void main(String[] args) {
		//Declaração de variáveis
		float nota1, nota2, media, notar, mediar;
		
		//Entrada de dados
		nota1 = 5;
		nota2 = 4;
		
		//processamento
		media = (nota1 + nota2)/2;
		
		//Saída de dados
		if(media>=7) {
				System.out.println("Aprovado com média " + media);
		}else if(media < 7 && media >= 5){
			System.out.println("Aluno em recuperação com a média " + media);
		}else {
			notar = 8;
			mediar = (media + notar)/2;
			if(mediar >= 5) {
				System.out.println("Aprovado em recuperação com média " + mediar);
			}else {
			System.out.println("Reprovado com média " + mediar);	
			}
		
		}
	}	

}	