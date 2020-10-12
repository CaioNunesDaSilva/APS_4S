package controller;

public abstract class Temporizador {

	private static long inicio;
	
	public static void iniciar() {
		Temporizador.inicio = System.currentTimeMillis();
	}
	
	public static long parar() {
		long inicio = Temporizador.inicio;
		Temporizador.inicio = 0;
		return System.currentTimeMillis() - inicio;
	}
}
