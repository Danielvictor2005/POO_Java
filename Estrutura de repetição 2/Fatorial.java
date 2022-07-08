import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner leitorX = new Scanner(System.in);
		int soma = 1;

		System.out.println("Digite o número: ");
		int x = leitorX.nextInt();

		for (byte y = 1; y <= x; y++) {
			soma *= y;
		}
		System.out.println(soma);
		leitorX.close();
	}
}