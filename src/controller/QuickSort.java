package controller;

public abstract class QuickSort {

	public static void sortInt(int[] vet) {
        quick(vet, 0, (vet.length -1));
	}
	private static void quick(int[] vet, int esquerda, int direita) {
		int pivo, aPivo, aEsquerda, aDireita;
		pivo = vet[esquerda];
		aEsquerda = esquerda;
		aDireita = direita;
		while (esquerda < direita) {
			while (vet[direita] >= pivo && esquerda < direita)
				direita--;
			if (esquerda != direita) {
				vet[esquerda] = vet[direita];
				esquerda++;
			}
			while (vet[esquerda] <= pivo && esquerda < direita)
				esquerda++;
			if (esquerda != direita) {
				vet[direita] = vet[esquerda];
				direita--;
			}
		}
		vet[esquerda] = pivo;
		aPivo = esquerda;
		if (aEsquerda < aPivo)
			quick(vet, aEsquerda, (aPivo - 1));
		if (aDireita > aPivo)
			quick(vet, (aPivo + 1), aDireita);
	}

	public static void sortlong(long[] vet) {
        quick(vet, 0, (vet.length -1));

	}
	private static void quick(long[] vet, int esquerda, int direita) {
		int aPivo, aEsquerda, aDireita;
		long pivo = vet[esquerda];
		aEsquerda = esquerda;
		aDireita = direita;
		while (esquerda < direita) {
			while (vet[direita] >= pivo && esquerda < direita)
				direita--;
			if (esquerda != direita) {
				vet[esquerda] = vet[direita];
				esquerda++;
			}
			while (vet[esquerda] <= pivo && esquerda < direita)
				esquerda++;
			if (esquerda != direita) {
				vet[direita] = vet[esquerda];
				direita--;
			}
		}
		vet[esquerda] = pivo;
		aPivo = esquerda;
		if (aEsquerda < aPivo)
			quick(vet, aEsquerda, (aPivo - 1));
		if (aDireita > aPivo)
			quick(vet, (aPivo + 1), aDireita);
	}

	public static void sortDouble(double[] vet) {
        quick(vet, 0, (vet.length -1));

	}
	private static void quick(double[] vet, int esquerda, int direita) {
		int aPivo, aEsquerda, aDireita;
		double pivo = vet[esquerda];
		aEsquerda = esquerda;
		aDireita = direita;
		while (esquerda < direita) {
			while (vet[direita] >= pivo && esquerda < direita)
				direita--;
			if (esquerda != direita) {
				vet[esquerda] = vet[direita];
				esquerda++;
			}
			while (vet[esquerda] <= pivo && esquerda < direita)
				esquerda++;
			if (esquerda != direita) {
				vet[direita] = vet[esquerda];
				direita--;
			}
		}
		vet[esquerda] = pivo;
		aPivo = esquerda;
		if (aEsquerda < aPivo)
			quick(vet, aEsquerda, (aPivo - 1));
		if (aDireita > aPivo)
			quick(vet, (aPivo + 1), aDireita);
	}

}
