package br.com.didox;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        /*
         * 
         * Paula tem um petshop, ela está precisando de um sistema para controlar seus
         * serviços. neste sistema, precisa cadastrar o cliente (Dados básicos) os dados
         * do Pet, o peso do pet, depois o sistema deverá calcular o valor do banho pelo
         * peso do pet qual será este calculo:
         * - Para macho:
         * (pesoDopet * valorPorPeso) + (pesoDoPet * valorPorPEso * 15 / 100)
         * - Para femêa:
         * (pesoDopet * valorPorPeso) + (pesoDoPet * valorPorPEso * 30 / 100)
         * Feito o calculo o sistema deverá mostrar um relatório com os dados do pedido
         * e o valor total a pagar
         * 
         * Coloque uma usabilidade agradável
         * 
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("==================== PET SHOP ====================");
        System.out.println("Olá Paula, vamos seguir com o seu serviço");
        System.out.println("Digite as informações necessarias para prosseguir:");

        System.out.println("Qual o nome do cliente?");
        String nameOfClient = sc.nextLine();
        System.out.println("Qual o numero para contato ?");
        String numberOfClient = sc.nextLine();

        System.out.printf("Agora, informe as informções do Pet do(a) cliente - %s %n", nameOfClient);
        System.out.println();
        System.out.println("Qual o sexo do pet? [1] - Macho ou [2] - femêa");
        int sex = sc.nextInt();
        System.out.println("Qual o nome do Pet ?");
        String nameOfPet = sc.nextLine();
        System.out.println("Qual o peso do pet ?");
        double weigthOfPet = sc.nextDouble();
        System.out.println("Qual o valor por peso do pet ?");
        double value = sc.nextDouble();

        System.out.println("Agora que temos as informações, segue o relátorio referente ao serviço:");

        System.out.println("------------ Informações do Client ------------");
        System.out.printf("Nome do cliente: %s %n", nameOfClient);
        System.out.printf("Numero para contato: %s %n", numberOfClient);
        System.out.println("----------   Informações do pet    -----------");
        System.out.printf("Nome do pet: %s %n", nameOfPet);
        if (sex == 1) {
            System.out.printf("Sexo: Macho");
        }
        if (sex == 2) {
            System.out.printf("Sexo: Femêa");
        }
        System.out.printf("Peso: %.2f %n", weigthOfPet);

        System.out.println("---------- Valor do Serviço ----------");
        if (sex == 1) {
            double totalValue = (weigthOfPet * value) + (weigthOfPet * value * 15 / 100);
            System.out.printf("O valor do serviço é: R$ %.2f", totalValue);
        }
        if (sex == 2) {
            double totalValue = (weigthOfPet * value) + (weigthOfPet * value * 30 / 100);
            System.out.printf("O valor do serviço é: R$ %.2f", totalValue);
        }

        sc.close();

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

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Olá João, vamos seguir com a compra do ciente e gerar o
        // relátorio de venda");
        // System.out.println("Digite as informações necessarias para prosseguir:");

        // System.out.println("Qual o nome do cliente?");
        // String nameOfClient = sc.nextLine();
        // System.out.println("Qual o endereço do cliente (" + nameOfClient + ") ?");
        // String adressOfClient = sc.nextLine();
        // System.out.println("Qual o produto que o cliente vai comprar?");
        // String nameOfproduct = sc.nextLine();
        // System.out.printf("Qual a valor do produto: (%s) ", nameOfproduct);
        // double priceOfProduct = sc.nextDouble();
        // System.out.printf("Qual a quantidade do produto: (%s) ", nameOfproduct);
        // int amountOfProduct = sc.nextInt();

        // double totalValue = priceOfProduct * amountOfProduct;

        // System.out.println("-----------------------------");
        // System.out.printf("Cliente: %s %n", nameOfClient);
        // System.out.printf("Endereço de entrega: %s %n", adressOfClient);
        // System.out.printf("Comprou o material: %s no valor de R$ %.2f %n",
        // nameOfproduct, priceOfProduct);
        // System.out.printf("O valor total da compra deu: R$ %.2f %n", totalValue);

        // if (totalValue > 100) {
        // System.out.println("Seu pedido foi maior que R$ 100 e voçê terá um desconto
        // na proxima");
        // }

        // System.out.println("-----------------------------");

        // sc.close();
    }
}
