package controller;

public abstract class InsertionSort {

	public static void sortInt(int[] vet) {
		int ini = 1, chg, men;
		while (ini < vet.length) {
			men = vet[ini];
			chg = ini - 1;
			while (chg >= 0 && men < vet[chg]) {
				vet[chg + 1] = vet[chg];
				chg--;
			}
			vet[chg + 1] = men;
			ini++;
		}
	}

	public static void sortLong(long[] vet) {
		int ini = 1, chg;
		long men;
		while (ini < vet.length) {
			men = vet[ini];
			chg = ini - 1;
			while (chg >= 0 && men < vet[chg]) {
				vet[chg + 1] = vet[chg];
				chg--;
			}
			vet[chg + 1] = men;
			ini++;
		}
	}

	public static void sortDouble(double[] vet) {
		int ini = 1, chg;
		double men;
		while (ini < vet.length) {
			men = vet[ini];
			chg = ini - 1;
			while (chg >= 0 && men < vet[chg]) {
				vet[chg + 1] = vet[chg];
				chg--;
			}
			vet[chg + 1] = men;
			ini++;
		}
	}

}
