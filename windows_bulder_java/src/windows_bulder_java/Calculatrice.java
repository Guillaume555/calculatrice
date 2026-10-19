package windows_bulder_java;

import java.util.Scanner;

public class Calculatrice {

	public static double calculer(double a, double b, String op) {
		double res = 0;
		if (op.equals("+")) {
			res = a + b;
		} else if (op.equals("-")) {
			res = a - b;
		} else if (op.equals("*")) {
			res = a * b;
		} else if (op.equals("/")) {
			res = a / b;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenue dans la calculatrice !");

		System.out.print("Premier nombre : ");
		double a = sc.nextDouble();
		System.out.print("Operation (+ - * /) : ");
		String op = sc.next();
		System.out.print("Deuxieme nombre : ");
		double b = sc.nextDouble();

		if (op.equals("/") && b == 0) {
			System.out.println("Erreur : division par 0");
		} else {
			System.out.println("Resultat : " + calculer(a, b, op));
		}
		sc.close();
	}
}