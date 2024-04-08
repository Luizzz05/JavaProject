package funcao;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Arquivo {
	
	public void readFile1(String arquivo) {
		
		File path = new File("/home/luiz/Documentos/eclipse-workspace/Projeto_WEB/src/tmp/" + arquivo);
		Scanner read = null;
		try {
			read = new Scanner(path);
			while(read.hasNextLine()) {
				JOptionPane.showMessageDialog(null, read.nextLine());				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//	e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		finally {
			if(read != null) {
				read.close();
			}
		}
	}

}