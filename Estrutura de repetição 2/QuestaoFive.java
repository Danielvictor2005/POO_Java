import java.util.Scanner;

public class QuestaoFive {
	public static void main(String[] args) {
		Scanner leitorX = new Scanner(System.in);

		int somaIn = 0;
		int somaOut = 0;

		System.out.print("Quantidade de vezes: ");
		int vezes = leitorX.nextInt();

		for (; vezes > 0; vezes--) {
			System.out.print("Digite um número: ");
			double x = leitorX.nextDouble();

			if (x >= 10 && x <= 20) {
				somaIn++;
			} else {
				somaOut++;
			}
		}
		System.out.printf("%d in\n%d out\n", somaIn, somaOut);
		leitorX.close();
	}
}