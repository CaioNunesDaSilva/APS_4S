package controller;

import java.util.ArrayList;
import model.Imagem;
import model.enums.TipoClassificacao;

public abstract class Classificador {

	public static long sortData(ArrayList<Imagem> imagems, TipoClassificacao tipo) {
		long[] datas = new long[imagems.size()];
		int x = 0;

		for (Imagem img : imagems) {
			datas[x++] = img.getData().getTime();
		}

		Temporizador.iniciar();
		switch (tipo) {

		case BUBBLE_SORT:
			BubbleSort.sortLong(datas);

		case SELECTION_SORT:
			SelectionSort.sortLong(datas);
			
		case INSERTION_SORT:
			InsertionSort.sortLong(datas);
		
		case QUICK_SORT:
			QuickSort.sortlong(datas);
		
		default:
			//throw
			
		return Temporizador.parar();
		}
	}

	public static long sortSatelite(ArrayList<Imagem> imagems, TipoClassificacao tipo) {
		int[] satelites = new int[imagems.size()];
		int x = 0;

		for (Imagem img : imagems) {
			satelites[x++] = img.getSatelite().ordinal();
		}
		
		Temporizador.iniciar();
		switch (tipo) {

		case BUBBLE_SORT:
			BubbleSort.sortInt(satelites);

		case SELECTION_SORT:
			SelectionSort.sortInt(satelites);
			
		case INSERTION_SORT:
			InsertionSort.sortInt(satelites);
		
		case QUICK_SORT:
			QuickSort.sortInt(satelites);
		
		default:
			//throw
			
		return Temporizador.parar();
		}
	}
	
	public static long sortEstado(ArrayList<Imagem> imagems, TipoClassificacao tipo) {
		int[] estados = new int[imagems.size()];
		int x = 0;

		for (Imagem img : imagems) {
			estados[x++] = img.getEstado().ordinal();
		}
		
		Temporizador.iniciar();
		switch (tipo) {

		case BUBBLE_SORT:
			BubbleSort.sortInt(estados);

		case SELECTION_SORT:
			SelectionSort.sortInt(estados);
			
		case INSERTION_SORT:
			InsertionSort.sortInt(estados);
		
		case QUICK_SORT:
			QuickSort.sortInt(estados);
		
		default:
			//throw
			
		return Temporizador.parar();
		}
	}
	
	public static long sortMunicipio(ArrayList<Imagem> imagems, TipoClassificacao tipo) {
		int[] municipios = new int[imagems.size()];
		int x = 0;

		for (Imagem img : imagems) {
			municipios[x++] = img.getMunicipio().ordinal();
		}
		
		Temporizador.iniciar();
		switch (tipo) {

		case BUBBLE_SORT:
			BubbleSort.sortInt(municipios);

		case SELECTION_SORT:
			SelectionSort.sortInt(municipios);
			
		case INSERTION_SORT:
			InsertionSort.sortInt(municipios);
		
		case QUICK_SORT:
			QuickSort.sortInt(municipios);
		
		default:
			//throw
			
		return Temporizador.parar();
		}
	}
	
	public static long sortLatitude(ArrayList<Imagem> imagems, TipoClassificacao tipo) {
		double[] latitudes = new double[imagems.size()];
		int x = 0;

		for (Imagem img : imagems) {
			latitudes[x++] = img.getLatitude();
		}
		
		Temporizador.iniciar();
		switch (tipo) {

		case BUBBLE_SORT:
			BubbleSort.sortDouble(latitudes);

		case SELECTION_SORT:
			SelectionSort.sortDouble(latitudes);
			
		case INSERTION_SORT:
			InsertionSort.sortDouble(latitudes);
		
		case QUICK_SORT:
			QuickSort.sortDouble(latitudes);
		
		default:
			//throw
			
		return Temporizador.parar();
		}
	}
	
	public static long sortLongitude(ArrayList<Imagem> imagems, TipoClassificacao tipo) {
		double[] longitudes = new double[imagems.size()];
		int x = 0;

		for (Imagem img : imagems) {
			longitudes[x++] = img.getLongitude();
		}
		
		Temporizador.iniciar();
		switch (tipo) {

		case BUBBLE_SORT:
			BubbleSort.sortDouble(longitudes);

		case SELECTION_SORT:
			SelectionSort.sortDouble(longitudes);
			
		case INSERTION_SORT:
			InsertionSort.sortDouble(longitudes);
		
		case QUICK_SORT:
			QuickSort.sortDouble(longitudes);
		
		default:
			//throw
			
		return Temporizador.parar();
		}
	}

	public static long sortDiasSemChuva(ArrayList<Imagem> imagems, TipoClassificacao tipo) {
		int[] diasSemChuva = new int[imagems.size()];
		int x = 0;

		for (Imagem img : imagems) {
			diasSemChuva[x++] = img.getDiasSemChuva();
		}
		
		Temporizador.iniciar();
		switch (tipo) {

		case BUBBLE_SORT:
			BubbleSort.sortInt(diasSemChuva);

		case SELECTION_SORT:
			SelectionSort.sortInt(diasSemChuva);
			
		case INSERTION_SORT:
			InsertionSort.sortInt(diasSemChuva);
		
		case QUICK_SORT:
			QuickSort.sortInt(diasSemChuva);
		
		default:
			//throw
			
		return Temporizador.parar();
		}
	}
	
	public static long sortPrecipitacao(ArrayList<Imagem> imagems, TipoClassificacao tipo) {
		double[] precipitacoes = new double[imagems.size()];
		int x = 0;

		for (Imagem img : imagems) {
			precipitacoes[x++] = img.getPrecipitacao();
		}
		
		Temporizador.iniciar();
		switch (tipo) {

		case BUBBLE_SORT:
			BubbleSort.sortDouble(precipitacoes);

		case SELECTION_SORT:
			SelectionSort.sortDouble(precipitacoes);
			
		case INSERTION_SORT:
			InsertionSort.sortDouble(precipitacoes);
		
		case QUICK_SORT:
			QuickSort.sortDouble(precipitacoes);
		
		default:
			//throw
			
		return Temporizador.parar();
		}
	}
	
	public static long sortRiscoFogo(ArrayList<Imagem> imagems, TipoClassificacao tipo) {
		double[] riscosFogo = new double[imagems.size()];
		int x = 0;

		for (Imagem img : imagems) {
			riscosFogo[x++] = img.getRiscoFogo();
		}
		
		Temporizador.iniciar();
		switch (tipo) {

		case BUBBLE_SORT:
			BubbleSort.sortDouble(riscosFogo);

		case SELECTION_SORT:
			SelectionSort.sortDouble(riscosFogo);
			
		case INSERTION_SORT:
			InsertionSort.sortDouble(riscosFogo);
		
		case QUICK_SORT:
			QuickSort.sortDouble(riscosFogo);
		
		default:
			//throw
			
		return Temporizador.parar();
		}
	}
}
