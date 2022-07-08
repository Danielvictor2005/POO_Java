import java.util.Scanner;

public class CasoImpares {
	public static void main(String[] args) {

		Scanner leitorX = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int x = leitorX.nextInt();

		while (x < 1 || x > 1000) {
			System.out.println("X >= 1 e X <= 1000\nDigite novamente!");
			x = leitorX.nextInt();
		}

		for (byte y = 1; y <= x; y++) {
			if (y % 2 != 0) {
				System.out.println(y);
			}
		}
		leitorX.close();
	}
}