package Atividade_Estrutura_Condicional_2;

import java.util.Scanner;

public class CartesianPlane {
    public static void main(String[] args) {

        Scanner leitorX = new Scanner(System.in);

        System.out.printf("Enter the X and Y axis numbers \n");
        float axisX = leitorX.nextFloat();
        float axisY = leitorX.nextFloat();

        if ((axisX > 0) && (axisY > 0)) {
            System.out.println("Q1");
        } else if ((axisX < 0) && (axisY < 0)) {
            System.out.println("Q3");
        } else if ((axisX > 0) && (axisY < 0)) {
            System.out.println("Q4");
        } else if ((axisX < 0) && (axisY > 0)) {
            System.out.println("Q2");
        } else {
            System.out.println("Origin");
        }
    }
}
