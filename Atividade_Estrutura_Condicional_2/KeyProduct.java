package Atividade_Estrutura_Condicional_2;

import java.util.Scanner;

public class KeyProduct {
    public static void main(String[] args) {

        Scanner leitorX = new Scanner(System.in);

//       Arrays

        int[] codeProducts = {1,2,3,4,5};
        String[] products = {"Cachorro-Quente","X-Salada","X-Bacon","Torrada simples","Refrigerante"};
        double[] priceProduct = {4.0, 4.50, 5.0, 2.0, 1.5};

//        Inputs

        System.out.println("Enter the product code");
        int codeProduct = leitorX.nextInt();

        System.out.println("Enter the amount product");
        int amountProduct = leitorX.nextInt();

        for (int positionProduct = 0; positionProduct < codeProducts.length; positionProduct++) {
                if (codeProduct == codeProducts[positionProduct]){
                    double totalBuy = priceProduct[positionProduct] * amountProduct;
                    System.out.printf("Quantidade de %s deu R$ %.2f",products[positionProduct],totalBuy);
                }
        }
        System.out.println("Can't possible find the product code");
    }
}
