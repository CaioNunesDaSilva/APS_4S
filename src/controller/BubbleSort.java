package controller;

public abstract class BubbleSort {

	public static void sortInt(int[] vet) {
		int ini = 1, fim, trc;
		while (ini < vet.length) {
			fim = vet.length - 1;
			while (fim >= ini) {
				if (vet[fim - 1] > vet[fim]) {
					trc = vet[fim - 1];
					vet[fim - 1] = vet[fim];
					vet[fim] = trc;
				}
				fim--;
			}
			ini++;
		}
	}

	public static void sortLong(long[] vet) {
		int ini = 1, fim;
		long trc;
		while (ini < vet.length) {
			fim = vet.length - 1;
			while (fim >= ini) {
				if (vet[fim - 1] > vet[fim]) {
					trc = vet[fim - 1];
					vet[fim - 1] = vet[fim];
					vet[fim] = trc;
				}
				fim--;
			}
			ini++;
		}
	}

	public static void sortDouble(double[] vet) {
		int ini = 1, fim;
		double trc;
		while (ini < vet.length) {
			fim = vet.length - 1;
			while (fim >= ini) {
				if (vet[fim - 1] > vet[fim]) {
					trc = vet[fim - 1];
					vet[fim - 1] = vet[fim];
					vet[fim] = trc;
				}
				fim--;
			}
			ini++;
		}
	}
	
}
