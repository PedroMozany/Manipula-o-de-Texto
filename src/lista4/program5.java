package lista4;

import java.util.Scanner;

public class program5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Declaração de variavel
		String number;
		int quantity;
//Entrada  de dados
		System.out.print("Digite o numero: ");
		number = sc.nextLine();
// usando length para saber quantidade de caracteres que contém na variavel "number" é salvando na variavel "quantity"
		quantity = number.length();
		
		
//metodo para saber se o numero contém os nove digitos 
		while (quantity <= 8) {
			if (quantity < 9) {
				System.out.println(
						"Telefone possui 8 dígitos. Acrescente o digito '9' na frente se caso estiver faltando.");
				System.out.print("Digite o numero novamente: ");
				number = sc.nextLine();
				quantity = number.length();
			}
		}
		System.out.println("Telefone sem formatação deseja formatar S/N: " + number);
		char format = sc.next().charAt(0);
		
// condicionamento para pessoa formatar ou nao numero.
		if (format == 'S' || format == 's') {
			System.out.print("Digite o numero novamente: ");
			number = sc.next();
			System.out.println("Telefone corrigido com formatação: " + number);
		} else {
			System.out.println("Telefone corrigido sem formatação: " + number);
		}

		sc.close();
	}

}
