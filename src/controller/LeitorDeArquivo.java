package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import model.Imagem;
import model.enums.Estado;
import model.enums.Municipio;
import model.enums.Satelite;

public abstract class LeitorDeArquivo {

	private static String endereco;

	public static String getEndereco() {
		return LeitorDeArquivo.endereco;
	}
	
	public static void setEndereco(String endereco) {
		LeitorDeArquivo.endereco = endereco;
	}
	
	public static boolean checkEndereco() {
		return new File(LeitorDeArquivo.endereco).exists();
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
	
	public static ArrayList<Imagem> readImagems() throws FileNotFoundException, ParseException, NullPointerException{
		ArrayList<Imagem> imagems = new ArrayList<Imagem>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		for(String linha : LeitorDeArquivo.readTextFile()) {
			String campos[] = linha.split(",");
			
			Date data = sdf.parse(campos[0]);
			Satelite satelite = Satelite.valueOf(campos[1].replace("-", ""));
			Estado estado = Estado.valueOf(campos[2].replace(" ", "_"));
			Municipio municipio = Municipio.valueOf(campos[3].replace(" ", "_").replace("'", "").replace("-", "_")); 
			int diasSemChuva = Integer.parseInt(campos[4]);
			double precipitacao = Double.parseDouble(campos[5]);
			double riscoFogo = Double.parseDouble(campos[6]);
			double latitude = Double.parseDouble(campos[7]);
			double longitude = Double.parseDouble(campos[8]);
			
			imagems.add(new Imagem(data, satelite, estado, municipio, latitude, longitude, diasSemChuva, precipitacao, riscoFogo));
		}
		
		return imagems;
	}
}
