package lista4;

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Declara��o de variavel.
		String texto;

		System.out.println("Digite uma texto: ");
		/*
		 * Entrada de dados ultilizando o metodo .trim() para remover todos os espa�os
		 * adicionais no inicio e final do texto � o metodo .replaceAll() pegando os
		 * espa�os adicionais entre o texto deixando somente um espa�o entre as
		 * palavras.
		 */
		texto = sc.nextLine().trim().replaceAll("\s+", " ");
//saida
		System.out.println("{" + texto + "}");

		sc.close();
	}

}
