package controller;

import java.util.ArrayList;
import model.Imagem;
import model.enums.TipoClassificacao;
import model.exceptions.NullAttributeException;

public abstract class Classificador {

	public static long sortData(ArrayList<Imagem> imagems, TipoClassificacao tipo)
			throws NullAttributeException, IllegalArgumentException {
		long[] datas = new long[imagems.size()];
		int x = 0;

		for (Imagem img : imagems) {
			datas[x++] = img.getData().getTime();
		}

		Temporizador.iniciar();
		if (tipo == TipoClassificacao.BUBBLE_SORT) {
			BubbleSort.sortLong(datas);
		} else if (tipo == TipoClassificacao.SELECTION_SORT) {
			SelectionSort.sortLong(datas);
		} else if (tipo == TipoClassificacao.INSERTION_SORT) {
			InsertionSort.sortLong(datas);
		} else if (tipo == TipoClassificacao.QUICK_SORT) {
			QuickSort.sortlong(datas);
		} else {
			throw new IllegalArgumentException();
		}
		return Temporizador.parar();
	}

	public static long sortSatelite(ArrayList<Imagem> imagems, TipoClassificacao tipo)
			throws NullAttributeException, IllegalArgumentException {
		int[] satelites = new int[imagems.size()];
		int x = 0;

		for (Imagem img : imagems) {
			satelites[x++] = img.getSatelite().ordinal();
		}

		Temporizador.iniciar();
		if (tipo == TipoClassificacao.BUBBLE_SORT) {
			BubbleSort.sortInt(satelites);
		} else if (tipo == TipoClassificacao.SELECTION_SORT) {
			SelectionSort.sortInt(satelites);
		} else if (tipo == TipoClassificacao.INSERTION_SORT) {
			InsertionSort.sortInt(satelites);
		} else if (tipo == TipoClassificacao.QUICK_SORT) {
			QuickSort.sortInt(satelites);
		} else {
			throw new IllegalArgumentException();
		}
		return Temporizador.parar();
	}

	public static long sortEstado(ArrayList<Imagem> imagems, TipoClassificacao tipo)
			throws NullAttributeException, IllegalArgumentException {
		int[] estados = new int[imagems.size()];
		int x = 0;

		for (Imagem img : imagems) {
			estados[x++] = img.getEstado().ordinal();
		}

		Temporizador.iniciar();
		if (tipo == TipoClassificacao.BUBBLE_SORT) {
			BubbleSort.sortInt(estados);
		} else if (tipo == TipoClassificacao.SELECTION_SORT) {
			SelectionSort.sortInt(estados);
		} else if (tipo == TipoClassificacao.INSERTION_SORT) {
			InsertionSort.sortInt(estados);
		} else if (tipo == TipoClassificacao.QUICK_SORT) {
			QuickSort.sortInt(estados);
		} else {
			throw new IllegalArgumentException();
		}
		return Temporizador.parar();
	}

	public static long sortMunicipio(ArrayList<Imagem> imagems, TipoClassificacao tipo)
			throws NullAttributeException, IllegalArgumentException {
		int[] municipios = new int[imagems.size()];
		int x = 0;

		for (Imagem img : imagems) {
			municipios[x++] = img.getMunicipio().ordinal();
		}

		Temporizador.iniciar();
		if (tipo == TipoClassificacao.BUBBLE_SORT) {
			BubbleSort.sortInt(municipios);
		} else if (tipo == TipoClassificacao.SELECTION_SORT) {
			SelectionSort.sortInt(municipios);
		} else if (tipo == TipoClassificacao.INSERTION_SORT) {
			InsertionSort.sortInt(municipios);
		} else if (tipo == TipoClassificacao.QUICK_SORT) {
			QuickSort.sortInt(municipios);
		} else {
			throw new IllegalArgumentException();
		}
		return Temporizador.parar();
	}

	public static long sortLatitude(ArrayList<Imagem> imagems, TipoClassificacao tipo) throws IllegalArgumentException {
		double[] latitudes = new double[imagems.size()];
		int x = 0;

		for (Imagem img : imagems) {
			latitudes[x++] = img.getLatitude();
		}

		Temporizador.iniciar();
		if (tipo == TipoClassificacao.BUBBLE_SORT) {
			BubbleSort.sortDouble(latitudes);
		} else if (tipo == TipoClassificacao.SELECTION_SORT) {
			SelectionSort.sortDouble(latitudes);
		} else if (tipo == TipoClassificacao.INSERTION_SORT) {
			InsertionSort.sortDouble(latitudes);
		} else if (tipo == TipoClassificacao.QUICK_SORT) {
			QuickSort.sortDouble(latitudes);
		} else {
			throw new IllegalArgumentException();
		}
		return Temporizador.parar();
	}

	public static long sortLongitude(ArrayList<Imagem> imagems, TipoClassificacao tipo)
			throws IllegalArgumentException {
		double[] longitudes = new double[imagems.size()];
		int x = 0;

		for (Imagem img : imagems) {
			longitudes[x++] = img.getLongitude();
		}

		Temporizador.iniciar();
		if (tipo == TipoClassificacao.BUBBLE_SORT) {
			BubbleSort.sortDouble(longitudes);
		} else if (tipo == TipoClassificacao.SELECTION_SORT) {
			SelectionSort.sortDouble(longitudes);
		} else if (tipo == TipoClassificacao.INSERTION_SORT) {
			InsertionSort.sortDouble(longitudes);
		} else if (tipo == TipoClassificacao.QUICK_SORT) {
			QuickSort.sortDouble(longitudes);
		} else {
			throw new IllegalArgumentException();
		}
		return Temporizador.parar();
	}

	public static long sortDiasSemChuva(ArrayList<Imagem> imagems, TipoClassificacao tipo)
			throws IllegalArgumentException {
		int[] diasSemChuva = new int[imagems.size()];
		int x = 0;

		for (Imagem img : imagems) {
			diasSemChuva[x++] = img.getDiasSemChuva();
		}

		Temporizador.iniciar();
		if (tipo == TipoClassificacao.BUBBLE_SORT) {
			BubbleSort.sortInt(diasSemChuva);
		} else if (tipo == TipoClassificacao.SELECTION_SORT) {
			SelectionSort.sortInt(diasSemChuva);
		} else if (tipo == TipoClassificacao.INSERTION_SORT) {
			InsertionSort.sortInt(diasSemChuva);
		} else if (tipo == TipoClassificacao.QUICK_SORT) {
			QuickSort.sortInt(diasSemChuva);
		} else {
			throw new IllegalArgumentException();
		}
		return Temporizador.parar();
	}

	public static long sortPrecipitacao(ArrayList<Imagem> imagems, TipoClassificacao tipo)
			throws IllegalArgumentException {
		double[] precipitacoes = new double[imagems.size()];
		int x = 0;

		for (Imagem img : imagems) {
			precipitacoes[x++] = img.getPrecipitacao();
		}

		Temporizador.iniciar();
		if (tipo == TipoClassificacao.BUBBLE_SORT) {
			BubbleSort.sortDouble(precipitacoes);
		} else if (tipo == TipoClassificacao.SELECTION_SORT) {
			SelectionSort.sortDouble(precipitacoes);
		} else if (tipo == TipoClassificacao.INSERTION_SORT) {
			InsertionSort.sortDouble(precipitacoes);
		} else if (tipo == TipoClassificacao.QUICK_SORT) {
			QuickSort.sortDouble(precipitacoes);
		} else {
			throw new IllegalArgumentException();
		}
		return Temporizador.parar();
	}

	public static long sortRiscoFogo(ArrayList<Imagem> imagems, TipoClassificacao tipo)
			throws IllegalArgumentException {
		double[] riscosFogo = new double[imagems.size()];
		int x = 0;

		for (Imagem img : imagems) {
			riscosFogo[x++] = img.getRiscoFogo();
		}

		Temporizador.iniciar();
		if (tipo == TipoClassificacao.BUBBLE_SORT) {
			BubbleSort.sortDouble(riscosFogo);
		} else if (tipo == TipoClassificacao.SELECTION_SORT) {
			SelectionSort.sortDouble(riscosFogo);
		} else if (tipo == TipoClassificacao.INSERTION_SORT) {
			InsertionSort.sortDouble(riscosFogo);
		} else if (tipo == TipoClassificacao.QUICK_SORT) {
			QuickSort.sortDouble(riscosFogo);
		} else {
			throw new IllegalArgumentException();
		}
		return Temporizador.parar();
	}
}
