/*7 - Qual o quê?
Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores. */

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Digite um numero: ");
        int n1 = in.nextInt();
        System.out.println("Digite mais um numero: ");
        int n2 = in.nextInt();
        System.out.println("Digite o ultimo numero: ");
        int n3 = in.nextInt();

        double menor = Math.min(n1, Math.min(n2,n3));
        double valor = n1 + n2 + n3 - menor;
        System.out.println("A soma dos dois maiores é: " + valor);

    }
}