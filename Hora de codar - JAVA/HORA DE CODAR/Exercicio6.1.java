/*6.1 - Qual o maior? (4 vezes pior)
Faça um programa para ler 4 valores (considere que não serão informados valores iguais) e escrever o maior deles. */

import java.util.Scanner;


public class Exercicio6.1 {
    public static void main(String[] args)
    {   
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o primeiro valor");   
        int numero1 = in.nextInt();

        System.out.println("Informe o segundo valor");   
        int numero2 = in.nextInt();

        System.out.println("Informe o terceiro valor");   
        int numero3 = in.nextInt();

        System.out.println("Informe o ultimo valor");   
        int numero4 = in.nextInt();


        double maior = Math.max (numero1, Math.max(numero2, Math.max(numero3,numero4)));

         System.out.println("O maior numero entre eles é " + maior );
    }
}