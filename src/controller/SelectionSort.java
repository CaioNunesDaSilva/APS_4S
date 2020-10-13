package controller;

public abstract class SelectionSort {

	public static void sortInt(int[] vet) {
		int ini = 0, sch, chg, men;
		while (ini < vet.length - 1) {
			chg = ini;
			men = vet[ini];
			sch = ini + 1;
			while (sch < vet.length) {
				if (vet[sch] < men) {
					chg = sch;
					men = vet[sch];
				}
				sch++;
			}
			vet[chg] = vet[ini];
			vet[ini] = men;
			ini++;
		}
	}

	public static void sortLong(long[] vet) {
		int ini = 0, sch, chg;
		long men;
		while (ini < vet.length - 1) {
			chg = ini;
			men = vet[ini];
			sch = ini + 1;
			while (sch < vet.length) {
				if (vet[sch] < men) {
					chg = sch;
					men = vet[sch];
				}
				sch++;
			}
			vet[chg] = vet[ini];
			vet[ini] = men;
			ini++;
		}
	}

	public static void sortDouble(double[] vet) {
		int ini = 0, sch, chg;
		double men;
		while (ini < vet.length - 1) {
			chg = ini;
			men = vet[ini];
			sch = ini + 1;
			while (sch < vet.length) {
				if (vet[sch] < men) {
					chg = sch;
					men = vet[sch];
				}
				sch++;
			}
			vet[chg] = vet[ini];
			vet[ini] = men;
			ini++;
		}
	}
	
}
