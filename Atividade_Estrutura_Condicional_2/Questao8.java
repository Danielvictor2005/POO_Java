package Atividade_Estrutura_Condicional_2;

import java.util.Scanner;
import java.lang.Math;

public class Questao8 {
    public static void main(String[] args) {

        Scanner leitorX = new Scanner(System.in);

        System.out.println("Digite o seu salário para calcular o imposto de renda");
        double salario = leitorX.nextDouble();
        double impostoRenda = 0;

        if ((salario >= 0) && (salario <= 2000)) {
            System.out.println("Isento");
        } else if ((salario >= 2000.01) && (salario <= 3000)) {
            impostoRenda = (salario - 2000) * 0.08;
        } else if ((salario >= 3000.01) && (salario <= 4500.1)) {
            impostoRenda = ((salario - 3000.01) * 0.18) + (1000 * 0.08);
        } else {
            impostoRenda = (salario - 4500) * 0.28 + (1500 * 0.18) + (1000 * 0.08);
        }

        System.out.printf("Imposto de renda a pagar: R$ %.2f \n", impostoRenda);

    }
}
