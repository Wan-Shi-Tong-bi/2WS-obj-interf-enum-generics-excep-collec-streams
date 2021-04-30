package Aufgabe4;

import htl.Out;
import htl.In;

public class Binom {

	static long binKoeff(long n, long k) {
		if (k == 0) {
			return 1;
		} else if (k > n) {
			return 0;
		} else {
			return binKoeff(n - 1, k - 1) + binKoeff(n - 1, k);
		}
	}

	static long binCoeff1(long n, long k) {
		if (k > n) {
			return 0;
		} else {
			int a = 1;
			for (long i = n - k + 1; i <= n; i++) {
				a *= i;
			}
			int b = 1;
			for (long i = 2; i <= k; i++) {
				b *= i;
			}
			return a / b;
		}
	}

	public static void main(String args[]) {
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j <= i / 2; j++) {
				Out.print(i + " ueber " + j + ": ");
				Out.println("rekursiv: " + binKoeff(i, j) + ", iterativ: " + binCoeff1(i, j));
			}
		}
	}
}
