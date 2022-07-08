import java.util.Scanner;
import javax.swing.JOptionPane;

public class MediaPonderada {
	public static void main(String[] args) {

		Scanner leitorX = new Scanner(System.in);

		System.out.println("Digite quantidade de vezes: ");
		int vezes = leitorX.nextInt();

		for (; vezes >= 1; vezes--) {
			System.out.println("Digite os valores de X Y e Z");
			float x = leitorX.nextFloat();
			float y = leitorX.nextFloat();
			float z = leitorX.nextFloat();

			float mediaPonderada = ((x * 2) + (y * 3) + (z * 5)) / 10;
			System.out.printf("\nMedia ponderada = %.1f\n", mediaPonderada);
		}
		System.out.println("Codigo terminado!");
		leitorX.close();
	}
}