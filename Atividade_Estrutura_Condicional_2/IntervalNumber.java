package Atividade_Estrutura_Condicional_2;

import java.util.Scanner;

public class IntervalNumber {
    public static void main(String[] args) {

        Scanner leitorX = new Scanner(System.in);

        System.out.println("Enter a integer value:");
        int xNumber = leitorX.nextInt();

        if ((xNumber >= 0) && (xNumber <= 25)) {
            System.out.println("Interval: [0,25]");
        } else if ((xNumber >= 25) && (xNumber <= 50)) {
            System.out.println("Interval: [25,50]");
        } else if ((xNumber >= 75) && (xNumber <= 100)) {
            System.out.println("Interval: [75,100]");
        } else {
            System.out.println("Out of range!");
        }
    }
}
