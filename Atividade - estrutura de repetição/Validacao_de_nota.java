import java.util.Scanner;

public class Validacao_de_nota {
	public static void main(String[] args) {

		Scanner leitorX = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		float first_nota = leitorX.nextFloat();

		while (first_nota < 0 || first_nota > 10) {
			System.out.println("Valor inválido! Digite novamente: ");
			first_nota = leitorX.nextFloat();
		}

		System.out.println("Digite a segunda nota: ");
		float second_nota = leitorX.nextFloat();

		while (second_nota < 0 || second_nota > 10) {
			System.out.println("Valor inválido! Digite novamente: ");
			second_nota = leitorX.nextFloat();
		}
		float media = (first_nota + second_nota) / 2;
		System.out.printf("Media = %2.f", media);
	}
}