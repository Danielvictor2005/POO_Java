package Atividade_Estrutura_Condicional_2;

import java.util.Scanner;

public class ParOrImpar {
    public static void main(String[] args) {

        Scanner leitorX = new Scanner(System.in);

        for (int y = 0; y < 3; y++) {

            System.out.println("Digite um número inteiro: ");
            int numeroX = leitorX.nextInt();

            if (numeroX % 2 == 0) {
                System.out.println("Número Par");
            } else {
                System.out.println("Número Ímpar");
            }
        }
    }
}
