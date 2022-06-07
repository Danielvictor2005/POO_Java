package Atividade_Estrutura_Condicional_2;

import java.util.Scanner;

public class MultiplesOrNot {
    public static void main(String[] args) {

        Scanner leitorX = new Scanner(System.in);

        System.out.println("Digite dois números inteiros: ");
        int x1 = leitorX.nextInt();
        int x2 = leitorX.nextInt();

        if ((x1 % x2 == 0) || (x2 % x1 == 0)){
            System.out.println("São múltiplos!");
        }
        else {
            System.out.println("Não são múltiplos");
        }
    }
}
