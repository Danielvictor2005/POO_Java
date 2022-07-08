import java.util.Scanner;

public class CoordernadasTwo {
	public static void main(String[] args) {
		Scanner leitorX = new Scanner(System.in);

		System.out.println("Digite as coordenadas X e Y, respectivamente!");
		int x = leitorX.nextInt();
		int y = leitorX.nextInt();

		while (x != 0 && y != 0) {

			if (x >= 1 && y >= 1) {
				System.out.println("Primeiro");
			} else if (x <= -1 && y >= 1) {
				System.out.println("Segundo");
			} else if (x <= -1 && y <= -1) {
				System.out.println("Terceiro");
			} else {
				System.out.println("Quarta");
			}
		}
		leitorX.close();
	}
}