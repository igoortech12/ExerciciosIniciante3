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
		
		int x = sc.nextInt();
		
		while (x >= 1 && x <= 4) {
			if (x == 1) {
				
			}
		}
		System.out.println("POR FAVOR, DIGITE UM NÚMERO VÁLIDO");
		sc.close();
	}

}
