package Atividade_Estrutura_Condicional_2;

import java.util.Scanner;


public class HourGameTime {
    public static void main(String[] args) {

        Scanner leitorX = new Scanner(System.in);

        System.out.println("Game start time");
        int hourInital = leitorX.nextInt();

        System.out.println("Final game time: ");
        int hourFinal = leitorX.nextInt();


        if ((hourInital >= 0) || (hourFinal >= 0)) {

            if (hourInital < hourFinal) {
                int hoursPlayed = (hourFinal - hourInital);

                if (hoursPlayed >= 1) {
                    System.out.printf("Hour played: %.2f hours", hoursPlayed);
                } else {
                    System.out.println("Hour played is less than 1 hour");
                }

            } else if (hourInital > hourFinal) {
                int hoursPlayed = (24 - hourInital) + hourFinal;
                System.out.printf("Hour played: %.2f horas", hoursPlayed);

                if (hoursPlayed >= 1) {
                    System.out.printf("Hour played: %.2f hours", hoursPlayed);
                } else {
                    System.out.println("Hour played is less than 1 hour");
                }

            } else {
                System.out.println("Hour played: 24 hours"); // If both are equal to zero
            }

        } else {
            System.out.println("Not is possible make the calculations!");
        }
    }
}
