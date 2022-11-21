/*9 -  Cansar de Digitar
Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos.*/

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int soma = 0 ;

        for(int i = 0; i < 10; i++){
            System.out.print("Digite um número: ");
            int numero = in.nextInt();

            soma += numero;
        }

        System.out.println("A soma dos números informados é " + soma / 10);

        in.close();

    }
}
