import java.util.Scanner;

public class Exercicio_Um {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("DIGITE A SENHA DE ACESSO");
		System.out.println("SENHA CONTENDO 4 DÍGITOS\n");
		System.out.println("DIGITE A SENHA DE ACESSO");
		
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		while (x != 2002) {
			System.out.println("Senha Invalida\n");
			x = sc.nextInt();
		}

		System.out.println("\n-----ACESSO PERMITIDO----");
		sc.close();
	}

}
