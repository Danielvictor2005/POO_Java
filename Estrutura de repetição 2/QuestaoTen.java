import java.util.Scanner;
import java.lang.Math;

public class QuestaoTen {
	public static void main(String[] args) {
		Scanner leitorX = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int x = leitorX.nextInt();

		for (double y = 1; y <= x; y++) {
			System.out.printf("%.0f %.0f %.0f\n",
					y, // primeiro termo
					Math.pow(y, 2), // segundo termo
					Math.pow(y, 3)); // terceiro termo
		}
		leitorX.close();
	}
}