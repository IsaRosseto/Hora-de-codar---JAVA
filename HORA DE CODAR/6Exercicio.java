/*6 - Qual o maior?
Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles. */

import java.util.Scanner;

public class 6Exercicio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual o primeiro valor?");
        int numero1 = in.nextInt();
        System.out.println("Qual o segundo valor?");
        int numero2 = in.nextInt();
        System.out.println("Qual o terceiro valor?");
        int numero3 = in.nextInt();
        double resultado = Math.max(numero1, Math.max(numero2,numero3));

        System.out.println("O maior numero entre eles é " +  resultado );

    }
}
