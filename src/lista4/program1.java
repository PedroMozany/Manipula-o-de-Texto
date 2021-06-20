package lista4;

import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//Declaração de varivel.
		String name, dados;

//Entrada de dados.
		System.out.println("Digite o seu nome completo: ");
		name = sc.nextLine();

// Ultilizando o metodo .replace() para substituir os conectores por nada.
		dados = name.replaceAll("d([aeiou]s?) ", "").replace("e ", "");

// Concatenando o vetor com variavel  dados já com todas as lentras maiúsculas é dividida.
		String[] vet = dados.toUpperCase().split(" ");
		
//Preenchemento do vetor e retornando somente as iniciais 
		for (int i = 0; i < vet.length; i++) {

			System.out.print(vet[i].charAt(0));

		}

		sc.close();
	}

}
