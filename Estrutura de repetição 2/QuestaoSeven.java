import java.util.Scanner;

public class QuestaoSeven {
	public static void main(String[] args) {
		Scanner leitorX = new Scanner(System.in);

		System.out.println("Quanta vezes: ");
		int vezes = leitorX.nextInt();

		for (; vezes >= 1; vezes--) {
			System.out.println("Digite o numerador e denominador: ");
			double numerador = leitorX.nextDouble();
			double denominador = leitorX.nextDouble();

			if (denominador == 0) {
				System.out.println("Impossível de calcular!");
			} else {
				System.out.println(numerador / denominador);
			}
		}
	}
}