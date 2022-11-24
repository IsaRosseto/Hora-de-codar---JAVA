/* 8 - Enquanto isso
Faça um programa para ler 2 valores informados pelo usuário e se o segundo valor informado for neutro, deve ser lido um novo valor - ou seja,
para o segundo valor não pode ser aceito o valor zero nem um valor negativo. 
O programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido. */

import java.util.Scanner;

public class 8Exercicio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Digite o primeiro valor: ");
        int n1 = in.nextInt();
        System.out.println("Digite o segundo valor ");
        int n2 = in.nextInt();

        if( n2 <= 0) {
        System.out.println("O numero não pode ser igual ou menor que ZERO (0), tente novamente!");

        System.out.println("Digite o segundo valor novamente! ");
        n2 = in.nextInt();
        }

        int resultado = (n1 / n2);

        System.out.println("O resultado da divisão é " + resultado + ".");
    }
}
