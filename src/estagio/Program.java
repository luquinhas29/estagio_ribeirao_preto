package estagio;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int indice = 13, soma = 0, k = 0;
		// soma
		System.out.println("(--------SOMA--------)");
		while (k < indice) {
			k = k + 1;
			soma += k;
		}

		System.out.println("imprimir soma -> " + soma);
		System.out.println();

		// fibonacci

		int v1 = -1, v2 = 1, v3, cont = 0, n, x = 0;
		System.out.println("(--------FIBONACCI--------)");
		System.out.print("Digite um numero: ");
		n = input.nextInt();
		while (cont < n) {
			cont = cont + 1;
			v3 = v1 + v2;
			v1 = v2;
			v2 = v3;
			System.out.print(v3 + " ");
			if (v3 == n) {
				x = v3;
			}
		}

		System.out.println();
		if (x == n) {
			System.out.println("Pertence a sequencia -> " + x);
		} else {
			System.out.println("Nao pertence a sequencia");
		}

		System.out.println();
		System.out.println("(--------PROXIMO ELEMENTO--------)");
		/*
		 * a) 1, 3, 5, 7, 9 b) 2, 4, 8, 16, 32, 64, 128 c) 0, 1, 4, 9, 16, 25, 36, 49 d)
		 * 4, 16, 36, 64, 100 e) 1, 1, 2, 3, 5, 8, 13 f) 2, 10, 12, 16, 17, 18, 19, 200
		 */

		System.out.println();
		System.out.println("(--------INTERRUPTOR QUE CONTROLA CADA LAMPADA--------)");
		/*
		 * Ligaria o primeiro interrupto e esperaria alguns segundos, depois desligaria
		 * e ligaria o segundo interruptor e iria ate a sala, se a lampada estivesse
		 * quente seria o primeiro interruptor, se a lampada estivesse acesa seria o
		 * segundo e se estivesse fria seria o terceiro interruptor.
		 */

		System.out.println();
		System.out.println("--------INVERTER CARACTERES DE UM STRING--------)");
		String nome;
		String nomeReverso = "";
		System.out.print("Digite o nome -> ");
		nome = input.next();

		for (int i = nome.length() - 1; i >= 0; i--) {
			nomeReverso += Character.toString(nome.charAt(i));
		}

		System.out.println("Nome reverso -> " + nomeReverso);

		input.close();

	}

}
