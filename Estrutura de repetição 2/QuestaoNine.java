import java.util.Scanner;

public class QuestaoNine {
	public static void main(String[] args) {

		Scanner leitorX = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		int x = leitorX.nextInt();

		for (byte y = 1;y <= x; y++) {
			if (x % y == 0) {
				System.out.println(x / y);
			}
		}
	}
}