import java.util.Scanner;

public class Problema_combustível {
	public static void main(String[] args) {

		Scanner leitorX = new Scanner(System.in);

		// Variáveies iniciais
		int soma_gasolina = 0;
		int soma_alcool = 0;
		int soma_diesel = 0;

		System.out.println("Informe o código (1,2,3) ou 4 para parar: ");
		int codigo_prod = leitorX.nextInt();

		while (codigo_prod != 4) {

			switch (codigo_prod) {
				case 1:
					soma_alcool++;
					break;
				case 2:
					soma_gasolina++;
					break;
				case 3:
					soma_diesel++;
					break;
			}
			System.out.println("Informe o código (1,2,3) ou 4 para parar: ");
			codigo_prod = leitorX.nextInt();
		}
		System.out.println("MUITO OBRIGADO!");

		System.out.printf("Álcool: %d\nGasolina: %d\nDiesel: %d\n",
				soma_alcool,
				soma_gasolina,
				soma_diesel);
	}
}