import java.util.Scanner;

public class Problema_crescente {
	public static void main(String[] args) {

			Scanner leitorX = new Scanner(System.in);

			System.out.println("Digite uma dupla de valores: ");
			int valorX = leitorX.nextInt();
			int valorY = leitorX.nextInt();

			while (valorX != valorY) {
				if (valorX > valorY) {
					System.out.println("Decrescente");
				} else {
					System.out.println("Crescente");
				}
				System.out.println("Digite uma dupla de valores: ");
				valorX = leitorX.nextInt();
				valorY = leitorX.nextInt();
			}
			System.out.println("Fim da execução");
	}
}