package lista4;

import java.util.Scanner;

public class program5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Declara��o de variavel
		String number;
		int quantity;
//Entrada  de dados
		System.out.print("Digite o numero: ");
		number = sc.nextLine();
// usando length para saber quantidade de caracteres que cont�m na variavel "number" � salvando na variavel "quantity"
		quantity = number.length();
		
		
//metodo para saber se o numero cont�m os nove digitos 
		while (quantity <= 8) {
			if (quantity < 9) {
				System.out.println(
						"Telefone possui 8 d�gitos. Acrescente o digito '9' na frente se caso estiver faltando.");
				System.out.print("Digite o numero novamente: ");
				number = sc.nextLine();
				quantity = number.length();
			}
		}
		System.out.println("Telefone sem formata��o deseja formatar S/N: " + number);
		char format = sc.next().charAt(0);
		
// condicionamento para pessoa formatar ou nao numero.
		if (format == 'S' || format == 's') {
			System.out.print("Digite o numero novamente: ");
			number = sc.next();
			System.out.println("Telefone corrigido com formata��o: " + number);
		} else {
			System.out.println("Telefone corrigido sem formata��o: " + number);
		}

		sc.close();
	}

}
