package lista4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class program3 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Data de Nascimento: ");
		
		/* DIGIDANDO DATA DE NASCIMENTO ULTILIZANDO A CLASSE DATE NO FORMATO "dd/MM/yyyy" */
		Date birth = sdf.parse(sc.next());
		
		
		//FORMATANDO A DATA DE NASCIMENTO PARA MOSTRAR SOMENTE O MÊS POR EXTENSO
		DateFormat formato = new SimpleDateFormat(" dd 'de' MMMM 'de' yyyy");
		String nasci = formato.format(birth);

		System.out.printf("Você nasceu em" + nasci);

		sc.close();
	}

}
