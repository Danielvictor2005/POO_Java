import java.util.Scanner;

public class Experiencias {
	public static void main(String[] args) {
		Scanner leitorX = new Scanner(System.in);

		int coelhos = 0;
		int ratos = 0;
		int sapos = 0;
		int totalCobaias = 0;

		System.out.println("Quantos casos de testes serão digitados? ");
		int Qresults = leitorX.nextInt();

		for (int y = 1; y <= Qresults; y++) {
			System.out.println("Quantidade de cobaias: ");
			int Qcobaias = leitorX.nextInt();
			System.out.println("Tipo de cobaia: ");
			char Tcobaias = leitorX.next().charAt(0);

			if (Tcobaias == 'c') {
				coelhos += Qcobaias;
			} else if (Tcobaias == 'r') {
				ratos += Qcobaias;
			} else {
				sapos += Qcobaias;
			}
			totalCobaias += Qcobaias;
		}

		// Tratamento de dados e variáveies

		double porcent_coelhos = (coelhos * 100) / totalCobaias;
		double porcent_ratos = (ratos * 100) / totalCobaias;
		double porcente_sapos = (sapos * 100) / totalCobaias;

		// Saídas de dados

		System.out.println("RELATÓRIO FINAL");
		System.out.printf("Total: %d\n"
				+ "Total de coelhos: %d\n"
				+ "Total de ratos: %d\n"
				+ "Total de sapos: %d\n",
				totalCobaias, coelhos, ratos, sapos);
		System.out.printf("\nPercentual dos coelhos: %.2f\n"
				+ "Percentual dos ratos: %.2f\n"
				+ "Percentual dos sapos: %.2f\n",
				porcent_coelhos, porcent_ratos, porcente_sapos);
	}
}