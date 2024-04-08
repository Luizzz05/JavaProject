package principal;

import java.util.Scanner;

import javax.swing.JOptionPane;

import funcao.Arquivo;
import funcao.Funcao;
import model.People;

public class main {

	public static void main(String[] args) {
	//Declaração de variáveis
	String mensagem, arquivo;
	Funcao funcao = new Funcao();
	Arquivo arq = new Arquivo();
	
	//Usando método de passagem de parâmetro com retorno
//	mensagem = JOptionPane.showInputDialog("Digite o Seu nome: ");
//	funcao.mensagem(mensagem);
//	JOptionPane.showMessageDialog(null, funcao.mensagem(mensagem));
	
//	funcao.media();
//	funcao.printPerson();

	
	arquivo = JOptionPane.showInputDialog("Digite o caminho e o nome do arquivo. exemplo: 'ini.txt'': ");
	arq.readFile1(arquivo);
//	arq.readFile2(arquivo);
//	arq.writeFile(arquivo);
//	arq.readFile3(arquivo);
//	
	

	}
}
	