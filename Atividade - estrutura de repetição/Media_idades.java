import java.util.Scanner;

public class Media_idades {
	public static void main(String[] args) {

		// GAMBIARRA DAS BOAS!
		Scanner leitorX = new Scanner(System.in);

		int contadorMedia = 0;
		int somaIdades = 0;

		System.out.println("Digite uma idade: ");
		int idade = leitorX.nextInt();

		while (idade <= 0) {
			System.out.println("IMPOSSÍVEL CALCULAR!\nDigite novamente!");
			idade = leitorX.nextInt();
		}
		while (idade > 0) {
			contadorMedia++;
			somaIdades += idade;
			idade = leitorX.nextInt();
		}
		double mediaIdades = (double) somaIdades / contadorMedia;
		System.out.println("Media = " + mediaIdades);
		System.out.println("Fim do programa!");

	}
}