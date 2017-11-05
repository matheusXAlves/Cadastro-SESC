
package br.com.functions;

import java.awt.SystemColor;
import java.io.FileWriter;
import java.io.PrintWriter;


public class FormWriter {
 
	//Caminho do arquivo
	private static final String path = "C:\form.txt";
	//Método que escreve no arquivo
	public static void writeOnFile(String value) {
		try {
			FileWriter writer = new FileWriter(path);
			PrintWriter pw = new PrintWriter(writer);
			//Função para escrever texto no arquivo
			pw.println(value);
			pw.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

    public static void writeOnFile(SystemColor text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 

