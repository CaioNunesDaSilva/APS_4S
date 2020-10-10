package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class LeitorDeArquivo {

	private static String endereco;

	public static String getEndereco() {
		return LeitorDeArquivo.endereco;
	}
	public static void setEndereco(String endereco) {
		LeitorDeArquivo.endereco = endereco;
	}

	public static ArrayList<String> readTextFile() throws FileNotFoundException {
		ArrayList<String> texto = new ArrayList<String>();
		File arquivo = new File(LeitorDeArquivo.getEndereco());
		Scanner sc = new Scanner(arquivo);
		sc.nextLine();
		while(sc.hasNextLine()) {
			texto.add(sc.nextLine());
		}
		sc.close();
		return texto;
	}
	
	
}
