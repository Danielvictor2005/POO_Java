import java.util.Scanner;

public class Pares_consecutivos {
	public static void main(String[] args) {

		Scanner leitorX = new Scanner(System.in);
		
	// É UMA GAMBIARRA DESCARADA!
		int contador = 0;
		int soma = 0;
		int total = 0;
		System.out.println("Digite um número inteiro: ");
		int numX = leitorX.nextInt();

		if (numX != 0) {
			if (numX % 2 == 0) {
				soma = numX;
				while (contador < 4) {
					contador++;
					soma += 2;
					total += soma;
				}
				System.out.printf("Soma = %d", total + numX);
			} else {
				soma = numX + 1;
				while (contador < 4) {
					contador++;
					soma += 2;
					total += soma;
				}
				System.out.printf("Soma = %d", total + numX + 1);
			}
		}
	}
}