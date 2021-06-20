package lista4;

import java.util.Scanner;

public class program4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a palavra que deseja saber se palíndromo: ");

		// Entrada de dados
		String origin = sc.nextLine();
		System.out.println("Texto original: " + origin);

// Recebendo o valor da variavel "origin" revertendo a palavra e salvando na variavel "reverso"
		String reverso = new StringBuilder(origin).reverse().toString();
		System.out.println("Texto reverso: " + reverso);

//condicionamento para compara as duas palavras e saber se são palíndromas onde os espaços foram ignorados.
		if (origin.replaceAll(" ", "").equals(reverso.replaceAll(" ", ""))) {
			System.out.println("É um palíndromo");
		} else {
			System.out.println("Não é um palíndromo");
		}
		sc.close();
	}

}
