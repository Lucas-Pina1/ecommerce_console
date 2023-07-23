package br.com.didox;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor de X");
        int x = sc.nextInt();
        System.out.println("Informe o valor de Y");
        int y = sc.nextInt();

        int result = (x * 8 + y) - x + y / 100;

        System.out.println("O resultado é: " + result);

        sc.close();

    }
}
