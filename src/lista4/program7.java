package lista4;

import java.util.Scanner;

public class program7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a cadeia de caracteres");

// Entrada de dados.
		String text = sc.nextLine();

//convertendo 
		char[] cadeia = text.toCharArray();

		/*
		 * Percorrendo toda cadeia de caracteres e converta todos os caracteres para
		 * maiúscula, onde os caracteres com valor abaixo de 64 sera somato com mais 32
		 * é os caractres acima de 91 sera subtraido por 32.
		 */

		for (int i = 0; i < cadeia.length; i++) {
			int ascii = (int) cadeia[i];

			if (ascii <= 64) {
				cadeia[i] = (char) (ascii + 32);
				System.out.println(cadeia[i]);

			} else if (ascii > 91) {
				cadeia[i] = (char) (ascii - 32);
				System.out.println(cadeia[i]);
			} else {
				System.out.println(cadeia[i]);
			}

		}

		sc.close();
	}

}
