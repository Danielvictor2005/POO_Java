import java.util.Scanner;

public class Senha_fixa {
	public static void main(String[] args) {

		Scanner leitorX = new Scanner(System.in);

		System.out.println("Senha para acessar a classe: ");
		int senhaAcesso = leitorX.nextInt();

		while (senhaAcesso != 2002) {
			System.out.println("Senha incorreta!\nDigite novamente!");
			senhaAcesso = leitorX.nextInt();
		}
		System.out.println("Acesso permitido!");
	}
}