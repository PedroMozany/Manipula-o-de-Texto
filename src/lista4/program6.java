package lista4;

import java.util.Scanner;

public class program6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
// Declaração de variavel
		String say;
		System.out.println("Digite a palavra: ");
//Entrada de dados		
		say = sc.nextLine();
		
//Declaração de variavel "digonal"	recebendo 0.
		StringBuilder digonal = new StringBuilder(0);
		
//Concatenação da variavel "say" com o vetor "word".		
		String[] word = say.split("");
		
//contrustução do vetor onde vai ser concatenado com a variavel digonal.		
		for (int i = 0; i < word.length; i++) {
			
			digonal.insert(0, " ");
			System.out.println(digonal + word[i]);
		}
		sc.close();
	}

}
