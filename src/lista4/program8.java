package lista4;

import java.util.Scanner;

public class program8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um frase");
// Entrada de dados. 		
		String text = sc.nextLine();

//convertendo 
		char[] cesar = text.toUpperCase().toCharArray();

		/*
		 * Percorrendo toda a frase, convertendo cada caractere para ASCII,
		 * acrescentando três e convertendo novamente para caractere, usando
		 * condicionamento para percorrer ASCII acima de 90 subtraindo por 23 e a baixo de 65 para poder
		 * pegar os espaço normal sem acrescimo de três. 
		 */
		for (int i = 0; i < cesar.length; i++) {

			int ascii = (int) cesar[i] + 3;

			if (ascii >= 65 && ascii <= 90) {
				cesar[i] = (char) ascii;
				System.out.print(cesar[i]);

			} else if (ascii <= 65) {
				cesar[i] = (char) (ascii - 3);
				System.out.print(cesar[i]);

			} else if (ascii >= 90) {
				ascii = cesar[i];
				cesar[i] = (char) (ascii - 23);
				System.out.print(cesar[i]);
			}

		}

		sc.close();
	}

}
