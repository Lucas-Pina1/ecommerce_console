package br.com.didox;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Informe o valor de X");
        // int x = sc.nextInt();
        // System.out.println("Informe o valor de Y");
        // int y = sc.nextInt();

        // int result = (x * 8 + y) - x + y / 100;

        // System.out.println("O resultado é: " + result);

        // sc.close();

        /*
         * João tem um armazem e precisa de um programa que solicite
         * o nome do seu cliente
         * o endereço do seu cliente
         * o nome do material de construção
         * o valor do material de construção
         * e a quantidade que o cliente deseja
         * no final do programa, mostre um rela'torio com o valor total do produto
         * comprado
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Olá João, vamos seguir com a compra do ciente e gerar o relátorio de venda");
        System.out.println("Digite as informações necessarias para prosseguir:");

        System.out.println("Qual o nome do cliente?");
        String nameOfClient = sc.nextLine();
        System.out.println("Qual o endereço do cliente (" + nameOfClient + ") ?");
        String adressOfClient = sc.nextLine();
        System.out.println("Qual o produto que o cliente vai comprar?");
        String nameOfproduct = sc.nextLine();
        System.out.printf("Qual a valor do produto: (%s) ", nameOfproduct);
        double priceOfProduct = sc.nextDouble();
        System.out.printf("Qual a quantidade do produto: (%s) ", nameOfproduct);
        int amountOfProduct = sc.nextInt();

        double totalValue = priceOfProduct * amountOfProduct;

        System.out.println("-----------------------------");
        System.out.printf("Cliente: %s %n", nameOfClient);
        System.out.printf("Endereço de entrega: %s %n", adressOfClient);
        System.out.printf("Comprou o material: %s no valor de R$ %.2f %n", nameOfproduct, priceOfProduct);
        System.out.printf("O valor total da compra deu: R$ %.2f %n", totalValue);

        if (totalValue > 100) {
            System.out.println("Seu pedido foi maior que R$ 100 e voçê terá um desconto na proxima");
        }

        System.out.println("-----------------------------");

        sc.close();
    }
}
