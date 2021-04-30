/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthäus
 */
public class Aufgabe4 {
    
    public static void main(String args[]) {
        System.out.println(binKoeff(5, 4));
        System.out.println(binCoeff1(5, 4));
    }
    
    static int binKoeff(int n, int k) {
		if (k == 0) {
			return 1;
		} else if (k > n) {
			return 0;
		} else {
			return binKoeff(n - 1, k - 1) + binKoeff(n - 1, k);
		}
	}

	static int binCoeff1(int n, int k) {
		if (k > n) {
			return 0;
		} else {
			int a = 1;
			for (int i = n - k + 1; i <= n; i++) {
				a *= i;
			}
			int b = 1;
			for (int i = 2; i <= k; i++) {
				b *= i;
			}
			return a / b;
		}
	}

	
}
