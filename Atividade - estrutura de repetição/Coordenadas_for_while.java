import java.util.Scanner;

public class Coordenadas_for_while {
	public static void main(String[] args) {

		Scanner leitorX = new Scanner(System.in);

		System.out.println("Digite a coordenada X e Y");
		int x = leitorX.nextInt();
		int y = leitorX.nextInt();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.println("QUADRANTE Q1");
			} else if (x < 0 && y < 0) {
				System.out.println("QUADRANTE Q3");
			} else if (x > 0 && y < 0) {
				System.out.println("QUADRANTE Q4");
			} else if (x < 0 && y > 0) {
				System.out.println("QUADRANTE Q2");
			}

			System.out.println("Digite a coordenada X e Y");
			x = leitorX.nextInt();
			y = leitorX.nextInt();
		}
	}
}
