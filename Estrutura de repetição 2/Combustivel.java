import java.util.Scanner;

public class Combustivel {
	public static void main(String[] args) {
		Scanner leitorX = new Scanner(System.in);

		int gasolina = 0;
		int alcool = 0;
		int diesel = 0;

		System.out.println("Informe o código de 1 a 4: ");
		int codigo = leitorX.nextInt();

		while (codigo != 4) {

			switch (codigo) {
				case 1:
					alcool++;
					break;
				case 2:
					gasolina++;
					break;
				case 3:
					diesel++;
					break;
			}
			codigo = leitorX.nextInt();
		}
		System.out.println("Muito obrigado(a)! ");
		System.out.printf("Álcool: %d\nGasolina: %d\nDiesel: %d\n", alcool, gasolina, diesel);
	}
}