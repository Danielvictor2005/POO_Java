import java.util.Scanner;

public class Acesso_Senha {
	public static void main(String[] args) {
		Scanner leitorX = new Scanner(System.in);

		System.out.println("Digite a senha: ");
		int senha = leitorX.nextInt();

		while (senha != 2002) {
			System.out.println("Senha inválida!\nDigite novamente!");
			senha = leitorX.nextInt();
		}
		System.out.println("Acesso permitido!");
		leitorX.close();
	}
}