import java.util.Scanner;

public class Exercicio_Dois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt(); //variavel x para iniciar o programa
		int y = sc.nextInt(); //variavel y para iniciar o programa

		// while (x != 0 || y != 0) {
		// if (x > 0 && y > 0) {
		// System.out.println("primeiro");
		// x = sc.nextInt();
		// y = sc.nextInt();
		// } else if (x < 0 && y > 0) {
		// System.out.println("segundo");
		// x = sc.nextInt();
		// y = sc.nextInt();
		// } else if (x < 0 && y < 0) {
		// System.out.println("terceiro");
		// x = sc.nextInt();
		// y = sc.nextInt();
		// } else if (x > 0 && y < 0) {
		// System.out.println("quarto");
		// x = sc.nextInt();
		// y = sc.nextInt();
		// }
		// }
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else {
				System.out.println("quarto");
			}
			x = sc.nextInt(); //variavel x para reativar o WHILE
			y = sc.nextInt(); //variavel Y para reativar o WHILE
		}
		sc.close();
	}

}
