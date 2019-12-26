import java.util.Scanner;

public class Exercicio_Tres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("OLÁ! SEJA BEM VINDO(A)\n");
		System.out.println("QUAL SEU PRODUTO DE PREFERENCIA CONFORME TABELA ABAIXO?\n");
		System.out.println("=============");
		System.out.println("|1. Álcool  |");
		System.out.println("|2. Gasolina|");
		System.out.println("|3. Diesel  |");
		System.out.println("|4. FIM     |");
		System.out.println("=============\n");
		System.out.print("Digite um número:\n");
		
		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		int tipo = sc.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			} else if (tipo == 2) {
				gasolina = gasolina + 1;
			} else if (tipo == 3) {
				diesel = diesel + 1;
			}

			tipo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}

}
